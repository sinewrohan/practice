package com.bridge.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver= new ChromeDriver();


driver.navigate().to("https://www.google.com");

WebElement element= driver.findElement(By.id("lst-ib"));
String length=element.getAttribute("maxlength");

if(length.equals("2048"))
{
	System.out.println("pass");
}
else{
	System.out.println("fail");
}
driver.close();
	}

}
