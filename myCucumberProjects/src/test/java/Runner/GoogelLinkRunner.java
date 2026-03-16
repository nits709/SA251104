package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features/GoogleLinks.feature"},
					glue = {"stepsDefinition"},tags="@Alltest")
public class GoogelLinkRunner {
	
	/*single scenario = @Gmail
	 * 
	 * Mulitple scenario = @Gmail or @Image
	 * 
	 * Skip testcases = not @Gmail
	 * 
	 * All testcases
	 * */

}
