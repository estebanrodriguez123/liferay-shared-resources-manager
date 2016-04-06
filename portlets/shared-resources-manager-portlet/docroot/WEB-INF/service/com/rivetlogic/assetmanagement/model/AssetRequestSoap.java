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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Manrique Varela
 * @generated
 */
public class AssetRequestSoap implements Serializable {
	public static AssetRequestSoap toSoapModel(AssetRequest model) {
		AssetRequestSoap soapModel = new AssetRequestSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAssetRequestId(model.getAssetRequestId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserName(model.getUserName());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setAssingedDate(model.getAssingedDate());
		soapModel.setBookedDate(model.getBookedDate());
		soapModel.setReturnedDate(model.getReturnedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setPriority(model.getPriority());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static AssetRequestSoap[] toSoapModels(AssetRequest[] models) {
		AssetRequestSoap[] soapModels = new AssetRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetRequestSoap[][] toSoapModels(AssetRequest[][] models) {
		AssetRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetRequestSoap[] toSoapModels(List<AssetRequest> models) {
		List<AssetRequestSoap> soapModels = new ArrayList<AssetRequestSoap>(models.size());

		for (AssetRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetRequestSoap[soapModels.size()]);
	}

	public AssetRequestSoap() {
	}

	public long getPrimaryKey() {
		return _assetRequestId;
	}

	public void setPrimaryKey(long pk) {
		setAssetRequestId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAssetRequestId() {
		return _assetRequestId;
	}

	public void setAssetRequestId(long assetRequestId) {
		_assetRequestId = assetRequestId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public Date getAssingedDate() {
		return _assingedDate;
	}

	public void setAssingedDate(Date assingedDate) {
		_assingedDate = assingedDate;
	}

	public Date getBookedDate() {
		return _bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		_bookedDate = bookedDate;
	}

	public Date getReturnedDate() {
		return _returnedDate;
	}

	public void setReturnedDate(Date returnedDate) {
		_returnedDate = returnedDate;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getPriority() {
		return _priority;
	}

	public void setPriority(String priority) {
		_priority = priority;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private String _uuid;
	private long _assetRequestId;
	private long _groupId;
	private long _assetId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _companyId;
	private String _userName;
	private Date _requestedDate;
	private Date _assingedDate;
	private Date _bookedDate;
	private Date _returnedDate;
	private String _status;
	private String _priority;
	private String _description;
}