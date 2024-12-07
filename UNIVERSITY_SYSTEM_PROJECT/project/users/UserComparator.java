package users;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		if(user1.login == user2.login) {
			if(user1.password == user2.password) {
				return 0;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
	
	
}
