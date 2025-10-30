package Oct_15;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUp {
	static WebDriver driver;
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}
	
	public void upload() throws AWTException{
		//Robot robot = new Robot();
		driver.findElement(By.xpath(null));
		driver.findElement(By.xpath(null));
		driver.findElement(By.xpath(null));
	}
	
	//Save the upload file location
	//String Selection s = new StringSelection("Location of the file);"
	//save file in system memory
	//Toolkit.defaultToolkit().getSystem
	//ClipBoard().sContents(s,nul)
	//paste file to window alert textfield
	//robot keyPress(KeyEvent.VK_Control)
	
}
