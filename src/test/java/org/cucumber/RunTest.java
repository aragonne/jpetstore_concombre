package org.cucumber;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@Cucumber.Options(

glue = {"org.cucumber.AnnotationSteps"},
features = "~/test4/src/test/resources",
format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"}

)
public class RunTest {

}
