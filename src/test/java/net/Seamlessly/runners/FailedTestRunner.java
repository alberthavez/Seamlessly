package net.Seamlessly.runners;


import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "net/seamlessly/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}
