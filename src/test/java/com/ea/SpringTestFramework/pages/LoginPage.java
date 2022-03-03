package com.ea.SpringTestFramework.pages;

import com.ea.SpringTestFramework.annotation.PageScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@PageScope
public class LoginPage extends BasePage {

    @FindBy(id = "UserName")
    public WebElement txtUserName;

    @FindBy(name = "Password")
    public WebElement txtPassword;

    @FindBy(css = ".btn.btn-default")
    public WebElement btnLogin;

    public void login(String userName, String password) {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public HomePage clickLogin () {
        btnLogin.click();
        return new HomePage();
    }

}
