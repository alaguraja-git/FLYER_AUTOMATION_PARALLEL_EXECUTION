package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrun.txt"
				}, 
		//tags = "not @Skip",
		monochrome = true,
		glue = { "parallel" },
		features = { "src/test/resources/parallel/2.HomePage.feature" }
)

public class ParallelRun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}

//Note: if you want to run from maven - you can use the  below command
// mvn test -DCucumber.options="--tags '@Home and not @Skip'"