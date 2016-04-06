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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the photo column in Asset.
 *
 * @author Manrique Varela
 * @see Asset
 * @generated
 */
public class AssetPhotoBlobModel {
	public AssetPhotoBlobModel() {
	}

	public AssetPhotoBlobModel(long assetId) {
		_assetId = assetId;
	}

	public AssetPhotoBlobModel(long assetId, Blob photoBlob) {
		_assetId = assetId;
		_photoBlob = photoBlob;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public Blob getPhotoBlob() {
		return _photoBlob;
	}

	public void setPhotoBlob(Blob photoBlob) {
		_photoBlob = photoBlob;
	}

	private long _assetId;
	private Blob _photoBlob;
}