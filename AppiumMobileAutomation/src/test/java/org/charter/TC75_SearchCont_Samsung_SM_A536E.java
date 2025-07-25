package org.charter;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.charter.pageObjects.Android.msgPage;
import org.charter.pageObjects.Android.SearchContactPage;
import org.charter.pageObjects.Android.SecondNoPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class TC75_SearchCont_Samsung_SM_A536E extends BaseTest {

	@Test

	public void contact() throws InterruptedException {

		SearchContactPage contact = new SearchContactPage(driver);
		contact.launchAppDirect("com.sec.android.app.launcher",
				"com.sec.android.app.launcher.activities.LauncherActivity");
		contact.swipeScreen();
		contact.clickPhoneIcon();
		contact.searchIcon();
		contact.searchText();
		contact.contact();

	}
}
