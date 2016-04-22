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

package com.rivetlogic.assetmanagement.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.rivetlogic.assetmanagement.model.Asset;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Asset in entity cache.
 *
 * @author Manrique Varela
 * @see Asset
 * @generated
 */
public class AssetCacheModel implements CacheModel<Asset>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", location=");
		sb.append(location);
		sb.append(", active=");
		sb.append(active);
		sb.append(", category=");
		sb.append(category);
		sb.append(", status=");
		sb.append(status);
		sb.append(", mimeType=");
		sb.append(mimeType);
		sb.append(", currentUserId=");
		sb.append(currentUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Asset toEntityModel() {
		AssetImpl assetImpl = new AssetImpl();

		if (uuid == null) {
			assetImpl.setUuid(StringPool.BLANK);
		}
		else {
			assetImpl.setUuid(uuid);
		}

		assetImpl.setAssetId(assetId);
		assetImpl.setGroupId(groupId);
		assetImpl.setCompanyId(companyId);
		assetImpl.setUserId(userId);

		if (userName == null) {
			assetImpl.setUserName(StringPool.BLANK);
		}
		else {
			assetImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			assetImpl.setCreateDate(null);
		}
		else {
			assetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assetImpl.setModifiedDate(null);
		}
		else {
			assetImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			assetImpl.setName(StringPool.BLANK);
		}
		else {
			assetImpl.setName(name);
		}

		if (description == null) {
			assetImpl.setDescription(StringPool.BLANK);
		}
		else {
			assetImpl.setDescription(description);
		}

		assetImpl.setLocation(location);
		assetImpl.setActive(active);
		assetImpl.setCategory(category);

		if (status == null) {
			assetImpl.setStatus(StringPool.BLANK);
		}
		else {
			assetImpl.setStatus(status);
		}

		if (mimeType == null) {
			assetImpl.setMimeType(StringPool.BLANK);
		}
		else {
			assetImpl.setMimeType(mimeType);
		}

		assetImpl.setCurrentUserId(currentUserId);

		assetImpl.resetOriginalValues();

		return assetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		assetId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		location = objectInput.readLong();
		active = objectInput.readBoolean();
		category = objectInput.readLong();
		status = objectInput.readUTF();
		mimeType = objectInput.readUTF();
		currentUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(assetId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(location);
		objectOutput.writeBoolean(active);
		objectOutput.writeLong(category);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (mimeType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mimeType);
		}

		objectOutput.writeLong(currentUserId);
	}

	public String uuid;
	public long assetId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public long location;
	public Boolean active;
	public long category;
	public String status;
	public String mimeType;
	public Long currentUserId;
}