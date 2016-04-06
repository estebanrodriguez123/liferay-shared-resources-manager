/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.rivetlogic.assetmanagement.service.impl;

import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.rivetlogic.assetmanagement.model.Asset;
import com.rivetlogic.assetmanagement.model.impl.AssetStatus;
import com.rivetlogic.assetmanagement.service.base.AssetLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the asset local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.rivetlogic.assetmanagement.service.AssetLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Manrique Varela
 * @see com.rivetlogic.assetmanagement.service.base.AssetLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.AssetLocalServiceUtil
 */
public class AssetLocalServiceImpl extends AssetLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.rivetlogic.assetmanagement.service.AssetLocalServiceUtil} to access
	 * the asset local service.
	 */

	public long addAsset(ThemeDisplay themeDisplay, ServiceContext serviceContext, Asset asset) throws SystemException {

		long assetId = counterLocalService.increment(Asset.class.getName());
		Date now = new Date();

		Asset _asset = assetPersistence.create(assetId);

		_asset.setCompanyId(themeDisplay.getCompanyId());
		_asset.setGroupId(themeDisplay.getScopeGroupId());
		_asset.setUserId(themeDisplay.getUserId());

		_asset.setCreateDate(now);
		_asset.setModifiedDate(now);

		_asset.setName(asset.getName());
		_asset.setDescription(asset.getDescription());
		_asset.setLocation(asset.getLocation());
		_asset.setActive(asset.getActive());
		_asset.setCategory(asset.getCategory());
		_asset.setMimeType(asset.getMimeType());
		_asset.setPhoto(asset.getPhoto());

		_asset.setStatus(AssetStatus.AVAILABLE.toString());

		_asset = assetLocalService.addAsset(_asset);

		return assetId;
	}

	public Asset editAsset(ThemeDisplay themeDisplay, ServiceContext serviceContext, Asset asset) throws SystemException {

		Date now = new Date();
		asset.setModifiedDate(now);

		return assetLocalService.updateAsset(asset);
	}

	@SuppressWarnings("unchecked")
	public List<Asset> getAssetsByUser(long groupId, long companyId, long userId, String status, int start, int end, String orderByColumn,
			String orderByType) throws PortalException, SystemException {

		List<Asset> myList = new ArrayList<Asset>();

		// TODO: Add global scope items

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Asset.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));

		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		disjunction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		disjunction.add(PropertyFactoryUtil.forName("groupId").eq(
				GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId()));
		dynamicQuery.add(disjunction);

		dynamicQuery.add(PropertyFactoryUtil.forName("currentUserId").eq(userId));

		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(status));

		dynamicQuery.setLimit(start, end);

		if (orderByType.equalsIgnoreCase("asc")) {
			dynamicQuery.addOrder(OrderFactoryUtil.asc(orderByColumn));
		} else {
			dynamicQuery.addOrder(OrderFactoryUtil.desc(orderByColumn));
		}

		try {
			myList = assetPersistence.findWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}

	public int getAssetsByUserCount(long groupId, long companyId, long userId, String status) throws PortalException, SystemException {

		int count = 0;

		// TODO: Add global scope items

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Asset.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));

		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		disjunction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		disjunction.add(PropertyFactoryUtil.forName("groupId").eq(
				GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId()));
		dynamicQuery.add(disjunction);

		dynamicQuery.add(PropertyFactoryUtil.forName("currentUserId").eq(userId));

		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(status));

		try {
			count = (int) assetPersistence.countWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return count;
	}

	@SuppressWarnings("unchecked")
	public List<Asset> getAvailableAssets(long groupId, long companyId, int start, int end, String orderByColumn, String orderByType, String searchText,
			String category, String location)
			throws PortalException, SystemException {

		List<Asset> myList = new ArrayList<Asset>();

		// TODO: Add global scope items

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Asset.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));

		Disjunction groupIdDisjunction = RestrictionsFactoryUtil.disjunction();
		groupIdDisjunction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		groupIdDisjunction.add(PropertyFactoryUtil.forName("groupId").eq(
				GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId()));
		dynamicQuery.add(groupIdDisjunction);
		
		String[] keywords = searchText.split("\\s+");

		Disjunction keywordsDisjunction = RestrictionsFactoryUtil.disjunction();

		if (Validator.isNotNull(searchText) && keywords.length > 0) {
			for (String keyword : keywords) {
				keywordsDisjunction.add(RestrictionsFactoryUtil.ilike("name", StringPool.PERCENT + keyword + StringPool.PERCENT));
				keywordsDisjunction.add(RestrictionsFactoryUtil.ilike("description", StringPool.PERCENT + keyword + StringPool.PERCENT));
				keywordsDisjunction.add(RestrictionsFactoryUtil.ilike("category", StringPool.PERCENT + keyword + StringPool.PERCENT));
			}
		}

		dynamicQuery.add(keywordsDisjunction);

		if (Validator.isNotNull(category)) {
			dynamicQuery.add(PropertyFactoryUtil.forName("category").eq(category));
		}

		if (Validator.isNotNull(location)) {
			dynamicQuery.add(PropertyFactoryUtil.forName("location").eq(location));
		}

		dynamicQuery.add(PropertyFactoryUtil.forName("active").eq(true));

		dynamicQuery.setLimit(start, end);

		if (orderByType.equalsIgnoreCase("asc")) {
			dynamicQuery.addOrder(OrderFactoryUtil.asc(orderByColumn));
		} else {
			dynamicQuery.addOrder(OrderFactoryUtil.desc(orderByColumn));
		}

		try {
			myList = assetPersistence.findWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}

	public int getAvailableAssetsCount(long groupId, long companyId, String searchText, String category, String location) throws PortalException, SystemException {

		int count = 0;

		// TODO: Add global scope items

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Asset.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));

		Disjunction groupIdDisjunction = RestrictionsFactoryUtil.disjunction();
		groupIdDisjunction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		groupIdDisjunction.add(PropertyFactoryUtil.forName("groupId").eq(
				GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId()));
		dynamicQuery.add(groupIdDisjunction);
		
		String[] keywords = searchText.split("\\s+");

		Disjunction keywordsDisjunction = RestrictionsFactoryUtil.disjunction();

		if (Validator.isNotNull(searchText) && keywords.length > 0) {
			for (String keyword : keywords) {
				keywordsDisjunction.add(RestrictionsFactoryUtil.ilike("name", StringPool.PERCENT + keyword + StringPool.PERCENT));
				keywordsDisjunction.add(RestrictionsFactoryUtil.ilike("description", StringPool.PERCENT + keyword + StringPool.PERCENT));
				keywordsDisjunction.add(RestrictionsFactoryUtil.ilike("category", StringPool.PERCENT + keyword + StringPool.PERCENT));
			}
		}

		dynamicQuery.add(keywordsDisjunction);

		if (Validator.isNotNull(category)) {
			dynamicQuery.add(PropertyFactoryUtil.forName("category").eq(category));
		}

		if (Validator.isNotNull(location)) {
			dynamicQuery.add(PropertyFactoryUtil.forName("location").eq(location));
		}
		

		dynamicQuery.add(PropertyFactoryUtil.forName("active").eq(true));

		try {
			count = (int) assetPersistence.countWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return count;
	}

	@SuppressWarnings("unchecked")
	public List<Asset> getAssets(long groupId, long companyId, int start, int end, String orderByColumn, String orderByType, String searchText,
			String category, String location) {

		List<Asset> myList = new ArrayList<Asset>();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Asset.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));

		String[] keywords = searchText.split("\\s+");

		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();

		if (Validator.isNotNull(searchText) && keywords.length > 0) {
			for (String keyword : keywords) {
				disjunction.add(RestrictionsFactoryUtil.ilike("name", StringPool.PERCENT + keyword + StringPool.PERCENT));
				disjunction.add(RestrictionsFactoryUtil.ilike("description", StringPool.PERCENT + keyword + StringPool.PERCENT));
				disjunction.add(RestrictionsFactoryUtil.ilike("category", StringPool.PERCENT + keyword + StringPool.PERCENT));
			}
		}

		dynamicQuery.add(disjunction);

		if (Validator.isNotNull(category)) {
			dynamicQuery.add(PropertyFactoryUtil.forName("category").eq(category));
		}

		if (Validator.isNotNull(location)) {
			dynamicQuery.add(PropertyFactoryUtil.forName("location").eq(location));
		}

		dynamicQuery.setLimit(start, end);

		if (orderByType.equalsIgnoreCase("asc")) {
			dynamicQuery.addOrder(OrderFactoryUtil.asc(orderByColumn));
		} else {
			dynamicQuery.addOrder(OrderFactoryUtil.desc(orderByColumn));
		}

		try {
			myList = assetPersistence.findWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}

	public int getAssetsCount(long groupId, long companyId, String searchText, String category, String location) {

		int count = 0;

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Asset.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));

		String[] keywords = searchText.split("\\s+");

		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();

		if (Validator.isNotNull(searchText) && keywords.length > 0) {
			for (String keyword : keywords) {
				disjunction.add(RestrictionsFactoryUtil.ilike("name", StringPool.PERCENT + keyword + StringPool.PERCENT));
				disjunction.add(RestrictionsFactoryUtil.ilike("description", StringPool.PERCENT + keyword + StringPool.PERCENT));
				disjunction.add(RestrictionsFactoryUtil.ilike("category", StringPool.PERCENT + keyword + StringPool.PERCENT));
			}
		}

		dynamicQuery.add(disjunction);

		if (Validator.isNotNull(category)) {
			dynamicQuery.add(PropertyFactoryUtil.forName("category").eq(category));
		}

		if (Validator.isNotNull(location)) {
			dynamicQuery.add(PropertyFactoryUtil.forName("location").eq(location));
		}

		try {
			count = (int) assetPersistence.countWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return count;
	}

	private static final Log _log = LogFactoryUtil.getLog(AssetLocalServiceImpl.class);

}