package com.cydeo.step_definitions;

/*
In the class we will be able to pass pre- & post - conditions to each scenario and each step
 */

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.DateTimeException;

public class Hooks {

    // import from io.cucumber. java not from junit
    @Before(order = 1)
    public void setupScenario(){
        System.out.println("==== Setting up browser using cucumber @Before");
    }

    @Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.println("==== This will only apply to scenario with @login tag");
    }

    @Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("==== This will only apply to scenario with @db tag");
    }

    @After
    public void tearDownScenario(Scenario scenario){

        //scenario.isFailed===> if scenario fails this methods will return TRUE boolean value
        if (scenario.isFailed()){
            byte [] screenShot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", scenario.getName());
        }

       // BrowserUtils.sleep(3);

        Driver.closeDriver();

        // System.out.println("==== Closing browser using cucumber @After");
       // System.out.println("==== Scenario ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setStep(){
        System.out.println("-------  applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("---------->  applying tearDown using @AfterStep");
    }


}
