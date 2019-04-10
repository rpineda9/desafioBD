package com.applause.auto.pageframework.pages;

import java.lang.invoke.MethodHandles;

import com.applause.auto.framework.pageframework.util.logger.LogController;
import com.applause.auto.framework.pageframework.web.AbstractPage;
import com.applause.auto.framework.pageframework.web.WebElementLocator;
import com.applause.auto.framework.pageframework.web.factory.WebDesktopImplementation;
import com.applause.auto.framework.pageframework.web.factory.WebPhoneImplementation;
import com.applause.auto.framework.pageframework.web.factory.WebTabletImplementation;
import com.applause.auto.framework.pageframework.webcontrols.Text;

@WebDesktopImplementation(ActivityProductCategoriesPage.class)
@WebTabletImplementation(ActivityProductCategoriesPage.class)
@WebPhoneImplementation(ActivityProductCategoriesPage.class)

public class ActivityProductCategoriesPage extends AbstractPage {
	protected final static LogController LOGGER = new LogController(MethodHandles.lookup().getClass());

	@Override
	protected void waitUntilVisible() {
		syncHelper.waitForElementToAppear(getShowInactivesText());
	}

	/*
	 * Public Actions
	 */
	/**
	 * Returns the URL with String format
	 */
	public String GetURL() {
		return getDriver().getCurrentUrl();
	}

	/**
	 * Taps the search button and expects to land at Search Results Page
	 * 
	 * @return a SearchResultsPage
	 */
	/*
	 * Protected Getters
	 */

	@WebElementLocator(webDesktop = "//label[@for='show-inactives']")
	protected Text getShowInactivesText() {
		return new Text(this, getLocator(this, "getShowInactivesText"));
	}

	/*
	 * Private Helpers
	 */
}

/**
 * Desktop Implementation for LandingPage
 */
class DesktopActivityProductCategoriesPage extends ActivityProductCategoriesPage {

}

/**
 * Tablet Implementation for LandingPage
 */
class TabletActivityProductCategoriesPage extends ActivityProductCategoriesPage {
}

/**
 * Phone Implementation for LandingPage
 */
class PhoneActivityProductCategoriesPage extends ActivityProductCategoriesPage {

}