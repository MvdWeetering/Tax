package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/Reports/html/" },
        glue = {"steps"},
        features = "classpath:featurefiles/",
        tags = {"@Toelichting_garantievoorzieningen"}
       
)
public class TestRunner {

}
