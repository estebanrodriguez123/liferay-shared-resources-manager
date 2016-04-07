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

package com.rivetlogic.assetmanagement.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssetCategoryLocalService}.
 *
 * @author Manrique Varela
 * @see AssetCategoryLocalService
 * @generated
 */
public class AssetCategoryLocalServiceWrapper
	implements AssetCategoryLocalService,
		ServiceWrapper<AssetCategoryLocalService> {
	public AssetCategoryLocalServiceWrapper(
		AssetCategoryLocalService assetCategoryLocalService) {
		_assetCategoryLocalService = assetCategoryLocalService;
	}

	/**
	* Adds the asset category to the database. Also notifies the appropriate model listeners.
	*
	* @param assetCategory the asset category
	* @return the asset category that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory addAssetCategory(
		com.rivetlogic.assetmanagement.model.AssetCategory assetCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.addAssetCategory(assetCategory);
	}

	/**
	* Creates a new asset category with the primary key. Does not add the asset category to the database.
	*
	* @param assetCategoryId the primary key for the new asset category
	* @return the new asset category
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory createAssetCategory(
		long assetCategoryId) {
		return _assetCategoryLocalService.createAssetCategory(assetCategoryId);
	}

	/**
	* Deletes the asset category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCategoryId the primary key of the asset category
	* @return the asset category that was removed
	* @throws PortalException if a asset category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory deleteAssetCategory(
		long assetCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.deleteAssetCategory(assetCategoryId);
	}

	/**
	* Deletes the asset category from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCategory the asset category
	* @return the asset category that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory deleteAssetCategory(
		com.rivetlogic.assetmanagement.model.AssetCategory assetCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.deleteAssetCategory(assetCategory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetCategoryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory fetchAssetCategory(
		long assetCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.fetchAssetCategory(assetCategoryId);
	}

	/**
	* Returns the asset category with the matching UUID and company.
	*
	* @param uuid the asset category's UUID
	* @param companyId the primary key of the company
	* @return the matching asset category, or <code>null</code> if a matching asset category could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory fetchAssetCategoryByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.fetchAssetCategoryByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the asset category matching the UUID and group.
	*
	* @param uuid the asset category's UUID
	* @param groupId the primary key of the group
	* @return the matching asset category, or <code>null</code> if a matching asset category could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory fetchAssetCategoryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.fetchAssetCategoryByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the asset category with the primary key.
	*
	* @param assetCategoryId the primary key of the asset category
	* @return the asset category
	* @throws PortalException if a asset category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory getAssetCategory(
		long assetCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.getAssetCategory(assetCategoryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the asset category with the matching UUID and company.
	*
	* @param uuid the asset category's UUID
	* @param companyId the primary key of the company
	* @return the matching asset category
	* @throws PortalException if a matching asset category could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory getAssetCategoryByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.getAssetCategoryByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the asset category matching the UUID and group.
	*
	* @param uuid the asset category's UUID
	* @param groupId the primary key of the group
	* @return the matching asset category
	* @throws PortalException if a matching asset category could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory getAssetCategoryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.getAssetCategoryByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the asset categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @return the range of asset categories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetCategory> getAssetCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.getAssetCategories(start, end);
	}

	/**
	* Returns the number of asset categories.
	*
	* @return the number of asset categories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssetCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.getAssetCategoriesCount();
	}

	/**
	* Updates the asset category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetCategory the asset category
	* @return the asset category that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory updateAssetCategory(
		com.rivetlogic.assetmanagement.model.AssetCategory assetCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.updateAssetCategory(assetCategory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetCategoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetCategoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetCategoryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory addAssetCategory(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.AssetCategory assetCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.addAssetCategory(themeDisplay,
			serviceContext, assetCategory);
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetCategory> getAssetCategories(
		long groupId, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.getAssetCategories(groupId,
			companyId, start, end);
	}

	@Override
	public int getAssetCategoriesCount(long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategoryLocalService.getAssetCategoriesCount(groupId,
			companyId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetCategoryLocalService getWrappedAssetCategoryLocalService() {
		return _assetCategoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetCategoryLocalService(
		AssetCategoryLocalService assetCategoryLocalService) {
		_assetCategoryLocalService = assetCategoryLocalService;
	}

	@Override
	public AssetCategoryLocalService getWrappedService() {
		return _assetCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		AssetCategoryLocalService assetCategoryLocalService) {
		_assetCategoryLocalService = assetCategoryLocalService;
	}

	private AssetCategoryLocalService _assetCategoryLocalService;
}