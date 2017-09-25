import java.util.List;
public class AddressBook {
	
	
	private List<BuddyInfo> book;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddressBook book = new AddressBook();
		System.out.println("book created");

	}
	
	public void addBuddy(BuddyInfo person) {
		
		book.add(person);
		
	}
	public void removeBuddy(BuddyInfo person) {
		
		book.remove(person);
		
	}

}
