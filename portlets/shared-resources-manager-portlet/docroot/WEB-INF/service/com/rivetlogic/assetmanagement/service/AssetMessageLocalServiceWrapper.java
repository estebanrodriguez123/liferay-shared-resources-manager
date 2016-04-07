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
 * Provides a wrapper for {@link AssetMessageLocalService}.
 *
 * @author Manrique Varela
 * @see AssetMessageLocalService
 * @generated
 */
public class AssetMessageLocalServiceWrapper implements AssetMessageLocalService,
	ServiceWrapper<AssetMessageLocalService> {
	public AssetMessageLocalServiceWrapper(
		AssetMessageLocalService assetMessageLocalService) {
		_assetMessageLocalService = assetMessageLocalService;
	}

	/**
	* Adds the asset message to the database. Also notifies the appropriate model listeners.
	*
	* @param assetMessage the asset message
	* @return the asset message that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage addAssetMessage(
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.addAssetMessage(assetMessage);
	}

	/**
	* Creates a new asset message with the primary key. Does not add the asset message to the database.
	*
	* @param assetMessageId the primary key for the new asset message
	* @return the new asset message
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage createAssetMessage(
		long assetMessageId) {
		return _assetMessageLocalService.createAssetMessage(assetMessageId);
	}

	/**
	* Deletes the asset message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetMessageId the primary key of the asset message
	* @return the asset message that was removed
	* @throws PortalException if a asset message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage deleteAssetMessage(
		long assetMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.deleteAssetMessage(assetMessageId);
	}

	/**
	* Deletes the asset message from the database. Also notifies the appropriate model listeners.
	*
	* @param assetMessage the asset message
	* @return the asset message that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage deleteAssetMessage(
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.deleteAssetMessage(assetMessage);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetMessageLocalService.dynamicQuery();
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
		return _assetMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetMessageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetMessageLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _assetMessageLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assetMessageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage fetchAssetMessage(
		long assetMessageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.fetchAssetMessage(assetMessageId);
	}

	/**
	* Returns the asset message with the matching UUID and company.
	*
	* @param uuid the asset message's UUID
	* @param companyId the primary key of the company
	* @return the matching asset message, or <code>null</code> if a matching asset message could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage fetchAssetMessageByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.fetchAssetMessageByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the asset message matching the UUID and group.
	*
	* @param uuid the asset message's UUID
	* @param groupId the primary key of the group
	* @return the matching asset message, or <code>null</code> if a matching asset message could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage fetchAssetMessageByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.fetchAssetMessageByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the asset message with the primary key.
	*
	* @param assetMessageId the primary key of the asset message
	* @return the asset message
	* @throws PortalException if a asset message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage getAssetMessage(
		long assetMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.getAssetMessage(assetMessageId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the asset message with the matching UUID and company.
	*
	* @param uuid the asset message's UUID
	* @param companyId the primary key of the company
	* @return the matching asset message
	* @throws PortalException if a matching asset message could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage getAssetMessageByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.getAssetMessageByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the asset message matching the UUID and group.
	*
	* @param uuid the asset message's UUID
	* @param groupId the primary key of the group
	* @return the matching asset message
	* @throws PortalException if a matching asset message could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage getAssetMessageByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.getAssetMessageByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the asset messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @return the range of asset messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetMessage> getAssetMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.getAssetMessages(start, end);
	}

	/**
	* Returns the number of asset messages.
	*
	* @return the number of asset messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssetMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.getAssetMessagesCount();
	}

	/**
	* Updates the asset message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetMessage the asset message
	* @return the asset message that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage updateAssetMessage(
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.updateAssetMessage(assetMessage);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetMessageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetMessageLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetMessageLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage addAssetMessage(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage,
		java.lang.String notificationType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.addAssetMessage(themeDisplay,
			serviceContext, assetMessage, notificationType);
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetMessage> getAssetMessages(
		long assetId, long userId, int start, int end) {
		return _assetMessageLocalService.getAssetMessages(assetId, userId,
			start, end);
	}

	@Override
	public int getAssetMessagesCount(long assetId, long userId) {
		return _assetMessageLocalService.getAssetMessagesCount(assetId, userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetMessageLocalService getWrappedAssetMessageLocalService() {
		return _assetMessageLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetMessageLocalService(
		AssetMessageLocalService assetMessageLocalService) {
		_assetMessageLocalService = assetMessageLocalService;
	}

	@Override
	public AssetMessageLocalService getWrappedService() {
		return _assetMessageLocalService;
	}

	@Override
	public void setWrappedService(
		AssetMessageLocalService assetMessageLocalService) {
		_assetMessageLocalService = assetMessageLocalService;
	}

	private AssetMessageLocalService _assetMessageLocalService;
}