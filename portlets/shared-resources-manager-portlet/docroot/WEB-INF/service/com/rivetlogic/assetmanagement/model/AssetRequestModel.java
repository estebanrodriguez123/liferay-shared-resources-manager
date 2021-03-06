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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AssetRequest service. Represents a row in the &quot;rivetlogic_AssetRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestImpl}.
 * </p>
 *
 * @author Manrique Varela
 * @see AssetRequest
 * @see com.rivetlogic.assetmanagement.model.impl.AssetRequestImpl
 * @see com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl
 * @generated
 */
public interface AssetRequestModel extends BaseModel<AssetRequest>,
	StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset request model instance should use the {@link AssetRequest} interface instead.
	 */

	/**
	 * Returns the primary key of this asset request.
	 *
	 * @return the primary key of this asset request
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset request.
	 *
	 * @param primaryKey the primary key of this asset request
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this asset request.
	 *
	 * @return the uuid of this asset request
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this asset request.
	 *
	 * @param uuid the uuid of this asset request
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the asset request ID of this asset request.
	 *
	 * @return the asset request ID of this asset request
	 */
	public long getAssetRequestId();

	/**
	 * Sets the asset request ID of this asset request.
	 *
	 * @param assetRequestId the asset request ID of this asset request
	 */
	public void setAssetRequestId(long assetRequestId);

	/**
	 * Returns the group ID of this asset request.
	 *
	 * @return the group ID of this asset request
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this asset request.
	 *
	 * @param groupId the group ID of this asset request
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the asset ID of this asset request.
	 *
	 * @return the asset ID of this asset request
	 */
	public long getAssetId();

	/**
	 * Sets the asset ID of this asset request.
	 *
	 * @param assetId the asset ID of this asset request
	 */
	public void setAssetId(long assetId);

	/**
	 * Returns the user ID of this asset request.
	 *
	 * @return the user ID of this asset request
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this asset request.
	 *
	 * @param userId the user ID of this asset request
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset request.
	 *
	 * @return the user uuid of this asset request
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this asset request.
	 *
	 * @param userUuid the user uuid of this asset request
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this asset request.
	 *
	 * @return the create date of this asset request
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset request.
	 *
	 * @param createDate the create date of this asset request
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this asset request.
	 *
	 * @return the modified date of this asset request
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this asset request.
	 *
	 * @param modifiedDate the modified date of this asset request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the company ID of this asset request.
	 *
	 * @return the company ID of this asset request
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset request.
	 *
	 * @param companyId the company ID of this asset request
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user name of this asset request.
	 *
	 * @return the user name of this asset request
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this asset request.
	 *
	 * @param userName the user name of this asset request
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the requested date of this asset request.
	 *
	 * @return the requested date of this asset request
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this asset request.
	 *
	 * @param requestedDate the requested date of this asset request
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the assinged date of this asset request.
	 *
	 * @return the assinged date of this asset request
	 */
	public Date getAssingedDate();

	/**
	 * Sets the assinged date of this asset request.
	 *
	 * @param assingedDate the assinged date of this asset request
	 */
	public void setAssingedDate(Date assingedDate);

	/**
	 * Returns the booked date of this asset request.
	 *
	 * @return the booked date of this asset request
	 */
	public Date getBookedDate();

	/**
	 * Sets the booked date of this asset request.
	 *
	 * @param bookedDate the booked date of this asset request
	 */
	public void setBookedDate(Date bookedDate);

	/**
	 * Returns the returned date of this asset request.
	 *
	 * @return the returned date of this asset request
	 */
	public Date getReturnedDate();

	/**
	 * Sets the returned date of this asset request.
	 *
	 * @param returnedDate the returned date of this asset request
	 */
	public void setReturnedDate(Date returnedDate);

	/**
	 * Returns the status of this asset request.
	 *
	 * @return the status of this asset request
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this asset request.
	 *
	 * @param status the status of this asset request
	 */
	public void setStatus(String status);

	/**
	 * Returns the priority of this asset request.
	 *
	 * @return the priority of this asset request
	 */
	@AutoEscape
	public String getPriority();

	/**
	 * Sets the priority of this asset request.
	 *
	 * @param priority the priority of this asset request
	 */
	public void setPriority(String priority);

	/**
	 * Returns the description of this asset request.
	 *
	 * @return the description of this asset request
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this asset request.
	 *
	 * @param description the description of this asset request
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rivetlogic.assetmanagement.model.AssetRequest> toCacheModel();

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest toEscapedModel();

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}