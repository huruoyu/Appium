package BaiduyunTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import java.io.File;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.test.Methods;

public class UploadTest {
	private AppiumDriver driver;
	Methods method = new Methods();

	@Before
	public void setUp() throws Exception {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "apps");
		File app = new File(appDir, "baiduyun.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("app", app.getAbsolutePath());
//		capabilities.setCapability("appPackage", "com.sohu.newsclient");
//		capabilities.setCapability("appActivity", ".app.NewsTabActivity");

		capabilities.setCapability("noReset", true);
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test_upload() throws InterruptedException {

		TouchAction action = new TouchAction(driver);
		// 根据坐标点击元素，后面记得加perform()，tap轻击坐标
		action.tap(400, 220).perform();
		action.release();
		Thread.sleep(5000);
		

		Thread.sleep(5000);
	}


}
