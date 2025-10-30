package Oct_15;

import java.awt.AWTException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ImplicitWaitDemo {
	static WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	FluentWait wait;
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
//		js = (JavascriptExecutor) driver;
//		action = new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		WebDriverWait wait = new WebDriverwait(driver, Duration.ofSeconds(2)));
		wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(600));
	}
	
	public void login() throws AWTException
	{
		try {
			WebElement unm = driver.findElement(By.name("userName"));
			unm.sendKeys("mercury");
//			WebElement pwd = driver.findElement(By.name("password1"));
//			pwd.sendKeys("mercury");
//			WebElement submit = driver.findElement(By.name("submit"));
//			submit.click();
			wait.until(ExpectedConditions.attributeToBe(By.name("password"), "name", "password"));
			WebElement pwd = driver.findElement(By.name("password1"));
			pwd.sendKeys("mercury");
			WebElement submit = driver.findElement(By.name("submit"));
			wait.until(ExpectedConditions.numberOfElementsToBe(By.name("submit"),3));
			submit.click();
		}catch(NoSuchElementException e){
			e.printStackTrace();	
		}
	}
	public static void main(String[] args) throws AWTException {
		ImplicitWaitDemo alert = new ImplicitWaitDemo();
		alert.setup();
		alert.login();
	}
}