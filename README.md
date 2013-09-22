Requirements:
The requirements team has gathered the following requirements for the Contact Manager application:

Each Contact has the following attributes:
- Last name (String)
- First name (String)
- Middle name (String)
- Address list (an array of Address objects)
- Phone number list (an array of PhoneNumber objects)
- Social network account list (an array of SocialNetworkAccount objects)
Note: Two contacts are considered equal if they have the same first, last and middle name.

Each Address has the following attributes:
- type [Home, Work, Other] (Hint: use Enum types)
- Street name
- Street number
- Apartment number (could be null)
- City
- Postal Code
- Country
Note: Two addresses are considered equal if all of the aforementioned attributes are equal.

Each PhoneNumber has the following attributes:
- type [Home, Work, Mobile, Fax] (Hint: use Enum types)
- country code
- area code
- phone number
- extension (usually applicable for work phone numbers, could be null)
Note: Two phone numbers are considered equal if all of the aforementioned attributes are equal.

Each SocialNetworkAccount has the following attributes:
- type [Skype, Facebook, Google+, Twitter, LinkedIn] (Hint: use Enum types)
- account id/name
Note: Two social network accounts are considered equal if all of the aforementioned attributes are equal.

The class ContactManager will be used to store the contacts in an array of Contact objects.

Task #1 : Design and implement the required classes.

- For each class, create an appropriate constructor that initializes the values of the attributes. (Hint: attributes of array type should be initialized as empty arrays allowing to store 10 objects at maximum)
- Create appropriate methods in class Contact for the addition of
a) An address addAddress()
b) A phone number addPhoneNumber()
c) A social network account addSocialNetworkAccount()
to a specific contact. The methods should examine if the element passed as argument already exists in the corresponding array (Hint: create a separate private method that performs this check) and add it only if it is not already present. (Hint: the check should be performed using the corresponding equals() method)
- Create method addContact() for the addition of a new contact in class ContactManager. Again, the method should examine if the contact passed as argument already exists in the array and add it only if it is not already present. 

Create also method numberOfContacts() that returns the current number of stored contacts. (Hint: the check should be performed using the corresponding equals() method)
- Create a main() method in Driver class that creates and populates the attributes of five contacts and adds them in the ContactManager.

Task #2 - For the first prototype, you will have to implement and test the correctness of the following features:

1. Contact search: Create a method searchContacts() in ContactManager that takes a String as argument and prints the contacts whose first or last name contains that string (i.e., the string given as argument should be part of the first or last name of a contact). The string comparison should be case insensitive. (Hint: use method contains() or matches() from class String)

2. Find my contacts in Social Network X: Create a method findContactsInSocialNetwork() in ContactManager that takes as argument the type of a Social Network and prints the contacts having an account for this specific Social Network. (Hint: make an additional method in class Contact that checks whether the array of social network accounts contains an account corresponding to the type passed as argument)

3. Contact sorting: Create a method sortContacts() that returns all contacts stored in the ContactManager sorted lexicographically/alphabetically in ascending order based on their last name. In the case two contacts have the same last name they will be sorted based on their first name in ascending order. (Hint: use method compareTo() of class String to compare the contact names. You can use the insertion sort algorithm)
