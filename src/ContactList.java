import java.util.ArrayList;
import java.util.Scanner;
/**
 * One ContactList holds one list of Contact objects it can manipulate, save,
 * and display elements of the array.
 * 
 * @author Nick
 */
public class ContactList {

	private ArrayList<Contact> currentContacts = new ArrayList<Contact>();

	/**
	 * Adds a contact to the list at the next unoccupied index
	 * 
	 * @author Nick
	 */
	public void addContact() {
		currentContacts.add(newContact());
	}

	/**
	 * take user input and return a new contact
	 */
	private Contact newContact() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the person's first name.");
		String newFirstName = scan.nextLine();

		System.out.println("Please enter the person's last name.");
		String newLastName = scan.nextLine();

		if (!newLastName.trim().equals(null) && !newLastName.trim().equals("")) {
			Contact theContact = new Contact(newLastName);
			theContact.setFirstName(newFirstName);
			
			System.out.println("Please enter the person's address.");
			theContact.setStreetAddress(scan.nextLine());

			System.out.println("Please enter the person's email address.");
			theContact.setEmailAddress(scan.nextLine());

			System.out.println("Please enter the person's phone number.");
			theContact.setPhoneNumber(scan.nextLine());

			System.out.println("Please enter any other additional information about the person.");
			theContact.setNotes(scan.nextLine());
			
			System.out.println(newFirstName + " " + newLastName + " got stored into the contact list");
			return theContact;
		}
		else {
			System.out.println("You did not enter the person's last name." +
								"\n" + "The person did not get stored into the contact list.");
			return null;
		}
		

	}

	/**
	 * Prints all contacts stored in the list, alphabetically by last name, then
	 * first name. (not case sensitive)
	 * 
	 * @author Nick
	 */
	public void printAll() {
		
		ArrayList<Contact> printList = currentContacts;
		boolean notSorted = true;
		while (notSorted){
			notSorted = false;
			for (int i = 0; i < printList.size()-1; i ++){
				if (printList.get(i).compareTo(printList.get(i+1)) == 1) {
					Contact tempContact = printList.get(i);
					printList.set(i, printList.get(i+1));
					printList.set(i+1, tempContact);
					notSorted = true;
				}
			}
		}
		for (int i = 0; i < printList.size(); i ++){
			System.out.println(printList.get(i));
		}
	}

	/**
	 * Prints all the info for each contact with a specified last name
	 * 
	 * @author Nick
	 */
	public void printContact(String lastName) {
		System.out.println("ONE whole contact being printed");
	}

	/**
	 * Saves the current list of contacts onto the disk
	 * 
	 * @author Nick, Zhixiang
	 */
	public void save() {
		// Implement save function
		System.out.println("data saved");
	}

	/**
	 * Reads any saved data from the disk into memory, and stores it in the
	 * currentContacts
	 * 
	 * @author Nick
	 */
	public void loadSavedData() {
		System.out.println("data loaded");
	}
}
