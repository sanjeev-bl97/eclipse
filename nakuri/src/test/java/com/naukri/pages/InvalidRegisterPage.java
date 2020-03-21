package com.naukri.pages;

import org.openqa.selenium.By;

//Sends invalid details and clicks register button
public class InvalidRegisterPage extends LoginPage {

	public void invalidRegister() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"p0widget\"]/div/div[1]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"flowBifurcation\"]/div[2]/form/div[1]/div/button")).click();
		driver.findElement(By.id("fname")).sendKeys("maji");
		driver.findElement(By.id("email")).sendKeys("majitha@gmail");
		driver.findElement(By.name("password")).sendKeys("!234567E");
		driver.findElement(By.name("number")).sendKeys("8765434561");
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[2]/ul/li[2]/div/div/span")).click();
		driver.findElement(By.name("basicDetailSubmit")).click();

		Thread.sleep(3000);

		driver.close();

	}
}
