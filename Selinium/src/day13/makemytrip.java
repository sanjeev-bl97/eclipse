package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	    //driver.findElement(By.id("fromCity")).click();
	    driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-2\"]/div/div[1]/p[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-6\"]/div/div[1]/p[2]")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[6]/div/p[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div/label/p")).click();
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[4]/div/p")).click();
	    
	}

}
