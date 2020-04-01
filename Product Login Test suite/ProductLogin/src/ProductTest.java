import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class ProductTest {
	
	private static ProductDAO dao;
	private static Product user1;
	private static Product user2;
	
	@BeforeClass
	public static void init() {
		dao = new ProductDAO();
		user1 = new Product("1", "pass",5000);
		user2 = new Product("2", "passas",500.0);
	}
	
	@Test
	public void testaddProduct_ADD_NULL() {
		int prev_size = dao.productlist.size();
		boolean actual = dao.addProduct(null);
		int new_size = dao.productlist.size();
		assertFalse(actual);
		assertEquals(prev_size, new_size);
	}

	@Test
	public void testaddProduct() {
		int prev_size = dao.productlist.size();
		boolean actual = dao.addProduct(user1);
		int new_size = dao.productlist.size();
		assertTrue(actual);
		assertEquals(prev_size + 1, new_size);
	}
	
	@Test
	public void testdeleteProduct_WHEN_Product_IS_PRESENT() {
		dao.addProduct(user1);
		int prev_size = dao.productlist.size();
		boolean actual = dao.deleteProduct(user1);
		int new_size = dao.productlist.size();
		assertTrue(actual);
		assertEquals(prev_size - 1, new_size);
	}

	
	@Test
	public void testdeleteProduct_WHEN_Product_NOT_PRESENT() {
		int prev_size = dao.productlist.size();
		boolean actual = dao.deleteProduct(user2);
		int new_size = dao.productlist.size();
		assertFalse(actual);
		assertEquals(prev_size, new_size);
	}
	
	@Test
	public void testdeleteProduct_DELETE_NULL() {
		int prev_size = dao.productlist.size();
		boolean actual = dao.deleteProduct(null);
		int new_size = dao.productlist.size();
		assertFalse(actual);
		assertEquals(prev_size, new_size);
	}
	}
	
	
/*
	@Test
	public void deleteproducttrue() {
		
		ProductDAO product = new ProductDAO();
		Product l = new Product("123","name",500.0);
		product.addProduct(l);
		assertTrue(product.deleteProduct(l));
	}
	
	@Test
	public void deleteproductfalse() {
		
		ProductDAO product = new ProductDAO();
		Product l = new Product("123","name",500.0);
		product.addProduct(l);
		assertFalse(product.deleteProduct(null));
	}
	
	
 //Write the code for test methods
}
*/