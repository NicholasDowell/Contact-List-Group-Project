import java.util.Scanner;

/**
 * Tests all use cases and proves the program runs as specified.
 * @author Nick
 *
 */
public class MainMethod {

	
	public static void main(String[] args) {
		ContactList myList = new ContactList();
		myList.loadSavedData();
		System.out.println("You have a total of " + myList.getSize() + " contacts");
		boolean notFinished = true;
		
		while (notFinished){
			printMenu();
			switch(getUserChoice()){
			case 1: System.out.println("You chose option 1 to add a new contact:");
					myList.addContact();
					break;
			case 2: System.out.println("You chose option 2 for printing the entire contact list:");
					myList.printAll();
					break;
			case 3: System.out.println("You chose option 3 to search by last name:");
					myList.find();
					break;
			case 4: System.out.println("You chose option 4 to quit:");
					myList.save();
					notFinished = false;
					break;
			}	
		}
		
		
		
	}
	
	/**
	 * Prints out the menu so the user can see the available options
	 */
	public static void printMenu(){
		System.out.println("**************************************************************" + "\n");
		System.out.println("MENU" + "\n");
		System.out.println("1 - Enter a new person to the contact list (Last name required)" + "\n");
		System.out.println("2 - Print the contact list" + "\n");
		System.out.println("3 - Retrieve a person's information by last name" + "\n");
		System.out.println("4 - Quit the program" + "\n");
		System.out.println("*Please choose a number, then press ‘Enter’" + "\n" +
							"***************************************************************");
	}
	/**
	 * Gets an integer between 1 and 4 from the user
	 * @return
	 */
	public static int getUserChoice(){
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	
}
