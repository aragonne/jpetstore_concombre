package org.cucumber;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) 
@CucumberOptions(

glue = {"org.cucumber.AnnotationSteps"},
features = "~/test4/src/test/resources",
format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"}

)
public class RunTest {

}
