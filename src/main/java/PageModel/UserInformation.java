package PageModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/6/30.
 */
public class UserInformation extends BasePage{

    private final String BACKBUTTON_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]";

    private final String PHOTO_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]";
    private final String USERNAME_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2]";
    private final String MOBILE_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.CheckedTextView[1]";
    private final String MOBILEBINDING_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]";
    private final String EMAIL_XPATH = " //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.CheckedTextView[1]";
    private final String EMAILBINDING_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]";
    private final String WEIXIN_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.CheckedTextView[1]";
    private final String WEIXINBINDING_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]";
    private final String QQ_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.CheckedTextView[1]";
    private final String QQBINDING_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]";
    private final String WEIBO_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[8]/android.widget.CheckedTextView[1]";
    private final String WEIBOBINDING_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[8]";
    private final String TAOBAO_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[9]/android.widget.CheckedTextView[1]";
    private final String TAOBAOBINDING_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[9]";

    private final String LAUNCHPWD_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[10]/android.widget.CheckedTextView[1]";
    private final String LAUNCHPWDBINDING_XPATH ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[10]";

    private final String PAYPWD_XPATH="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[11]/android.widget.CheckedTextView[1]";
    private final String PAYPWDBINDING_XPATH="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[11]/android.widget.CheckedTextView[1]SS";

    private WebElement backButton;
    private WebElement photo;
    private WebElement userName;
    private WebElement mobile;
    private WebElement mobileBinding;
    private WebElement email;
    private WebElement emailBinding;
    private WebElement weixin;
    private WebElement weixinBinding;
    private WebElement QQ;
    private WebElement QQBinding;
    private WebElement weibo;
    private WebElement weiboBinding;
    private WebElement taobao;
    private WebElement taobaoBinding;
    private WebElement launchPwd;
    private WebElement launchPwdBinding;
    private WebElement payPwd;
    private WebElement payPwdBinding;

    public UserInformation(AppiumDriver driver){
        this.driver = driver;
        this.backButton = driver.findElementByXPath(BACKBUTTON_XPATH);
        this.photo = driver.findElementByXPath(PHOTO_XPATH);
        this.userName = driver.findElementByXPath(USERNAME_XPATH);
        this.mobile = driver.findElementByXPath(MOBILE_XPATH);
        this.mobileBinding  = driver.findElementByXPath(MOBILEBINDING_XPATH);
        this.email = driver.findElementByXPath(EMAIL_XPATH);
        this.emailBinding =driver.findElementByXPath(EMAILBINDING_XPATH);
        this.weixin = driver.findElementByXPath(WEIXIN_XPATH);
        this.weixinBinding = driver.findElementByXPath(WEIXINBINDING_XPATH);
        this.QQ = driver.findElementByXPath(QQ_XPATH);
        this.QQBinding = driver.findElementByXPath(QQBINDING_XPATH);
        this.weibo = driver.findElementByXPath(WEIBO_XPATH);
        this.weiboBinding = driver.findElementByXPath(WEIBOBINDING_XPATH);
        this.taobao = driver.findElementByXPath(TAOBAO_XPATH);
        this.taobaoBinding = driver.findElementByXPath(TAOBAOBINDING_XPATH);

    }

    public void click_backButton(){
        backButton.click();
    }

    public void click_mobileBinding(){
        mobileBinding.click();
    }
    public void click_emailBinding(){
        emailBinding.click();
    }
    public void click_weixinBinding(){
        weixinBinding.click();
    }
    public void click_QQBinding(){
        QQBinding.click();
    }
    public void click_weiboBinding(){
        weiboBinding.click();
    }
    public void click_taobaoBinding(){
        taobaoBinding.click();
    }
    public void click_launchPwdBinding(){
        launchPwdBinding.click();
    }
    public void click_payPwdBinding(){
        payPwdBinding.click();
    }



    public String getText_userName(){
        return userName.getText();
    }

    public String getText_mobile(){
        return mobile.getText();
    }

    public String getText_email(){
        return email.getText();
    }

    public String getText_weixin(){
        return weixin.getText();
    }

    public String getText_QQ(){
        return QQ.getText();
    }

    public String getText_weibo(){
        return weibo.getText();
    }
    public String getText_taobao(){
        return taobao.getText();
    }
    public String getText_launchPwd(){
        return launchPwd.getText();
    }
    public String getText_payPwd(){
        return payPwd.getText();
    }



    public String getuserInformation(){


        swipeToUp(driver,5000);
        this.launchPwd = driver.findElementByXPath(LAUNCHPWD_XPATH);
        this.payPwd = driver.findElementByXPath(PAYPWD_XPATH);

        StringBuilder sb = new StringBuilder();

        sb.append("用户名:" + getText_userName() +"\n");
        sb.append("手机:" + getText_mobile() + "\n");
        sb.append("邮箱:" + getText_email() + "\n");
        sb.append("微信:" + getText_weixin() + "\n");
        sb.append("QQ:" + getText_QQ() + "\n");
        sb.append("微博:" + getText_weibo() + "\n");
        sb.append("淘宝:" + getText_taobao() + "\n");
        sb.append("登录密码:" + getText_launchPwd() + "\n");
        sb.append("支付密码:" + getText_payPwd() + "\n");


        return sb.toString();
    }





}
