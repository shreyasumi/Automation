package Pages;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BasicSetup.Base;


public class HomePage extends Base
{
public void openHomePage()
{
	
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "BlazeDemo");
	 
			
	
//	Set<String> s = driver.getWindowHandles();
//	ArrayList<E> arr = new ArrayList(s);
//	driver.switchTo().window(String)arr.get(1));
	
}
 public void navigateToDestinationPage()
 {
	 driver.findElement(By.linkText("destination of the week! The Beach!")).click();
	 // navigate to other tab
		Set<String> s = driver.getWindowHandles();
		ArrayList arr = new ArrayList(s);
		driver.switchTo().window((String)arr.get(1));
		System.out.println(arr.get(1));
		driver.switchTo().window((String)arr.get(0));
		
 
}
 public void purchaseTicket()
 {
	 
	 WebElement dcity = driver.findElement(By.xpath("//select[@name='fromPort']"));
	 Select select1 = new Select(dcity);
	 select1.selectByVisibleText("Mexico City");
	 
	 WebElement destination = driver.findElement(By.xpath("//select[@name='toPort']"));

	 Select select2 = new Select(destination);
	 select1.selectByVisibleText("London");
	 
	 // click on find flight button
	 driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	 driver.manage()
.timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	
	 //choose the flight
	 driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
	 
	 //details
	 String ExpectedText = "Total Cost";
	//  String get_source = driver.getPageSource();
	 WebElement totalcost = driver.findElement(By.xpath("//*[contains(text(),'Total Cost')]"));
	 Assert.assertEquals(ExpectedText,totalcost);
	 // click on purchase flight button
	 driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	 
	 WebElement id = driver.findElement(By.xpath("//td[normalize-space()='1705404598317']"));
	 String idvalue = id.getText();
	 System.out.println("the id value is" + id );
	 
	 
 }
}