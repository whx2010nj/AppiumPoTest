package PageModel;

import PageModel.util.PrintInforamtionUtil;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/6/30.
 */
public class LaunchPage {

    private AppiumDriver driver;

    final String LAUNCHBUTTON_ID = "me.ele:id/user_center_profile_container";
    private WebElement launchButton;

    final String SETTING_ID = "me.ele:id/user_center_action_more_setting";
    private WebElement setting;

    final String USERNAME_ID = "me.ele:id/userCenter_name_tv";
    private WebElement userName;

    final String MYBALANCE_ID = "me.ele:id/userCenter_balance_rl";
    private WebElement myBalance;

    final String MYHONGBAO_ID = "me.ele:id/userCenter_balance_rl";

    private WebElement myBalanceValue;
    final String MYBALANCEVALUE_ID = "me.ele:id/userCenter_balance_tv";

    private WebElement myHongbaoValue;
    final String MYHONGBAOVALUE_ID = "me.ele:id/userCenter_hongbao_tv";
    private WebElement myHongbao;

    final String MYINTEGRAL_ID = "me.ele:id/userCenter_balance_rl";

    private WebElement myIntegral;
    private WebElement myIntegralValue;
    final String MYINTEGERALVALUE_ID = "me.ele:id/userCenter_integral_tv";

    final String ADDRESS_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]";

    private WebElement address;

    final String MYCOLLECTION_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]";

    private WebElement myCollection;
    final String GOODFOOD_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[3]/android.widget.RelativeLayout[1]";
    private WebElement goodFood;
    final String SCOREMALL_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[4]/android.widget.RelativeLayout[1]";

    private WebElement scoreMall;


    final String MEMBERS_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[5]/android.widget.RelativeLayout[1]";

    private WebElement members;

    private WebElement backButton;
    final String BACKBUTTON_XPATH = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]";


    public LaunchPage(AppiumDriver driver) {
        this.driver = driver;
        this.launchButton = driver.findElementById(LAUNCHBUTTON_ID);

        this.userName = driver.findElementById(USERNAME_ID);
        this.setting = driver.findElementById(SETTING_ID);

        this.myBalance = driver.findElementById(MYBALANCE_ID);

        this.myHongbao = driver.findElementById(MYHONGBAO_ID);
        this.myIntegral = driver.findElementById(MYINTEGRAL_ID);

        this.address = driver.findElementByXPath(ADDRESS_XPATH);
        this.goodFood = driver.findElementByXPath(GOODFOOD_XPATH);

        this.myCollection = driver.findElementByXPath(MYCOLLECTION_XPATH);

        this.scoreMall = driver.findElementByXPath(SCOREMALL_XPATH);
        this.members = driver.findElementByXPath(MEMBERS_XPATH);


    }

    public void click_setting() {
        setting.click();
    }


    public String getuserNameText() {
        return userName.getText();
    }


    public void click_launchButton() {
        launchButton.click();
    }

    public void click_myBalance() {
        myBalance.click();
    }

    public void click_myHongbao() {
        myHongbao.click();
    }

    public void click_myIntegral() {
        myIntegral.click();
    }

    public void click_address() {
        address.click();
    }

    public void click_goodFood() {
        goodFood.click();
    }

    public void click_myCollection() {
        myCollection.click();
    }

    public void click_scoreMall() {
        scoreMall.click();
    }

    public void click_member() {
        members.click();
    }

    public String getMyBalanceValue() {
        this.myBalanceValue = driver.findElementById(MYBALANCEVALUE_ID);

        return "我的余额:" + myBalanceValue.getText();
    }

    public String getMyHongBaoValue() {
        this.myHongbaoValue = driver.findElementById(MYHONGBAOVALUE_ID);

        return "我的红包:" + myHongbaoValue.getText();
    }

    public String getMyIntegeralValue() {
        this.myIntegralValue = driver.findElementById(MYINTEGERALVALUE_ID);
        return "我的积分:" + myIntegralValue.getText();
    }


    public String getAddressInfo() {

        click_address();
        String s = PrintInforamtionUtil.printPageTextInfo(driver);
        backButton = driver.findElementByXPath(BACKBUTTON_XPATH);
        backButton.click();
        return s;

    }

    public String getCollectionInfo() {
        click_myCollection();
        String s = PrintInforamtionUtil.printPageTextInfo(driver);
        backButton = driver.findElementByXPath(BACKBUTTON_XPATH);
        backButton.click();
        return s;

    }

    public String getMemberInfo() {
        click_member();
        try {
            Thread.sleep(3000);

        String s = PrintInforamtionUtil.printPageTextInfo(driver);
        backButton = driver.findElementByXPath(BACKBUTTON_XPATH);
        backButton.click();
        return s;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;

    }

    public String getLaunchInfomation() {

        String info =
                "用户名:" + getuserNameText() + "\n" +
                        getMyBalanceValue() + "\n" +
                        getMyHongBaoValue() + "\n" +
                        getMyIntegeralValue() + "\n" +
                        "收货地址:" + getAddressInfo() + "\n" +
                        "我的收藏:" + getCollectionInfo() + "\n" +
                        "饿了么会员:" + getMemberInfo() + "\n";


        return info;
    }


//    final String MYBALANCE_ID = "me.ele:id/userCenter_balance_rl";


}
