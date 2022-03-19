package com.ea.SpringTestFramework.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class Hooks {

    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    @Before
    public void initializeTest(Scenario scenario){
        webDriver.navigate().to(appUrl);
    }

    @After
    public void TearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            //Screenshot
            System.out.println(scenario.getName());
        }
        webDriver.quit();
    }
}
