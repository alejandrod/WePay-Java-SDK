package com.wepay.model.data;

import org.json.*;

public class AddressData {

	public String address1;
	public String address2;
	public String city;
	public String state;
	public String zip;
	public String country;
	public String region;
	public String postcode;

	public static JSONObject buildUnifiedAddress(AddressData info) throws JSONException {
		JSONObject o = new JSONObject();
		o.put("address1", info.address1);
		o.put("address2", info.address2);
		o.put("city", info.city);
		o.put("region", (info.state != null) ? info.state : info.region);
		o.put("postal_code", (info.zip  != null) ? info.zip : info.postcode);
		o.put("country", info.country);
		return o;
	}

}
