package com.pages;

import org.openqa.selenium.By;

public class resume_page extends login_page {
	
	
	public void resume_upload() throws InterruptedException {
		

		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\BLTuser.BLT0206\\Documents\\test.docx");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/em")).click();
		driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.close();
		
		
	}

}
