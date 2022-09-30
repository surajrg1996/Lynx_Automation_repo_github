 package TestRunner;
 
 import org.junit.runner.RunWith;

 import io.cucumber.junit.Cucumber;
 import io.cucumber.junit.CucumberOptions;

 @RunWith(Cucumber.class)
 @CucumberOptions

 	(
 			features="@target/failedrerun.txt",
 			glue={"stepdefinations","appHooks" },
 			dryRun= false,
 			monochrome=true,
 			//tags= " @Examples ",
 			plugin= {"pretty","html:target/test.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
 					,"rerun:target/failedrerun.txt"}
 				
 			
 			)


 
 

public class FailTestRunner {

}
