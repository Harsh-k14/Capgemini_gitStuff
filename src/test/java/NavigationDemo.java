import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
	static WebDriver driver;
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1760426926354&no_sw_cr=1");
	}
	
	public static void main(String[] args) {
		NavigationDemo nd = new NavigationDemo();
		nd.setup();
		WebElement search = driver.findElement(By.id("APjFqb"));
//		search.sendKeys("java");
//		search.sendKeys(Keys.ENTER);
		
		search.sendKeys("java",Keys.ENTER);
		search.sendKeys("java",Keys.chord(Keys.CONTROL, Keys.getKeyFromUnicode('f')));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		//driver.navigate().to(new URl());
		}
}
 