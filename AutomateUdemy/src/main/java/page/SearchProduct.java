package page;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import BasicSetup.Base;

public class SearchProduct extends Base
{
	public void productSearch()
	{
		driver.findElement(By.name("q")).sendKeys("Blouse", Keys.ENTER);
		driver.findElement(By.xpath("//*[@title=\"Round Neck Women Blouse\"]")).click();
        Set<String> s=driver.getWindowHandles();
        ArrayList<String> arr=new ArrayList<String>(s);
        driver.switchTo().window((String)arr.get(1));
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")).click();

        
        //driver.findElement(By.xpath("//*[@class=\"_36yFo0\"]")).sendKeys("560077");
        //driver.findElement(By.xpath("//*[@class=\"_2P_LDn\"]")).click();
        //driver.findElement(By.xpath("//*[text()='Add 2 Items to Cart']")).click();
        //driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")).click();
       // driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")).click();
       
        
        
		
	}

}
