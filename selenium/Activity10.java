package fst_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("The title of the page is: "+driver.getTitle());
		Actions builder = new Actions(driver);
		WebElement cargolock=driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[1]/div"));
		WebElement cargotoml=driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[2]/div"));
		WebElement srcbutton=driver.findElement(By.xpath("//*[@id=\"stage\"]/div[1]/div[3]/div"));
		WebElement targetbutton=driver.findElement(By.xpath("//*[@id=\"stage\"]/div[1]/div[4]/div"));
		
		builder.click(cargolock).pause(1000).moveToElement(cargotoml).pause(3000).click(cargotoml);
        String actionmsg = driver.findElement(By.id("result")).getText();
        System.out.println(actionmsg);
        builder.doubleClick(srcbutton).pause(3000).moveToElement(targetbutton).pause(1000).contextClick(targetbutton).pause(1000).build().perform();
        builder.click(driver.findElement(By.xpath("//*[@id=\"menu\"]/div/ul/li[1]/button"))).pause(5000).build().perform();
        actionmsg = driver.findElement(By.id("result")).getText();
        System.out.println(actionmsg);

        // Close the browser
        driver.quit();
	}

}
