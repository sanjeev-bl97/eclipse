package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststep {
	WebDriver driver;
	@Given("^I launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
	driver=new ChromeDriver();
	
	}
	@When("^I open Google Homepage$")
	public void open_homepage() throws InterruptedException
	{
	
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	}
	@Then("^I verify that the page displays search text box")
	public void verify_textbox()           
	{
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
	txtbox.sendKeys("github");
	//driver.close();

	}
	}
	
	
	@Then("^i verify that text is entered and searched")
	public void verify_textbox1()           
	{
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	}
	@And("^clicks the submit button")
	public void display_searchbutton()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));    
    
        int linkCount = links.size();     
    
       System.out.println("Total Number of link count on webpage = "  + linkCount);
	}
}
