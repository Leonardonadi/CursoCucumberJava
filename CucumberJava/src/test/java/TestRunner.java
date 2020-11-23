

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)                                             
@CucumberOptions(
		features = "src/test/resources/Features/alugar_filme.feature",
glue = "CucumberJava",
monochrome= true,
   dryRun = false,
   snippets = SnippetType.CAMELCASE,
   strict = false,
   tags= {},
plugin = "pretty"
   
)


public class TestRunner {


}
