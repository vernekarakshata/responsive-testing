package com.framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriverTest {

	public static void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		/*
		 * DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		 * desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
		 * "Safari"); URL url = new URL("http://127.0.0.1:4723/wd/hub"); AppiumDriver
		 * driver = new AppiumDriver(url, desiredCapabilities);
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("https://www.google.co.in/");

	}

}
