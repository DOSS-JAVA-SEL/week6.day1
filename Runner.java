package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src\\test\\resources\\Features",glue={"StepDefinition"},
monochrome= true, dryRun=false ,snippets = SnippetType.CAMELCASE, publish=true)

public class Runner extends AbstractTestNGCucumberTests{

}
