package factoties;

import ifaces.IUserDAO;
import impl.MemoryUserImpl;

public class UserFactory {
	public static IUserDAO getClassFromFactory() {
		return  new MemoryUserImpl();
	}
}
