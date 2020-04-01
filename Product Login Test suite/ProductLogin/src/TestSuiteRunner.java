import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({LoginTest.class, ProductTest.class})
public class TestSuiteRunner {

/*	@Test
	public void ProductTest () {
	 ProductTest productTest =new ProductTest();
		productTest.testaddProduct();
		productTest.testaddProduct_ADD_NULL();
		productTest.testdeleteProduct_WHEN_Product_IS_PRESENT();
		productTest.testdeleteProduct_WHEN_Product_NOT_PRESENT();
		productTest.testdeleteProduct_DELETE_NULL();
		
	}
	
	@Test
	public void LoginTest () {
		LoginTest loginTest =new LoginTest();
		loginTest.testAddLogin_ADD_NULL();
		loginTest.testAddLogin();
		loginTest.testDeleteLogin_DELETE_NULL();
		loginTest.testDeleteLogin_WHEN_USER_IS_PRESENT();
		loginTest.testDeleteLogin_WHEN_USER_NOT_PRESENT();
	}
	*/
}
