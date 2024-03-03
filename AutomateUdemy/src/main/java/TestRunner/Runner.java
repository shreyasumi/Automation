package TestRunner;

import org.testng.annotations.Test;

import BasicSetup.Base;
import page.LoginPage;
import page.SearchProduct;
import page.ShippingDetails;

public class Runner extends Base
{
	LoginPage lp = new LoginPage();
	SearchProduct sp = new SearchProduct();
	ShippingDetails sd = new ShippingDetails();
	
	@Test
	public void testOne()
	{
		
		openBrowser();
		openURL();	
		//lp.Login();
		sp.productSearch();
		sd.courierDetails();
		closeBrowser();
	}
}

/*
class LoginPage
{
	Login()
	{}
}

public class Runner
{
	LoginPage lp = new LoginPage();
	lp.Login();
}*/