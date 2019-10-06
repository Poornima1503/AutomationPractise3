package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\poorn\\IdeaProjects\\AutomationPractise3\\src\\test\\java\\feature\\",
        glue={"stepDefinition"},
      //  tags={"@sanity"},
        tags= {},
      plugin = {"pretty","html:target/destination" +""}
)
public class TestRunner {}
