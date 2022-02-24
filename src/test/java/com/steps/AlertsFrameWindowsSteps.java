package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class AlertsFrameWindowsSteps extends BaseSteps {

    @Step
    public void clickOnAlertsFrameWindowsButton(){
        alertsFrameWindowsPage.clickOnAlertsFrameWindowsButton();
    }

    @Step
    public void clickOnBrowserWindowsButton(){
        alertsFrameWindowsPage.clickOnBrowserWindows();
    }

    @Step
    public void clickOnTabButton(){
        alertsFrameWindowsPage.clickOnTabButton();
    }

    @Step
    public void clickOnNewWindowButton(){
        alertsFrameWindowsPage.clickOnNewWindowButton();
    }

    @Step
    public void clickOnMessageWindowButton(){
        alertsFrameWindowsPage.clickOnMessageWindowButton();
    }

    @Step
    public void switchToNewTab(){
        alertsFrameWindowsPage.switchToNewWindow();
    }

    @Step
    public void verifyIfNewTabIsOpened(){
        Assert.assertTrue(alertsFrameWindowsPage.verifyIfNewTabIsOpened());
    }

    @Step
    public void verifyIfNewWindowMessageIsDisplayed(){
        alertsFrameWindowsPage.verifyIfNewWindowMessageIsDisplayed();
    }

    @Step
    public void clickOnAlertsButton(){
        alertsFrameWindowsPage.clickOnAlertsButton();
    }

    @Step
    public void clickOnAlertButton(){
        alertsFrameWindowsPage.clickOnAlertButton();
    }

    @Step
    public void clickOnTimeAlertButton(){
        alertsFrameWindowsPage.clickOnTimeAlertButton();
    }

    @Step
    public void clickOnConfirmationAlertButton(){
        alertsFrameWindowsPage.clickOnConfirmationAlertButton();
    }

    @Step
    public void clickOnPromtButton(){
        alertsFrameWindowsPage.clickOnPromtButton();
    }

    @Step
    public void verifyIfConfirmAlertWasSelected(){
        Assert.assertTrue(alertsFrameWindowsPage.verifyIfConfirmAlertWasSelected());
    }

    @Step
    public void verifyIfNameWasEnteredInPromtBox(){
        Assert.assertTrue(alertsFrameWindowsPage.verifyIfNameWasEnteredInPromtBox());
    }

    @Step
    public void waitForTheAlert(){
        waitFor(10).seconds();
    }

    @Step
    public void clickOnModalDialogsButton(){
        alertsFrameWindowsPage.clickOnModalDialogsButton();
    }

    @Step
    public void clickOnSmallModalButton(){
        alertsFrameWindowsPage.clickOnSmallModalButton();
    }

    @Step
    public void clickOnLargeModalButton(){
        alertsFrameWindowsPage.clickOnLargeModalButton();
    }

    @Step
    public void clickOnCloseSmallModalButton(){
        alertsFrameWindowsPage.clickOnCloseSmallModalButton();
    }

    @Step
    public void clickOnCloseLargeModalButton(){
        alertsFrameWindowsPage.clickOnCloseLargeModalButton();
    }

    @Step
    public void verifyIfSmallModalButtonWasClosed(){
        alertsFrameWindowsPage.verifyIfSmallModalButtonWasClosed();
    }

    @Step
    public void verifyIfLargeModalButtonWasClosed(){
        alertsFrameWindowsPage.verifyIfLargeModalButtonWasClosed();
    }

    @Step
    public void scrollThePage(){
        alertsFrameWindowsPage.scrollToPageBottom();
    }








}
