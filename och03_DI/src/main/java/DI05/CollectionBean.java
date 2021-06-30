package DI05;

import java.util.Map;

public class CollectionBean {

	private Map<String, String> addressList; // Map Type Member Variable

	public Map<String, String> getAddressList() { // Method
		return addressList;
	}

	public void setAddressList(Map<String, String> addressList) { // Setter
		this.addressList = addressList;
	}

}
