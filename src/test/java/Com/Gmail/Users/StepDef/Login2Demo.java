package Com.Gmail.Users.StepDef;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import Pages.UserInteraction3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class Login2Demo {
	WebDriver driver = Hooks.driver;
	ExtentTest test = Hooks.test;
	UserInteraction3 demo;
//	Base base;
//	
//	public Login2Demo() {
//		
//	}
//	
//	public Login2Demo(Base base) {
//		this.base = base;
//		driver = Base.driver;
//	}

//		UserInteraction demo;
//		WebDriver driver;
		
    @Given("I navigate to Browser {string}")
    public void i_navigate_to_browser(String url) {
        //driver = new ChromeDriver();
        driver.get(url);
        demo = new UserInteraction3(driver, test); // Pass driver to UserInteraction
    }

 
    @When("I insert {string} and {string}")
    public void I_Insert_userName(String un, String pwrd) {
        demo.getUserName(un);
        demo.getPassword(pwrd);
        System.out.println(un + " " + pwrd);
    }
 
    @And("I clicked the signin button")
    public void I_Clicked_Login() {
        demo.getSubmitted();
    }
//    
//    @Then("Its navigates the UI")
//    public void its_navigated_to_the_home_page() {
//    			demo.LoginSuccess();
//    }
//    @Then("Its not navigates the UI")
//    public void its_not_navigates_the_ui() {
//    	demo.LoginFails();
//		}

    @Then("Its navigated to the {string}")
    public void its_navigated_to_the(String expectedResult) {
        demo.run(expectedResult);
    }
    
//    public void it_got_navigated_to_the_home_page(String ex) {
//    	 
//    	try {
//    	    boolean result = obj2.Run(ex);
//    	    Assert.assertTrue(result);
//    	    System.out.println("Success..");
//    	} catch (AssertionError ae) {
//    	    System.out.println("Failure... Assertion failed: ");
//    	}      
//    }
}