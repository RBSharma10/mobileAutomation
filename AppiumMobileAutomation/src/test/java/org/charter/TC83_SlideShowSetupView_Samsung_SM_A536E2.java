package org.charter;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.charter.pageObjects.Android.msgPage;

import org.charter.pageObjects.Android.MmsSendPage;
import org.charter.pageObjects.Android.OrgPhotoPage;
import org.charter.pageObjects.Android.SlideShowPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class TC83_SlideShowSetupView_Samsung_SM_A536E2 extends BaseTest {

	@Test

	public void slideShowPhotos() throws InterruptedException {

		SlideShowPage photo = new SlideShowPage(driver);

		photo.launchAppDirect("com.sec.android.app.launcher",
				"com.sec.android.app.launcher.activities.LauncherActivity");
		photo.swipeScreen();
		photo.gallery();
		photo.picture();
		photo.moreOption();
		photo.slideShow();
		photo.verify();

	}
}
