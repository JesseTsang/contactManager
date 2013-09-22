/**
 * COMP 249 - Assignment 1 - Contact Manager v.1
 * Author: Tsang Chi Kit
 * Student ID: 5692636
 */
package contactManager;

/**
 * This is the SocialNetworkAccount class. The main purpose is to create SocialNetworkAccount instances that used in the Contact class (for each contacts).
 * Each instance will have an SocialNetworkAccount type (Facebook, Skype, Google+, LinkedIn, or Twitter), account ID or account name.
 */

public class SocialNetworkAccount 
{
	private int accountID = 0;
	private String accountName = "";
	private SocialNetworkAccountType socialNetworkAccountType;

	//Constructor with accountID (int)
	public SocialNetworkAccount(SocialNetworkAccountType socialNetworkType, int accountID)
	{
		this.socialNetworkAccountType = socialNetworkType;
		this.accountID = accountID;
	}
	
	//Constructor with account name (String)
	public SocialNetworkAccount(SocialNetworkAccountType socialNetworkType, String accountName)
	{
		this.socialNetworkAccountType = socialNetworkType;
		this.accountName = accountName;
	}

	public int getAccountID() {
		return accountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public SocialNetworkAccountType getSocialNetworkAccountType() {
		return socialNetworkAccountType;
	}
}
