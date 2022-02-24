package com.features;

import org.junit.Test;

public class AlertsFrameWindowsTest extends BaseTest {

    @Test
    public void clickOnNewTabTest(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.clickOnBrowserWindowsButton();
        alertsFrameWindowsSteps.clickOnTabButton();
        alertsFrameWindowsSteps.switchToNewTab();
        alertsFrameWindowsSteps.verifyIfNewTabIsOpened();
    }

    @Test
    public void clickOnNewWindowTest(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.clickOnBrowserWindowsButton();
        alertsFrameWindowsSteps.clickOnNewWindowButton();
        alertsFrameWindowsSteps.switchToNewTab();
        alertsFrameWindowsSteps.verifyIfNewTabIsOpened();
    }

    //assert
    @Test
    public void clickOnNewWindowMessageTest(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.clickOnBrowserWindowsButton();
        alertsFrameWindowsSteps.clickOnMessageWindowButton();
        alertsFrameWindowsSteps.switchToNewTab();
        alertsFrameWindowsSteps.verifyIfNewWindowMessageIsDisplayed();
    }


    @Test
    public void clickOnAlertTest(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.clickOnAlertsButton();
        alertsFrameWindowsSteps.clickOnAlertButton();
    }

    @Test
    public void clickOnTimeAlertTest(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.clickOnAlertsButton();
        alertsFrameWindowsSteps.clickOnTimeAlertButton();
        alertsFrameWindowsSteps.waitForTheAlert();
    }

    @Test
    public void clickOnConfirmationAlertTest(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.clickOnAlertsButton();
        alertsFrameWindowsSteps.clickOnConfirmationAlertButton();
        alertsFrameWindowsSteps.verifyIfConfirmAlertWasSelected();
    }

    @Test
    public void clickOnPromtButtonAlert(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.clickOnAlertsButton();
        alertsFrameWindowsSteps.clickOnPromtButton();
        alertsFrameWindowsSteps.verifyIfNameWasEnteredInPromtBox();
    }

    @Test
    public void clickOnSmallModalButton(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.scrollThePage();
        alertsFrameWindowsSteps.clickOnModalDialogsButton();
        alertsFrameWindowsSteps.clickOnSmallModalButton();
        alertsFrameWindowsSteps.clickOnCloseSmallModalButton();
        alertsFrameWindowsSteps.verifyIfSmallModalButtonWasClosed();
    }

    @Test
    public void clickOnLargeModalButton(){
        alertsFrameWindowsSteps.clickOnAlertsFrameWindowsButton();
        alertsFrameWindowsSteps.scrollThePage();
        alertsFrameWindowsSteps.clickOnModalDialogsButton();
        alertsFrameWindowsSteps.clickOnLargeModalButton();
        alertsFrameWindowsSteps.clickOnCloseLargeModalButton();
        alertsFrameWindowsSteps.verifyIfLargeModalButtonWasClosed();
    }




}
