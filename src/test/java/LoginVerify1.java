import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerify1 {
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		LoginVerify1 newtours = new LoginVerify1();
		newtours.setup();
		System.out.println(" URL : " + driver.getCurrentUrl());
		System.out.println(" URL : " + driver.getTitle());
		
		//newtours.login();
		newtours.triptype();
		//newtours.getLinks();
		
//		passwrdtxt.clear();
//		Thread.sleep(1000);
//		
//		passwrdtxt.sendKeys("Hello");
		
		WebElement submitbtn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table"
				+ "[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/table[1]"
				+ "/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/input[1]"));
		submitbtn.click();
	}
	
	public void setup() {
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	public void triptype() {
		driver.findElement(By.partialLinkText("Flights")).click();
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}
	
	public void login(){
		WebElement usernm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/"
				+ "tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/table[1]/"
				+ "tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		usernm.sendKeys("mercury");
		
		WebElement passwrdtxt = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table"
				+ "[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/table[1]/"
				+ "tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		passwrdtxt.sendKeys("mercury@123");
	}
	
	public void getLinks(){
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement usernm = driver.findElement(By.name("userName"));
		usernm.sendKeys("mercury");
		
		WebElement passwrdtxt = driver.findElement(By.name("password"));
		passwrdtxt.sendKeys("mercury@123");
		
		WebElement cnfpasswrdtxt = driver.findElement(By.name("confirmpassword"));
		cnfpasswrdtxt.sendKeys("mercury@123");
		
		//input[@name='userName']
		///html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]
		///
	}
}
