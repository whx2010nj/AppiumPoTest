package PageModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/6/30.
 */
public class PasswordLaunchPage {

    private AppiumDriver driver;

    private final String BACKBUTTON_XPATH ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]";
    private final String USERNAME_XPATH ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]";
    private final String PASSWORD_XPATH =" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.EditText[1]";
    private final String VERIFYCODETEXT = " //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[3]/android.widget.LinearLayout[1]/android.widget.EditText[1]";



    private final String SEEPASSWORDBUTTON_ID = "me.ele:id/easy_edit_text_password_open";
    private final String LAUNCHBUTTON_ID = "me.ele:id/login_submit";
    private final String FORGETPASSWORD_ID ="me.ele:id/forgot_password";
    private final String USERNAMECLEAR_ID = "me.ele:id/easy_edit_text_clear";
    private final String VERIFYCODEIMAGE_ID =" me.ele:id/easy_edit_pic_code";
    private final String CHANGEVERIFYCODE =" me.ele:id/easy_edit_switch_pic_code";

    private WebElement backButton;
    private WebElement userName;
    private WebElement userNameClear;
    private WebElement password;
    private WebElement seePasswordButton;
    private WebElement launchButton;
    private WebElement forgetPassword;
    private WebElement verifycodeText;
    private WebElement verifycodeImage;
    private WebElement changeVerifyCode;

    public PasswordLaunchPage(AppiumDriver driver){
        this.driver = driver;
        this.backButton = driver.findElementByXPath(BACKBUTTON_XPATH);
        this.userName = driver.findElementByXPath(USERNAME_XPATH);
        this.password = driver.findElementByXPath(PASSWORD_XPATH);
        this.seePasswordButton = driver.findElementById(SEEPASSWORDBUTTON_ID);
        this.launchButton = driver.findElementById(LAUNCHBUTTON_ID);
        this.forgetPassword = driver.findElementById(FORGETPASSWORD_ID);
       // this.userNameClear = driver.findElementById(USERNAMECLEAR_ID);
    }

    public void userNameClear(){
        userName.click();
        userNameClear = driver.findElementById(USERNAMECLEAR_ID);
        userNameClear.click();
    }
    public void click_backButton(){
        backButton.click();
    }

    public void input_userName(String name){
        userName.clear();
        userName.sendKeys(name);
    }

    public String getText_userName(){
        return userName.getText();
    }

    public void input_password(String passeword){
        password.clear();
        password.sendKeys(passeword);
    }
    public String getText_password(){
        return password.getText();
    }

    public void click_seePasswordButton(){
        seePasswordButton.click();
    }
    public void click_launchButton(){
        launchButton.click();
    }

    public void click_forgetPassword(){
        forgetPassword.click();
    }


    public void verifyPasswordLaunch(String userName,String password){

        input_userName(userName);
        input_password(password);
        click_launchButton();
//        Assert.assertTrue(true);


    }


}
