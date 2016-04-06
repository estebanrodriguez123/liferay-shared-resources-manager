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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AssetRequest}.
 * </p>
 *
 * @author Manrique Varela
 * @see AssetRequest
 * @generated
 */
public class AssetRequestWrapper implements AssetRequest,
	ModelWrapper<AssetRequest> {
	public AssetRequestWrapper(AssetRequest assetRequest) {
		_assetRequest = assetRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetRequest.class;
	}

	@Override
	public String getModelClassName() {
		return AssetRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetRequestId", getAssetRequestId());
		attributes.put("groupId", getGroupId());
		attributes.put("assetId", getAssetId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("userName", getUserName());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("assingedDate", getAssingedDate());
		attributes.put("bookedDate", getBookedDate());
		attributes.put("returnedDate", getReturnedDate());
		attributes.put("status", getStatus());
		attributes.put("priority", getPriority());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetRequestId = (Long)attributes.get("assetRequestId");

		if (assetRequestId != null) {
			setAssetRequestId(assetRequestId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		Date assingedDate = (Date)attributes.get("assingedDate");

		if (assingedDate != null) {
			setAssingedDate(assingedDate);
		}

		Date bookedDate = (Date)attributes.get("bookedDate");

		if (bookedDate != null) {
			setBookedDate(bookedDate);
		}

		Date returnedDate = (Date)attributes.get("returnedDate");

		if (returnedDate != null) {
			setReturnedDate(returnedDate);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String priority = (String)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this asset request.
	*
	* @return the primary key of this asset request
	*/
	@Override
	public long getPrimaryKey() {
		return _assetRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset request.
	*
	* @param primaryKey the primary key of this asset request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this asset request.
	*
	* @return the uuid of this asset request
	*/
	@Override
	public java.lang.String getUuid() {
		return _assetRequest.getUuid();
	}

	/**
	* Sets the uuid of this asset request.
	*
	* @param uuid the uuid of this asset request
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assetRequest.setUuid(uuid);
	}

	/**
	* Returns the asset request ID of this asset request.
	*
	* @return the asset request ID of this asset request
	*/
	@Override
	public long getAssetRequestId() {
		return _assetRequest.getAssetRequestId();
	}

	/**
	* Sets the asset request ID of this asset request.
	*
	* @param assetRequestId the asset request ID of this asset request
	*/
	@Override
	public void setAssetRequestId(long assetRequestId) {
		_assetRequest.setAssetRequestId(assetRequestId);
	}

	/**
	* Returns the group ID of this asset request.
	*
	* @return the group ID of this asset request
	*/
	@Override
	public long getGroupId() {
		return _assetRequest.getGroupId();
	}

	/**
	* Sets the group ID of this asset request.
	*
	* @param groupId the group ID of this asset request
	*/
	@Override
	public void setGroupId(long groupId) {
		_assetRequest.setGroupId(groupId);
	}

	/**
	* Returns the asset ID of this asset request.
	*
	* @return the asset ID of this asset request
	*/
	@Override
	public long getAssetId() {
		return _assetRequest.getAssetId();
	}

	/**
	* Sets the asset ID of this asset request.
	*
	* @param assetId the asset ID of this asset request
	*/
	@Override
	public void setAssetId(long assetId) {
		_assetRequest.setAssetId(assetId);
	}

	/**
	* Returns the user ID of this asset request.
	*
	* @return the user ID of this asset request
	*/
	@Override
	public long getUserId() {
		return _assetRequest.getUserId();
	}

	/**
	* Sets the user ID of this asset request.
	*
	* @param userId the user ID of this asset request
	*/
	@Override
	public void setUserId(long userId) {
		_assetRequest.setUserId(userId);
	}

	/**
	* Returns the user uuid of this asset request.
	*
	* @return the user uuid of this asset request
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetRequest.getUserUuid();
	}

	/**
	* Sets the user uuid of this asset request.
	*
	* @param userUuid the user uuid of this asset request
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assetRequest.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this asset request.
	*
	* @return the create date of this asset request
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _assetRequest.getCreateDate();
	}

	/**
	* Sets the create date of this asset request.
	*
	* @param createDate the create date of this asset request
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_assetRequest.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this asset request.
	*
	* @return the modified date of this asset request
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _assetRequest.getModifiedDate();
	}

	/**
	* Sets the modified date of this asset request.
	*
	* @param modifiedDate the modified date of this asset request
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_assetRequest.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the company ID of this asset request.
	*
	* @return the company ID of this asset request
	*/
	@Override
	public long getCompanyId() {
		return _assetRequest.getCompanyId();
	}

	/**
	* Sets the company ID of this asset request.
	*
	* @param companyId the company ID of this asset request
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetRequest.setCompanyId(companyId);
	}

	/**
	* Returns the user name of this asset request.
	*
	* @return the user name of this asset request
	*/
	@Override
	public java.lang.String getUserName() {
		return _assetRequest.getUserName();
	}

	/**
	* Sets the user name of this asset request.
	*
	* @param userName the user name of this asset request
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assetRequest.setUserName(userName);
	}

	/**
	* Returns the requested date of this asset request.
	*
	* @return the requested date of this asset request
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _assetRequest.getRequestedDate();
	}

	/**
	* Sets the requested date of this asset request.
	*
	* @param requestedDate the requested date of this asset request
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_assetRequest.setRequestedDate(requestedDate);
	}

	/**
	* Returns the assinged date of this asset request.
	*
	* @return the assinged date of this asset request
	*/
	@Override
	public java.util.Date getAssingedDate() {
		return _assetRequest.getAssingedDate();
	}

	/**
	* Sets the assinged date of this asset request.
	*
	* @param assingedDate the assinged date of this asset request
	*/
	@Override
	public void setAssingedDate(java.util.Date assingedDate) {
		_assetRequest.setAssingedDate(assingedDate);
	}

	/**
	* Returns the booked date of this asset request.
	*
	* @return the booked date of this asset request
	*/
	@Override
	public java.util.Date getBookedDate() {
		return _assetRequest.getBookedDate();
	}

	/**
	* Sets the booked date of this asset request.
	*
	* @param bookedDate the booked date of this asset request
	*/
	@Override
	public void setBookedDate(java.util.Date bookedDate) {
		_assetRequest.setBookedDate(bookedDate);
	}

	/**
	* Returns the returned date of this asset request.
	*
	* @return the returned date of this asset request
	*/
	@Override
	public java.util.Date getReturnedDate() {
		return _assetRequest.getReturnedDate();
	}

	/**
	* Sets the returned date of this asset request.
	*
	* @param returnedDate the returned date of this asset request
	*/
	@Override
	public void setReturnedDate(java.util.Date returnedDate) {
		_assetRequest.setReturnedDate(returnedDate);
	}

	/**
	* Returns the status of this asset request.
	*
	* @return the status of this asset request
	*/
	@Override
	public java.lang.String getStatus() {
		return _assetRequest.getStatus();
	}

	/**
	* Sets the status of this asset request.
	*
	* @param status the status of this asset request
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_assetRequest.setStatus(status);
	}

	/**
	* Returns the priority of this asset request.
	*
	* @return the priority of this asset request
	*/
	@Override
	public java.lang.String getPriority() {
		return _assetRequest.getPriority();
	}

	/**
	* Sets the priority of this asset request.
	*
	* @param priority the priority of this asset request
	*/
	@Override
	public void setPriority(java.lang.String priority) {
		_assetRequest.setPriority(priority);
	}

	/**
	* Returns the description of this asset request.
	*
	* @return the description of this asset request
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetRequest.getDescription();
	}

	/**
	* Sets the description of this asset request.
	*
	* @param description the description of this asset request
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetRequest.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _assetRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetRequestWrapper((AssetRequest)_assetRequest.clone());
	}

	@Override
	public int compareTo(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest) {
		return _assetRequest.compareTo(assetRequest);
	}

	@Override
	public int hashCode() {
		return _assetRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rivetlogic.assetmanagement.model.AssetRequest> toCacheModel() {
		return _assetRequest.toCacheModel();
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest toEscapedModel() {
		return new AssetRequestWrapper(_assetRequest.toEscapedModel());
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest toUnescapedModel() {
		return new AssetRequestWrapper(_assetRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetRequestWrapper)) {
			return false;
		}

		AssetRequestWrapper assetRequestWrapper = (AssetRequestWrapper)obj;

		if (Validator.equals(_assetRequest, assetRequestWrapper._assetRequest)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _assetRequest.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetRequest getWrappedAssetRequest() {
		return _assetRequest;
	}

	@Override
	public AssetRequest getWrappedModel() {
		return _assetRequest;
	}

	@Override
	public void resetOriginalValues() {
		_assetRequest.resetOriginalValues();
	}

	private AssetRequest _assetRequest;
}