package com.SeleniumPrachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumHomework1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		// driver.findElement)(By.id("twotabsearchtextbox").click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(50);
		driver.close();

		// TODO Auto-generated method stub

	}

}
