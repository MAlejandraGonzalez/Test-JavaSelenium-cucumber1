import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Proyecto {



    @CucumberOptions(
            features = "src/test/java/features/ejemplo.feature",
            glue = "stepDefinitions",
            plugin = {
                    "pretty",
                    "html:target/cucumber-html-report.html"
            }
    )
    public class Projects extends AbstractTestNGCucumberTests {}

}
