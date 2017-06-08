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
	 * @author Zhixiang
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
	 * assigns the contact's first name
	 * 
	 * @author Nick
	 */
	public void setFirstName(String newFirstName) {
	}


	/**
	 * Returns the contact's last name
	 * 
	 * @author Zhixiang
	 */
	public String getLastName() {
		return "got test last Name";
	}

	/**
	 * assigns the contact's last name
	 * 
	 * @author Zhixiang
	 */
	public void setLastName(String newFirstName) {
	}

	/**
	 * returns the contact's street address
	 * 
	 * @author Nick
	 */
	public String getStreetAddress() {
		return "got test Address";
	}

	/**
	 * assigns the contact's street address
	 * 
	 * @author Nick
	 */
	public void setStreetAddress(String newStreetAddress) {
	}

	/**
	 * returns the contact's email address
	 * 
	 * @author Nick
	 */
	public String getEmailAddress() {
		return "got test email";
	}

	/**
	 * assigns the contact's email address
	 * 
	 * @author Nick
	 */
	public void setEmailAddress(String newEmailAddress) {
	}

	/**
	 * returns the contact's phone number
	 * 
	 * @author Nick
	 */
	public String getPhoneNumber() {
		return "got test phone#";
	}

	/**
	 * assigns the contact's phone number
	 * 
	 * @author Nick
	 */
	public void setPhoneNumber(String newPhoneNumber) {
	}

	/**
	 * returns the contact's notes
	 * 
	 * @author Nick
	 */
	public String getNotes() {
		return "got test notes";
	}

	/**
	 * assigns the contact's notes
	 * 
	 * @author Nick
	 */
	public void setNotes(String newNotes) {
	}
	
	/**
	 * return all information of the contact
	 * @author Zhixiang
	 */
	public String toString(){
		return this.lastName + " " + this.lastName + "\n" + this.streetAddress + "\n" + this.emailAddress  + "\n" + this.phoneNumber  + "\n" + this.notes;
	}
}
