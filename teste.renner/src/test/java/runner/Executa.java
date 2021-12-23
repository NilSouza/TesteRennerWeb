package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features",

		glue = "steps",

		tags = "@renner1",

		dryRun = false,

		plugin = { "pretty", "html:target/reportesterenner.html" },

		monochrome = true

)

public class Executa {

}
