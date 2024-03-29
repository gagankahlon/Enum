package com.qa.dotdash.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.dotdash.utils.Proxywrapper;

public class MultipleWindowsPage extends Page {
	private static final String PAGE_URL = "/windows";

	public MultipleWindowsPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	

	private By link = By.cssSelector("#content a");

	public NewWindowPage clickLink() {
		((Proxywrapper) driver).click(link);
		return new NewWindowPage(driver, true);
	}

}
