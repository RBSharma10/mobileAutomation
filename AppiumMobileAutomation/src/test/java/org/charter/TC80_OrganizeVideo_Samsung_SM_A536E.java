package org.charter;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.charter.pageObjects.Android.msgPage;

import org.charter.pageObjects.Android.MmsSendPage;
import org.charter.pageObjects.Android.OrgVideoPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class TC80_OrganizeVideo_Samsung_SM_A536E extends BaseTest {

	@Test

	public void browseVideos() throws InterruptedException {

		OrgVideoPage video = new OrgVideoPage(driver);

		video.launchAppDirect("com.sec.android.app.launcher",
				"com.sec.android.app.launcher.activities.LauncherActivity");
		video.swipeScreen();
		video.search();
		video.searchEdit();
		video.photos();
		video.library();
		video.download();
		video.longPressVideos();
		video.actionBar();
		video.copyFolder();
		video.allow();
		video.newFolder();
		video.folderName();
		video.create();
		video.againFolder();
		video.verify();

	}
}
