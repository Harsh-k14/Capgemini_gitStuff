import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launchweb {
	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\hvishnuk\\Downloads\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://demo.guru99.com/test/newtours/");
	}
}
