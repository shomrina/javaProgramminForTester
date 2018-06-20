package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class ContactCreationTests extends TestBase {
    FirefoxDriver wd;


    @Test
    public void ContactCreationTests() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm();
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();

    }
    

}
