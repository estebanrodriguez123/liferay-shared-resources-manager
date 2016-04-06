package com.rivetlogic.assetmanagement.portlet;

import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rivetlogic.assetmanagement.model.Asset;
import com.rivetlogic.assetmanagement.model.AssetCategory;
import com.rivetlogic.assetmanagement.model.AssetLocation;
import com.rivetlogic.assetmanagement.service.AssetCategoryLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.AssetLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.AssetLocationLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

/**
 * Portlet implementation class ManageAssetsPortlet
 */
public class ManageAssetsPortlet extends MVCPortlet {

	public static final String PORTLET_ID = "manageassets_WAR_sharedresourcesmanagerportlet";

	public void addAsset(ActionRequest request, ActionResponse response) throws IOException, PortalException, SystemException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		Asset asset = AssetLocalServiceUtil.createAsset(0);

		asset.setName(ParamUtil.getString(request, "name"));
		asset.setDescription(ParamUtil.getString(request, "description"));
		asset.setLocation(ParamUtil.getString(request, "location"));
		asset.setActive(ParamUtil.getBoolean(request, "active"));
		asset.setCategory(ParamUtil.getString(request, "category"));

		List<String> errors = new ArrayList<String>();

		if (NewAssetValidator.validateAsset(asset, errors)) {

			long assetId = AssetLocalServiceUtil.addAsset(themeDisplay, serviceContext, asset);

			SessionMessages.add(request, "asset-success-created");

			response.setRenderParameter("assetId", String.valueOf(assetId));
			response.setRenderParameter("mvcPath", "/html/manageassets/edit_asset.jsp");

		} else {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			PortalUtil.copyRequestParameters(request, response);

			response.setRenderParameter("mvcPath", "/html/manageassets/add_asset.jsp");

		}
	}

	public void deleteAsset(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {

		long assetId = ParamUtil.getLong(request, "assetId");

		AssetRequestLocalServiceUtil.deleteAssetRequestByAssetId(assetId);
		AssetLocalServiceUtil.deleteAsset(assetId);

		sendRedirect(request, response);
	}

	public void editAssetPhoto(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException, SQLException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);

		long assetId = ParamUtil.getLong(uploadRequest, "assetId");

		if (assetId == 0) {
			assetId = ParamUtil.getLong(request, "assetId");
		}

		if (assetId > 0) {

			Asset asset = AssetLocalServiceUtil.getAsset(assetId);

			try {

				asset.setPhoto(null);

				File photoImage = uploadRequest.getFile("photo");

				if (photoImage != null) {

					InputStream fis = new FileInputStream(photoImage);
					OutputBlob photo = new OutputBlob(fis, photoImage.length());

					asset.setPhoto(photo);
					asset.setMimeType(MimeTypesUtil.getContentType(photoImage));
				}
			} catch (FileNotFoundException ex) {
				_log.error("No file uploaded");
			} catch (Exception ex) {
				_log.error(ex);
			}

			if (Validator.isNotNull(asset.getPhoto())) {

				AssetLocalServiceUtil.editAsset(themeDisplay, serviceContext, asset);

				sendRedirect(request, response);

			} else {

				SessionErrors.add(request, "asset-photo-required");

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("assetId", assetId+"");

				response.setRenderParameter("mvcPath", "/html/manageassets/edit_asset.jsp");
			}

		} else {

			SessionErrors.add(request, "asset-photo-required");
			
			response.setRenderParameter("mvcPath", "/html/manageassets/view.jsp");

		}
	}

	public void editAsset(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		long assetId = ParamUtil.getLong(request, "assetId");

		Asset asset = AssetLocalServiceUtil.getAsset(assetId);

		asset.setName(ParamUtil.getString(request, "name"));
		asset.setDescription(ParamUtil.getString(request, "description"));
		asset.setLocation(ParamUtil.getString(request, "location"));
		asset.setActive(ParamUtil.getBoolean(request, "active"));
		asset.setCategory(ParamUtil.getString(request, "category"));

		List<String> errors = new ArrayList<String>();

		if (NewAssetValidator.validateAsset(asset, errors)) {

			AssetLocalServiceUtil.editAsset(themeDisplay, serviceContext, asset);

			sendRedirect(request, response);

		} else {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			PortalUtil.copyRequestParameters(request, response);

			response.setRenderParameter("mvcPath", "/html/manageassets/edit_asset.jsp");
		}

	}

	public void addAssetCategory(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		String categoryName = ParamUtil.getString(request, "name");

		AssetCategory assetCategory = AssetCategoryLocalServiceUtil.createAssetCategory(0);

		assetCategory.setName(categoryName);

		AssetCategoryLocalServiceUtil.addAssetCategory(themeDisplay, serviceContext, assetCategory);

	}

	public void deleteAssetCategory(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {

		long assetCategoryId = ParamUtil.getLong(request, "assetCategoryId");

		AssetCategoryLocalServiceUtil.deleteAssetCategory(assetCategoryId);

	}

	public void addAssetLocation(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		String categoryName = ParamUtil.getString(request, "name");

		AssetLocation assetLocation = AssetLocationLocalServiceUtil.createAssetLocation(0);

		assetLocation.setName(categoryName);

		AssetLocationLocalServiceUtil.addAssetLocation(themeDisplay, serviceContext, assetLocation);

	}

	public void deleteAssetLocation(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {

		long assetLocationId = ParamUtil.getLong(request, "assetLocationId");

		AssetLocationLocalServiceUtil.deleteAssetLocation(assetLocationId);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {

		long assetId = ParamUtil.getLong(resourceRequest, "assetId");

		if (assetId > 0) {
			try {
				Asset asset = AssetLocalServiceUtil.getAsset(assetId);

				if (asset != null) {
					Blob image = asset.getPhoto();
					if (image != null) {
						byte[] imgData = image.getBytes(1, (int) image.length());
						resourceResponse.setContentType(asset.getMimeType());
						OutputStream o = resourceResponse.getPortletOutputStream();
						o.write(imgData);
						o.flush();
						o.close();
					} else {

						String realPath = getPortletContext().getRealPath("/");

						String url = realPath + "images/no-preview-available.jpg";

						Path path = Paths.get(url);
						byte[] data = Files.readAllBytes(path);

						resourceResponse.setContentType("image/jpeg");

						OutputStream o = resourceResponse.getPortletOutputStream();

						o.write(data);

						o.flush();
						o.close();
					}
				}

			} catch (Exception e) {
				_log.error(e);
			}
		} else {

			super.serveResource(resourceRequest, resourceResponse);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(ManageAssetsPortlet.class);

}
