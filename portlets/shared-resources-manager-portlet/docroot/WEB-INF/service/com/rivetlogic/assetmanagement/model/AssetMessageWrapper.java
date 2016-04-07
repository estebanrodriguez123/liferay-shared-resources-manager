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
 * This class is a wrapper for {@link AssetMessage}.
 * </p>
 *
 * @author Manrique Varela
 * @see AssetMessage
 * @generated
 */
public class AssetMessageWrapper implements AssetMessage,
	ModelWrapper<AssetMessage> {
	public AssetMessageWrapper(AssetMessage assetMessage) {
		_assetMessage = assetMessage;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetMessage.class;
	}

	@Override
	public String getModelClassName() {
		return AssetMessage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetMessageId", getAssetMessageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("assetId", getAssetId());
		attributes.put("fromUserId", getFromUserId());
		attributes.put("toUserId", getToUserId());
		attributes.put("message", getMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetMessageId = (Long)attributes.get("assetMessageId");

		if (assetMessageId != null) {
			setAssetMessageId(assetMessageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Long fromUserId = (Long)attributes.get("fromUserId");

		if (fromUserId != null) {
			setFromUserId(fromUserId);
		}

		Long toUserId = (Long)attributes.get("toUserId");

		if (toUserId != null) {
			setToUserId(toUserId);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	/**
	* Returns the primary key of this asset message.
	*
	* @return the primary key of this asset message
	*/
	@Override
	public long getPrimaryKey() {
		return _assetMessage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset message.
	*
	* @param primaryKey the primary key of this asset message
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetMessage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this asset message.
	*
	* @return the uuid of this asset message
	*/
	@Override
	public java.lang.String getUuid() {
		return _assetMessage.getUuid();
	}

	/**
	* Sets the uuid of this asset message.
	*
	* @param uuid the uuid of this asset message
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assetMessage.setUuid(uuid);
	}

	/**
	* Returns the asset message ID of this asset message.
	*
	* @return the asset message ID of this asset message
	*/
	@Override
	public long getAssetMessageId() {
		return _assetMessage.getAssetMessageId();
	}

	/**
	* Sets the asset message ID of this asset message.
	*
	* @param assetMessageId the asset message ID of this asset message
	*/
	@Override
	public void setAssetMessageId(long assetMessageId) {
		_assetMessage.setAssetMessageId(assetMessageId);
	}

	/**
	* Returns the group ID of this asset message.
	*
	* @return the group ID of this asset message
	*/
	@Override
	public long getGroupId() {
		return _assetMessage.getGroupId();
	}

	/**
	* Sets the group ID of this asset message.
	*
	* @param groupId the group ID of this asset message
	*/
	@Override
	public void setGroupId(long groupId) {
		_assetMessage.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this asset message.
	*
	* @return the company ID of this asset message
	*/
	@Override
	public long getCompanyId() {
		return _assetMessage.getCompanyId();
	}

	/**
	* Sets the company ID of this asset message.
	*
	* @param companyId the company ID of this asset message
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetMessage.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this asset message.
	*
	* @return the create date of this asset message
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _assetMessage.getCreateDate();
	}

	/**
	* Sets the create date of this asset message.
	*
	* @param createDate the create date of this asset message
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_assetMessage.setCreateDate(createDate);
	}

	/**
	* Returns the asset ID of this asset message.
	*
	* @return the asset ID of this asset message
	*/
	@Override
	public long getAssetId() {
		return _assetMessage.getAssetId();
	}

	/**
	* Sets the asset ID of this asset message.
	*
	* @param assetId the asset ID of this asset message
	*/
	@Override
	public void setAssetId(long assetId) {
		_assetMessage.setAssetId(assetId);
	}

	/**
	* Returns the from user ID of this asset message.
	*
	* @return the from user ID of this asset message
	*/
	@Override
	public long getFromUserId() {
		return _assetMessage.getFromUserId();
	}

	/**
	* Sets the from user ID of this asset message.
	*
	* @param fromUserId the from user ID of this asset message
	*/
	@Override
	public void setFromUserId(long fromUserId) {
		_assetMessage.setFromUserId(fromUserId);
	}

	/**
	* Returns the from user uuid of this asset message.
	*
	* @return the from user uuid of this asset message
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getFromUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessage.getFromUserUuid();
	}

	/**
	* Sets the from user uuid of this asset message.
	*
	* @param fromUserUuid the from user uuid of this asset message
	*/
	@Override
	public void setFromUserUuid(java.lang.String fromUserUuid) {
		_assetMessage.setFromUserUuid(fromUserUuid);
	}

	/**
	* Returns the to user ID of this asset message.
	*
	* @return the to user ID of this asset message
	*/
	@Override
	public long getToUserId() {
		return _assetMessage.getToUserId();
	}

	/**
	* Sets the to user ID of this asset message.
	*
	* @param toUserId the to user ID of this asset message
	*/
	@Override
	public void setToUserId(long toUserId) {
		_assetMessage.setToUserId(toUserId);
	}

	/**
	* Returns the to user uuid of this asset message.
	*
	* @return the to user uuid of this asset message
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getToUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetMessage.getToUserUuid();
	}

	/**
	* Sets the to user uuid of this asset message.
	*
	* @param toUserUuid the to user uuid of this asset message
	*/
	@Override
	public void setToUserUuid(java.lang.String toUserUuid) {
		_assetMessage.setToUserUuid(toUserUuid);
	}

	/**
	* Returns the message of this asset message.
	*
	* @return the message of this asset message
	*/
	@Override
	public java.lang.String getMessage() {
		return _assetMessage.getMessage();
	}

	/**
	* Sets the message of this asset message.
	*
	* @param message the message of this asset message
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_assetMessage.setMessage(message);
	}

	@Override
	public boolean isNew() {
		return _assetMessage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetMessage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetMessage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetMessage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetMessage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetMessage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetMessage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetMessage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetMessageWrapper((AssetMessage)_assetMessage.clone());
	}

	@Override
	public int compareTo(
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage) {
		return _assetMessage.compareTo(assetMessage);
	}

	@Override
	public int hashCode() {
		return _assetMessage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rivetlogic.assetmanagement.model.AssetMessage> toCacheModel() {
		return _assetMessage.toCacheModel();
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage toEscapedModel() {
		return new AssetMessageWrapper(_assetMessage.toEscapedModel());
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage toUnescapedModel() {
		return new AssetMessageWrapper(_assetMessage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetMessage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetMessage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetMessage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetMessageWrapper)) {
			return false;
		}

		AssetMessageWrapper assetMessageWrapper = (AssetMessageWrapper)obj;

		if (Validator.equals(_assetMessage, assetMessageWrapper._assetMessage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetMessage getWrappedAssetMessage() {
		return _assetMessage;
	}

	@Override
	public AssetMessage getWrappedModel() {
		return _assetMessage;
	}

	@Override
	public void resetOriginalValues() {
		_assetMessage.resetOriginalValues();
	}

	private AssetMessage _assetMessage;
}