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
 * This class is a wrapper for {@link AssetCategory}.
 * </p>
 *
 * @author Manrique Varela
 * @see AssetCategory
 * @generated
 */
public class AssetCategoryWrapper implements AssetCategory,
	ModelWrapper<AssetCategory> {
	public AssetCategoryWrapper(AssetCategory assetCategory) {
		_assetCategory = assetCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetCategory.class;
	}

	@Override
	public String getModelClassName() {
		return AssetCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetCategoryId", getAssetCategoryId());
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

		Long assetCategoryId = (Long)attributes.get("assetCategoryId");

		if (assetCategoryId != null) {
			setAssetCategoryId(assetCategoryId);
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
	* Returns the primary key of this asset category.
	*
	* @return the primary key of this asset category
	*/
	@Override
	public long getPrimaryKey() {
		return _assetCategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset category.
	*
	* @param primaryKey the primary key of this asset category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetCategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this asset category.
	*
	* @return the uuid of this asset category
	*/
	@Override
	public java.lang.String getUuid() {
		return _assetCategory.getUuid();
	}

	/**
	* Sets the uuid of this asset category.
	*
	* @param uuid the uuid of this asset category
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assetCategory.setUuid(uuid);
	}

	/**
	* Returns the asset category ID of this asset category.
	*
	* @return the asset category ID of this asset category
	*/
	@Override
	public long getAssetCategoryId() {
		return _assetCategory.getAssetCategoryId();
	}

	/**
	* Sets the asset category ID of this asset category.
	*
	* @param assetCategoryId the asset category ID of this asset category
	*/
	@Override
	public void setAssetCategoryId(long assetCategoryId) {
		_assetCategory.setAssetCategoryId(assetCategoryId);
	}

	/**
	* Returns the group ID of this asset category.
	*
	* @return the group ID of this asset category
	*/
	@Override
	public long getGroupId() {
		return _assetCategory.getGroupId();
	}

	/**
	* Sets the group ID of this asset category.
	*
	* @param groupId the group ID of this asset category
	*/
	@Override
	public void setGroupId(long groupId) {
		_assetCategory.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this asset category.
	*
	* @return the company ID of this asset category
	*/
	@Override
	public long getCompanyId() {
		return _assetCategory.getCompanyId();
	}

	/**
	* Sets the company ID of this asset category.
	*
	* @param companyId the company ID of this asset category
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetCategory.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this asset category.
	*
	* @return the user ID of this asset category
	*/
	@Override
	public long getUserId() {
		return _assetCategory.getUserId();
	}

	/**
	* Sets the user ID of this asset category.
	*
	* @param userId the user ID of this asset category
	*/
	@Override
	public void setUserId(long userId) {
		_assetCategory.setUserId(userId);
	}

	/**
	* Returns the user uuid of this asset category.
	*
	* @return the user uuid of this asset category
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetCategory.getUserUuid();
	}

	/**
	* Sets the user uuid of this asset category.
	*
	* @param userUuid the user uuid of this asset category
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assetCategory.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this asset category.
	*
	* @return the user name of this asset category
	*/
	@Override
	public java.lang.String getUserName() {
		return _assetCategory.getUserName();
	}

	/**
	* Sets the user name of this asset category.
	*
	* @param userName the user name of this asset category
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assetCategory.setUserName(userName);
	}

	/**
	* Returns the create date of this asset category.
	*
	* @return the create date of this asset category
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _assetCategory.getCreateDate();
	}

	/**
	* Sets the create date of this asset category.
	*
	* @param createDate the create date of this asset category
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_assetCategory.setCreateDate(createDate);
	}

	/**
	* Returns the name of this asset category.
	*
	* @return the name of this asset category
	*/
	@Override
	public java.lang.String getName() {
		return _assetCategory.getName();
	}

	/**
	* Sets the name of this asset category.
	*
	* @param name the name of this asset category
	*/
	@Override
	public void setName(java.lang.String name) {
		_assetCategory.setName(name);
	}

	/**
	* Returns the description of this asset category.
	*
	* @return the description of this asset category
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetCategory.getDescription();
	}

	/**
	* Sets the description of this asset category.
	*
	* @param description the description of this asset category
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetCategory.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _assetCategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetCategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetCategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetCategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetCategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetCategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetCategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetCategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetCategoryWrapper((AssetCategory)_assetCategory.clone());
	}

	@Override
	public int compareTo(
		com.rivetlogic.assetmanagement.model.AssetCategory assetCategory) {
		return _assetCategory.compareTo(assetCategory);
	}

	@Override
	public int hashCode() {
		return _assetCategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rivetlogic.assetmanagement.model.AssetCategory> toCacheModel() {
		return _assetCategory.toCacheModel();
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory toEscapedModel() {
		return new AssetCategoryWrapper(_assetCategory.toEscapedModel());
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetCategory toUnescapedModel() {
		return new AssetCategoryWrapper(_assetCategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetCategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetCategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetCategoryWrapper)) {
			return false;
		}

		AssetCategoryWrapper assetCategoryWrapper = (AssetCategoryWrapper)obj;

		if (Validator.equals(_assetCategory, assetCategoryWrapper._assetCategory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetCategory getWrappedAssetCategory() {
		return _assetCategory;
	}

	@Override
	public AssetCategory getWrappedModel() {
		return _assetCategory;
	}

	@Override
	public void resetOriginalValues() {
		_assetCategory.resetOriginalValues();
	}

	private AssetCategory _assetCategory;
}