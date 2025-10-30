package Oct_15;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandelingDemo {
	static WebDriver driver;
	JavascriptExecutor js;
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
	}
	
	public void handlewindow() throws AWTException
	{
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		driver.findElement(By.xpath("//div[@id='subtopnav']/a[text()='PYTHON']")).click();
		
		js.executeScript("scroll(0,+700)");
//		js.executeScript("arguments[0].ScrollIntoView(true)", driver.findElement(By.xpath("//div[@class='w3-example']/h3[text()='Example']")));
		driver.findElement(By.xpath("//div[@class='w3-example']/a[text()='Try it Yourself »']")).click();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin.size());
		for(String w: allwin){
			if(!w.equalsIgnoreCase(mainId)) {
				driver.switchTo().window(w);
				driver.findElement(By.id("runbtn")).click();
			}
		}
	}
	
	public static void main(String[] args) throws AWTException {
		WindowHandelingDemo alert = new WindowHandelingDemo();
		alert.setup();
		alert.handlewindow();
	}
}
