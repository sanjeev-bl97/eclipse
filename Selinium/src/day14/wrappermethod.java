package day14;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wrappermethod {
WebDriver driver;
	public  void launchapp(String url) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
         driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        
	}
	public void clickbyxpath(String path)
	{
		driver.findElement(By.xpath(path)).click();
		
	}
	public void clickbylink(String path)
	{
		driver.findElement(By.linkText(path)).click();
		
	}
	
	
	public void enterbyid(String loc,String value) {
		
		driver.findElement(By.id(loc)).sendKeys(value);
		
		
	}
	
public void enterbyxpath(String loc,String value) {
		
		driver.findElement(By.xpath(loc)).sendKeys(value);
		
		
	}
public void enterbyclass(String loc,String value) {
	
	driver.findElement(By.className(loc)).sendKeys(value);
	
	
}
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts=((TakesScreenshot)driver);
		File SrcFile = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(SrcFile,new File(path));
		
	}
	public void closeup() {
		
		driver.close();
	}
	
	public void move(String m,String b) {
		
		
		WebElement c=driver.findElement(By.xpath(m));
        WebElement d=driver.findElement(By.linkText(b));
		Actions ac = new Actions(driver); 
        ac.moveToElement(c);
        ac.moveToElement(d).click().build().perform();
		
		
	}
	public void dragndrop(String a,String b)
	{
		WebElement c=driver.findElement(By.id(a));
        WebElement d=driver.findElement(By.id(b));
        Actions al =new Actions(driver);
        al.dragAndDrop(c,d).build().perform();
		
	}
	
	public void alert() {
		
		 Alert al = driver.switchTo().alert();
		 al.accept();
	}
	
	public void frame(String a)
	{
		
		 driver.switchTo().frame(driver.findElement(By.className(a)));
	}
	


}
