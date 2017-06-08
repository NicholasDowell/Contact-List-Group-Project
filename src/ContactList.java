import java.util.ArrayList;
/**
 * One ContactList holds one contact[]
 * it can manipulate, save, and display the array
 * @author Nick
 */
public class ContactList {

	private ArrayList<Contact> currentContacts = new ArrayList<Contact>();
	
	/**
	 * Adds a contact to the list at the next unoccupied index
	 * @author Nick
	 */
	public void addContact(Contact theContact){
		System.out.println("contact added");
	}
	/**
	 * Prints all contacts stored in the list, alphabetically by last name, then first name. (not case sensitive)
	 * @author Nick
	 */
	public void printAll(){
		System.out.println("all contacts printed");
	}
	/**
	 * Prints all the info for each contact with a specified last name
	 * @author Nick
	 */
	public void printContact(String lastName){
		System.out.println("ONE whole contact being printed");
	}
	
	/**
	 * Saves the current list of contacts onto the disk
	 * @author Nick, Zhixiang
	 */
	public void save(){
		//Implement save function
		System.out.println("data saved");
	}
	/**
	 * Reads any saved data from the disk into memory, and stores it in the currentContacts
	 * @author Nick
	 */
	public void loadSavedData(){
		System.out.println("data loaded");
	}
	
	/**
	 * Return information of the entire list of contact
	 * @author Zhixiang
	 */
	public String toString(){
		return "";
	}
	
}
