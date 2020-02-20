package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")).isDisplayed());
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Droppable")).click();
        
	}

}
