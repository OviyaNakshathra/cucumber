package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/search multiple product.feature"},
glue="stepdef",
plugin="json:target/jsonreport.json")
//tags={"@smoke,@regression"})

public class Scennariorun {
	
}
