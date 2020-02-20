package day14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
        Thread.sleep(10000);
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div[1]/div[8]/button")).click();
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();  //clicks accept button
        al.dismiss(); //clicks cancel button
      al.sendKeys("sanjeev");  //pass value to the alert textbox
      driver.switchTo().alert().accept(); //direct call to alert
	}

}
