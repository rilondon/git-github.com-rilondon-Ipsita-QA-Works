package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\Automation\\Jar\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.uk");
		driver.findElement(By.linkText("Gmail")).click();
//		driver.findElement(By.id("")).sendKeys("");

	}

}
