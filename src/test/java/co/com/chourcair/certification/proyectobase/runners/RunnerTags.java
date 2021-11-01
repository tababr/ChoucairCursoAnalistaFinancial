package co.com.chourcair.certification.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/academyChourcair.feature",
        tags = "@stories",
        glue = "co.com.chourcair.certification.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags{

}