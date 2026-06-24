package fst_selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity_amazon {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
//		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 17 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement price=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span[2]/span[2]"));

		driver.findElement(By.xpath("span[@class = 'a-price-whole'][4]"));
		System.out.println("Price is : " + price.getText());
		driver.quit();
		
		
		
	}

}
