package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WidgetsPage extends BasePage {

    @FindBy(css = ".card.mt-4.top-card:nth-child(4)")
    private WebElementFacade widgetsButton;

    @FindBy(css = ".element-list.collapse.show li:first-child")
    private WebElementFacade accordianButton;

    @FindBy(id = "section1Heading")
    private WebElementFacade firstTextTitle;

    @FindBy(css = "#section1Content > p")
    private WebElementFacade firstTextVerification;

    @FindBy(id = "section2Heading")
    private WebElementFacade secondTextTitle;

    @FindBy(id = "section2Content")
    private WebElementFacade secondTextVerification;

    @FindBy(id = "section3Heading")
    private WebElementFacade thirdTextTitle;

    @FindBy(css = "#section3Content p")
    private WebElementFacade thirdTextVerification;

    @FindBy(css = ".element-list.collapse.show li:nth-child(2)")
    private WebElementFacade autoCompleteButton;

    @FindBy(id = "autoCompleteMultipleInput")
    private WebElementFacade multipleInputColorField;

    @FindBy(id = "autoCompleteSingleInput")
    private WebElementFacade singleInputColorField;

    @FindBy(css = ".css-xb97g8.auto-complete__multi-value__remove path")
    private WebElementFacade removeMultipleColorButton;

    @FindBy(css = ".css-1rhbuit-multiValue")
    private List<WebElementFacade> colorNameBoxList;

    @FindBy(css = ".auto-complete__single-value.css-1uccc91-singleValue")
    private WebElementFacade singleColorName;

    @FindBy(css = ".element-list.collapse.show li:nth-child(4)")
    private WebElementFacade sliderButton;

    @FindBy(css = ".range-slider")
    private WebElementFacade sliderField;

    @FindBy(css = "sliderValue")
    private WebElementFacade sliderValueField;

    @FindBy(css = ".element-list.collapse.show li:nth-child(5)")
    private WebElementFacade progressBarButton;

    @FindBy(id = "startStopButton")
    private WebElementFacade startProgressBarButton;

    @FindBy(id = "resetButton")
    private WebElementFacade resetProgressBarButton;

    @FindBy(css = ".progress-bar")
    private WebElementFacade progressBarField;

    @FindBy(css = "aria-valuenow")
    private WebElementFacade progressBarLoading;

    @FindBy(css = ".element-list.collapse.show li:nth-child(7)")
    private WebElementFacade toolTipsButton;

    @FindBy(id = "toolTipButton")
    private WebElementFacade hoverMeButton;

    @FindBy(id = "toolTipTextField")
    private WebElementFacade hoverMeTextField;

    @FindBy(css = ".element-list.collapse.show li:nth-child(8)")
    private WebElementFacade menuButton;

    @FindBy(css = "#nav > li:nth-child(1)")
    private WebElementFacade mainItem1Text;

    @FindBy(css = "#nav > li:nth-child(2)")
    private WebElementFacade mainItem2Text;

    @FindBy(css = "#nav > li:nth-child(3)")
    private WebElementFacade mainItem3Text;

    @FindBy(css = "#nav > li:nth-child(2) > ul > li:nth-child(3)")
    private WebElementFacade subSubListText;

    @FindBy(css = "#nav > li:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(1) > a")
    private WebElementFacade subSubItem1Text;

    @FindBy(css = ".element-list.collapse.show li:nth-child(9)")
    private WebElementFacade selectMenuButton;

    @FindBy(id = "react-select-2-input")   // react-select-11-option-0-0
    private WebElementFacade firstDropdownValue;

    @FindBy(id = "react-select-12-option-0-2")
    private WebElementFacade titleDropdown;

    @FindBy(id = "oldSelectMenu")
    private WebElementFacade oldStyleSelectDropdown;

    @FindBy(id = "react-select-4-input")
    private WebElementFacade multiselectDropdown;

    @FindBy(id = "cars")
    private WebElementFacade carsSelect;




    public void clickOnWidgetsButton(){
        clickOn(widgetsButton);
    }

    public void clickOnAccordianButton(){
        clickOn(accordianButton);
    }

    public void clickOnFirstTextTitle(){
        withAction().doubleClick(firstTextTitle);
    }

    public void verifyIfFirstTextIsDisplayed(){
        firstTextVerification.shouldBeCurrentlyVisible();
        firstTextVerification.getText().startsWith("Lorem Ipsum is simply dummy text");
        firstTextVerification.getText().endsWith("Aldus PageMaker including versions of Lorem Ipsum.");
    }

    public void clickOnSecondTextTitle(){
//        withAction().doubleClick(secondTextTitle);
        clickOn(secondTextTitle);
    }

    public void verifyIfSecondTextIsDisplayed(){
        secondTextVerification.shouldBeCurrentlyVisible();
        secondTextVerification.getText().startsWith("Contrary to popular belief");
        secondTextVerification.getText().endsWith("1914 translation by H. Rackham.");
    }

    public void clickOnThirdTextTitle(){
//        withAction().doubleClick(thirdTextTitle);
        clickOn(thirdTextTitle);
    }

    public void verifyIfThirdTextIsDisplayed(){
        thirdTextVerification.shouldBeCurrentlyVisible();
        thirdTextVerification.getText().startsWith("It is a long established fact that");
        thirdTextVerification.getText().endsWith("(injected humour and the like).");
    }

    public void clickOnAutoCompleteButton(){
        clickOn(autoCompleteButton);
    }

    public void setMultipleInputColorField(){
        multipleInputColorField.sendKeys(Keys.chord("B"));
        multipleInputColorField.sendKeys(Keys.ARROW_DOWN);
        multipleInputColorField.sendKeys(Keys.ENTER);
        multipleInputColorField.sendKeys(Keys.chord("y"));
        multipleInputColorField.sendKeys(Keys.ENTER);
    }

    // nu verifica culoarea adaugata
    public boolean verifyIfColorWasAdded(String color){
        for(WebElement element : colorNameBoxList){
            if(element.findElement(By.cssSelector(".css-12jo7m5")).getText().equalsIgnoreCase(color));
                return true;
            }
        return false;
    }

    // delete la toate
    public void deleteFromMultipleColorField(String color){
        for(WebElement element : colorNameBoxList){
            element.findElement(By.cssSelector(".css-12jo7m5")).getText().equalsIgnoreCase(color);
            element.findElement(By.cssSelector(".css-xb97g8 svg")).click();
        }
    }

    public void setSingleInputColorField(){
        singleInputColorField.sendKeys(Keys.chord("b"));
        singleInputColorField.sendKeys(Keys.ENTER);
    }

    public boolean verifyIfOneColorWasAdded(String color){
        return singleColorName.getText().equalsIgnoreCase(color);
    }

    // nu merge delete-u
    public void clearTheSingleColorField(){
//       singleInputColorField.sendKeys(Keys.SPACE);
       singleColorName.clear();
    }

    public void verifyIfTheSingleColorFieldIsClear(){
        singleColorName.shouldNotBeVisible();
    }

    public void clickOnSliderButton(){
        clickOn(sliderButton);
    }


    //selector
    public void slideTheSlider(){
//        clickOn(sliderField);
//        withAction().moveToElement(sliderField).clickAndHold().perform();
//        withAction().dragAndDropBy(sliderField, 100, 0).release().build().perform();
//        waitFor(10).seconds();

        sliderField.sendKeys(Keys.ARROW_RIGHT);


//        sliderField.selectByValue("56");
//        waitFor(10).seconds();
    }

    public void clickOnProgressBarButton(){
        clickOn(progressBarButton);
    }

    public void clickOnStartProgressBarButton(){
        clickOn(startProgressBarButton);
        waitFor(10).seconds();
//        resetProgressBarButton.waitUntilPresent(); //9 sec
//        waitFor(resetProgressBarButton); //5 sec
    }


    public boolean verifyIfProgressBarIsCompleted(){
        return resetProgressBarButton.isPresent();
    }

    public void clickOnStartAndStopProgressBarButton() {
        clickOn(startProgressBarButton);
        waitFor(4900).milliseconds();
        clickOn(startProgressBarButton);
    }

    public boolean verifyIfProgressBarProcentIsCorrect() {
        return progressBarField.getText().equals("50%");
    }


    public void clickOnToolTipsButton(){
        clickOn(toolTipsButton);
    }

    public void hoverOverHoverMeButton(){
        withAction().moveToElement(hoverMeButton).build().perform();
        waitFor(5).seconds();
        System.out.println(element(By.cssSelector("#buttonToolTip .tooltip-inner")).getText());
    }

    public void hoverOverHoverMeTextField(){
        withAction().moveToElement(hoverMeTextField).build().perform();
    }

    public void clickOnMenuButton(){
        clickOn(menuButton);
    }

    public void clickOnMainItem1Text(){
        clickOn(mainItem1Text);
    }

    public void clickOnMainItem2Text(){
        clickOn(mainItem2Text);
    }

    public void clickOnSubSubListText(){
        clickOn(subSubListText);
    }

    public void clickOnSubSubItem1Text(){
        clickOn(subSubItem1Text);
    }

    public boolean verifyIfMainItem1IsClickable(){
        return mainItem1Text.isClickable();
    }

    public boolean verifyIfMainItem2IsClickable(){
        return mainItem2Text.isClickable();
    }

    public boolean verifyIfSubSubListIsClickable(){
        return subSubListText.isClickable();
    }

    public boolean verifyIfSubSubItem1IsClickable(){
        return subSubItem1Text.isClickable();
    }

    public void clickOnSelectMenuButton(){
        clickOn(selectMenuButton);
    }

    public void selectValueFromFirstDropdown(){
        firstDropdownValue.selectByVisibleText("Group 1, option 1");
    }

    public void selectTitleFromTitleDropdown(){
        titleDropdown.selectByVisibleText("Mrs.");
    }

    public void selectColorFromOldStyleSelectDropdown(){
        oldStyleSelectDropdown.selectByValue("5");
    }

    public void selectFromMultiselectDropdown(){
        multiselectDropdown.sendKeys(Keys.chord("Black"));
        multiselectDropdown.sendKeys(Keys.ENTER);
    }

    public void selectFromCarsSelector(){
        carsSelect.selectByValue("Audi");
    }




}
