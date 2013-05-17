package com.mtc.steps;
/**
 * 
 * @author saikrishna_v
 *
 */
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebDriverException;

public class LifeCycleSteps {
	private final WebDriverProvider webDriverProvider;

	public LifeCycleSteps(WebDriverProvider webDriverProvider) {
		this.webDriverProvider = webDriverProvider;
	}

	@BeforeScenario
	public void emptyCart() {
		try {
			webDriverProvider.get().manage().deleteCookieNamed("uaid");
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
}
