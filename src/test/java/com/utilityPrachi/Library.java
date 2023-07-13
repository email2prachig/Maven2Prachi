package com.utilityPrachi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class Library {

	public static Properties objProp;
	public WebDriver driver;

	public void ReadPropertiesFile() throws IOException {
		try {
			File objFile = new File(System.getProperty("user.dir") + "/src/test/resources/Configure.Property");
			FileInputStream objFileInput = new FileInputStream(objFile);
			objProp = new Properties();
			objProp.load(objFileInput);
			String application = objProp.getProperty("application");
			String browser = objProp.getProperty("browser");
			System.out.println("application" + application);
			System.out.println("browser" + browser);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void LaunchBrowser() {
		String browserFromPropFile = objProp.getProperty("browser");
		switch (browserFromPropFile.toLowerCase()) {
		case "edge":
			WebDriverManager.edgedriver().setup();                      
			driver = new EdgeDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("given browser name is not supported");
		}
		driver.manage().window().maximize();
	}
	
}
