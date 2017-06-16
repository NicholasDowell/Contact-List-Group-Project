/**
 * Tests UseCase1 by creating two ContactList objects.
 * @author Arman
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
mousavi.arman@gmail.com
Please enter the person's phone number.

Please enter any other additional information about the person.
Male
Arman Mousavi got stored into the contact list
[Arman Mousavi  mousavi.arman@gmail.com  Male]
Please enter the person's first name.
Danial
Please enter the person's last name.
Mousavi
Please enter the person's address.

Please enter the person's email address.

Please enter the person's phone number.
041521847
Please enter any other additional information about the person.
Arman's Brother
Danial Mousavi got stored into the contact list
[Arman Mousavi  mousavi.arman@gmail.com  Male, Danial Mousavi   041521847 Arman's Brother]

*/
