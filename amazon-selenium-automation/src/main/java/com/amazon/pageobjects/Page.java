package com.amazon.pageobjects;

import org.openqa.selenium.WebDriver;

/*
 Page object pattern
 */
public abstract class Page {

	protected WebDriver webDriver;

	/*
	 * Constructor injecting the WebDriver interface
	 * 
	 * @param webDriver
	 */
	public Page(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public String getTitle() {
		return webDriver.getTitle();
	}

}
