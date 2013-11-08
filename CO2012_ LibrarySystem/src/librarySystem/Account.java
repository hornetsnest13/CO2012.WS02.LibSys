package librarySystem;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;;

public class Account {
	private int id;
	private Set<UserItem> history;
	private Date opened;
	private AccountState state;
	
	public Account(){
		
	}
}
