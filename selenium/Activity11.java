package fst_selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println("The title of the page is: "+driver.getTitle());
		Actions builder = new Actions(driver);
		builder.sendKeys("Testing the send keys functionality in selenium.").build().perform();

//		builder.sendKeys("Testing the send keys functionality in selenium.").pause(3000).sendKeys(Keys.RETURN).build().perform();
		String textdata=driver.findElement(By.cssSelector("h1.mt-3")).getText();
		System.out.println(textdata);
		driver.quit();
		
	}

}
