package com.bridge.seleniumpractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			System.out.println(e);
		}
		driver.navigate().to("https://www.myntra.com");
		try {
			Thread.sleep(600);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		driver.navigate().refresh();
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().maximize();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			System.out.println("error");
		}
		Dimension d = driver.manage().window().getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		System.out.println("Height is" + height);
		System.out.println("width is" + width);

		try {
			Point p = driver.manage().window().getPosition();
			int x = p.getX();
			int y = p.getY();
			System.out.println("The position of the browser window is" + x + "and" + y);
		} catch (Exception e) {
			System.out.println(e);
		}
		Dimension d1 = new Dimension(1000, 1296);
		int newHeight = d1.getHeight();
		int newWidth = d1.getWidth();
		System.out.println("The new height is" + newHeight);
		System.out.println("The new height is" + newWidth);

		Point p1 = new Point(-4, -4);
		int x1 = p1.getX();
		int y1 = p1.getY();
		System.out.println("New coordinates of the browser window is" + x1 + "and" + y1);
		
		String t=driver.getTitle();
		System.out.println(t);
		
		String curt=driver.getCurrentUrl();
		System.out.println(curt);
		
		driver.close();
	}
}
