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

import com.rivetlogic.assetmanagement.model.AssetLocation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetLocation in entity cache.
 *
 * @author Manrique Varela
 * @see AssetLocation
 * @generated
 */
public class AssetLocationCacheModel implements CacheModel<AssetLocation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assetLocationId=");
		sb.append(assetLocationId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetLocation toEntityModel() {
		AssetLocationImpl assetLocationImpl = new AssetLocationImpl();

		if (uuid == null) {
			assetLocationImpl.setUuid(StringPool.BLANK);
		}
		else {
			assetLocationImpl.setUuid(uuid);
		}

		assetLocationImpl.setAssetLocationId(assetLocationId);
		assetLocationImpl.setGroupId(groupId);
		assetLocationImpl.setCompanyId(companyId);
		assetLocationImpl.setUserId(userId);

		if (userName == null) {
			assetLocationImpl.setUserName(StringPool.BLANK);
		}
		else {
			assetLocationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			assetLocationImpl.setCreateDate(null);
		}
		else {
			assetLocationImpl.setCreateDate(new Date(createDate));
		}

		if (name == null) {
			assetLocationImpl.setName(StringPool.BLANK);
		}
		else {
			assetLocationImpl.setName(name);
		}

		if (description == null) {
			assetLocationImpl.setDescription(StringPool.BLANK);
		}
		else {
			assetLocationImpl.setDescription(description);
		}

		assetLocationImpl.resetOriginalValues();

		return assetLocationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		assetLocationId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
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

		objectOutput.writeLong(assetLocationId);
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
	}

	public String uuid;
	public long assetLocationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public String name;
	public String description;
}