package com.ea.SpringTestFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public abstract class BasePage {

    @Autowired
    private WebDriver webDriver;

    @PostConstruct
    public void InitPage(){
        PageFactory.initElements(webDriver, this);
    }

}
