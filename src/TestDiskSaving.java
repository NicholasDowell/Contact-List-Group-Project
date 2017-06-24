public class TestDiskSaving {

	public static void main(String args[]) {
		ContactList myList = new ContactList();
		myList.addContact();
		myList.addContact();
		myList.printAll();
		myList.find();
		
		myList.write();
		
		myList.setNull();
		System.out.println(myList);
		
		myList.read();
		System.out.println(myList);
		
		

		
		

	}
}
