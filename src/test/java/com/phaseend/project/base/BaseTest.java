package com.phaseend.project.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

public class BaseTest {
	
	public static WebDriver driver=new ChromeDriver();
	@After
	public void Close_Browser() throws InterruptedException {
		System.out.println("Browser closed");
		driver.quit();
	}

}
