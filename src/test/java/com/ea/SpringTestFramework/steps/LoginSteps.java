package com.ea.SpringTestFramework.steps;

import com.ea.SpringTestFramework.models.TestUserDetails;
import com.ea.SpringTestFramework.models.UserDetails;
import com.ea.SpringTestFramework.pages.HomePage;
import com.ea.SpringTestFramework.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @Given("I click login in Home Page")
    public void iClickLoginInHomePage(){
        homePage.clickLogin();

        testUserDetails.setUserDetails(new UserDetails("admin", "password"));
    }


    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should see userform page")
    public void iShouldSeeUserformPage() {
        Assert.assertEquals(homePage.isEmployeeDetailsExists(), true);
    }

    @And("I click logout link")
    public void iClickLogoutLink() {
        homePage.ClickLogout();
    }
}
