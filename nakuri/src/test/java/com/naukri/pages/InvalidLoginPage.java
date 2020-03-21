package com.naukri.pages;

import org.openqa.selenium.By;

//Sends invalid username and clicks login buttton
public class InvalidLoginPage extends LoginPage {

	public void invalidLogin() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		driver.findElement(By.id("eLoginNew")).sendKeys("swasthikswasthik09876@gmail");
		driver.findElement(By.id("pLogin")).sendKeys("!234567E9");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
		Thread.sleep(3000);

		driver.close();

	}
}
