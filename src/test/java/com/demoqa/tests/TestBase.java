package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.components.CalendarComponent;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    RegistrationPage registrationPage =new RegistrationPage();

    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl= "https://demoqa.com";
        Configuration.browserSize= "1920x1080";
    }
}
