package com.pages;

import org.openqa.selenium.By;

public class resume_page extends login_page {
	
	
	public void resume_upload() throws InterruptedException {
		

		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		driver.findElement(By.id("attachCV")).sendKeys("src\\test\\resources\\Testdata\\test.docx");
		Thread.sleep(3000);
		driver.findElement(By.linkText("DELETE RESUME")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[7]/div/div/button")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
