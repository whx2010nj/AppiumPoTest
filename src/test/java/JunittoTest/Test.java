package JunittoTest;
import Config.GlobalValues;
import PageModel.*;
import appiumUtils.AppiumInit;
import com.ele.aftcapi.utils.Global;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Ignore;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by wanghongxiang on 16/6/30.
 */
public class Test {

    public static Logger logger = Logger.getLogger(Test.class);

    public AppiumDriver driver;
    public HomePage homePage;
    public LaunchPage launchPage;
    public MobileVerifyLaunchPage mobileVerifyLaunchPage;
    public PasswordLaunchPage passwordLaunchPage;
    public UserInformation userInformation;
    public OtherLaunchUserInformation otherLaunchUserInformation;
    public SettingPage settingPage;
    public WeiXinLaunchPage weiXinLaunchPage;
    public SettingLaunchPasswordPage settingLaunchPasswordPage;

    @BeforeTest
    public void setup(){
        driver= AppiumInit.init();
        homePage = new HomePage(driver);



//        userInformation = new UserInformation(driver);

    }


    @org.testng.annotations.Test(enabled = true)
    public void homePageclickTest(){
        homePage.clickTakeAwayButton();
        homePage.clickOrderButton();
        homePage.clickFindButton();
        homePage.clickUserButton();

        GlobalValues.glabal_map.put("homePageclickTest",
                "homepageclick ok");
    }

    @org.testng.annotations.Test(enabled = false)

    public void firstLaunchTest(){

        homePage.clickUserButton();
        launchPage = new LaunchPage(driver);
        String resultcontent = "";
        if(launchPage.getuserNameText().equals("立即登录")) {
            launchPage.click_launchButton();

            mobileVerifyLaunchPage = new MobileVerifyLaunchPage(driver);
            mobileVerifyLaunchPage.click_passwordLaunch();

            passwordLaunchPage = new PasswordLaunchPage(driver);
            passwordLaunchPage.userNameClear();
            Assert.assertTrue("手机/邮箱/用户名".equals(passwordLaunchPage.getText_userName()));
            logger.info("首次登录 : 显示 手机/用户名/邮箱" + "status: success" );
            String userName = "whx2010nj";
            String password = "whx0506,.";
            passwordLaunchPage.verifyPasswordLaunch(userName,password);
            Assert.assertEquals(userName,launchPage.getuserNameText());
            resultcontent = "*********获取登录的信息*************\n" + launchPage.getLaunchInfomation()
                    + "\n***********************************************\n";
//            logger.info(resultcontent);
            launchPage.click_launchButton();
            userInformation = new UserInformation(driver);
           // userInformation.getuserInformation();

            resultcontent += "*********获取用户的信息*************\n" + userInformation.getuserInformation()
                    + "\n***********************************************\n";
            logger.info(resultcontent);
            GlobalValues.glabal_map.put("firstLaunchTest",resultcontent);
            userInformation.click_backButton();
            launchPage.click_setting();
            settingPage = new SettingPage(driver);
            settingPage.click_logout();

        } else {
            resultcontent = "用户: " + launchPage.getuserNameText() + "已登录\n";
            resultcontent += "*********获取登录的信息*************\n" + launchPage.getLaunchInfomation()
                    + "\n***********************************************\n";

            launchPage.click_launchButton();
            userInformation = new UserInformation(driver);
           // userInformation.getuserInformation();
            resultcontent += "*********获取用户的信息*************\n" + userInformation.getuserInformation()
                    + "\n***********************************************\n";
            logger.info(resultcontent);
            GlobalValues.glabal_map.put("firstLaunchTest",resultcontent);
            userInformation.click_backButton();
            launchPage.click_setting();
            settingPage = new SettingPage(driver);
            settingPage.click_logout();



        }
    }


    @org.testng.annotations.Test(enabled = false)
    public void weixinLaunchTest(){
        homePage.clickUserButton();
        launchPage = new LaunchPage(driver);
        if(!launchPage.getuserNameText().equals("立即登录")){
            launchPage.click_setting();
            settingPage = new SettingPage(driver);
            settingPage.click_logout();

//            settingLaunchPasswordPage = new SettingLaunchPasswordPage(driver);
//            settingLaunchPasswordPage.click_skipButton();

        }
        launchPage.click_launchButton();
        mobileVerifyLaunchPage = new MobileVerifyLaunchPage(driver);
        mobileVerifyLaunchPage.click_weixinLaunch();
        weiXinLaunchPage = new WeiXinLaunchPage(driver);
        weiXinLaunchPage.click_launch();
        launchPage.click_launchButton();
        userInformation = new UserInformation(driver);
        //otherLaunchUserInformation.getuserInformation();
        String resultContent = "*********获取用户的信息*************\n" + userInformation.getuserInformation()
                + "\n***********************************************\n";
        logger.info(resultContent);
        GlobalValues.glabal_map.put("weixinLaunchTest",resultContent);
        userInformation.click_backButton();
        launchPage.click_setting();
        settingPage = new SettingPage(driver);
        settingPage.click_logout();

    }





    @org.testng.annotations.Test(enabled = false)
    public void passwordLaunchPageTest(){
        homePage.clickUserButton();
        launchPage = new LaunchPage(driver);
        if(launchPage.getuserNameText().equals("立即登录")){
            launchPage.click_launchButton();

            mobileVerifyLaunchPage = new MobileVerifyLaunchPage(driver);
            mobileVerifyLaunchPage.click_passwordLaunch();

            passwordLaunchPage = new PasswordLaunchPage(driver);
            String userName = "whx2010nj";
            String password = "whx0506,.";
            passwordLaunchPage.verifyPasswordLaunch(userName,password);



            Assert.assertTrue(userName.equals(launchPage.getuserNameText()));
            GlobalValues.glabal_map.put("passwordLaunchPageTest","verifyPasswordLaunch is ok");

//            passwordLaunchPage.input_userName("15996239267");
//            passwordLaunchPage.input_password("whx0506,.");
//            passwordLaunchPage.click_seePasswordButton();
//            passwordLaunchPage.click_launchButton();
        }

        GlobalValues.glabal_map.put("passwordLaunchPageTest","用户" + launchPage.getuserNameText() + "已登录");




    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }



}
