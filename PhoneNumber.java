package contactManager;

/**
 * This is the PhoneNumber class. The main purpose is to create PhoneNumber instances that used in the Contact class (for each contacts).
 * Each instance will have an PhoneNumber type (Work, Home, Mobile, Fax), country code, area code, phone number, and extension (optional).
 */

public class PhoneNumber 
{
	private int countryCode = 0;
	private int areaCode = 0;
	private int phoneNumbers = 0;
	private int extension = 0;
	
	private PhoneNumberType phoneNumberType;
	
	//Constructor with extension
	public PhoneNumber(PhoneNumberType phoneNumberType, int countryCode, int areaCode, int phoneNumbers, int extension) 
	{
		this.phoneNumberType = phoneNumberType;
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.phoneNumbers = phoneNumbers;
		this.extension = extension;
	}

	//Constructor without extension
	public PhoneNumber(PhoneNumberType phoneNumberType, int countryCode, int areaCode, int phoneNumbers) 
	{
		this.phoneNumberType = phoneNumberType;
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.phoneNumbers = phoneNumbers;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public int getPhoneNumbers() {
		return phoneNumbers;
	}

	public int getExtension() {
		return extension;
	}
}
