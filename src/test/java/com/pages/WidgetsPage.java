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

    @FindBy(css = "#autoCompleteSingleContainer .auto-complete__value-container")
    private WebElementFacade singleColorName;

    @FindBy(css = ".element-list.collapse.show li:nth-child(4)")
    private WebElementFacade sliderButton;

    @FindBy(css = ".range-slider")
    private WebElementFacade sliderField;

    @FindBy(id = "sliderValue")
    private WebElementFacade sliderValueField;

    @FindBy(css = ".range-slider__tooltip__label")
    private WebElementFacade sliderPercentage;

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

    @FindBy(css = "#withOptGroup svg")
    private WebElementFacade firstDropdownValue;

    @FindBy(css = "div[id*='option']")
    private List<WebElementFacade> firstDropDownValueList;

    @FindBy(css = "#selectMenuContainer > div:nth-child(4) .css-1hwfws3")
    private WebElementFacade titleDropdown;

    @FindBy(css = "div[id*='option']")
    private List<WebElementFacade> titleDropdownList;

    @FindBy(id = "oldSelectMenu")
    private WebElementFacade oldStyleSelectDropdown;

    @FindBy(css = "#selectMenuContainer div:nth-child(7) input")
    private WebElementFacade multiselectDropdown;

    @FindBy(id = "cars")
    private WebElementFacade carsSelect;

    @FindBy(css = ".element-list.collapse.show li:nth-child(3)")
    private WebElementFacade datePickerButton;

    @FindBy(id = "datePickerMonthYearInput")
    private WebElementFacade dateFirstSelector;

    @FindBy(css = ".react-datepicker__month-select")
    private WebElementFacade monthSelectButton;

    @FindBy(css = ".react-datepicker__year-select")
    private WebElementFacade yearSelectButton;

    @FindBy(css = "[role='option']")
    private List<WebElementFacade> daySelectList;

    @FindBy(css = ".react-datepicker__time-list-item")
    private List<WebElementFacade> hoursList;

    @FindBy(css = ".react-datepicker__year-option")
    private List<WebElementFacade> yearsList;

    @FindBy(css = ".react-datepicker__month-option")
    private List<WebElementFacade> monthsList;

    @FindBy(id = "dateAndTimePickerInput")
    private WebElementFacade dateAndTimeSelector;

    @FindBy(css = ".react-datepicker__month-read-view--down-arrow")
    private WebElementFacade monthDropdownButton;

    @FindBy(css = ".react-datepicker__year-read-view--down-arrow")
    private WebElementFacade yearDropdownButton;







    public void clickOnWidgetsButton(){
        clickOn(widgetsButton);
    }

    public void clickOnAccordianButton(){
        clickOn(accordianButton);
    }

    public void clickOnFirstTextTitle(){
        withAction().doubleClick(firstTextTitle);
    }

    public void verifyIfFirstTextIsDisplayed(String text){
        firstTextVerification.shouldContainText(text);
//        firstTextVerification.getText().startsWith("Lorem Ipsum is simply dummy text");
//        firstTextVerification.getText().endsWith("Aldus PageMaker including versions of Lorem Ipsum.");
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


    public boolean verifyIfColorWasAdded(String color){
        for(WebElement element : colorNameBoxList){
            if (element.getText().equalsIgnoreCase(color))
            return true;
        }
        return false;
    }

    public void deleteFromMultipleColorField(String color){
        for(WebElement element : colorNameBoxList){
            element.findElement(By.cssSelector(".css-12jo7m5")).getText().equalsIgnoreCase(color);
            element.findElement(By.cssSelector(".css-xb97g8 svg")).click();
            break;
        }
        waitFor(2).seconds();
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
       singleInputColorField.sendKeys(Keys.SPACE);
       singleColorName.clear();
    }

    public void verifyIfTheSingleColorFieldIsClear(){
        singleColorName.shouldNotBeVisible();
    }

    public void clickOnSliderButton(){
        clickOn(sliderButton);
    }

    public void slideTheSlider(int sliderValue) {
        for (int i = 25; i < sliderValue; i++) {
            sliderField.sendKeys(Keys.ARROW_RIGHT);
        }
        for (int y = 25; y > sliderValue; y--){
            sliderField.sendKeys(Keys.ARROW_LEFT);
        }

//        for (int i = 0; i < Math.abs(25 - sliderValue); i++) {
//            if (sliderValue > 25) sliderField.sendKeys(Keys.ARROW_RIGHT);
//            else sliderField.sendKeys(Keys.ARROW_LEFT);
//        }
    }

    public void hooverOverTheSliderButton(){
        withAction().moveToElement(sliderField).build().perform();
        waitFor(3).seconds();
    }

    public boolean verifyIfTheSliderMovesLikeJagger(){
        return sliderPercentage.getText().equals(sliderValueField.getValue());
    }

    public void clickOnProgressBarButton(){
        clickOn(progressBarButton);
    }

    public void clickOnStartProgressBarButton(){
        clickOn(startProgressBarButton);
        waitFor(10).seconds();
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

    public void setTheFirstDropDownValue(String value) {
        clickOn(firstDropdownValue);
//        find(By.xpath("//div[text()='" + value + "']")).click();
//        List<WebElementFacade> dropDownList = findAll(By.cssSelector("div[id*='option']"));
        for (WebElement element : firstDropDownValueList) {
            if (element.getText().equalsIgnoreCase(value)) {
                clickOn(element);
                break;
            }
        }
    }

    public void setTheTitleDropdown(String titleValue) {
        clickOn(titleDropdown);
        find(By.xpath("//div[text()='" + titleValue + "']")).click();
//        for (WebElement element : titleDropdownList) {
//            if (element.getText().equalsIgnoreCase(titleValue)){
//                clickOn(element);
//                break;
//            }
//        }
    }

    public void selectColorFromOldStyleSelectDropdown(){
        oldStyleSelectDropdown.selectByValue("5");
    }

    public void selectFromMultiselectDropdown(){
        multiselectDropdown.sendKeys(Keys.chord("Black"));
        multiselectDropdown.sendKeys(Keys.ENTER);
        multiselectDropdown.sendKeys(Keys.chord("Red"));
        multiselectDropdown.sendKeys(Keys.ENTER);
    }

    public void selectFromCarsSelector(){
        carsSelect.selectByValue("audi");
        waitFor(3).seconds();
    }

    public void clickOnDatePickerButton(){
        clickOn(datePickerButton);
    }

    public void clickOnDateFirstField(){
        clickOn(dateFirstSelector);
    }

    public void setMonthFromFirstField(){
        monthSelectButton.selectByValue("6");
    }

    public void setYearFromFirstField(){
        yearSelectButton.selectByValue("1997");
    }

    // da click pe zi
    public void setDateFromFirstField(int date){
        System.out.println(daySelectList.size());
//        find(By.xpath("//div[@role='"+ date + "']")).click();
        for(WebElement element : daySelectList){
            if(element.getText().equals(date+"")){
                clickOn(element);
                waitFor(2).seconds();
                break;
            }
        }
    }

    public String verifyIfTheDateIsCorrect(){
        return dateFirstSelector.getValue();

//        return dateFirstSelector.getText().equals("7/15/1997");
    }

    public void clickOnDateAndTimeSelector(){
        clickOn(dateAndTimeSelector);
    }

    public boolean getTheMonthSet(String month) {
        for (WebElement element : monthsList) {
            if (element.getText().equals(month)) {
                clickOn(element);
                return true;
            }
        }
        return false;
    }

    public boolean getTheYearSet(String year){
        for(WebElement element : yearsList){
            if(element.getText().equals(year)){
                clickOn(element);
                return true;
            }
        }
        return false;
    }

    public boolean getTheHourSet(String hour) {
        for (WebElement element : hoursList) {
            if (element.getText().equals(hour)) {
                clickOn(element);
                return true;
            }
        }
        return false;
    }

    public void clickOnMonthDropdownButton(){
        clickOn(monthDropdownButton);
    }

    public void clickOnYearDropDownButton(){
        clickOn(yearDropdownButton);
    }





}
