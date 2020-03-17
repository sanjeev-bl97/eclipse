package com.pages;

import java.io.File;

import org.openqa.selenium.By;

public class image_page extends login_page {
	
	
	public void image_upload() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/em")).click();
		File file = new File("src/test/resources/Testdata/Desert.jpg");
		driver.findElement(By.id("fileUpload")).sendKeys(file.getAbsolutePath());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);
		
		driver.close();	
		
	}
}
