package fst_selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/dynamic-controls");
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Wait for it to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        // Check if it is visible
        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
        
        // Toggle the checkbox and click it
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
        // Check if it is selected
        System.out.println("Checkbox is selected? " + checkbox.isSelected());
        // Close the browser
        driver.quit();
	}

}
