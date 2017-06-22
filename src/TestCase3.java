/**
 * Tests case three be adding two contacts to a contact list, and then printing the list, and retrieving a contact by last name
 * @author Zhixiang
 *
 */
public class TestCase3 {
	public static void main(String args[]){
		ContactList myList = new ContactList();
		myList.addContact();
		myList.addContact();
		myList.printAll();
		myList.find();
	}
}