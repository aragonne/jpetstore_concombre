package org.cucumber;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:/src/test/resources/squash/test.feature"} //NOTE: NO SPACE
        )
public class RunTest {
 
 }
