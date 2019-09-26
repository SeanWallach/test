import java.util.*;

public class AddressBook {
	private List<BuddyInfo> buddies;
	private int buddyCount;
	
	public AddressBook() {
		buddies.add(new BuddyInfo("John", "main st", 12));
		buddies.add(new BuddyInfo("Lucas", "main st", 455));
		buddyCount = 2;
	}
	
	public void addBuddy(BuddyInfo buddy) {
		buddies.add(buddy);
		buddyCount++;
	}
	
	public void removeBuddy() {
		if (buddyCount == 0) return;
		buddies.remove(buddyCount);
		buddyCount--;
	}

}
