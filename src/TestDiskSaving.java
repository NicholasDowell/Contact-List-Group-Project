/**
 * Tests writing and reading from the disk, by creating a contactList object.
 * One contactList object represents one contact list.
 * @author Arman
 */

public class TestDiskSaving {

	public static void main(String args[]) {
		ContactList myList = new ContactList();
		myList.addContact();
		myList.addContact();
		myList.printAll();
		myList.find();

		myList.write();

		myList.clear();
		System.out.println(myList);

		myList.read();
		System.out.println(myList);

	}
}
