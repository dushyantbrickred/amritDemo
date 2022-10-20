package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/main/resources/Features/saucedemo.feature",
        glue= {"stepDef"},
        monochrome = true,
        plugin = {"pretty","html:target/Sauce_Report.html"}


)

public class testRunner {
}
