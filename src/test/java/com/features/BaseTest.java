package com.features;

import com.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximise() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    @Steps
    protected ElementsSteps elementsSteps;

    @Steps
    protected FormsSteps formsSteps;

    @Steps
    protected AlertsFrameWindowsSteps alertsFrameWindowsSteps;

    @Steps
    protected WidgetsSteps widgetsSteps;

    @Steps
    protected InteractionsSteps interactionsSteps;

    @Steps
    protected BookStoreApplicationSteps bookStoreApplicationSteps;







}

