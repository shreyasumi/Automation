package page;



import org.openqa.selenium.By;

import BasicSetup.Base;

public class ShippingDetails extends Base {
	public void courierDetails()
	{
		driver.findElement(By.xpath("//*[@class=\"_2IX_2- _17N0em\"]")).sendKeys("7004192941");
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _20xBvF _3AWRsL\"]")).click();
		
		
		
		
	}

	

}
