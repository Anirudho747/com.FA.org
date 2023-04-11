package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//ideally for features we should just mention the folder name and control execution via tags, but we can mention individual file as well
		        features = {"src/test/resources/features/Login","src/test/resources/features/Login2"},
				glue = {"stepDefinition"},
		        plugin= {
				"pretty",
				"html:html/Reports.html",
				"json:json/Report.json",
				"junit:junit/Report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		         },
		         tags="not @JIRA-456",
		         monochrome = false,
		         dryRun = false,
		         publish = true
		         )
public class TestRunner {

}
