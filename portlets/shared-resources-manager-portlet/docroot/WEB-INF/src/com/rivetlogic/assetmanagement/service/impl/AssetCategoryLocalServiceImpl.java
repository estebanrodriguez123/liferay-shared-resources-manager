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
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.rivetlogic.assetmanagement.model.AssetCategory;
import com.rivetlogic.assetmanagement.service.base.AssetCategoryLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the asset category local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.rivetlogic.assetmanagement.service.AssetCategoryLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Manrique Varela
 * @see com.rivetlogic.assetmanagement.service.base.AssetCategoryLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.AssetCategoryLocalServiceUtil
 */
public class AssetCategoryLocalServiceImpl extends AssetCategoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.rivetlogic.assetmanagement.service.AssetCategoryLocalServiceUtil} to
	 * access the asset category local service.
	 */

	public AssetCategory addAssetCategory(ThemeDisplay themeDisplay, ServiceContext serviceContext, AssetCategory assetCategory)
			throws SystemException {

		long assetCategoryId = counterLocalService.increment(AssetCategory.class.getName());
		Date now = new Date();

		AssetCategory category = assetCategoryPersistence.create(assetCategoryId);

		category.setCompanyId(themeDisplay.getCompanyId());
		category.setGroupId(themeDisplay.getScopeGroupId());
		category.setUserId(themeDisplay.getUserId());

		category.setCreateDate(now);
		category.setName(assetCategory.getName());

		return assetCategoryLocalService.addAssetCategory(category);
	}

	@SuppressWarnings("unchecked")
	public List<AssetCategory> getAssetCategories(long groupId, long companyId, int start, int end) throws PortalException, SystemException {
		
		List<AssetCategory> categories = null;

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetCategory.class);

		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		disjunction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		disjunction.add(PropertyFactoryUtil.forName("groupId").eq(
				GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId()));
		dynamicQuery.add(disjunction);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));

		dynamicQuery.setLimit(start, end);

		dynamicQuery.addOrder(OrderFactoryUtil.asc("name"));

		try {

			categories = assetCategoryPersistence.findWithDynamicQuery(dynamicQuery);

		} catch (SystemException e) {
			_log.error(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			_log.error(e.getMessage());
		}

		return categories;
	}

	public int getAssetCategoriesCount(long groupId, long companyId) throws SystemException {
		return assetCategoryPersistence.countByCompanyGroup(companyId, groupId);
	}

	private static final Log _log = LogFactoryUtil.getLog(AssetCategoryLocalServiceImpl.class);
}