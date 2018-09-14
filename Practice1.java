package com.bridge.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.google.com");
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("broadridge");

		//String a = element.getAttribute("value");
		String b=element.getCssValue("font-size");
		driver.get("https://www.paytm.com");
		WebElement element1 =driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[3]/div[1]/div"));
	String c=	element1.getCssValue("color");
	System.out.println(c);
		System.out.println(b);	
	}
}
