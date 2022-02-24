package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class AlertsFrameWindowsPage extends BasePage {

    @FindBy(css = ".card.mt-4.top-card:nth-child(3)")
    private WebElementFacade alertsFrameWindowsButton;

    @FindBy(css = ".element-list.collapse.show li:first-child")
    private WebElementFacade browserWindowsButton;

    @FindBy(id = "tabButton")
    private WebElementFacade tabButton;

    @FindBy(id = "windowButton")
    private WebElementFacade newWindowButton;

    @FindBy(id = "messageWindowButton")
    private WebElementFacade messageWindowButton;

    @FindBy(id = "sampleHeading")
    private WebElementFacade newTabVerificationTitle;

    @FindBy(css = "body")
    private WebElementFacade newWindowMessageVerificationText;

    @FindBy(css = ".element-list.collapse.show li:nth-child(2)")
    private WebElementFacade alertsButton;

    @FindBy(id = "alertButton")
    private WebElementFacade alertButton;

    @FindBy(id = "timerAlertButton")
    private WebElementFacade timerAlertButton;

    @FindBy(id = "confirmButton")
    private WebElementFacade confirmAlertButton;

    @FindBy(id = "confirmResult")
    private WebElementFacade confirmAlertVerification;

    @FindBy(id = "promtButton")
    private WebElementFacade promtButton;

    @FindBy(id = "promptResult")
    private WebElementFacade promtAlertVerification;

    @FindBy(css = ".element-list.collapse.show li:nth-child(5)")
    private WebElementFacade modalDialogs;

    @FindBy(id = "showSmallModal")
    private WebElementFacade smallModalButton;

    @FindBy(id = "showLargeModal")
    private WebElementFacade largeModalButton;

    @FindBy(id = "closeSmallModal")
    private WebElementFacade closeSmallModalButton;

    @FindBy(id = "closeLargeModal")
    private WebElementFacade closeLargeModalButton;



    public void clickOnAlertsFrameWindowsButton(){
        clickOn(alertsFrameWindowsButton);
    }

    public void clickOnBrowserWindows(){
        clickOn(browserWindowsButton);
    }

    public void clickOnTabButton(){
        clickOn(tabButton);
    }

    public void clickOnNewWindowButton(){
        clickOn(newWindowButton);
    }

    public void clickOnMessageWindowButton(){
        clickOn(messageWindowButton);
    }

    public boolean verifyIfNewTabIsOpened(){
        return newTabVerificationTitle.isPresent();
    }

    public void verifyIfNewWindowMessageIsDisplayed(){
        newWindowMessageVerificationText.shouldContainOnlyText("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
    }

    public void clickOnAlertsButton(){
        clickOn(alertsButton);
    }

    public void clickOnAlertButton(){
        clickOn(alertButton);
        getAlert().accept();
    }

    public void clickOnTimeAlertButton(){
        clickOn(timerAlertButton);
        waitFor(5).seconds();
        getAlert().accept();
    }

    public void clickOnConfirmationAlertButton(){
        clickOn(confirmAlertButton);
        getAlert().accept();
    }

    public boolean verifyIfConfirmAlertWasSelected(){
        return confirmAlertVerification.isPresent();
    }

    public void clickOnPromtButton(){
        clickOn(promtButton);
        getAlert().sendKeys(Keys.chord("Rebeca"));
        getAlert().accept();
    }

    public boolean verifyIfNameWasEnteredInPromtBox(){
        return promtAlertVerification.isPresent();
    }

    public void clickOnModalDialogsButton(){
        clickOn(modalDialogs);
    }

    public void clickOnSmallModalButton(){
        clickOn(smallModalButton);
    }

    public void clickOnLargeModalButton(){
        clickOn(largeModalButton);
    }

    public void clickOnCloseSmallModalButton(){
        clickOn(closeSmallModalButton);
    }

    public void clickOnCloseLargeModalButton(){
        clickOn(closeLargeModalButton);
    }

    public void verifyIfSmallModalButtonWasClosed(){
        smallModalButton.shouldBePresent();
    }

    public void verifyIfLargeModalButtonWasClosed(){
        largeModalButton.shouldBePresent();
    }















}
