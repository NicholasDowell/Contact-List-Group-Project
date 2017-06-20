/**
 * Tests use case 2 by creating contacts and then calling the print method
 * @author Nick
 *
 */
public class TestCase2 {

	public static void main(String[] args) {
		ContactList myList = new ContactList();
		myList.addContact();
		myList.addContact();
		myList.addContact();
		myList.addContact();
		myList.printAll();
		
	}
}


/*
Please enter the person's first name.
nick
Please enter the person's last name.
dowell
Please enter the person's address.

Please enter the person's email address.

Please enter the person's phone number.

Please enter any other additional information about the person.

nick dowell got stored into the contact list
Please enter the person's first name.
anders
Please enter the person's last name.
Dowell
Please enter the person's address.

Please enter the person's email address.

Please enter the person's phone number.

Please enter any other additional information about the person.

anders Dowell got stored into the contact list
Please enter the person's first name.
arman
Please enter the person's last name.
mousavi
Please enter the person's address.

Please enter the person's email address.

Please enter the person's phone number.

Please enter any other additional information about the person.

arman mousavi got stored into the contact list
Please enter the person's first name.
danial
Please enter the person's last name.
mousavi
Please enter the person's address.

Please enter the person's email address.

Please enter the person's phone number.

Please enter any other additional information about the person.

danial mousavi got stored into the contact list
anders Dowell    
nick dowell    
arman mousavi    
danial mousavi    
*/