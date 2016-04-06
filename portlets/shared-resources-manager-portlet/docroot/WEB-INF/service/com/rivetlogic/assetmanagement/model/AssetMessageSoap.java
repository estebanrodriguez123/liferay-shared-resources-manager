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
public class AssetMessageSoap implements Serializable {
	public static AssetMessageSoap toSoapModel(AssetMessage model) {
		AssetMessageSoap soapModel = new AssetMessageSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAssetMessageId(model.getAssetMessageId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setFromUserId(model.getFromUserId());
		soapModel.setToUserId(model.getToUserId());
		soapModel.setMessage(model.getMessage());

		return soapModel;
	}

	public static AssetMessageSoap[] toSoapModels(AssetMessage[] models) {
		AssetMessageSoap[] soapModels = new AssetMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetMessageSoap[][] toSoapModels(AssetMessage[][] models) {
		AssetMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetMessageSoap[] toSoapModels(List<AssetMessage> models) {
		List<AssetMessageSoap> soapModels = new ArrayList<AssetMessageSoap>(models.size());

		for (AssetMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetMessageSoap[soapModels.size()]);
	}

	public AssetMessageSoap() {
	}

	public long getPrimaryKey() {
		return _assetMessageId;
	}

	public void setPrimaryKey(long pk) {
		setAssetMessageId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAssetMessageId() {
		return _assetMessageId;
	}

	public void setAssetMessageId(long assetMessageId) {
		_assetMessageId = assetMessageId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public long getFromUserId() {
		return _fromUserId;
	}

	public void setFromUserId(long fromUserId) {
		_fromUserId = fromUserId;
	}

	public long getToUserId() {
		return _toUserId;
	}

	public void setToUserId(long toUserId) {
		_toUserId = toUserId;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	private String _uuid;
	private long _assetMessageId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _assetId;
	private long _fromUserId;
	private long _toUserId;
	private String _message;
}