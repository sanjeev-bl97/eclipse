package training;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class fire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.gecko.driver","C://Selenium//geckodriver.exe");
		    WebDriver driver1 = new FirefoxDriver(); 
		    driver1.get("https://www.google.com/intl/en-GB/gmail/about/");
	}

}
