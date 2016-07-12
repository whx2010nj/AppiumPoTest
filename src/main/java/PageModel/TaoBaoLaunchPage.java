package PageModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/7/1.
 */
public class TaoBaoLaunchPage {

    private final String BACKBUTTON_ID ="com.taobao.taobao:id/tbopen_oauth_cancel";
    private final String LAUNCHBUTTON_BYAUTO="new UiSelector().className(\"android.widget.Button\").text(\"授权并登陆\")";

    private WebElement backButton;
    private WebElement launchButton;

    public TaoBaoLaunchPage(AppiumDriver driver){
        this.backButton = driver.findElementById(BACKBUTTON_ID);
        this.launchButton = ((AndroidDriver)driver).findElementByAndroidUIAutomator(LAUNCHBUTTON_BYAUTO);

    }

    public void click_backButton(){
        backButton.click();
    }

    public void click_launchButton(){
        launchButton.click();
    }
}
