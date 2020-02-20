package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dateselectorfb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(driver,1);
	 
	    Select day = new Select(driver.findElement(By.xpath("//*[@id='day']")));
	    day.selectByVisibleText("3");
	    
	    Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	    month.selectByValue("1");
	    
	    Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	    year.selectByValue("1997");
	    
	    driver.findElement(By.id("u_0_4")).click();
	    WebElement guru99seleniumlink;
		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		guru99seleniumlink.click();
	}

}
