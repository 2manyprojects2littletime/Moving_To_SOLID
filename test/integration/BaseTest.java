package integration;

import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.start;
import static play.test.Helpers.stop;
import static play.test.Helpers.testServer;

import org.fluentlenium.core.FluentAdapter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import play.test.TestServer;

public class BaseTest {
	
	public static TestServer testServer;
	public static WebDriver driver;
	public static FluentAdapter browser;
	
	@BeforeClass
	public static void startApp() {
		testServer = testServer(3333, fakeApplication(inMemoryDatabase("PostgreSQL")));
		start(testServer);
		driver = new FirefoxDriver();
		browser = new FluentAdapter(driver);
	}
	
	@AfterClass
	public static void stopApp() {
		driver.quit();
		stop(testServer);
	}
	
}
