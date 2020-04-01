import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest {
	private static LoginDAO dao;
	private static Login user1;
	private static Login user2;
	
	@BeforeClass
	public static void init() {
		dao = new LoginDAO();
		user1 = new Login("Aman", "pass");
		user2 = new Login("Akash", "pass");
	}
	
	@Test
	public void testAddLogin_ADD_NULL() {
		int prev_size = dao.loginlist.size();
		boolean actual = dao.addLogin(null);
		int new_size = dao.loginlist.size();
		assertFalse(actual);
		assertEquals(prev_size, new_size);
	}

	@Test
	public void testAddLogin() {
		int prev_size = dao.loginlist.size();
		boolean actual = dao.addLogin(user1);
		int new_size = dao.loginlist.size();
		assertTrue(actual);
		assertEquals(prev_size + 1, new_size);
	}
	@Test
	public void testDeleteLogin_WHEN_USER_IS_PRESENT() {
		int prev_size = dao.loginlist.size();
		boolean actual = dao.deleteLogin(user1);
		int new_size = dao.loginlist.size();
		assertTrue(actual);
		assertEquals(prev_size - 1, new_size);
	}

	
	@Test
	public void testDeleteLogin_WHEN_USER_NOT_PRESENT() {
		int prev_size = dao.loginlist.size();
		boolean actual = dao.deleteLogin(user2);
		int new_size = dao.loginlist.size();
		assertFalse(actual);
		assertEquals(prev_size, new_size);
	}
	
	@Test
	public void testDeleteLogin_DELETE_NULL() {
		int prev_size = dao.loginlist.size();
		boolean actual = dao.deleteLogin(null);
		int new_size = dao.loginlist.size();
		assertFalse(actual);
		assertEquals(prev_size, new_size);
	}
	}
/*
	@Test
	public void methoddeleteLogintrue() {

		LoginDAO login = new LoginDAO();
		Login l = new Login("1234", "password");
		login.addLogin(l);
		assertTrue(login.deleteLogin(l));
	}

	// Write the code for adding and deleting Login data
	@Test
	public void methoddeleteLoginfalse() {

		LoginDAO login = new LoginDAO();
		Login l = new Login("1234", "password");
		login.addLogin(l);
		assertFalse(login.deleteLogin(null));
	}

}*/
