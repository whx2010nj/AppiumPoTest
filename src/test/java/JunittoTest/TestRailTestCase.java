package JunittoTest;

import com.ele.aftcapi.CaseAndResultHandler;
import com.ele.aftcapi.model.Case;
import com.ele.aftcapi.model.CaseStep;

import java.util.ArrayList;

import static com.ele.aftcapi.CaseAndResultHandler.getInstante;

/**
 * Created by wanghongxiang on 16/7/7.
 *
 */

/*
project_name:可以有多个suit 如Ui测试
testSuit:suit 可以是acccount测试,order测试,pay测试,其下可以有多个session
testSession:可以是手机用户名登陆,第三方登陆等,其下可以有多个
testCase: 手机登陆,,用户名登陆,微信登陆等
casestep: 输入手机,输入密码,点击登陆按钮
run:是一系列cases的集合

run要基于现有的case进行创建,因此必须向创建case,且其projectname,suitname,session,

 */
public class TestRailTestCase {

    public static void main(String[] args){
        Case caseInfo = new Case();
        caseInfo.setProject_name("test");
//        testsuit的添加有权限要求
        caseInfo.setSuite_name("test-appiumsuite");

        caseInfo.setSection_name("test-launchsection");
        caseInfo.setTitle("case -username2");
        ArrayList caseStep = new ArrayList();
        CaseStep step0 = new CaseStep();
        step0.setContent("testcontent11");
        step0.setExpected("setExpected11");
        caseStep.add(step0);
        caseInfo.setCaseSteps(caseStep);
        CaseAndResultHandler caseAndResultHandler = new CaseAndResultHandler();
        try {
            caseAndResultHandler.getInstante().saveCase(caseInfo, "fengchun.fan@ele.me", "Waimai20151101$");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
