package com.pages;

import java.io.File;

import org.openqa.selenium.By;

public class resume_page extends login_page {
	
	
	public void resume_upload() throws InterruptedException {
		

		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		File file = new File("src/test/resources/Testdata/test.docx");
		driver.findElement(By.id("attachCV")).sendKeys(file.getAbsolutePath());
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"lazyAttachCV\"]/div/div/div[2]/div[1]/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[7]/div/div/button")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
