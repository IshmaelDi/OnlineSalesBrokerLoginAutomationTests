package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/KorridorLogin.feature",
        glue = "stepsDefinition",
        plugin = { "pretty", "json:target/CucumberTestReport.json" },
        monochrome = false,
        dryRun = false


)



public class KorridorUITestRunner {
}
