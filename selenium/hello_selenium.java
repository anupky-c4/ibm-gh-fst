package fst_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class hello_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net");
	    System.out.println(driver.getTitle());
	    // Close the browser
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();

	}

}
