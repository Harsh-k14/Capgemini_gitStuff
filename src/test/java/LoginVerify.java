import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerify {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1760347364891&no_sw_cr=1");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String expectUrl = "https://www.google.com/?zx=1760347364891&no_sw_cr=1";
		
		if(url.equals(expectUrl)){
			System.out.println("Successful launch");
		}else {
			System.out.println("UnSuccessful launch");
		}
		
		//Extract the actual title from the launch website
		
		String title = driver.getTitle();
		if(title.matches("Google")) {
			System.out.println("Title Matches");
		}else {
			System.out.println("Title does not Matches");
		}
	}
}
