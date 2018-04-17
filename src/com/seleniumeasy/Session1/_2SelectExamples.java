package com.seleniumeasy.Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _2SelectExamples {

	static WebDriver driver;
	static WebElement singlSel;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate()
				.to("C:\\Users\\ranjithkumar.b\\eclipse-workspace\\SeleniumTutorials\\SingleMultipleSelect.html");
		// SingleSelect Way:
		singlSel = driver.findElement(By.name("Mobiles"));

		// 1. Select by Visible Text
		System.out.println("1. Select by Visible Text");
		String byVisibleText = "ByVisibleText=iPhone";
		singleSelect(singlSel, byVisibleText);
		Thread.sleep(3000);

		// 2. Select by value
		System.out.println("2. Select by value");
		String byValue = "ByValue=samsung";
		singleSelect(singlSel, byValue);
		Thread.sleep(3000);

		// 3. Select by value
		System.out.println("3. Select by value");
		String byIndex = "ByIndex=5";
		singleSelect(singlSel, byIndex);
		Thread.sleep(3000);

	}

	public static void singleSelect(WebElement dropDown, String val) {
		Select sel = new Select(dropDown);
		String arr[] = val.split("=");
		if (arr[0].equalsIgnoreCase("ByVisibleText")) {
			sel.selectByVisibleText(arr[1]);
		} else if (arr[0].equalsIgnoreCase("Byvalue")) {
			sel.selectByValue(arr[1]);
		} else if (arr[0].equalsIgnoreCase("Byindex")) {
			sel.selectByIndex(Integer.parseInt(arr[1]));
		} else {
			System.out.println("Nothing Selected!!");
		}

	}

	/*
	 * //Other methods of Select Method Name: deselectByIndex 
	 * Syntax: select.deselectByIndex(Index);
	 * 
	 * Method Name: deselectByValue 
	 * Syntax: select.deselectByValue(Value);
	 * 
	 * Method Name: deselectByVisibleText 
	 * Syntax: select.deselectByVisibleText(Text);
	 * 
	 * Method Name: deselectAll 
	 * Syntax: select.deselectAll();
	 */
}
