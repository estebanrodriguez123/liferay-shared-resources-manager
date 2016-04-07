package com.rivetlogic.assetmanagement.portlet;

import com.liferay.portal.kernel.util.Validator;
import com.rivetlogic.assetmanagement.model.Asset;

import java.util.List;

public class NewAssetValidator {
	
	
	public static boolean validateAsset(Asset asset, List<String> errors) {
		boolean valid = true;

		if (Validator.isNull(asset.getName())) {
			errors.add("asset-name-required");
			valid = false;
		}
		
		if (Validator.isNull(asset.getDescription())) {
			errors.add("asset-description-required");
			valid = false;
		}

		if (Validator.isNull(asset.getLocation())) {
			errors.add("asset-location-required");
			valid = false;
		}
		
		if (Validator.isNull(asset.getCategory())) {
			errors.add("asset-category-required");
			valid = false;
		}
		
		return valid;
	}

}
