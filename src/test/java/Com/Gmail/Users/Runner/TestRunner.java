package Com.Gmail.Users.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".\\src\\test\\java\\Com\\Gmail\\Users\\Features\\DemoLogin2.feature", // path to your .feature files
    glue = "Com.Gmail.Users.StepDef",
//    tags = "datatable"
//    plugin = {"pretty", "html:Reports/cucumber-reports.html"}
    		plugin = {"pretty", "json:target/cucumber-report.json",
    "junit:target/cucumber-report.xml"}
    )

public class TestRunner {

}
