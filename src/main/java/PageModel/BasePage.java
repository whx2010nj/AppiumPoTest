package PageModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

/**
 * Created by wanghongxiang on 16/7/1.
 */
public class BasePage {


    public static void main(String[] args){

    }
    protected AppiumDriver driver;


    /**
     * This Method for swipe up
     *
     *
     * @param driver
     * @param during
     */
    public void swipeToUp(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
        // wait for page loading
    }

    /**
     * This Method for swipe down
     *
     *
     * @param driver
     * @param during
     */
    public void swipeToDown(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
        // wait for page loading
    }

    /**
     * This Method for swipe Left
     *
     *
     * @param driver
     * @param during
     */
    public void swipeToLeft(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
        // wait for page loading
    }

    /**
     * This Method for swipe Right
     *
     *
     * @param driver
     * @param during
     */
    public void swipeToRight(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
        // wait for page loading
    }

    /**
     * This Method create for take screenshot
     *
     *
     * @param drivername
     * @param filename
     */
    public static void snapshot(TakesScreenshot drivername, String filename) {
        // this method will take screen shot ,require two parameters ,one is
        // driver name, another is file name

        String currentPath = System.getProperty("user.dir"); // get current work
        // folder
        File scrFile = drivername.getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy
        // somewhere
        try {
            System.out.println("save snapshot path is:" + currentPath + "/"
                    + filename);
            FileUtils
                    .copyFile(scrFile, new File(currentPath + "\\" + filename));
        } catch (IOException e) {
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        } finally {
            System.out.println("screen shot finished, it's in " + currentPath
                    + " folder");
        }
    }



    /**
     * This method for delete text in textView
     *
     * @author Young
     * @param text
     */
    public void clearText(String text) {
        ((AndroidDriver)driver).sendKeyEvent(123);
        for (int i = 0; i < text.length(); i++) {
            ((AndroidDriver)driver).sendKeyEvent(67);
        }
    }

}
