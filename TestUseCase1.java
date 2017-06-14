/**
 * Tests UseCase1 by creating two ContactList objects.
 * Each object represents a contact.
 * @author armanmousavi
 *
 */

public class TestUseCase1 {
	
	public static void main(String args[]) {
		//AM
		ContactList Arman = new ContactList();
		Arman.addContact();
		Arman.printAll();
		//AM
		ContactList Danial = new ContactList();
		Danial.addContact();
		Danial.printAll();
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