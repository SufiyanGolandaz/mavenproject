package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature",
		glue = {"StepsDefinition"})
public class Runner extends AbstractTestNGCucumberTests{

}
