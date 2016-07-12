package PageModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/7/1.
 */
public class WeiXinLaunchPage {

    private String BACKBUTTON_ID="com.tencent.mm:id/ey";
    private String WEBKIT_CLASSNAME ="com.tencent.smtt.webkit.WebView";

    private WebElement backButton;
    private WebElement webkit;

    public WeiXinLaunchPage(AppiumDriver driver){
        this.backButton = driver.findElementById(BACKBUTTON_ID);
        this.webkit = driver.findElementByClassName(WEBKIT_CLASSNAME);

    }

    public void click_backButton(){
        backButton.click();
    }
    public void click_launch(){
        webkit.click();
    }

}
