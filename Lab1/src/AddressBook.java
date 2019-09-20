
public class AddressBook {
	private BuddyInfo[] buddies;
	private int buddyCount;
	
	public AddressBook() {
		buddies[0] = new BuddyInfo("John", "main st", 12);
		buddies[1] = new BuddyInfo("Lucas", "main st", 455);
		buddyCount = 1;
	}
	
	public void addBuddy(BuddyInfo buddy) {
		buddies[buddyCount-1] = buddy;
		buddyCount++;
	}
	
	public void removeBuddy() {
		if (buddyCount == 0) return;
		buddies[buddyCount-1] = null;
		buddyCount--;
	}

}
