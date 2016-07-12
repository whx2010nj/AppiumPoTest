package PageModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/6/30.
 */
public class HomePage {

    private AppiumDriver driver = null;


//    @FindBy(id="me.ele:id/home_bottom_tab_1")
    private final String TAKEAWAY_BUTTON_ID = "me.ele:id/home_bottom_tab_1";

    private WebElement takeawayButton;


    private final String ORDER_BUTTON_ID = "me.ele:id/home_bottom_tab_2";
//    @FindBy(id="me.ele:id/home_bottom_tab_2")
    private WebElement orderButton ;

//    @FindBy(id="me.ele:id/home_bottom_tab_3")
    private final String FIND_BUTTON_ID = "me.ele:id/home_bottom_tab_3";
    private WebElement findButton;

    private final String USER_BUTTON_ID = "me.ele:id/home_bottom_tab_4";
//    @FindBy(id="me.ele:id/home_bottom_tab_4")
    private WebElement userButton;

//    @FindBy(xpath ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.widget.LinearLayout[1]\n")
    private WebElement goodFood;

//    private Map<String,WebElement> webElemnents = new HashMap<>();

    public HomePage(AppiumDriver driver){

        this.driver = driver;
        this.takeawayButton = driver.findElementById(TAKEAWAY_BUTTON_ID);
//        this.webElemnents.put("外卖",takeawayButton);
        this.orderButton = driver.findElementById(ORDER_BUTTON_ID);
//        this.webElemnents.put("订单",orderButton);
        this.findButton = driver.findElementById(FIND_BUTTON_ID);
//        this.webElemnents.put("发现",findButton);
        this.userButton = driver.findElementById(USER_BUTTON_ID);
//        this.webElemnents.put("我的",takeawayButton);

    }


    public void clickTakeAwayButton(){

        takeawayButton.click();

    }
    public void clickOrderButton(){

        orderButton.click();
    }

    public void clickFindButton(){

        findButton.click();
    }

    public void clickUserButton(){

        userButton.click();
    }


}

