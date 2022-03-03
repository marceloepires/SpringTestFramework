package com.ea.SpringTestFramework.steps;

import com.ea.SpringTestFramework.models.TestUserDetails;
import com.ea.SpringTestFramework.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HomeSteps {
    @Autowired
    public LoginPage loginPage;

    @Autowired
    public TestUserDetails testUserDetails;


    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
//        List<List<String>> data = table.asLists(String.class);
//        loginPage.login(data.get(1).get(0), data.get(1).get(1));

        loginPage.login(testUserDetails.getUserDetails().getUsername(), testUserDetails.getUserDetails().getPassword());
    }
}
