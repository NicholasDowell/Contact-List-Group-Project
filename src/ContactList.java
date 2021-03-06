import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

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
		Contact theContact = newContact();
		if (theContact != null){
			currentContacts.add(theContact);
		}
	}

	/**
	 * returns the size of the contact list
	 * 
	 * @author Nick
	 */
	public int getSize() {
		return currentContacts.size();
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
		} else {
			System.out.println("You did not enter the person's last name." + "\n"
					+ "The person did not get stored into the contact list.");
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
		
		Collections.sort(printList);
		for (int i = 0; i < printList.size(); i++) {
			System.out.println(printList.get(i).printInfo());
		}
	}

	/**
	 * Find contact(s) in contact list by last name
	 * 
	 * @author Zhixiang
	 */
	public void find() {
		Scanner scan = new Scanner(System.in);
		String lastName;
		System.out.println("Please enter a last name for search:");
		lastName = scan.nextLine();
		boolean found = false;
		for (int i = 0; i < currentContacts.size(); i++) {
			if (currentContacts.get(i).getLastName().trim().equalsIgnoreCase(lastName)) {
				System.out.println(currentContacts.get(i).printInfo());
				found = true;
			}
		}
		if (!found) {
			System.out.println("Contact with the last name: " + lastName + " not found.");
		}
	}

	/**
	 * Saves the current list of contacts onto the disk
	 * 
	 * @author Arman
	 */
	public void write() {
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream("data");
			outObject = new ObjectOutputStream(outFile);
			outObject.writeObject(currentContacts);
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: " + ioe.getMessage());
		}
	}

	/**
	 * Reads any saved data from the disk into memory, and stores it in the
	 * currentContacts
	 * 
	 * @author Arman
	 */
	public void read() {
		if (currentContacts != null) {
			FileInputStream inFile;
			ObjectInputStream inObject;
			try {
				inFile = new FileInputStream("data");
				inObject = new ObjectInputStream(inFile);
				currentContacts = (ArrayList<Contact>) inObject.readObject();
				inFile.close();
				inObject.close();
			} catch (IOException ioe) {
				System.out.println("No contacts found on disk");
			} catch (ClassNotFoundException cnfe) {
				System.out.println(cnfe);
			}
		} else {
			System.out.println("You have a total of " + currentContacts.size() + " contacts");
		}
	}

	/**
	 * Returns contact information of a contact
	 * 
	 * @author Arman
	 */
	public String toString() {
		String results = "";
		for (Contact c : currentContacts) {
			results += c.printInfo() + "\n";
		}
		return results;
	}

	/**
	 * Removes all objects from the array list currentContacts
	 * 
	 * @author Arman
	 */
	public void clear() {
		currentContacts.clear();
	}
}
