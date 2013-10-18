package contactManager;

/**
 * This is the Contact class. The main purpose of this class is to create instances with first & last name, addresses, phone #s, and their social accounts.
 * Each Contact instance will have a first & last name. Each instance can add up to 10 address, phone #s, and social accounts.
 * 
 * Currently, we can ...
 * 
 * 	1. Add addresses via addAddress(Address address);
 *  2. Add phone numbers via addPhoneNumber(Phone number);
 *  3. Add social network accounts via addSocialNetworkAccount(SocialNetworkAccount socialNetworkAccount);
 *  4. Check if a contact has account in certain social network via contactsBySocialNetworkType(SocialNetworkAccountType type);
 */

public class Contact 
{
	private String lastName = "";
	private String firstName = "";
	private String middleName = "";
	
	private Address[] addresses;
	private PhoneNumber[] phoneNumbers;
	private SocialNetworkAccount[] socialNetworkAccounts;
	
	//Address, phone #, and account counts. Also acts as current array position pointers.
	private int addedAddressCount = 0;
	private int addedPhoneNumberCount = 0;
	private int addedSocialNetworkAccountCount = 0;
	
	//Maximum allowed address, phone#, social network account per each Contact instance.
	private static final int MAX_ADDRESS = 10;
	private static final int MAX_PHONE_NUMBER = 10;
	private static final int MAX_SOCIAL_NETWORK_ACT = 10;
	
	//Constructor with middleName
	public Contact (String firstName, String middleName, String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		
		this.addresses = new Address[MAX_ADDRESS];
		this.phoneNumbers = new PhoneNumber[MAX_PHONE_NUMBER];
		this.socialNetworkAccounts = new SocialNetworkAccount[MAX_SOCIAL_NETWORK_ACT];
	}

	//Constructor without middleName
	public Contact (String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.addresses = new Address[MAX_ADDRESS];
		this.phoneNumbers = new PhoneNumber[MAX_PHONE_NUMBER];
		this.socialNetworkAccounts = new SocialNetworkAccount[MAX_SOCIAL_NETWORK_ACT];
	}

	//An address is added only if not duplicate.
	//It is considered duplicate if they have the same country, city, street name, street number, postal code, and apartment code.
	private boolean isAddressAdded(Address address)
	{
		for(int i=0; i<addedAddressCount; i++)
		{
			Address addedAddress = addresses[i];
			
			if(addedAddress.getCountry().equalsIgnoreCase(address.getCountry()))
			{
				if(addedAddress.getCity().equalsIgnoreCase(address.getCity()))
				{
					if(addedAddress.getStreetName().equalsIgnoreCase(address.getStreetName()))
					{
						if(addedAddress.getStreetNumber() == address.getApartmentNumber())
						{
							if(addedAddress.getPostalCode().equalsIgnoreCase(address.getPostalCode()))
							{
								if(addedAddress.getApartmentNumber() == address.getApartmentNumber())
								{
									return true;						
								}								
							}
						}			
					}				
				}
			}
		}	
		return false;
	}
	
	//Add an address to the Address[] if isAddressAdded() is false (not duplicate)
	public void addAddress(Address address)
	{
		if(!isAddressAdded(address) && addedAddressCount < addresses.length)
		{
			addresses[addedAddressCount] = address;
			
			addedAddressCount++;
		}
	}
	
	//A phone number is added only if not duplicate.
	//It is considered duplicate if they have the same country code, city code, phone number, and extension.
	private boolean isPhoneNumberAdded(PhoneNumber phoneNumber)
	{
		for(int i=0; i<addedPhoneNumberCount; i++)
		{
			PhoneNumber addedPhoneNumbers = phoneNumbers[i];
			
			if(addedPhoneNumbers.getCountryCode() == phoneNumber.getCountryCode())
			{
				if(addedPhoneNumbers.getAreaCode() == phoneNumber.getAreaCode())
				{
					if(addedPhoneNumbers.getPhoneNumbers() == phoneNumber.getPhoneNumbers())
					{
						if(addedPhoneNumbers.getExtension() == phoneNumber.getExtension())
						{
							return true;
						}
					}
				}
			}
		}	
		return false;
	}
	
	//Add a phone number to the phoneNumbers[] if isPhoneNumberAdded() is false (not duplicate)
	public void addPhoneNumber(PhoneNumber phoneNumber)
	{
		if(!isPhoneNumberAdded(phoneNumber) && addedPhoneNumberCount < phoneNumbers.length)
		{
			phoneNumbers[addedPhoneNumberCount] = phoneNumber;
			
			addedPhoneNumberCount++;
		}
	}
	
	//A social network account is added only if not duplicate.
	//It is considered duplicate if they have the same account type and the same ID.
	private boolean isSocialNetworkAccountAdded(SocialNetworkAccount socialNetworkAccount)
	{
		for(int i=0; i<addedSocialNetworkAccountCount; i++)
		{
			SocialNetworkAccount addedSocialNetworkAct = socialNetworkAccounts[i];
			
			//If they have the same account type ...
			if(addedSocialNetworkAct.getSocialNetworkAccountType().equals(socialNetworkAccount.getSocialNetworkAccountType()))
			{
				//and same ID ...
				if(addedSocialNetworkAct.getAccountID() == socialNetworkAccount.getAccountID())
				{
					return true; //duplicate
				}
				//and same account name ...
				else if (addedSocialNetworkAct.getAccountName().equalsIgnoreCase(socialNetworkAccount.getAccountName()))
				{
					return true; //also duplicate		
				}
			}
		}		
		return false;
	}
	
	//Add social network account to the socialNetworkAccounts[] if isSocialNetworkAccountAdded() is false (not duplicate)
	public void addSocialNetworkAccount(SocialNetworkAccount socialNetworkAccount)
	{
		if(!isSocialNetworkAccountAdded(socialNetworkAccount) && addedSocialNetworkAccountCount < socialNetworkAccounts.length)			
		{
			socialNetworkAccounts[addedSocialNetworkAccountCount] = socialNetworkAccount;
			
			addedSocialNetworkAccountCount++;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	//Check if a contact contain the argument social network type account, return true if yes
	public Boolean contactsBySocialNetworkType(SocialNetworkAccountType socialNetworkAccountType)
	{
		for(int i=0; i<addedSocialNetworkAccountCount; i++)
		{
			SocialNetworkAccount searchedAccounts = socialNetworkAccounts[i];
							
			if(searchedAccounts.getSocialNetworkAccountType().equals(socialNetworkAccountType))
			{
				return true;
			}
		}		
		return false;
	}	
}
