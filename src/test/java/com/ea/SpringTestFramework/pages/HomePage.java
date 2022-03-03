package com.ea.SpringTestFramework.pages;

import com.ea.SpringTestFramework.annotation.PageScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;


@PageScope
public class HomePage extends BasePage {

    @FindBy(linkText = "Login")
    public WebElement lnkLogin;

    @FindBy(linkText = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(linkText = "Employee Details")
    public WebElement lnkEmployeeDetails;

    @FindBy(linkText = "Log off")
    public WebElement lnkLogout;

    public LoginPage clickLogin() {
        lnkLogin.click();
        return new LoginPage();
    }

    public void clickEmployeeList() {
        lnkEmployeeList.click();
    }

    public boolean isEmployeeDetailsExists() {
        return lnkEmployeeDetails.isDisplayed();
    }

    public HomePage ClickLogout() {
        lnkLogout.click();
        return new HomePage();
    }


}
