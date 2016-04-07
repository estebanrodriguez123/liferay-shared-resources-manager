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
 * Provides a wrapper for {@link AssetRequestLocalService}.
 *
 * @author Manrique Varela
 * @see AssetRequestLocalService
 * @generated
 */
public class AssetRequestLocalServiceWrapper implements AssetRequestLocalService,
	ServiceWrapper<AssetRequestLocalService> {
	public AssetRequestLocalServiceWrapper(
		AssetRequestLocalService assetRequestLocalService) {
		_assetRequestLocalService = assetRequestLocalService;
	}

	/**
	* Adds the asset request to the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest addAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.addAssetRequest(assetRequest);
	}

	/**
	* Creates a new asset request with the primary key. Does not add the asset request to the database.
	*
	* @param assetRequestId the primary key for the new asset request
	* @return the new asset request
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest createAssetRequest(
		long assetRequestId) {
		return _assetRequestLocalService.createAssetRequest(assetRequestId);
	}

	/**
	* Deletes the asset request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request that was removed
	* @throws PortalException if a asset request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.deleteAssetRequest(assetRequestId);
	}

	/**
	* Deletes the asset request from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.deleteAssetRequest(assetRequest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetRequestLocalService.dynamicQuery();
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
		return _assetRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetRequestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetRequestLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _assetRequestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assetRequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest fetchAssetRequest(
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.fetchAssetRequest(assetRequestId);
	}

	/**
	* Returns the asset request with the matching UUID and company.
	*
	* @param uuid the asset request's UUID
	* @param companyId the primary key of the company
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest fetchAssetRequestByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.fetchAssetRequestByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the asset request matching the UUID and group.
	*
	* @param uuid the asset request's UUID
	* @param groupId the primary key of the group
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest fetchAssetRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.fetchAssetRequestByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the asset request with the primary key.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request
	* @throws PortalException if a asset request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getAssetRequest(
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.getAssetRequest(assetRequestId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the asset request with the matching UUID and company.
	*
	* @param uuid the asset request's UUID
	* @param companyId the primary key of the company
	* @return the matching asset request
	* @throws PortalException if a matching asset request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getAssetRequestByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.getAssetRequestByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the asset request matching the UUID and group.
	*
	* @param uuid the asset request's UUID
	* @param groupId the primary key of the group
	* @return the matching asset request
	* @throws PortalException if a matching asset request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getAssetRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.getAssetRequestByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the asset requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @return the range of asset requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getAssetRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.getAssetRequests(start, end);
	}

	/**
	* Returns the number of asset requests.
	*
	* @return the number of asset requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssetRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.getAssetRequestsCount();
	}

	/**
	* Updates the asset request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest updateAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.updateAssetRequest(assetRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetRequestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetRequestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetRequestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest bookAsset(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.AssetRequest requestedAsset)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.bookAsset(themeDisplay,
			serviceContext, requestedAsset);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest returnAsset(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext, long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.returnAsset(themeDisplay,
			serviceContext, assetId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest rejectAssetRequest(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext, long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.rejectAssetRequest(themeDisplay,
			serviceContext, assetId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest receiveAsset(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext, long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.receiveAsset(themeDisplay,
			serviceContext, assetId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.deleteAssetRequest(themeDisplay,
			serviceContext, assetRequestId);
	}

	@Override
	public void deleteAssetRequestByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_assetRequestLocalService.deleteAssetRequestByAssetId(assetId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getRequestAssetByAssetId(
		long assetId, long userId, java.lang.String status) {
		return _assetRequestLocalService.getRequestAssetByAssetId(assetId,
			userId, status);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getRequestAssetByAssetId(
		long assetId, java.lang.String status) {
		return _assetRequestLocalService.getRequestAssetByAssetId(assetId,
			status);
	}

	@Override
	public boolean hasUserAssetRequests(long assetId, long userId,
		java.lang.String status) {
		return _assetRequestLocalService.hasUserAssetRequests(assetId, userId,
			status);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getUserAssetRequests(
		long assetId, long userId, java.lang.String status) {
		return _assetRequestLocalService.getUserAssetRequests(assetId, userId,
			status);
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getRequestsByAsset(
		long assetId, int start, int end, java.lang.String orderByColumn,
		java.lang.String orderByType) {
		return _assetRequestLocalService.getRequestsByAsset(assetId, start,
			end, orderByColumn, orderByType);
	}

	@Override
	public int getRequestsCountByAsset(long assetId) {
		return _assetRequestLocalService.getRequestsCountByAsset(assetId);
	}

	@Override
	public void reasignAssets()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_assetRequestLocalService.reasignAssets();
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getAssignedAssetsRequest() {
		return _assetRequestLocalService.getAssignedAssetsRequest();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetRequestLocalService getWrappedAssetRequestLocalService() {
		return _assetRequestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetRequestLocalService(
		AssetRequestLocalService assetRequestLocalService) {
		_assetRequestLocalService = assetRequestLocalService;
	}

	@Override
	public AssetRequestLocalService getWrappedService() {
		return _assetRequestLocalService;
	}

	@Override
	public void setWrappedService(
		AssetRequestLocalService assetRequestLocalService) {
		_assetRequestLocalService = assetRequestLocalService;
	}

	private AssetRequestLocalService _assetRequestLocalService;
}