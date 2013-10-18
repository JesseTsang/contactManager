package contactManager;

/**
 * The driver class populates attributes for ContactManager class and Contact instances. 
 * Each ContactManager instance can have up to 10 contacts, so we can imagine each ContactManager instance as a separate contact book.
 * The driver class populates the variable instances used in each contacts, such as first & last names, address, phone numbers and their types.
 * The driver class also runs all the public methods inside of ContactManager class.
 * 
 * Currently, we can ...
 * 
 * (Contact class)
 * 	1. Add addresses via addAddress(Address address);
 *  2. Add phone numbers via addPhoneNumber(Phone number);
 *  3. Add social network accounts via addSocialNetworkAccount(SocialNetworkAccount socialNetworkAccount);
 *  
 * (ContactManager class)
 *  1. Add contacts via addContact(Contact contact);
 *  2. Show currently total number of contacts added via numberOfContacts();
 *  3. Search contacts that contain certain words via searchContacts(String str);
 *  4. Search contacts within certain social network via findContactsInSocialNetwork(SocialNetworkAccountType socialNetworkType);
 *  5. Sort contacts alphabetically via sortContacts();
 */

public class Driver 
{
	public static void main(String[] args)
	{
		ContactManager contactManager = new ContactManager();
		
		/*1st contact*/
		
		Contact contact1 = new Contact("Isengrim", "Hornblower", "Longhole");
		Address address1 = new Address(AddressType.Home, 1936, "99th Street", "Grande Prairie", "Canada");
		PhoneNumber phoneNumber1 = new PhoneNumber (PhoneNumberType.Home, 1, 438, 6586472);
		SocialNetworkAccount socialNetworkAccount1 = new SocialNetworkAccount (SocialNetworkAccountType.Facebook, "Isengrim.Longhole");
		
		contactManager.addContact(contact1);
		contact1.addAddress(address1);
		contact1.addPhoneNumber(phoneNumber1);
		contact1.addSocialNetworkAccount(socialNetworkAccount1);
		
		/*2nd contact*/
		
		Contact contact2 = new Contact("Valdemar", "Labingi");
		Address address2 = new Address(AddressType.Work, 323, "Wyecroft Road", "Burlington", "Canada");
		PhoneNumber phoneNumber2 = new PhoneNumber (PhoneNumberType.Mobile, 1, 905, 3205026);
		SocialNetworkAccount socialNetworkAccount2 = new SocialNetworkAccount (SocialNetworkAccountType.LinkedIn, "Valdemar.Labingi");
		
		contactManager.addContact(contact2);
		contact2.addAddress(address2);
		contact2.addPhoneNumber(phoneNumber2);
		contact2.addSocialNetworkAccount(socialNetworkAccount2);
		
		/*3rd contact*/
		
		Contact contact3 = new Contact("Poppy", "Chubb-Baggins", "Baggins");
		Address address3 = new Address(AddressType.Other, 213, 854, "Bay Street", "Toronto", "Canada");
		PhoneNumber phoneNumber3 = new PhoneNumber (PhoneNumberType.Fax, 1, 647, 8664106);
		SocialNetworkAccount socialNetworkAccount3 = new SocialNetworkAccount (SocialNetworkAccountType.Skype, "Poppy31");
		
		contactManager.addContact(contact3);
		contact3.addAddress(address3);
		contact3.addPhoneNumber(phoneNumber3);
		contact3.addSocialNetworkAccount(socialNetworkAccount3);
		
		/*4th contact*/
		
		Contact contact4 = new Contact("Celendine", "Twofoot", "Baggins");
		Address address4 = new Address(AddressType.Home, 3931, "Cordova  Street", "Vancouver", "Canada");
		PhoneNumber phoneNumber4 = new PhoneNumber (PhoneNumberType.Work, 1, 778, 9997501);
		SocialNetworkAccount socialNetworkAccount4 = new SocialNetworkAccount (SocialNetworkAccountType.Google, 51305259);
		
		contactManager.addContact(contact4);
		contact4.addAddress(address4);
		contact4.addPhoneNumber(phoneNumber4);
		contact4.addSocialNetworkAccount(socialNetworkAccount4);
		
		/*5th contact*/
		
		Contact contact5 = new Contact("Toby", "Mugwort");
		Address address5 = new Address(AddressType.Work, 722, 3408, "Danforth Avenue", "Toronto", "Canada");
		PhoneNumber phoneNumber5 = new PhoneNumber (PhoneNumberType.Fax, 1, 416, 4047173);
		SocialNetworkAccount socialNetworkAccount5 = new SocialNetworkAccount (SocialNetworkAccountType.Google, "Advat1961");
		
		contactManager.addContact(contact5);
		contact5.addAddress(address5);
		contact5.addPhoneNumber(phoneNumber5);
		contact5.addSocialNetworkAccount(socialNetworkAccount5);
		
		/*Testing ContactManager class other methods*/
		
		contactManager.numberOfContacts();
		contactManager.searchContacts("baggins");
		contactManager.findContactsInSocialNetwork(SocialNetworkAccountType.Google);
		contactManager.sortContacts();
	}
}
