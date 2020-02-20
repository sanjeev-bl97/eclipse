package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import day14.wrappermethod;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wrappermethod a = new wrappermethod();
		a.launchapp("https://www.flipkart.com/");
		a.enterbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input","sanjeev.bl97@gmail.com");
		a.enterbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input","9003510663");
        a.clickbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span");
        boolean st =true;
     try { a.clickbyxpath("/html/body/div/div/div[2]/div/ul/li[1]/span");
    System.out.println(st=false); }
     catch(StaleElementReferenceException e) {System.out.println(st=true);}
     
     
     //  a.move("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div","/div/div[2]/div/ul/li[1]/a/div");
	 
        
       //  a.clickbyxpath("/html/body/div/div/div[2]/div/ul/li[1]/span");   System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
     // WebDriver driver = new ChromeDriver();
       
      
       //// WebElement c=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
       // WebElement d=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a"));
		//Actions ac = new Actions(driver); 
       // ac.moveToElement(c);
       // ac.moveToElement(d).click().build().perform();
        
	
	}

}
