package page;

import org.openqa.selenium.By;

import BasicSetup.Base;

public class LoginPage extends Base
{
	public void Login()
	{
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("8839463609");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[text()='Verify']")).click();
	}
}
