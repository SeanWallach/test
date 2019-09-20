
public class BuddyInfo {
	private String name;
	private String address;
	private int phoneNum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Homer");
		System.out.println("hello " + buddy.getName());
	}
	
	public BuddyInfo(String name, String address, int phoneNum) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	public BuddyInfo() {
		BuddyInfo buddy = new BuddyInfo("John", "Sample", 613);
	}
	
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

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

}
