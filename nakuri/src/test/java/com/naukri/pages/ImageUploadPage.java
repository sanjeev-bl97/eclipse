package com.naukri.pages;

import java.io.File;

import org.openqa.selenium.By;

//To upload image in profile
public class ImageUploadPage extends LoginPage {

	public void imageUpload() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/span/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/em")).click();
		File file = new File("src/test/resources/Testdata/Desert.jpg");
		driver.findElement(By.id("fileUpload")).sendKeys(file.getAbsolutePath());   //Uploads image
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);

		driver.close();

	}

}
