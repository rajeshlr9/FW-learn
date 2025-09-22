package runnersFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "classpath:FeatureFiles",
    glue = {"stepsDef"},
    dryRun = false,
    monochrome = true,
    plugin = {"pretty", "html:test-output/report.html", "timeline:target/test-timeline"},
    tags = "@parallel"
)


public class TestNGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
    return super.scenarios();  // ✅ now works
    }
}