package fst_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("The title of the page is: "+driver.getTitle());
		Actions builder = new Actions(driver);
		WebElement zone1=driver.findElement(By.id("dropzone1"));
		WebElement zone2=driver.findElement(By.id("dropzone2"));
		WebElement ball=driver.findElement(By.id("ball"));
		builder.clickAndHold(ball).pause(1000).moveToElement(zone1).pause(1000).release(ball).build().perform();
		if(zone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
        }
		builder.dragAndDrop(ball,zone2).build().perform();
		if(zone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        }
		driver.quit();

	}

}
