package fst_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("The title of the page is: "+driver.getTitle());
		driver.findElement(By.id("confirmation")).click();
		Alert simplealert= driver.switchTo().alert();
		System.out.println("Text in alert: "+simplealert.getText());
		simplealert.accept();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.quit();
	}

}
