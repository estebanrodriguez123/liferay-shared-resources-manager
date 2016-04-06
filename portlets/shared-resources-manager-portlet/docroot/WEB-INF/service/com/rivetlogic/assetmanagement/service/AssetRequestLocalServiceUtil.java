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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AssetRequest. This utility wraps
 * {@link com.rivetlogic.assetmanagement.service.impl.AssetRequestLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Manrique Varela
 * @see AssetRequestLocalService
 * @see com.rivetlogic.assetmanagement.service.base.AssetRequestLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.impl.AssetRequestLocalServiceImpl
 * @generated
 */
public class AssetRequestLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rivetlogic.assetmanagement.service.impl.AssetRequestLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the asset request to the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetRequest addAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAssetRequest(assetRequest);
	}

	/**
	* Creates a new asset request with the primary key. Does not add the asset request to the database.
	*
	* @param assetRequestId the primary key for the new asset request
	* @return the new asset request
	*/
	public static com.rivetlogic.assetmanagement.model.AssetRequest createAssetRequest(
		long assetRequestId) {
		return getService().createAssetRequest(assetRequestId);
	}

	/**
	* Deletes the asset request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request that was removed
	* @throws PortalException if a asset request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssetRequest(assetRequestId);
	}

	/**
	* Deletes the asset request from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssetRequest(assetRequest);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest fetchAssetRequest(
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssetRequest(assetRequestId);
	}

	/**
	* Returns the asset request with the matching UUID and company.
	*
	* @param uuid the asset request's UUID
	* @param companyId the primary key of the company
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetRequest fetchAssetRequestByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssetRequestByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the asset request matching the UUID and group.
	*
	* @param uuid the asset request's UUID
	* @param groupId the primary key of the group
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetRequest fetchAssetRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssetRequestByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the asset request with the primary key.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request
	* @throws PortalException if a asset request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetRequest getAssetRequest(
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetRequest(assetRequestId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static com.rivetlogic.assetmanagement.model.AssetRequest getAssetRequestByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetRequestByUuidAndCompanyId(uuid, companyId);
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
	public static com.rivetlogic.assetmanagement.model.AssetRequest getAssetRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetRequestByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getAssetRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetRequests(start, end);
	}

	/**
	* Returns the number of asset requests.
	*
	* @return the number of asset requests
	* @throws SystemException if a system exception occurred
	*/
	public static int getAssetRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetRequestsCount();
	}

	/**
	* Updates the asset request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetRequest updateAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAssetRequest(assetRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest bookAsset(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.AssetRequest requestedAsset)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .bookAsset(themeDisplay, serviceContext, requestedAsset);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest returnAsset(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext, long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().returnAsset(themeDisplay, serviceContext, assetId);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest rejectAssetRequest(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext, long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .rejectAssetRequest(themeDisplay, serviceContext, assetId);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest receiveAsset(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext, long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().receiveAsset(themeDisplay, serviceContext, assetId);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteAssetRequest(themeDisplay, serviceContext,
			assetRequestId);
	}

	public static void deleteAssetRequestByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAssetRequestByAssetId(assetId);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest getRequestAssetByAssetId(
		long assetId, long userId, java.lang.String status) {
		return getService().getRequestAssetByAssetId(assetId, userId, status);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest getRequestAssetByAssetId(
		long assetId, java.lang.String status) {
		return getService().getRequestAssetByAssetId(assetId, status);
	}

	public static boolean hasUserAssetRequests(long assetId, long userId,
		java.lang.String status) {
		return getService().hasUserAssetRequests(assetId, userId, status);
	}

	public static com.rivetlogic.assetmanagement.model.AssetRequest getUserAssetRequests(
		long assetId, long userId, java.lang.String status) {
		return getService().getUserAssetRequests(assetId, userId, status);
	}

	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getRequestsByAsset(
		long assetId, int start, int end, java.lang.String orderByColumn,
		java.lang.String orderByType) {
		return getService()
				   .getRequestsByAsset(assetId, start, end, orderByColumn,
			orderByType);
	}

	public static int getRequestsCountByAsset(long assetId) {
		return getService().getRequestsCountByAsset(assetId);
	}

	public static void reasignAssets()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().reasignAssets();
	}

	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getAssignedAssetsRequest() {
		return getService().getAssignedAssetsRequest();
	}

	public static void clearService() {
		_service = null;
	}

	public static AssetRequestLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AssetRequestLocalService.class.getName());

			if (invokableLocalService instanceof AssetRequestLocalService) {
				_service = (AssetRequestLocalService)invokableLocalService;
			}
			else {
				_service = new AssetRequestLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AssetRequestLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AssetRequestLocalService service) {
	}

	private static AssetRequestLocalService _service;
}