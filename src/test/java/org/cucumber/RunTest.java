package org.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) 
@CucumberOptions(

glue = {"org.cucumber.AnnotationSteps"},
features = "~/test4/src/test/resources"

)
public class RunTest {

}
