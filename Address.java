package contactManager;

/**
 * This is the Address class. The main purpose is to create Address instances that used in the Contact class (for each contacts).
 * Each instance will have an address type (Work, Home, etc), apartment # (optional), street name, city, postal code, and country.
 *
 */

public class Address
{
	private String streetName ="";
	private String city = "";
	private String postalCode = "";
	private String country = "";
	private AddressType addressType;
	
	private int streetNumber = 0;
	private int apartmentNumber = 0;
	
	//Constructor - with apartment #
	public Address(AddressType addressType, int apartmentNumber, int streetNumber, String streetName, String city, String country)
	{
		this.addressType = addressType;
		this.apartmentNumber = apartmentNumber;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}
	
	//Constructor - without apartment #
	public Address(AddressType addressType, int streetNumber, String streetName, String city, String country)
	{
		this.addressType = addressType;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCountry() {
		return country;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}	
}
