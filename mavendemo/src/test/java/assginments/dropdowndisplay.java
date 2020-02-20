package assginments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//*[@id='day']"));
	   // Select drp = new Select(driver.findElement(By.xpath("//*[@id='day']")));
	    
	    
	   

	    Select list1 = new Select(driver.findElement(By.xpath("//*[@id='day']")));

	    List<WebElement> dropdown_list = list1.getOptions();

	    for (int i = 0; i < dropdown_list.size(); i++) {

	      String dropdown_value = dropdown_list.get(i).getText();
	      

	      System.out.println("dropdown values are " + dropdown_value);
	}

	}
}
