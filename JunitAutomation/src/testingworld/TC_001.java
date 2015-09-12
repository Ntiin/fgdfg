package testingworld;
import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class TC_001 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*googlechrome", "http://worldtesting.in/");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
		selenium.open("/");
		selenium.click("link=About Us");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Sucess Story");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Placement Results");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
