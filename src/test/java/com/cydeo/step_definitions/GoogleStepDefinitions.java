package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @When("user types {word} and clicks enter")
    public void user_types_and_clicks_enter2(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);
    }


    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);
    }


    @Then("user sees {word} in the google title")
    public void user_sees_in_the_google_title(String word) {

        String expectedTitle = word+" - Cerca con Google";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected",expectedTitle,actualTitle);

        // Junit assertion accepts first arg as expected, second arg as actual
        //Assert.assertEquals(expectedTitle,actualTitle);
        //Assert.assertTrue(actualTile.equals(expectedTitle));
    }



    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.id("L2AGLb")).click();
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }





}
