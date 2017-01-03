package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class ContactPage {
 
	private WebDriver driver;

	private By contactPageText = By.cssSelector("div#ContactHead h1");
	private By nameTextBox = By.cssSelector("div#ContactNameBox input");
	private By emailTextBox = By.cssSelector("div#ContactEmailBox input");
	private By messageTextBox = By.cssSelector("css=div#ContactMessageBox textarea");
	private By sendBtn = By.id("css=div#ContactSend input");
	private By successMsgTxt = By.id("errormsg_0_Passwd");
		
		public ContactPage(WebDriver driver) {
			this.driver=driver;
		}
		
		public String getContactPageTitle() {
			String pageTitle = driver.getTitle();
			return pageTitle;
		}
		
		public boolean verifyContactPageTitle() {
			String expectedTitle = "Contact Us - QAWorks";
			return getContactPageTitle().contains(expectedTitle);
		}
		
		public boolean verifySignInPageText() {
			WebElement element = driver.findElement(contactPageText);
			String pageText = element.getText();
			String expectedPageText = "Contact";
			return pageText.contains(expectedPageText);
		}
			
		public void sendMessage(String name,String email,String message){
			driver.findElement(nameTextBox).sendKeys(name);
			driver.findElement(emailTextBox).sendKeys(email);
			driver.findElement(messageTextBox).sendKeys(message);
			driver.findElement(sendBtn).click();
		}
		
		public String getErrorMessage() {
				String strSuccesMessage = null;
				WebElement sucMsg = driver.findElement(successMsgTxt);
				if(sucMsg.isDisplayed()&&sucMsg.isEnabled())
					strSuccesMessage = sucMsg.getText();
				return strSuccesMessage;
		}
}
