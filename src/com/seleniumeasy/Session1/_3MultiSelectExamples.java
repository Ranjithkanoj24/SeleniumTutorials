package com.seleniumeasy.Session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _3MultiSelectExamples {
	static WebDriver driver;
	static WebElement singlSel;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate()
				.to("C:\\Users\\ranjithkumar.b\\eclipse-workspace\\SeleniumTutorials\\SingleMultipleSelect.html");
		Select sel = new Select(driver.findElement(By.name("Mobdevices")));
		sel.selectByIndex(1);
		sel.selectByValue("3");
		sel.selectByVisibleText("HTC");
		System.out.println("--------------------------------------");
		//To get all the options in the list
		List<WebElement> list  = sel.getOptions();
		for(WebElement options: list) {
			System.out.println(options.getText());
		}
		System.out.println("--------------------------------------");
		//To get the options in the list that are selected
		List<WebElement> allSelOptions = sel.getAllSelectedOptions();
		for(WebElement options: allSelOptions) {
			System.out.println(options.getText());
		}
		
		//**How to see if a single element that you have is present in a list or not?? Interview Question
		String phoneType = "Nokia";
		List<WebElement> phones = sel.getOptions();
		for(WebElement allPhones: phones) {
			if(phoneType.equalsIgnoreCase(allPhones.getText())) {
				System.out.println("We have that phone available in the dropdown");
			}
		}
		//**How to see if an array of elements are present in a list or not?? Interview Question
		String phonesList[] = {"Nokia","Samsung","Motorolla"};
	}

}
