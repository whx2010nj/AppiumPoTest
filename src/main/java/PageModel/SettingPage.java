package PageModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/7/1.
 */
public class SettingPage {


    private final String BACKBUTTON_XPATH ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]";
    private final String CLEARIMAGECACHE_ID="me.ele:id/clear_pic_cache";
    private final String NOTWIFIFORIMGAESETTING_ID ="me.ele:id/set_pic_quality_without_wifi";
    private final String AUTODWNLOADNEWESTPACKAGE_ID ="me.ele:id/auto_download_apk";
    private final String PUSHNOTIFYSETTING_ID ="me.ele:id/notification_switch";
    private final String SHACKFORSHORTCUTOFSCREEN_ID ="me.ele:id/shake_to_feedback_switch";
    private final String ABOUTELEME_ID="me.ele:id/about_us";
    private final String LOGOUT_ID="me.ele:id/logout";



    private WebElement backButton;
    private WebElement clearImageCache;
    private WebElement notWifiForImageSetting;
    private WebElement autoDownloadNewestPackage;
    private WebElement pushNotifySetting;
    private WebElement shakeForshortcutOfScreen;
    private WebElement aboutEleme;
    private WebElement logout;

    public SettingPage(AppiumDriver driver){

        this.backButton = driver.findElementByXPath(BACKBUTTON_XPATH);
        this.clearImageCache = driver.findElementById(CLEARIMAGECACHE_ID);
        this.notWifiForImageSetting = driver.findElementById(NOTWIFIFORIMGAESETTING_ID);
        this.autoDownloadNewestPackage = driver.findElementById(AUTODWNLOADNEWESTPACKAGE_ID);
        this.pushNotifySetting = driver.findElementById(PUSHNOTIFYSETTING_ID);
        this.shakeForshortcutOfScreen = driver.findElementById(SHACKFORSHORTCUTOFSCREEN_ID);
        this.aboutEleme = driver.findElementById(ABOUTELEME_ID);
        this.logout = driver.findElementById(LOGOUT_ID);

    }

    public void click_backButton(){
      backButton.click();
    }
     public void click_clearImageCache(){
         clearImageCache.click();
    }
     public void click_notWifiForImageSetting(){
         notWifiForImageSetting.click();
    }
     public void click_autoDownloadNewestPackage(){
         autoDownloadNewestPackage.click();
    }
     public void click_pushNotifySetting(){
         pushNotifySetting.click();
    }
     public void click_shakeForshortcutOfScreen(){
         shakeForshortcutOfScreen.click();
    }
     public void click_aboutEleme(){
         aboutEleme.click();
    }
     public void click_logout(){
         logout.click();
    }





}
