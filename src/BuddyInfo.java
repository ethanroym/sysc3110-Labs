
public class BuddyInfo {
	
	private String name;
	private String address;
	private int phoneNumber;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuddyInfo lab1 = new BuddyInfo();
		lab1.setName("Ethan");
		lab1.setAddress("56 wow street");
		lab1.setPhoneNumber(1234);
		
		System.out.println("Hello, " + lab1.getName());

	}

}
