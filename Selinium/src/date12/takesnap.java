package date12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class takesnap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://in.linkedin.com/");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File SrcFile = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(SrcFile,new File("C://Users//BLTuser.BLT0206//Desktop//jav//Selinium//Screenshot//fb12.png"));
	}

}
