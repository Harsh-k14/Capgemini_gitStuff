package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Com.Gmail.Users.config.Reports;


public class UserInteraction3 {
	private WebDriver driver;
	private WebDriverWait wait;
	ExtentTest test;
// POM using PageFactory
	public UserInteraction3(WebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
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
	
	public boolean getUserName(String un) {
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(username));
			Reports.generateReport(driver, test, Status.PASS, "UserName found");
			username.sendKeys(un);
		}catch(TimeoutException te){
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "UserName not interacting....");
		}
        return actResult;
    }

    public boolean getPassword(String pwrd) {
    	boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(password));
			Reports.generateReport(driver, test, Status.PASS, "Password found");
			password.sendKeys(pwrd);
		}catch(TimeoutException te){
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "Password not interacting....");
		}
        return actResult;
    }

    public boolean getSubmitted() {
        boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(submit));
			Reports.generateReport(driver, test, Status.PASS, "Submit button found");
			submit.click();
		}catch(TimeoutException te){
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "Submit button not interacting....");
		}
        return actResult;
    }
    
//    public void LoginSuccess() {
//        Assert.assertTrue(target.isDisplayed());
//        System.out.println("Login Successfully.");
//    }
//
//    public void LoginFails() {
//        Assert.assertTrue(target1.isDisplayed());
//        System.out.println("Login Failed....");
//    }
//
//    public void Run(String expectedResult) {
//        if(expectedResult.equals("Login Successfully")) {
//            Assert.assertEquals(success.getText(), "Login Successfully");
//            System.out.println("Navigated to HomePage");
//        }else if (expectedResult.equals("Enter data Correctly")) {
//            Assert.assertEquals(errorMsg.getText(), "Enter your userName and password correct");
//            System.out.println("Error message appeared");
//        }
//        
//    }
    
    public boolean run(String expectedResult) {
    	boolean actResult = true;
		WebElement ele;
		if(expectedResult.equals("Login Successfully")) {
			 ele = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		}else {
			ele=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		}
		
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			if(ele.getText().matches("Login Successfully")){
	   			Reports.generateReport(driver, test, Status.PASS, "Valid User");
	   		 }
	   		 else
	   		 {
	   			actResult = false;
	            Reports.generateReport(driver, test, Status.FAIL, "Invalid Credentials");
	   		 }
		}catch (Exception te) {
            actResult = false;
            Reports.generateReport(driver, test, Status.FAIL, "Wait time exceeded...");
        }
		
	   	 return actResult;
       }
    }

