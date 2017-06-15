/**
 * Tests ContactList and Contact for use case 1 by creating one ContactList and adding two contacts to it.
 * @author armanmousavi
 *
 */

public class TestUseCase1 {
	
	public static void main(String args[]) {
		//AM
		ContactList myList = new ContactList();
		myList.addContact();
		myList.printAll();
		//AM
		
		myList.addContact();
		myList.printAll();
		
		
	}

}

/*
Please enter the person's first name.
Arman
Please enter the person's last name.
Mousavi
Please enter the person's address.

Please enter the person's email address.
mousavi.arman@icloud.com
Please enter the person's phone number.

Please enter any other additional information about the person.
Male
Arman Mousavi got stored into the contact list
all contacts printed
Please enter the person's first name.
Danial
Please enter the person's last name.
Mousavi
Please enter the person's address.
Geesthachter Str. 80a, 21502 Geesthacht, Germany
Please enter the person's email address.

Please enter the person's phone number.

Please enter any other additional information about the person.
Male
Danial Mousavi got stored into the contact list
all contacts printed
*/
