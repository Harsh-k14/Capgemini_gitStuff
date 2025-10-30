package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction2 {
	private WebDriver driver;
	private ExtentTest test;
// POM using PageFactory
	public UserInteraction2(WebDriver driver, ExtentTest test){
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='userName']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//h3[contains(text(),'Login')]")
	private WebElement target;
	
	@FindBy(xpath = "//span[normalize-space()='Enter your userName and password correct']")
	private WebElement target1;
	
	@FindBy(xpath = "//h3[normalize-space()='Login Successfully']")
	private WebElement success;
	
	@FindBy(xpath = "//span[normalize-space()='Enter your userName and password correct']")
	private WebElement errorMsg;
	
	public void getUserName(String un) {
        username.sendKeys(un);
    }

    public void getPassword(String pwrd) {
        password.sendKeys(pwrd);
    }

    public void getSubmitted() {
        submit.click();
    }
    
    public void LoginSuccess() {
        Assert.assertTrue(target.isDisplayed());
        System.out.println("Login Successfully.");
    }

    public void LoginFails() {
        Assert.assertTrue(target1.isDisplayed());
        System.out.println("Login Failed....");
    }

    public void Run(String expectedResult) {
        if(expectedResult.equals("Login Successfully")) {
            Assert.assertEquals(success.getText(), "Login Successfully");
            System.out.println("Navigated to HomePage");
        }else if (expectedResult.equals("Enter data Correctly")) {
            Assert.assertEquals(errorMsg.getText(), "Enter your userName and password correct");
            System.out.println("Error message appeared");
        }
    }
}
