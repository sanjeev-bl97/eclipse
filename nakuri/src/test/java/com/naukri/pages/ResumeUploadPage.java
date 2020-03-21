package com.naukri.pages;

import java.io.File;

import org.openqa.selenium.By;

//Sends resume file from TestData folder and deletes the resume
public class ResumeUploadPage extends LoginPage {

	public void resumeUpload() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		File file = new File("src/test/resources/Testdata/test.docx");
		driver.findElement(By.id("attachCV")).sendKeys(file.getAbsolutePath());                           //Uploads resume
		Thread.sleep(7000);
	    driver.findElement(By.xpath("//*[@id=\"lazyAttachCV\"]/div/div/div[2]/div[1]/div[2]/div/a")).click();  //Deletes resume
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[7]/div/div/button")).click();

		Thread.sleep(3000);
		driver.close();

	}

}
