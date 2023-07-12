package stepDefinitions;

import cucumberHelper.TestContext;
import io.cucumber.java.After;

public class Hooks {

    TestContext testContext;

    public Hooks (TestContext context){
        testContext = context;
    }
    @After
    public void tearDown() {
        testContext.getWebDriverManager().closeDriver();
    }

}
