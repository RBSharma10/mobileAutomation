package org.charter;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.charter.pageObjects.Android.msgPage;

import org.charter.pageObjects.Android.MmsSendPage;
import org.charter.pageObjects.Android.OrgPhotoPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class TC79_OrganizePhoto_Samsung_SM_A536E extends BaseTest {

	@Test

	public void browsePhotos() throws InterruptedException {

		OrgPhotoPage photo = new OrgPhotoPage(driver);

		photo.launchAppDirect("com.sec.android.app.launcher",
				"com.sec.android.app.launcher.activities.LauncherActivity");
		photo.swipeScreen();
		photo.search();
		photo.searchEdit();
		photo.photos();
		photo.library();
		photo.download();
		photo.longPressPhotos();
		photo.actionBar();
		photo.copyFolder();
		photo.allow();
		photo.newFolder();
		photo.folderName();
		photo.create();
		photo.againFolder();
		photo.verify();

	}
}
