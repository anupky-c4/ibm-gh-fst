package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println(driver.getTitle());
        String th_header= driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h3[1]")).getText();
        System.out.println(th_header);
        Color fi_headerColor = Color.fromString(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h5")).getCssValue("color"));
        System.out.println(fi_headerColor);
        System.out.println("Color as RGB: " + fi_headerColor.asRgb());
        System.out.println("Color as hexcode: " + fi_headerColor.asHex());

        // Find the violet button and print its classes
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
        // Find the grey button and print its text
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);
        driver.quit();

	}

}
