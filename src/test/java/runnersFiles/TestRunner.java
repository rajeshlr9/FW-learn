package runnersFiles;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		
		//features = "classpath:FeatureFiles",
		features = "src/test/resources/FeatureFiles",
		//features = ".//FeatureFiles/",
		
	//	features = ".//Features/",
		glue = {"stepsDef"},
		dryRun=false,
		monochrome=true,
	//	plugin= {"html:target/cucumber.html"},
	plugin= {"pretty","html:test-output/report.html","pretty", "timeline:target/test-timeline"},
			
	tags = "@parallel" 
	//tags = "@sanity and @smoke" 
	//tags = "@sanity or @smoke" 
	
		)






public class TestRunner  {
	
	
	

}
