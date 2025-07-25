package org.charter.pageObjects.Android;

import java.time.Duration;

import org.charter.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SlideShowPage extends AndroidActions {

	AndroidDriver driver;

	public SlideShowPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(2000)), this);
	}

	@AndroidFindBy(id = "com.sec.android.app.launcher:id/workspace")
	private WebElement swipeLabel;

	@AndroidFindBy(accessibility = "Gallery")
	private WebElement clickGallery;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Pictures\"]/android.widget.RelativeLayout/android.widget.TextView")
	private WebElement clickPicture;

	@AndroidFindBy(accessibility = "More options")
	private WebElement clickMoreOptions;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Start slideshow']")
	private WebElement clickSlideShow;

	@AndroidFindBy(id = "com.sec.android.gallery3d:id/main_layout")
	private WebElement slideShow;

	@AndroidFindBy(id = "com.sec.android.gallery3d:id/action_resume_slideshow")
	private WebElement clickResume;

	@AndroidFindBy(id = "com.sec.android.gallery3d:id/main_layout")
	private WebElement stopSlideShow1;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	private WebElement backBtn;

	public void swipeScreen() throws InterruptedException {
		swipeUp(swipeLabel, "up");
		Thread.sleep(5000);
	}

	public void gallery() throws InterruptedException {
		clickGallery.click();
		Thread.sleep(5000);

	}

	public void picture() throws InterruptedException {
		clickPicture.click();
		Thread.sleep(5000);

	}

	public void moreOption() throws InterruptedException {
		clickMoreOptions.click();
		Thread.sleep(5000);

	}

	public void slideShow() throws InterruptedException {
		clickSlideShow.click();
		Thread.sleep(10000);

	}

	public void verify() throws InterruptedException {

		boolean photoStatus = slideShow.isDisplayed();

		if (photoStatus) {

			System.out.println("Slideshow is started successfully");

		}

		else {

			System.out.println("Slideshow  started is failed");

		}

		slideShow.click();
		backBtn.click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

	}
}
