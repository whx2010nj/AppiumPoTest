package PageModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/7/1.
 */
public class SettingLaunchPasswordPage {

    private final String BACKBUTTON_XPATH=" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]";
    private final String SKIPBUTTON_XPATH="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]";

    private final String PASSWORDTEXT_ID="me.ele:id/easy_edit_text";
    private final String PASSWORDOPENBUTTON_ID="me.ele:id/easy_edit_text_password_open";
    private final String SUREBUTTON_ID="me.ele:id/submit";

    private WebElement backButton;
    private WebElement skipButton;
    private WebElement passwordText;
    private WebElement passwordOpenButton;
    private WebElement sureButton;

    public SettingLaunchPasswordPage(AppiumDriver driver){
        this.backButton = driver.findElementByXPath(BACKBUTTON_XPATH);
        this.skipButton = driver.findElementByXPath(SKIPBUTTON_XPATH);
        this.passwordText = driver.findElementById(PASSWORDTEXT_ID);
        this.passwordOpenButton = driver.findElementById(PASSWORDOPENBUTTON_ID);
        this.sureButton = driver.findElementById(SUREBUTTON_ID);
    }

    public void click_backButton(){
        backButton.click();
    }
    public void click_skipButton(){
        skipButton.click();
    }

    public void input_passwordText(String password){

        passwordText.clear();
        passwordText.sendKeys(password);
    }

    public String getText_password(){
        passwordOpenButton.click();
        return passwordText.getText();
    }

    public void click_passwordOpenButton(){
        passwordOpenButton.click();
    }

    public void click_sureButton(){
        sureButton.click();
    }

}
