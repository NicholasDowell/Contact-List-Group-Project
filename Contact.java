import java.util.Scanner;

/**
 * One Contact will store various information about one person
 * 
 * @author Nick
 *
 */
public class Contact {

	private String firstName;
	private String lastName;
	private String streetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	/**
	 * Set the last name for contact
	 * 
	 * @author Arman
	 */
	public Contact(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the contact's first name
	 * 
	 * @author Nick
	 */
	public String getFirstName() {
		return "got test first Name";
	}

	/**
	 * Assigns the contact's first name
	 * 
	 * @author Nick
	 */
	public void setFirstName(String newFirstName) {
	}

	/**
	 * Returns the contact's street address
	 * 
	 * @author Nick
	 */
	public String getStreetAddress() {
		return "got test Address";
	}

	/**
	 * Assigns the contact's street address
	 * 
	 * @author Nick
	 */
	public void setStreetAddress(String newStreetAddress) {
	}

	/**
	 * Returns the contact's email address
	 * 
	 * @author Nick
	 */
	public String getEmailAddress() {
		return "got test email";
	}

	/**
	 * Assigns the contact's email address
	 * 
	 * @author Nick
	 */
	public void setEmailAddress(String newEmailAddress) {
	}

	/**
	 * Returns the contact's phone number
	 * 
	 * @author Nick
	 */
	public String getPhoneNumber() {
		return "got test phone#";
	}

	/**
	 * Assigns the contact's phone number
	 * 
	 * @author Nick
	 */
	public void setPhoneNumber(String newPhoneNumber) {
	}

	/**
	 * Returns the contact's notes
	 * 
	 * @author Nick
	 */
	public String getNotes() {
		return "got test notes";
	}

	/**
	 * Assigns the contact's notes
	 * 
	 * @author Nick
	 */
	public void setNotes(String newNotes) {
	}
	
	/**
	 * Return formatted entire contact information
	 * @author Zhixiang
	 */
	public String toString(){
		return "";
	}
	
	/**
	 * Allow making comparison between contacts for sorting
	 * @author Zhixiang
	 */
	public int CompareTo(Contact other){
		//Further implementation needed
		return 0;
	}
}
