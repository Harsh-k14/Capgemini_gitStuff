package Oct_15;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandle {
	static WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}
	
	public void handleFrame() throws AWTException{
		WebElement framele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framele);
		WebElement ele1 = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
		int x = ele2.getLocation().getX();
		int y = ele2.getLocation().getY();
		//action.dragAndDrop(ele1, ele2).perform();
		action.dragAndDropBy(ele1, x, y).perform();
		//validation
		String txt = ele2.getText();
		if(txt.matches("Dropped!")){
			System.out.println("Successfully Dropped");
		}else {
			System.out.println("Drop Unsuccessful");
		}
	}
	
	public static void main(String[] args) throws AWTException {
		FrameHandle alert = new FrameHandle();
		alert.setup();
		alert.handleFrame();
	}
}
