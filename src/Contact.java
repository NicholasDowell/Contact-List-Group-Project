import java.io.Serializable;

/**
 * One Contact will store various information about one person
 * 
 * @author Nick
 *
 */
public class Contact implements Comparable<Contact>, Serializable {

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
	 * Return last name of the contact
	 * 
	 * @author Zhixiang
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the contact
	 * 
	 * @author Nick
	 */
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

	/**
	 * Prints out all data on the contact, formatted for user viewing.
	 * 
	 * @author Zhixiang
	 */
	public String printInfo() {
		return "Name:    " + getFirstName() + " " + getLastName() + "\n" + "Phone:   " + getPhoneNumber() + "\n"
				+ "Address: " + getStreetAddress() + "\n" + "Email:   " + getEmailAddress() + "\n" + "Notes:   "
				+ getNotes() + "\n";

	}

	/**
	 * Returns the contact's first name
	 * 
	 * @author Nick
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Assigns the contact's first name
	 * 
	 * @author Nick
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Returns the contact's street address
	 * 
	 * @author Nick
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Assigns the contact's street address
	 * 
	 * @author Nick
	 */
	public void setStreetAddress(String newStreetAddress) {
		streetAddress = newStreetAddress;
	}

	/**
	 * Returns the contact's email address
	 * 
	 * @author Nick
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Assigns the contact's email address
	 * 
	 * @author Nick
	 */
	public void setEmailAddress(String newEmailAddress) {
		this.emailAddress = newEmailAddress;
	}

	/**
	 * Returns the contact's phone number
	 * 
	 * @author Nick
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Assigns the contact's phone number
	 * 
	 * @author Nick
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}

	/**
	 * Returns the contact's notes
	 * 
	 * @author Nick
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * Assigns the contact's notes
	 * 
	 * @author Nick
	 */
	public void setNotes(String newNotes) {
		this.notes = newNotes;
	}

	/**
	 * Return entire formatted contact information
	 * 
	 * @author Arman
	 */
	public String toString() {
		return firstName + " " + lastName + " " + streetAddress + " " + emailAddress + " " + phoneNumber + " " + notes;
	}

	/**
	 * Allow making comparison between contacts for sorting Compares this
	 * contact to the contact you specify. Compares by last name then first name
	 * alphabetically. Returns -1 if this contact comes before the other,
	 * returns 0 if they are exactly the same name, returns 1 if this comes
	 * after the other one.
	 * 
	 * @author Nick
	 */
	public int compareTo(Contact otherContact) {
		if (this.lastName.toLowerCase().compareTo(otherContact.lastName.toLowerCase()) <= -1) {
			return -1;
		} else if (this.lastName.toLowerCase().compareTo(otherContact.lastName.toLowerCase()) >= 1) {
			return 1;
		} else if (this.firstName.toLowerCase().compareTo(otherContact.firstName.toLowerCase()) <= -1) {
			return -1;
		} else if (this.firstName.toLowerCase().compareTo(otherContact.firstName.toLowerCase()) >= 1) {
			return 1;
		} else
			return 0;
	}

}
