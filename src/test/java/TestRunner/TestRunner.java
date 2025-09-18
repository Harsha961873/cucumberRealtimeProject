package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"C:\\Users\\User\\eclipse-workspace-interview\\CucumberProject\\src\\test\\resources\\Features"},
	glue = "StepDefination",
	monochrome = true,
	dryRun = false,
	plugin = {
			"pretty",
			"html:target/cucumberhtmlreport.html",
			"json:target/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
)
public class TestRunner {

}
