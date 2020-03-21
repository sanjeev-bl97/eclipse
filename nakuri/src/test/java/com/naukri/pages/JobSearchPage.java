package com.naukri.pages;

import java.io.IOException;
import org.openqa.selenium.By;

//Search jobs based on the details given
public class JobSearchPage extends LoginPage {

	//Login
	public void loginSearch() throws IOException {
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		driver.findElement(By.id("eLoginNew")).sendKeys("swasthikswasthik09876@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("!234567E");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
	}

	//Search job
	public void jobSearch() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"qsb-keyskill-sugg\"]")).sendKeys("dbms");
		driver.findElement(By.xpath("//*[@id=\"qsb-location-sugg\"]")).sendKeys("chennai");
		driver.findElement(By.xpath("//*[@id=\"expDroope-experienceFor\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ul_expDroope-experience\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"salaryDroope-salaryFor\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ul_salaryDroope-salary\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"search-jobs\"]/button")).click();
		Thread.sleep(4000);
		driver.close();

	}
}
