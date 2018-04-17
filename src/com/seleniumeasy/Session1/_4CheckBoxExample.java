package com.seleniumeasy.Session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4CheckBoxExample {
	static String browser = "ie";
	static WebDriver driver;

	public static void main(String[] args) {
		// System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(System.getProperty("user.dir") + "\\CheckBoxRadioButton.html");

		// Simple Select
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='yellow']"));
		boolean flag = checkBox.isSelected();
		System.out.println(flag);
		if (!flag) {
			checkBox.click();
		}
		// Using reusable method to select a check box
		WebElement optiontoSelect = driver.findElement(By.xpath("//input[@value='green']"));
		selectCheckBox(optiontoSelect);

		// Using reusable method to un-select a check box
		unSelectCheckBox(optiontoSelect);

		// Using reusable method to select the option from a list
		WebElement optiontoSelectFromList = driver.findElement(By.tagName("input"));
		selectCheckBoxFromList("Purple");
		
		WebElement red = driver.findElement(By.xpath("//input[@type='checkbox' and @value='red']"));
		WebElement blue = driver.findElement(By.xpath("//input[@type='checkbox' and @value='blue']"));
		WebElement green = driver.findElement(By.xpath("//input[@type='checkbox' and @value='green']"));
		WebElement we[] = {red, blue,green};
	}

	public static void selectCheckBox(WebElement select) {
		if (!select.isSelected()) {
			select.click();
		} else {
			System.out.println("The option is already selected");
		}

	}

	public static void unSelectCheckBox(WebElement select) {
		if (select.isSelected()) {
			select.click();
		} else {
			System.out.println("The option is already selected");
		}

	}

	public static void selectCheckBoxFromList(String valueToSelect) {
		List<WebElement> checkBoxesList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement we1 : checkBoxesList) {
			if (we1.getAttribute("value").equalsIgnoreCase(valueToSelect)) {
				we1.click();
				break;
			}
		}
	}
	// How to select a list of check boxes that we want from all the checkboxes available
	
	public static void selectMultChecksFromList(WebElement we[]) {
		
		
	}
	
}