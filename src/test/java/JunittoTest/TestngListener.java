package JunittoTest;

//import org.apache.log4j.Logger;
import Config.GlobalValues;
import com.ele.aftcapi.CaseAndResultHandler;
import com.ele.aftcapi.model.*;
import com.ele.aftcapi.utils.Global;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.TestResult;
import org.testng.log4testng.Logger;

import java.util.ArrayList;

import static com.ele.aftcapi.CaseAndResultHandler.getInstante;

/**
 * Created by wanghongxiang on 16/7/7.
 */
public class TestngListener extends TestListenerAdapter {


    private static Logger logger = Logger.getLogger(TestngListener.class);

    private static Result result;

//    private static Case caseInfo;

    private static  ArrayList<ResultStep> resultStep;

//    public static final String CONFIG = "config.properties";

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        logger.info("Test case: " + tr.getInstanceName() + "/" + tr.getName() + " is failed");
        ResultStep step1 = new ResultStep();
        step1.setContent("Test case: " + tr.getInstanceName() + "/" + tr.getName() + " is failed");
        step1.setActual("actual");
        step1.setExpected("expected");
        step1.setStatus(TestRailResult.FAILED);
        resultStep.add(step1);
        result.setStatus(TestRailResult.FAILED_STING);
        result.setResultSteps(resultStep);
        try {
            CaseAndResultHandler.getInstante().saveResult(result, "fengchun.fan@ele.me", "Waimai20151101$");
        } catch (Exception e) {

            e.printStackTrace();
        }
        logger.info("---------------------------------------------");
        //takeScreenShot(tr);
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
        logger.info("Test case: " + tr.getInstanceName() + "/" + tr.getName() + " is skip");
        logger.info("---------------------------------------------");
       // takeScreenShot(tr);
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        logger.info("Test case: " + tr.getInstanceName() + "/" + tr.getName() + " is success");
        ResultStep step1 = new ResultStep();
//        logger.error(GlobalValues.glabal_map.get(tr.getName()));
        step1.setContent(GlobalValues.glabal_map.get(tr.getName()));
        step1.setActual("actual");
        step1.setExpected("expected");
        step1.setStatus(TestRailResult.PASSED);
        resultStep.add(step1);
        result.setStatus(TestRailResult.PASSED_STRING);
        result.setResultSteps(resultStep);
//        logger.error(result.getResultSteps().get(0).getContent());
        try {
            CaseAndResultHandler.getInstante().saveResult(result, "fengchun.fan@ele.me", "Waimai20151101$");
        } catch (Exception e) {

            e.printStackTrace();
        }

        logger.info("---------------------------------------------");
    }

    @Override
    public void onTestStart(ITestResult tr) {
        super.onTestStart(tr);
        logger.info("Test case: " + tr.getInstanceName() + "/" + tr.getName() + " is start");


        Case caseInfo = new Case();
        caseInfo.setProject_name("test");
//        testsuit的添加有权限要求
        caseInfo.setSuite_name("test-appiumPOsuite-new");

        caseInfo.setSection_name("test-launchsection");
        caseInfo.setTitle("case-"+tr.getName());
        ArrayList caseStep = new ArrayList();
        CaseStep step0 = new CaseStep();
        step0.setContent(tr.getInstanceName() + "/" + tr.getName() + "test");
        step0.setExpected(tr.getInstanceName() + "/" + tr.getName() + "success");
        caseStep.add(step0);
        caseInfo.setCaseSteps(caseStep);
//        CaseAndResultHandler caseAndResultHandler = new CaseAndResultHandler();
        try {
            CaseAndResultHandler.getInstante().saveCase(caseInfo, "fengchun.fan@ele.me", "Waimai20151101$");

//        Run run = new Run();
//        run.setProject_name("test");
//        run.setSuite_name("test-appiumPOsuite5");
//        run.setName("appiumPorun5");
////        CaseAndResultHandler.getInstante().createRunForAllCase(run, "fengchun.fan@ele.me", "Waimai20151101$");

        result = new Result();
        result.setProjectname("test");
        result.setRunName("appiumPorun-new");
        result.setCaseInfo(caseInfo);
        resultStep = new ArrayList<>();

        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("---------------------------------------------");
    }

    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);

        Case caseInfo = new Case();
        caseInfo.setProject_name("test");
//        testsuit的添加有权限要求
        caseInfo.setSuite_name("test-appiumPOsuite-new");
        caseInfo.setSection_name("test-launchsection");
        caseInfo.setTitle("case-"+ testContext.getName());
        ArrayList caseStep = new ArrayList();
        CaseStep step0 = new CaseStep();
        step0.setContent("this just a test example");
        step0.setExpected("just example");
        caseStep.add(step0);
        caseInfo.setCaseSteps(caseStep);
//        CaseAndResultHandler caseAndResultHandler = new CaseAndResultHandler();
        try {
            CaseAndResultHandler.getInstante().saveCase(caseInfo, "fengchun.fan@ele.me", "Waimai20151101$");

            Run run = new Run();
            run.setProject_name("test");
            run.setSuite_name("test-appiumPOsuite-new");
            run.setName("appiumPorun-new");
            CaseAndResultHandler.getInstante().createRunForAllCase(run, "fengchun.fan@ele.me", "Waimai20151101$");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);
        logger.info("Test case: "+ testContext.getName()  + " is finish");

        logger.info("---------------------------------------------");

    }
}