package pageObjects;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		String expectedPageTitle="Home Page - QAWorks";
		return getPageTitle().contains(expectedPageTitle);
	}
}
