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

package com.rivetlogic.assetmanagement.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AssetLocation}.
 * </p>
 *
 * @author Manrique Varela
 * @see AssetLocation
 * @generated
 */
public class AssetLocationWrapper implements AssetLocation,
	ModelWrapper<AssetLocation> {
	public AssetLocationWrapper(AssetLocation assetLocation) {
		_assetLocation = assetLocation;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetLocation.class;
	}

	@Override
	public String getModelClassName() {
		return AssetLocation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetLocationId", getAssetLocationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetLocationId = (Long)attributes.get("assetLocationId");

		if (assetLocationId != null) {
			setAssetLocationId(assetLocationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this asset location.
	*
	* @return the primary key of this asset location
	*/
	@Override
	public long getPrimaryKey() {
		return _assetLocation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset location.
	*
	* @param primaryKey the primary key of this asset location
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetLocation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this asset location.
	*
	* @return the uuid of this asset location
	*/
	@Override
	public java.lang.String getUuid() {
		return _assetLocation.getUuid();
	}

	/**
	* Sets the uuid of this asset location.
	*
	* @param uuid the uuid of this asset location
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assetLocation.setUuid(uuid);
	}

	/**
	* Returns the asset location ID of this asset location.
	*
	* @return the asset location ID of this asset location
	*/
	@Override
	public long getAssetLocationId() {
		return _assetLocation.getAssetLocationId();
	}

	/**
	* Sets the asset location ID of this asset location.
	*
	* @param assetLocationId the asset location ID of this asset location
	*/
	@Override
	public void setAssetLocationId(long assetLocationId) {
		_assetLocation.setAssetLocationId(assetLocationId);
	}

	/**
	* Returns the group ID of this asset location.
	*
	* @return the group ID of this asset location
	*/
	@Override
	public long getGroupId() {
		return _assetLocation.getGroupId();
	}

	/**
	* Sets the group ID of this asset location.
	*
	* @param groupId the group ID of this asset location
	*/
	@Override
	public void setGroupId(long groupId) {
		_assetLocation.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this asset location.
	*
	* @return the company ID of this asset location
	*/
	@Override
	public long getCompanyId() {
		return _assetLocation.getCompanyId();
	}

	/**
	* Sets the company ID of this asset location.
	*
	* @param companyId the company ID of this asset location
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetLocation.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this asset location.
	*
	* @return the user ID of this asset location
	*/
	@Override
	public long getUserId() {
		return _assetLocation.getUserId();
	}

	/**
	* Sets the user ID of this asset location.
	*
	* @param userId the user ID of this asset location
	*/
	@Override
	public void setUserId(long userId) {
		_assetLocation.setUserId(userId);
	}

	/**
	* Returns the user uuid of this asset location.
	*
	* @return the user uuid of this asset location
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetLocation.getUserUuid();
	}

	/**
	* Sets the user uuid of this asset location.
	*
	* @param userUuid the user uuid of this asset location
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assetLocation.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this asset location.
	*
	* @return the user name of this asset location
	*/
	@Override
	public java.lang.String getUserName() {
		return _assetLocation.getUserName();
	}

	/**
	* Sets the user name of this asset location.
	*
	* @param userName the user name of this asset location
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assetLocation.setUserName(userName);
	}

	/**
	* Returns the create date of this asset location.
	*
	* @return the create date of this asset location
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _assetLocation.getCreateDate();
	}

	/**
	* Sets the create date of this asset location.
	*
	* @param createDate the create date of this asset location
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_assetLocation.setCreateDate(createDate);
	}

	/**
	* Returns the name of this asset location.
	*
	* @return the name of this asset location
	*/
	@Override
	public java.lang.String getName() {
		return _assetLocation.getName();
	}

	/**
	* Sets the name of this asset location.
	*
	* @param name the name of this asset location
	*/
	@Override
	public void setName(java.lang.String name) {
		_assetLocation.setName(name);
	}

	/**
	* Returns the description of this asset location.
	*
	* @return the description of this asset location
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetLocation.getDescription();
	}

	/**
	* Sets the description of this asset location.
	*
	* @param description the description of this asset location
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetLocation.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _assetLocation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetLocation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetLocation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetLocation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetLocation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetLocation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetLocation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetLocation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetLocation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetLocation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetLocation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetLocationWrapper((AssetLocation)_assetLocation.clone());
	}

	@Override
	public int compareTo(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation) {
		return _assetLocation.compareTo(assetLocation);
	}

	@Override
	public int hashCode() {
		return _assetLocation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rivetlogic.assetmanagement.model.AssetLocation> toCacheModel() {
		return _assetLocation.toCacheModel();
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetLocation toEscapedModel() {
		return new AssetLocationWrapper(_assetLocation.toEscapedModel());
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetLocation toUnescapedModel() {
		return new AssetLocationWrapper(_assetLocation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetLocation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetLocation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetLocation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetLocationWrapper)) {
			return false;
		}

		AssetLocationWrapper assetLocationWrapper = (AssetLocationWrapper)obj;

		if (Validator.equals(_assetLocation, assetLocationWrapper._assetLocation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetLocation getWrappedAssetLocation() {
		return _assetLocation;
	}

	@Override
	public AssetLocation getWrappedModel() {
		return _assetLocation;
	}

	@Override
	public void resetOriginalValues() {
		_assetLocation.resetOriginalValues();
	}

	private AssetLocation _assetLocation;
}