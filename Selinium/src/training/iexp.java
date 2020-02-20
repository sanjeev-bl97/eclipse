package training;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
public class iexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C://Selenium//IEDriverServer.exe");
	    WebDriver driver1 = new InternetExplorerDriver(); 
	    driver1.get("https://www.facebook.com/");
	}

}       
