/**
 * Tests the ContactList and Contact objects
 *@author Nick
 */
public class TestContactList {

	public static void main(String[] args) {
		
		//ND
		ContactList myList = new ContactList();
		myList.read();
		myList.printAll();
		
		//ND
		Contact sammie = new Contact("Angler");
		sammie.setFirstName("sammie");
		sammie.setStreetAddress("123 Fish Street, Sandy Eggo, CA");
		sammie.setEmailAddress("TacoShaman@gmail.com");
		sammie.setPhoneNumber("100-333-2255");
		sammie.setNotes("A true legend");

		//ND
		System.out.println("testing sample:");
		System.out.println(sammie.getFirstName());
		System.out.println(sammie.getStreetAddress());
		System.out.println(sammie.getEmailAddress());
		System.out.println(sammie.getPhoneNumber());
		System.out.println(sammie.getNotes());
		 
		//ND
		//myList.addContact(sammie);
		//System.out.println(sammie.toString);
		myList.printAll();
		//myList.printContact();
		myList.write();
		System.out.println("This is the last line of code in the program");
		
	}
}

/*OUTPUT:
data loaded
all contacts printed
new contact constructed
testing sample:
got test first Name
got test last name
got test Address
got test email
got test phone#
got test notes
contact added
all contacts printed
ONE whole contact being printed
data saved
This is the last line of code in the program
*/

