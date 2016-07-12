package PageModel.util;


import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;


/**
 * Created by wanghongxiang on 16/7/5.
 */
public class PrintInforamtionUtil {


    private static Logger logger = Logger.getLogger("Test");

    public static String printPageTextInfo(AppiumDriver driver) {

//        logger.info(
//                "*************Page information ***************"
//        );

        try {
            Thread.sleep(1000);
            StringBuilder sb = new StringBuilder();
            String pageXml = driver.getPageSource();
            String[] split = pageXml.split("\\s+");
            for (String str : split
                    ) {
                if (str.contains("text=")) {
                    for (String s : str.split("\"")
                            ) {
                        if (!s.contains("text")) {
                           // System.out.println(s);
                            sb.append(s + "\n");
                        }


                    }

                }
                if (str.contains("content")) {
                    for (String s : str.split("\"")
                            ) {
                        if (!s.contains("content")) {

                           // System.out.println(s);
                            if(!s.contains("resource"))
                            sb.append(s + "\n");
                        }


                    }

                }
//                if (str.contains("content-desc=")) {
//                    for (String s : str.split("\"")
//                            ) {
//                        if (!s.contains("content-desc=")) {
//                            // System.out.println(s);
//                            sb.append(s + "\n");
//                        }
//
//
//                    }

//                }


            }
//            logger.info(
//                    "************************************************"
//            );
            return sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
            logger.info("The sleep time exception");

        }

        return null;
    }
}
