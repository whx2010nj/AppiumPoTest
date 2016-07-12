package JunittoTest;

import com.ele.aftcapi.CaseAndResultHandler;
import com.ele.aftcapi.model.*;

import java.util.ArrayList;

import static com.ele.aftcapi.CaseAndResultHandler.getInstante;

/**
 * Created by wanghongxiang on 16/7/7.
 */
public class TestRailTestRun {

    public static void main(String[] args){

        Case caseInfo = new Case();
        caseInfo.setProject_name("test");
//        testsuit的添加有权限要求
        caseInfo.setSuite_name("test-appiumsuite");

        caseInfo.setSection_name("test-launchsection");
        caseInfo.setTitle("case -username");
        ArrayList caseStep = new ArrayList();
        CaseStep step0 = new CaseStep();
        step0.setContent("testcontent11");
        step0.setExpected("setExpected11");
        caseStep.add(step0);
        caseInfo.setCaseSteps(caseStep);
        //CaseAndResultHandler caseAndResultHandler = new CaseAndResultHandler();
        try {
            CaseAndResultHandler.getInstante().saveCase(caseInfo, "fengchun.fan@ele.me", "Waimai20151101$");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Run run = new Run();
//        run.setProject_name("test");
//        run.setSuite_name("test-appiumsuite");
//        run.setName("appiumrun");
        try {
            //CaseAndResultHandler.getInstante().createRunForAllCase(run, "fengchun.fan@ele.me", "Waimai20151101$");
        Result result = new Result();
        result.setProjectname("test");
        result.setRunName("appiumrun");
//        result.setCaseId(56141L);
            result.setCaseInfo(caseInfo);
        result.setStatus("5");
        ArrayList resultStep = new ArrayList();
        ResultStep step1 = new ResultStep();
        step1.setContent("step2");
        step1.setActual("actual");
        step1.setExpected("expected");
        step1.setStatus("1");
        resultStep.add(step1);
        result.setResultSteps(resultStep);
        getInstante().saveResult(result, "fengchun.fan@ele.me", "Waimai20151101$");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
