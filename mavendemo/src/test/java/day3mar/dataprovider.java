package day3mar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	public ChromeDriver driver;
@Test(dataProvider ="Testdata")
public void login(String username,String password) {
	
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.close();
	
}
@BeforeMethod
public void beforeMethod() {
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");

}

@DataProvider (name= "Testdata") 
public Object[][] getdata() { 
 Object[][] data = new Object[3][2] ; 
 data [0][0] = "user1"; 
 data [0][1] ="password1"; 
 data [1][0] ="user2"; 
 data [1][1] ="password1"; 
 data [2][0] ="user3"; 
 data [2][1] ="password3"; 
 
return data; 
 } 
}


