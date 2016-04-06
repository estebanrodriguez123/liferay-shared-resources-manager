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

import com.rivetlogic.assetmanagement.model.AssetRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetRequest in entity cache.
 *
 * @author Manrique Varela
 * @see AssetRequest
 * @generated
 */
public class AssetRequestCacheModel implements CacheModel<AssetRequest>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assetRequestId=");
		sb.append(assetRequestId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", assingedDate=");
		sb.append(assingedDate);
		sb.append(", bookedDate=");
		sb.append(bookedDate);
		sb.append(", returnedDate=");
		sb.append(returnedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", priority=");
		sb.append(priority);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetRequest toEntityModel() {
		AssetRequestImpl assetRequestImpl = new AssetRequestImpl();

		if (uuid == null) {
			assetRequestImpl.setUuid(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setUuid(uuid);
		}

		assetRequestImpl.setAssetRequestId(assetRequestId);
		assetRequestImpl.setGroupId(groupId);
		assetRequestImpl.setAssetId(assetId);
		assetRequestImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			assetRequestImpl.setCreateDate(null);
		}
		else {
			assetRequestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assetRequestImpl.setModifiedDate(null);
		}
		else {
			assetRequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		assetRequestImpl.setCompanyId(companyId);

		if (userName == null) {
			assetRequestImpl.setUserName(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setUserName(userName);
		}

		if (requestedDate == Long.MIN_VALUE) {
			assetRequestImpl.setRequestedDate(null);
		}
		else {
			assetRequestImpl.setRequestedDate(new Date(requestedDate));
		}

		if (assingedDate == Long.MIN_VALUE) {
			assetRequestImpl.setAssingedDate(null);
		}
		else {
			assetRequestImpl.setAssingedDate(new Date(assingedDate));
		}

		if (bookedDate == Long.MIN_VALUE) {
			assetRequestImpl.setBookedDate(null);
		}
		else {
			assetRequestImpl.setBookedDate(new Date(bookedDate));
		}

		if (returnedDate == Long.MIN_VALUE) {
			assetRequestImpl.setReturnedDate(null);
		}
		else {
			assetRequestImpl.setReturnedDate(new Date(returnedDate));
		}

		if (status == null) {
			assetRequestImpl.setStatus(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setStatus(status);
		}

		if (priority == null) {
			assetRequestImpl.setPriority(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setPriority(priority);
		}

		if (description == null) {
			assetRequestImpl.setDescription(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setDescription(description);
		}

		assetRequestImpl.resetOriginalValues();

		return assetRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		assetRequestId = objectInput.readLong();
		groupId = objectInput.readLong();
		assetId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyId = objectInput.readLong();
		userName = objectInput.readUTF();
		requestedDate = objectInput.readLong();
		assingedDate = objectInput.readLong();
		bookedDate = objectInput.readLong();
		returnedDate = objectInput.readLong();
		status = objectInput.readUTF();
		priority = objectInput.readUTF();
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

		objectOutput.writeLong(assetRequestId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(assetId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(companyId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(requestedDate);
		objectOutput.writeLong(assingedDate);
		objectOutput.writeLong(bookedDate);
		objectOutput.writeLong(returnedDate);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (priority == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(priority);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long assetRequestId;
	public long groupId;
	public long assetId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long companyId;
	public String userName;
	public long requestedDate;
	public long assingedDate;
	public long bookedDate;
	public long returnedDate;
	public String status;
	public String priority;
	public String description;
}