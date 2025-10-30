package Com.Gmail.Users.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginDemo2 {
	static WebDriver driver;
	
//	@When("I navigate to login page")
//	public void i_navigate_to_login_page() {
//			driver = new ChromeDriver();
//			driver.get("https://demo.guru99.com/test/newtours/");
//	}
//	
//	@When("I entered {string} and {string}")
//	public void i_entered_and(String unm, String pwd) {
//		WebElement unm1 = driver.findElement(By.name("userName"));
//		  unm1.sendKeys(unm);
//		  
//		  WebElement pwd1 = driver.findElement(By.name("password"));
//		  pwd1.sendKeys(pwd);
//	}
//	
//	@And("I clicked signin button")
//		public void I_clicked_signin_button() {
//			 WebElement submit = driver.findElement(By.name("submit"));
//			 submit.click();
//			  
//			  WebElement ref = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//			  System.out.println(ref.getText());
//			  Assert.assertEquals(ref.getText(), "Login Successfully");
//		}
	
//	@When("I navigate to login page")
//	public void i_navigate_again_to_login_page() {
//			driver = new ChromeDriver();
//			driver.get("https://demo.guru99.com/test/newtours/");
//	}
	
//	@When("I entered unm {string}")
//	public void i_entered_unm(String unm) {
//		WebElement unm1 = driver.findElement(By.name("userName"));
//		  unm1.sendKeys(unm);
//	}
//	
//	@When("I entered Invalid pwd {string}")
//	public void i_entered_pwd(String pwd) {
//		  WebElement pwd1 = driver.findElement(By.name("password"));
//		  pwd1.sendKeys(pwd);
//	}
//	
//	@And("I clicked signin button")
//	public void I_clicked_signin_button() {
//		 WebElement submit = driver.findElement(By.name("submit"));
//		 submit.click();
//	}
//	
//	@Then("Itas navigated to the error")
//	public void Itas_navigated_to_the_error(){
//		WebElement ref = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//		System.out.println(ref.getText());
//		Assert.assertEquals(ref.getText(), "Enter your userName and password correct");
//	}

}
