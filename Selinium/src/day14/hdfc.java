package day14;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.hdfcbank.com/");
            driver.manage().window().maximize();
            WebElement a=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span[2]"));
            WebElement b=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[3]/ul/li[5]/a/span"));
            
            Actions c = new Actions(driver); 
            c.moveToElement(a);
            c.moveToElement(b).click().build().perform();
            
            
            
            
            
            
	}

}
