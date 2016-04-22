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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Asset}.
 * </p>
 *
 * @author Manrique Varela
 * @see Asset
 * @generated
 */
public class AssetWrapper implements Asset, ModelWrapper<Asset> {
	public AssetWrapper(Asset asset) {
		_asset = asset;
	}

	@Override
	public Class<?> getModelClass() {
		return Asset.class;
	}

	@Override
	public String getModelClassName() {
		return Asset.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetId", getAssetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("location", getLocation());
		attributes.put("active", getActive());
		attributes.put("category", getCategory());
		attributes.put("status", getStatus());
		attributes.put("mimeType", getMimeType());
		attributes.put("photo", getPhoto());
		attributes.put("currentUserId", getCurrentUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long location = (Long)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long category = (Long)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String mimeType = (String)attributes.get("mimeType");

		if (mimeType != null) {
			setMimeType(mimeType);
		}

		Blob photo = (Blob)attributes.get("photo");

		if (photo != null) {
			setPhoto(photo);
		}

		Long currentUserId = (Long)attributes.get("currentUserId");

		if (currentUserId != null) {
			setCurrentUserId(currentUserId);
		}
	}

	/**
	* Returns the primary key of this asset.
	*
	* @return the primary key of this asset
	*/
	@Override
	public long getPrimaryKey() {
		return _asset.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset.
	*
	* @param primaryKey the primary key of this asset
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_asset.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this asset.
	*
	* @return the uuid of this asset
	*/
	@Override
	public java.lang.String getUuid() {
		return _asset.getUuid();
	}

	/**
	* Sets the uuid of this asset.
	*
	* @param uuid the uuid of this asset
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_asset.setUuid(uuid);
	}

	/**
	* Returns the asset ID of this asset.
	*
	* @return the asset ID of this asset
	*/
	@Override
	public long getAssetId() {
		return _asset.getAssetId();
	}

	/**
	* Sets the asset ID of this asset.
	*
	* @param assetId the asset ID of this asset
	*/
	@Override
	public void setAssetId(long assetId) {
		_asset.setAssetId(assetId);
	}

	/**
	* Returns the group ID of this asset.
	*
	* @return the group ID of this asset
	*/
	@Override
	public long getGroupId() {
		return _asset.getGroupId();
	}

	/**
	* Sets the group ID of this asset.
	*
	* @param groupId the group ID of this asset
	*/
	@Override
	public void setGroupId(long groupId) {
		_asset.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this asset.
	*
	* @return the company ID of this asset
	*/
	@Override
	public long getCompanyId() {
		return _asset.getCompanyId();
	}

	/**
	* Sets the company ID of this asset.
	*
	* @param companyId the company ID of this asset
	*/
	@Override
	public void setCompanyId(long companyId) {
		_asset.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this asset.
	*
	* @return the user ID of this asset
	*/
	@Override
	public long getUserId() {
		return _asset.getUserId();
	}

	/**
	* Sets the user ID of this asset.
	*
	* @param userId the user ID of this asset
	*/
	@Override
	public void setUserId(long userId) {
		_asset.setUserId(userId);
	}

	/**
	* Returns the user uuid of this asset.
	*
	* @return the user uuid of this asset
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _asset.getUserUuid();
	}

	/**
	* Sets the user uuid of this asset.
	*
	* @param userUuid the user uuid of this asset
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_asset.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this asset.
	*
	* @return the user name of this asset
	*/
	@Override
	public java.lang.String getUserName() {
		return _asset.getUserName();
	}

	/**
	* Sets the user name of this asset.
	*
	* @param userName the user name of this asset
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_asset.setUserName(userName);
	}

	/**
	* Returns the create date of this asset.
	*
	* @return the create date of this asset
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _asset.getCreateDate();
	}

	/**
	* Sets the create date of this asset.
	*
	* @param createDate the create date of this asset
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_asset.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this asset.
	*
	* @return the modified date of this asset
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _asset.getModifiedDate();
	}

	/**
	* Sets the modified date of this asset.
	*
	* @param modifiedDate the modified date of this asset
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_asset.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this asset.
	*
	* @return the name of this asset
	*/
	@Override
	public java.lang.String getName() {
		return _asset.getName();
	}

	/**
	* Sets the name of this asset.
	*
	* @param name the name of this asset
	*/
	@Override
	public void setName(java.lang.String name) {
		_asset.setName(name);
	}

	/**
	* Returns the description of this asset.
	*
	* @return the description of this asset
	*/
	@Override
	public java.lang.String getDescription() {
		return _asset.getDescription();
	}

	/**
	* Sets the description of this asset.
	*
	* @param description the description of this asset
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_asset.setDescription(description);
	}

	/**
	* Returns the location of this asset.
	*
	* @return the location of this asset
	*/
	@Override
	public long getLocation() {
		return _asset.getLocation();
	}

	/**
	* Sets the location of this asset.
	*
	* @param location the location of this asset
	*/
	@Override
	public void setLocation(long location) {
		_asset.setLocation(location);
	}

	/**
	* Returns the active of this asset.
	*
	* @return the active of this asset
	*/
	@Override
	public java.lang.Boolean getActive() {
		return _asset.getActive();
	}

	/**
	* Sets the active of this asset.
	*
	* @param active the active of this asset
	*/
	@Override
	public void setActive(java.lang.Boolean active) {
		_asset.setActive(active);
	}

	/**
	* Returns the category of this asset.
	*
	* @return the category of this asset
	*/
	@Override
	public long getCategory() {
		return _asset.getCategory();
	}

	/**
	* Sets the category of this asset.
	*
	* @param category the category of this asset
	*/
	@Override
	public void setCategory(long category) {
		_asset.setCategory(category);
	}

	/**
	* Returns the status of this asset.
	*
	* @return the status of this asset
	*/
	@Override
	public java.lang.String getStatus() {
		return _asset.getStatus();
	}

	/**
	* Sets the status of this asset.
	*
	* @param status the status of this asset
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_asset.setStatus(status);
	}

	/**
	* Returns the mime type of this asset.
	*
	* @return the mime type of this asset
	*/
	@Override
	public java.lang.String getMimeType() {
		return _asset.getMimeType();
	}

	/**
	* Sets the mime type of this asset.
	*
	* @param mimeType the mime type of this asset
	*/
	@Override
	public void setMimeType(java.lang.String mimeType) {
		_asset.setMimeType(mimeType);
	}

	/**
	* Returns the photo of this asset.
	*
	* @return the photo of this asset
	*/
	@Override
	public java.sql.Blob getPhoto() {
		return _asset.getPhoto();
	}

	/**
	* Sets the photo of this asset.
	*
	* @param photo the photo of this asset
	*/
	@Override
	public void setPhoto(java.sql.Blob photo) {
		_asset.setPhoto(photo);
	}

	/**
	* Returns the current user ID of this asset.
	*
	* @return the current user ID of this asset
	*/
	@Override
	public java.lang.Long getCurrentUserId() {
		return _asset.getCurrentUserId();
	}

	/**
	* Sets the current user ID of this asset.
	*
	* @param currentUserId the current user ID of this asset
	*/
	@Override
	public void setCurrentUserId(java.lang.Long currentUserId) {
		_asset.setCurrentUserId(currentUserId);
	}

	@Override
	public boolean isNew() {
		return _asset.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_asset.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _asset.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_asset.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _asset.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _asset.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_asset.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _asset.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_asset.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_asset.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_asset.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetWrapper((Asset)_asset.clone());
	}

	@Override
	public int compareTo(com.rivetlogic.assetmanagement.model.Asset asset) {
		return _asset.compareTo(asset);
	}

	@Override
	public int hashCode() {
		return _asset.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rivetlogic.assetmanagement.model.Asset> toCacheModel() {
		return _asset.toCacheModel();
	}

	@Override
	public com.rivetlogic.assetmanagement.model.Asset toEscapedModel() {
		return new AssetWrapper(_asset.toEscapedModel());
	}

	@Override
	public com.rivetlogic.assetmanagement.model.Asset toUnescapedModel() {
		return new AssetWrapper(_asset.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _asset.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _asset.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_asset.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetWrapper)) {
			return false;
		}

		AssetWrapper assetWrapper = (AssetWrapper)obj;

		if (Validator.equals(_asset, assetWrapper._asset)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _asset.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Asset getWrappedAsset() {
		return _asset;
	}

	@Override
	public Asset getWrappedModel() {
		return _asset;
	}

	@Override
	public void resetOriginalValues() {
		_asset.resetOriginalValues();
	}

	private Asset _asset;
}