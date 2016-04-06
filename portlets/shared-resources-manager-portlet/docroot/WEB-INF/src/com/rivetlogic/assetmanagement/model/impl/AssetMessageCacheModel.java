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

import com.rivetlogic.assetmanagement.model.AssetMessage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetMessage in entity cache.
 *
 * @author Manrique Varela
 * @see AssetMessage
 * @generated
 */
public class AssetMessageCacheModel implements CacheModel<AssetMessage>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assetMessageId=");
		sb.append(assetMessageId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", fromUserId=");
		sb.append(fromUserId);
		sb.append(", toUserId=");
		sb.append(toUserId);
		sb.append(", message=");
		sb.append(message);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetMessage toEntityModel() {
		AssetMessageImpl assetMessageImpl = new AssetMessageImpl();

		if (uuid == null) {
			assetMessageImpl.setUuid(StringPool.BLANK);
		}
		else {
			assetMessageImpl.setUuid(uuid);
		}

		assetMessageImpl.setAssetMessageId(assetMessageId);
		assetMessageImpl.setGroupId(groupId);
		assetMessageImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			assetMessageImpl.setCreateDate(null);
		}
		else {
			assetMessageImpl.setCreateDate(new Date(createDate));
		}

		assetMessageImpl.setAssetId(assetId);
		assetMessageImpl.setFromUserId(fromUserId);
		assetMessageImpl.setToUserId(toUserId);

		if (message == null) {
			assetMessageImpl.setMessage(StringPool.BLANK);
		}
		else {
			assetMessageImpl.setMessage(message);
		}

		assetMessageImpl.resetOriginalValues();

		return assetMessageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		assetMessageId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		assetId = objectInput.readLong();
		fromUserId = objectInput.readLong();
		toUserId = objectInput.readLong();
		message = objectInput.readUTF();
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

		objectOutput.writeLong(assetMessageId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(assetId);
		objectOutput.writeLong(fromUserId);
		objectOutput.writeLong(toUserId);

		if (message == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(message);
		}
	}

	public String uuid;
	public long assetMessageId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long assetId;
	public long fromUserId;
	public long toUserId;
	public String message;
}