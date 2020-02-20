package date12;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.facebook.com/");
	    //driver.navigate().back();
	    
	    driver.findElement(By.xpath("//*[@id='day']"));
	    Select drp = new Select(driver.findElement(By.xpath("//*[@id='day']")));
	   System.out.println(drp.getAllSelectedOptions());
	    //drp.selectByIndex(3);
	    drp.selectByVisibleText("3");
	    if(drp.isMultiple()){
	    	System.out.println("true");
	    }
	    else {System.out.println("false");}
//		   driver.findElement(By.id("email")).sendKeys("sanjeev.bl97@gmail.com");
//		   driver.findElement(By.id("pass")).sendKeys("computer engineer  8");
//		   driver.findElement(By.id("u_0_b")).click();
//		   driver.findElement(By.linkText("Forgotten account?")).click();
	
	
	}

}
