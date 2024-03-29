package com.qa.dotdash.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.dotdash.utils.Proxywrapper;

public class JavascriptErrorPage extends Page {
	private static final String PAGE_URL = "/javascript_error ";

	public JavascriptErrorPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	private By iframe = By.cssSelector("a[href='/iframe']");

	public boolean verifyErrorText(String data) {
		return ((Proxywrapper) driver).printPageErrorsVerifyText(data);
	} 

}
