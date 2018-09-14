package com.bridge.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.google.com");
		 WebElement element=driver.findElement(By.id("lst-ib"));
		 element.sendKeys("rohan is a good guy");
		 Thread.sleep(1000);
		 //boolean b=	element.isDisplayed();
		driver.navigate().refresh();
		element.sendKeys("rohan is a bad boy");
		Thread.sleep(1000);
		 //System.out.println(b);
		driver.close(); 
		
		
		 
}
}