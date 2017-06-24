
public class TestDiskSaving {

	public static void main(String args[]) {
		ContactList myList = new ContactList();
		myList.addContact();
		myList.addContact();
		myList.printAll();
		myList.find();
		
		myList.save();
		System.out.println(myList);
		myList.loadSavedData();
		System.out.println(myList);
		
		

	}
}
