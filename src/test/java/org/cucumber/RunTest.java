package org.cucumber;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class RunTest {
 @Cucumber.Options(

glue = {"org.cucumber.AnnotationSteps"},
features = "~/test4/src/test/resources",
format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"}

)
 }
