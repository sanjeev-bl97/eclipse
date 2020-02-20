package assginments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelinkcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?source=hp&ei=JtFLXqHREK7Xz7sPteObyAU&q=videos&oq=&gs_l=psy-ab.1.0.0i362i308i154i357l6.0.0..81507...0.0..0.799.799.6-1......0......gws-wiz.....6.PmXV0jOWNzY");
        
        List<WebElement> links = driver.findElements(By.tagName("a"));    //Identify the number of Link on webpage and assign into Webelement List 
        
        int linkCount = links.size();     // Count the total Link list on Web Page
        
        System.out.println("Total Number of link count on webpage = "  + linkCount);    //Print the total count of links on webpage
        
        List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
        
        int elementsCount = allElements.size();     //Count the total all element on web page
        
        System.out.println("Total Number of All Element on webpage = "  + elementsCount);         //Print the total count of all element on webpage
	}

}
