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
 * Provides a wrapper for {@link AssetLocalService}.
 *
 * @author Manrique Varela
 * @see AssetLocalService
 * @generated
 */
public class AssetLocalServiceWrapper implements AssetLocalService,
	ServiceWrapper<AssetLocalService> {
	public AssetLocalServiceWrapper(AssetLocalService assetLocalService) {
		_assetLocalService = assetLocalService;
	}

	/**
	* Adds the asset to the database. Also notifies the appropriate model listeners.
	*
	* @param asset the asset
	* @return the asset that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset addAsset(
		com.rivetlogic.assetmanagement.model.Asset asset)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.addAsset(asset);
	}

	/**
	* Creates a new asset with the primary key. Does not add the asset to the database.
	*
	* @param assetId the primary key for the new asset
	* @return the new asset
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset createAsset(long assetId) {
		return _assetLocalService.createAsset(assetId);
	}

	/**
	* Deletes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the asset
	* @return the asset that was removed
	* @throws PortalException if a asset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset deleteAsset(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.deleteAsset(assetId);
	}

	/**
	* Deletes the asset from the database. Also notifies the appropriate model listeners.
	*
	* @param asset the asset
	* @return the asset that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset deleteAsset(
		com.rivetlogic.assetmanagement.model.Asset asset)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.deleteAsset(asset);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetLocalService.dynamicQuery();
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
		return _assetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _assetLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assetLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.Asset fetchAsset(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.fetchAsset(assetId);
	}

	/**
	* Returns the asset with the matching UUID and company.
	*
	* @param uuid the asset's UUID
	* @param companyId the primary key of the company
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset fetchAssetByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.fetchAssetByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the asset matching the UUID and group.
	*
	* @param uuid the asset's UUID
	* @param groupId the primary key of the group
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset fetchAssetByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.fetchAssetByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the asset with the primary key.
	*
	* @param assetId the primary key of the asset
	* @return the asset
	* @throws PortalException if a asset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset getAsset(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAsset(assetId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the asset with the matching UUID and company.
	*
	* @param uuid the asset's UUID
	* @param companyId the primary key of the company
	* @return the matching asset
	* @throws PortalException if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset getAssetByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAssetByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the asset matching the UUID and group.
	*
	* @param uuid the asset's UUID
	* @param groupId the primary key of the group
	* @return the matching asset
	* @throws PortalException if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset getAssetByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAssetByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the assets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of assets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.Asset> getAssets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAssets(start, end);
	}

	/**
	* Returns the number of assets.
	*
	* @return the number of assets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssetsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAssetsCount();
	}

	/**
	* Updates the asset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param asset the asset
	* @return the asset that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.Asset updateAsset(
		com.rivetlogic.assetmanagement.model.Asset asset)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.updateAsset(asset);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetPhotoBlobModel getPhotoBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getPhotoBlobModel(primaryKey);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public long addAsset(com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.Asset asset)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.addAsset(themeDisplay, serviceContext, asset);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.Asset editAsset(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.Asset asset)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.editAsset(themeDisplay, serviceContext, asset);
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.Asset> getAssetsByUser(
		long groupId, long companyId, long userId, java.lang.String status,
		int start, int end, java.lang.String orderByColumn,
		java.lang.String orderByType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAssetsByUser(groupId, companyId, userId,
			status, start, end, orderByColumn, orderByType);
	}

	@Override
	public int getAssetsByUserCount(long groupId, long companyId, long userId,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAssetsByUserCount(groupId, companyId,
			userId, status);
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.Asset> getAvailableAssets(
		long groupId, long companyId, int start, int end,
		java.lang.String orderByColumn, java.lang.String orderByType,
		java.lang.String searchText, java.lang.String category,
		java.lang.String location)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAvailableAssets(groupId, companyId, start,
			end, orderByColumn, orderByType, searchText, category, location);
	}

	@Override
	public int getAvailableAssetsCount(long groupId, long companyId,
		java.lang.String searchText, java.lang.String category,
		java.lang.String location)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetLocalService.getAvailableAssetsCount(groupId, companyId,
			searchText, category, location);
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.Asset> getAssets(
		long groupId, long companyId, int start, int end,
		java.lang.String orderByColumn, java.lang.String orderByType,
		java.lang.String searchText, java.lang.String category,
		java.lang.String location) {
		return _assetLocalService.getAssets(groupId, companyId, start, end,
			orderByColumn, orderByType, searchText, category, location);
	}

	@Override
	public int getAssetsCount(long groupId, long companyId,
		java.lang.String searchText, java.lang.String category,
		java.lang.String location) {
		return _assetLocalService.getAssetsCount(groupId, companyId,
			searchText, category, location);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetLocalService getWrappedAssetLocalService() {
		return _assetLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetLocalService(AssetLocalService assetLocalService) {
		_assetLocalService = assetLocalService;
	}

	@Override
	public AssetLocalService getWrappedService() {
		return _assetLocalService;
	}

	@Override
	public void setWrappedService(AssetLocalService assetLocalService) {
		_assetLocalService = assetLocalService;
	}

	private AssetLocalService _assetLocalService;
}