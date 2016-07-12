package PageModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/7/1.
 */
public class QQLaunchPage {

    private final String BACKBUTTON_ID="com.tencent.mobileqq:id/ivTitleBtnLeft";
    private final String CHANGEUSERBUTTON_ID="com.tencent.mobileqq:id/ivTitleBtnRightText";

    private final String LAUNCHBUTTON_BYAUTO="new UiSelector().className(\"android.widget.Button\").text(\"登录\")";

    private WebElement backButton;
    private WebElement changeUserButton;
    private WebElement launchButton;

    public QQLaunchPage(AppiumDriver driver){
        this.backButton = driver.findElementById(BACKBUTTON_ID);
        this.changeUserButton = driver.findElementById(CHANGEUSERBUTTON_ID);
        this.launchButton = ((AndroidDriver)driver).findElementByAndroidUIAutomator(LAUNCHBUTTON_BYAUTO);
    }

    public void click_backButton(){
        backButton.click();
    }

    public void click_changeUserButton(){
        changeUserButton.click();
    }

    public void click_launchButton(){
        launchButton.click();
    }


}
