package com.bridge.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.findElement(By.cssSelector("input[placeholder='Search']"));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement web = driver.findElement(By.linkText("Gmail"));
		web.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement web1 = driver.findElement(By.name("q"));
		web1.sendKeys("hello world");
		web1.sendKeys(Keys.ENTER);
		driver.navigate().back();
		WebElement web3 = driver.findElement(By.name("q"));
		web3.sendKeys("broadridge");
		Thread.sleep(3000);
		web3.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
		Thread.sleep(4000);
		web3.sendKeys("PUBG", Keys.ENTER);
		Thread.sleep(2000);
		WebElement web4 = driver.findElement(By.name("q"));
		web4.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
		driver.navigate().to("https://paytm.com/");
		WebElement web5 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div[3]/div"));
		web5.click();
		driver.switchTo().frame(0);
		WebElement web6 = driver.findElement(By.id("input_0"));
		web6.sendKeys("rohan@gmail.com");
		web6.sendKeys(Keys.CONTROL, "a");
		web6.sendKeys(Keys.CONTROL, "c");
		WebElement web7 = driver.findElement(By.id("input_1"));
		Thread.sleep(1000);
		web7.sendKeys(Keys.CONTROL, "v");
		web7.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement web8 = driver.findElement(By.xpath("//a[text()='X']"));
		web8.click();
		WebElement web9 = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/ul/li[1]/div/div/input"));
		web9.sendKeys("9620142006");
		web9.sendKeys(Keys.ENTER);
	}
}
