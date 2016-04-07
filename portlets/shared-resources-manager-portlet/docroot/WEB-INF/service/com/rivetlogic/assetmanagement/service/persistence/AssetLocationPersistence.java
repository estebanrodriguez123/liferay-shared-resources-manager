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

import com.liferay.portal.service.persistence.BasePersistence;

import com.rivetlogic.assetmanagement.model.AssetLocation;

/**
 * The persistence interface for the asset location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Manrique Varela
 * @see AssetLocationPersistenceImpl
 * @see AssetLocationUtil
 * @generated
 */
public interface AssetLocationPersistence extends BasePersistence<AssetLocation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetLocationUtil} to access the asset location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the asset locations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the asset locations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the asset locations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first asset location in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last asset location in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where uuid = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation[] findByUuid_PrevAndNext(
		long assetLocationId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset locations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset location where uuid = &#63; and groupId = &#63; or throws a {@link com.rivetlogic.assetmanagement.NoSuchAssetLocationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the asset location where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset location where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the asset location where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the asset location that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the number of asset locations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the asset locations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the asset locations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the asset locations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation[] findByUuid_C_PrevAndNext(
		long assetLocationId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset locations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the asset locations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the asset locations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the asset locations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first asset location in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last asset location in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where groupId = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation[] findByGroupId_PrevAndNext(
		long assetLocationId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset locations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the asset locations where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the asset locations where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByCompanyGroup(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the asset locations where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByCompanyGroup(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByCompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByCompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByCompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByCompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation[] findByCompanyGroup_PrevAndNext(
		long assetLocationId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset locations where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByCompanyGroupUser(
		long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByCompanyGroupUser_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByCompanyGroupUser_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByCompanyGroupUser_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByCompanyGroupUser_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation[] findByCompanyGroupUser_PrevAndNext(
		long assetLocationId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyGroupUser(long companyId, long groupId,
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching asset locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyGroupUser(long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the asset location in the entity cache if it is enabled.
	*
	* @param assetLocation the asset location
	*/
	public void cacheResult(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation);

	/**
	* Caches the asset locations in the entity cache if it is enabled.
	*
	* @param assetLocations the asset locations
	*/
	public void cacheResult(
		java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> assetLocations);

	/**
	* Creates a new asset location with the primary key. Does not add the asset location to the database.
	*
	* @param assetLocationId the primary key for the new asset location
	* @return the new asset location
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation create(
		long assetLocationId);

	/**
	* Removes the asset location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location that was removed
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation remove(
		long assetLocationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	public com.rivetlogic.assetmanagement.model.AssetLocation updateImpl(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset location with the primary key or throws a {@link com.rivetlogic.assetmanagement.NoSuchAssetLocationException} if it could not be found.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location
	* @throws com.rivetlogic.assetmanagement.NoSuchAssetLocationException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation findByPrimaryKey(
		long assetLocationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.assetmanagement.NoSuchAssetLocationException;

	/**
	* Returns the asset location with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location, or <code>null</code> if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.assetmanagement.model.AssetLocation fetchByPrimaryKey(
		long assetLocationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the asset locations.
	*
	* @return the asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the asset locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the asset locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the asset locations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset locations.
	*
	* @return the number of asset locations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}