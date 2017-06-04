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
	 * Asks user for information to fill in a new contact
	 * 
	 * @author Nick
	 */
	public Contact() {
		System.out.println("new contact constructed");
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
	 * Parameterized constructor that sets lastName
	 * 
	 * @author armanmousavi
	 */
	public Contact(String lastName) {
		this.lastName = lastName;
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

}
