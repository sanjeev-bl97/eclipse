package com.naukri.pages;

import org.openqa.selenium.By;

//Apply filter in job search results
public class FilterPage extends LoginPage {

	public void filterJob() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"qsb-keyskill-sugg\"]")).sendKeys("dbms");
		driver.findElement(By.xpath("//*[@id=\"qsb-location-sugg\"]")).sendKeys("chennai");
		driver.findElement(By.xpath("//*[@id=\"expDroope-experienceFor\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ul_expDroope-experience\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"salaryDroope-salaryFor\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ul_salaryDroope-salary\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"search-jobs\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"acord\"]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"acord\"]/div[2]/a[2]")).click();
		Thread.sleep(4000);

		driver.close();

	}
}
