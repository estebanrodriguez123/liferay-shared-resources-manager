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

import com.liferay.portal.kernel.exception.SystemException;

import com.rivetlogic.assetmanagement.model.Asset;
import com.rivetlogic.assetmanagement.service.AssetLocalServiceUtil;

/**
 * The extended model base implementation for the Asset service. Represents a row in the &quot;rivetlogic_Asset&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetImpl}.
 * </p>
 *
 * @author Manrique Varela
 * @see AssetImpl
 * @see com.rivetlogic.assetmanagement.model.Asset
 * @generated
 */
public abstract class AssetBaseImpl extends AssetModelImpl implements Asset {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a asset model instance should use the {@link Asset} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetLocalServiceUtil.addAsset(this);
		}
		else {
			AssetLocalServiceUtil.updateAsset(this);
		}
	}
}