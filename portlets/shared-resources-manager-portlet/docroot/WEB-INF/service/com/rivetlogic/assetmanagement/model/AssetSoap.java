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

import java.sql.Blob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Manrique Varela
 * @generated
 */
public class AssetSoap implements Serializable {
	public static AssetSoap toSoapModel(Asset model) {
		AssetSoap soapModel = new AssetSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setLocation(model.getLocation());
		soapModel.setActive(model.getActive());
		soapModel.setCategory(model.getCategory());
		soapModel.setStatus(model.getStatus());
		soapModel.setMimeType(model.getMimeType());
		soapModel.setPhoto(model.getPhoto());
		soapModel.setCurrentUserId(model.getCurrentUserId());

		return soapModel;
	}

	public static AssetSoap[] toSoapModels(Asset[] models) {
		AssetSoap[] soapModels = new AssetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetSoap[][] toSoapModels(Asset[][] models) {
		AssetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetSoap[] toSoapModels(List<Asset> models) {
		List<AssetSoap> soapModels = new ArrayList<AssetSoap>(models.size());

		for (Asset model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetSoap[soapModels.size()]);
	}

	public AssetSoap() {
	}

	public long getPrimaryKey() {
		return _assetId;
	}

	public void setPrimaryKey(long pk) {
		setAssetId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public Boolean getActive() {
		return _active;
	}

	public void setActive(Boolean active) {
		_active = active;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getMimeType() {
		return _mimeType;
	}

	public void setMimeType(String mimeType) {
		_mimeType = mimeType;
	}

	public Blob getPhoto() {
		return _photo;
	}

	public void setPhoto(Blob photo) {
		_photo = photo;
	}

	public Long getCurrentUserId() {
		return _currentUserId;
	}

	public void setCurrentUserId(Long currentUserId) {
		_currentUserId = currentUserId;
	}

	private String _uuid;
	private long _assetId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private String _location;
	private Boolean _active;
	private String _category;
	private String _status;
	private String _mimeType;
	private Blob _photo;
	private Long _currentUserId;
}