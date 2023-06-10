package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features="C:\\Users\\Hp\\eclipse-workspace\\BDDAutomationFrameWorkMay2023\\src\\test\\java\\featurefiles\\loginpage.feature",
		
		glue="stepdefinitions",
		dryRun=true,//real execution it will initial crosscheck feature file contain correspoint step definition or not
		monochrome=true,//remove uncessary character from our window
		plugin= {"pretty","html:test-output"}//pretty:give the o/p of console with clearly
		
		
		
		)
public class TestRunner {
	
	

}


