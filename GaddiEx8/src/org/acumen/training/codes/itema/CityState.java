package org.acumen.training.codes.itema;

public abstract class CityState {

	private String nameString;
	private String addressString;
	private String phoneString;

	public boolean nameStartsWith(String prefix) {

		return nameString.startsWith(prefix);

	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	public String getPhoneString() {
		return phoneString;
	}

	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}

}

class NonResidentialArea extends CityState {

	public static String city = "";
	public static String state = "";
}

class BusinessEntry extends NonResidentialArea {

	@Override
	public void setAddressString(String addressString) {
		super.setAddressString(addressString);
	}

	@Override
	public String getPhoneString() {
		return super.getPhoneString();
	}

	@Override
	public void setPhoneString(String phoneString) {
		super.setPhoneString(phoneString);
	}

	@Override
	public boolean nameStartsWith(String prefix) {
		return super.nameStartsWith(prefix);
	}

}

class GovernmentEntry extends NonResidentialArea {

	@Override
	public String getAddressString() {
		return super.getAddressString();
	}

	@Override
	public void setAddressString(String addressString) {
		super.setAddressString(addressString);
	}

	@Override
	public String getPhoneString() {
		return super.getPhoneString();
	}

	@Override
	public void setPhoneString(String phoneString) {
		super.setPhoneString(phoneString);
	}

	@Override
	public boolean nameStartsWith(String prefix) {
		return super.nameStartsWith(prefix);
	}

}

class ResidentialEntry extends CityState {

	@Override
	public String getAddressString() {
		return super.getAddressString();
	}

	@Override
	public void setAddressString(String addressString) {
		super.setAddressString(addressString);
	}

	@Override
	public String getPhoneString() {
		return super.getPhoneString();
	}

	@Override
	public void setPhoneString(String phoneString) {
		super.setPhoneString(phoneString);
	}

	@Override
	public boolean nameStartsWith(String prefix) {
		return super.nameStartsWith(prefix);
	}

}
