package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.redbus.in/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
	   for(int i=1;i<6;i++)
	   {
		   driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]")).click();
	   }
	   
	    driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[4]")).click();
	}

}
