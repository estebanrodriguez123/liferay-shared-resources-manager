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

package com.rivetlogic.assetmanagement.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.rivetlogic.assetmanagement.model.AssetCategory;
import com.rivetlogic.assetmanagement.service.AssetCategoryLocalServiceUtil;

/**
 * @author Manrique Varela
 * @generated
 */
public abstract class AssetCategoryActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public AssetCategoryActionableDynamicQuery() throws SystemException {
		setBaseLocalService(AssetCategoryLocalServiceUtil.getService());
		setClass(AssetCategory.class);

		setClassLoader(com.rivetlogic.assetmanagement.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("assetCategoryId");
	}
}