package com.rivetlogic.assetmanagement.scheduling;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil;

public class ReassigningAssetsScheduler implements MessageListener {

	@Override
	public void receive(Message message) throws MessageListenerException {
		_log.info("Entering Reassigning Assets Scheduled Job");

		try {
			AssetRequestLocalServiceUtil.reasignAssets();
		} catch (PortalException e) {
			_log.error("Error Reassigning Assets", e);
		} catch (SystemException e) {
			_log.error("Error Reassigning Assets", e);
		}

		_log.info("Ending Reassigning Assets Scheduled Job");
	}

	private static final Log _log = LogFactoryUtil.getLog(ReassigningAssetsScheduler.class);

}
