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

package com.rivetlogic.assetmanagement;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Manrique Varela
 */
public class NoSuchAssetException extends NoSuchModelException {

	public NoSuchAssetException() {
		super();
	}

	public NoSuchAssetException(String msg) {
		super(msg);
	}

	public NoSuchAssetException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchAssetException(Throwable cause) {
		super(cause);
	}

}