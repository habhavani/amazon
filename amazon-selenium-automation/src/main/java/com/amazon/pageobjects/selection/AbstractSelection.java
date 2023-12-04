package com.amazon.pageobjects.selection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 Defines an abstract page selection. Sample page
 
 */

public abstract class AbstractSelection {

	/**
	 * Constructor for a Page object that represents a selection, or part of a
	 * page. We rely on the PageFactory to instantiate the instance of the
	 * PageObject. https://code.google.com/p/selenium/wiki/PageFactory A
	 * PageObject need not represent an entire page. It may represent a section
	 * that appears many times within a site or page, such as site navigation.
	 * 
	 * @param driver
	 *            the web driver instance.
	 */
	public AbstractSelection(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}