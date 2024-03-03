package TestRunner;

import org.testng.annotations.Test;

import BasicSetup.Base;
import Pages.HomePage;

public class RunTest extends Base

{
	@Test
public void Test1() 
{
		HomePage obj = new HomePage();
	    Setup();
	    openUrl("websiteURL");
	    obj.openHomePage();
	    obj.navigateToDestinationPage();
	    obj.purchaseTicket();
	    closeBrowse(); 
	
}
}
