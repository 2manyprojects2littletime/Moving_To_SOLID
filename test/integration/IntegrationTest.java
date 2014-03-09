package integration;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class IntegrationTest extends BaseTest {

	/**
	 * add your integration test here in this example we just check if the
	 * welcome page is being shown
	 */
	@Test
	public void test() {
		browser.goTo("http://localhost:3333");
		assertThat(browser.pageSource()).contains("Your new application is ready.");
	}
	
}
