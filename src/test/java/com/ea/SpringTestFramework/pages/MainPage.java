package com.ea.SpringTestFramework.pages;

import com.ea.SpringTestFramework.annotation.PageScope;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@PageScope
public class MainPage extends BasePage{

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver webDriver;

    public void performLogin() {
        homePage.clickLogin();
        loginPage.login("admin", "password");
        loginPage.clickLogin();
    }

    public void PerformLogoff() {
        homePage.ClickLogout();
    }
}
