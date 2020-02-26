package assginments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.carwale.com/?utm_source=google&utm_medium=cpc&utm_term=car%20wale&utm_campaign=6038662&gclid=Cj0KCQiAnL7yBRD3ARIsAJp_oLbrD1AawAxKjkqJZeIQtx393kAts95shWnqEBqLpuUAJ-3fme_43UIaAquGEALw_wcB");
	    driver.findElement(By.xpath("//*[@id=\"newUsedSearchOption\"]/li[2]")).click();
	   driver.findElement(By.id("usedCarsList")).sendKeys("pondicherry");
	   driver.findElement(By.id("usedCarsList")).sendKeys(Keys.ENTER);
	   driver.findElement(By.xpath("//*[@id=\"minPriceList\"]/li[4]")).click();
	   driver.findElement(By.xpath("//*[@id=\"maxPriceList\"]/li[4]")).click();
	   driver.findElement(By.id("btnFindCar")).click();
	}

}
