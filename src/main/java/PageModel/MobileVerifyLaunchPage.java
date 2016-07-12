package PageModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/6/30.
 */
public class MobileVerifyLaunchPage {


//    private AppiumDriver driver;

    final String BACKBUTTON_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]";
    final String PASSWORDLAUNCH_XPATH = " //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]";
    final String MOBILETEXT_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]";
    final String VERIFYCODETEXT_XPATH = " //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]";
    final String GETVERIFYCODEBUTTON_ID ="me.ele:id/send_sms_verification_code";
    final String PSTEXT_ID ="me.ele:id/agreement";
    final String LAUNCHBUTTON_ID ="me.ele:id/submit";
    final String WEIXINLAUNCH_ID ="me.ele:id/weixin_login";
    final String QQLAUNCH_ID ="me.ele:id/qq_login";
    final String WEIBOLAUNCH_ID ="me.ele:id/weibo_login";
    final String TAOBAOLAUNCH_ID ="me.ele:id/taobao_login";

    private WebElement backButton;
    private WebElement passwordLaunch;
    private WebElement mobileText;
    private WebElement getVerifyCodeButton;
    private WebElement verifyCodeText;
    private WebElement psText;
    private WebElement launchButton;
    private WebElement weixinLaunch;
    private WebElement QQLaunch;
    private WebElement weiboLaunch;
    private WebElement taobaoLaunch;

    public MobileVerifyLaunchPage(AppiumDriver driver) {

//        this.driver = driver;
        this.backButton = driver.findElementByXPath(BACKBUTTON_XPATH);

        this.passwordLaunch = driver.findElementByXPath(PASSWORDLAUNCH_XPATH);
        this.mobileText = driver.findElementByXPath(VERIFYCODETEXT_XPATH);
        this.verifyCodeText = driver.findElementByXPath(VERIFYCODETEXT_XPATH);
        this.getVerifyCodeButton = driver.findElementById(GETVERIFYCODEBUTTON_ID);
        this.psText = driver.findElementById(PSTEXT_ID);
        this.launchButton = driver.findElementById(LAUNCHBUTTON_ID);
        this.weixinLaunch = driver.findElementById(WEIXINLAUNCH_ID);
        this.QQLaunch = driver.findElementById(QQLAUNCH_ID);
        this.weiboLaunch = driver.findElementById(WEIBOLAUNCH_ID);
        this.taobaoLaunch = driver.findElementById(TAOBAOLAUNCH_ID);
    }

    public void click_backButton() {

        backButton.click();
    }

    public void click_passwordLaunch() {

        passwordLaunch.click();
    }

    public void input_mobileText(String mobile) {

        mobileText.clear();
        mobileText.sendKeys(mobile);
    }

    public String getText_mobileText(){
        return mobileText.getText();
    }

    public void input_verifyCodeText(String verifyCode) {

        verifyCodeText.clear();
        verifyCodeText.sendKeys(verifyCode);
    }

    public String getText_verifyCodeText(){
        return verifyCodeText.getText();
    }

    public void click_getVerifyCodeButton() {

        getVerifyCodeButton.click();
    }

    public String getText_psText() {

        return psText.getText();
    }

    public void click_launchButton() {
        launchButton.click();
    }
    public void click_weixinLaunch(){
        weixinLaunch.click();
    }

    public void click_QQLaunch() {
        QQLaunch.click();
    }

    public void click_weiboLaunch() {
        weiboLaunch.click();
    }

    public void click_taobaoLaunch() {
        taobaoLaunch.click();
    }





}



