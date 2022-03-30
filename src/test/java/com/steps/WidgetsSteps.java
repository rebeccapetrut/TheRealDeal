package com.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WidgetsSteps extends BaseSteps {

    @Step
    public void clickOnWidgetsButton(){
        widgetsPage.clickOnWidgetsButton();
    }

    @Step
    public void clickOnAccordianButton(){
        widgetsPage.clickOnAccordianButton();
    }

    @Step
    public void clickOnFirstTextTitle(){
        widgetsPage.clickOnFirstTextTitle();
    }

    @Step
    public void verifyIfFirstTextIsDisplayed(String text){
        widgetsPage.verifyIfFirstTextIsDisplayed(text);
    }

    @Step
    public void scrollThePageDown(){
        widgetsPage.scrollToPageBottom();
    }

    @Step
    public void clickOnSecondTextTitle(){
        widgetsPage.clickOnSecondTextTitle();
    }

    @Step
    public void verifyIfSecondTextIsDisplayed(){
        widgetsPage.verifyIfSecondTextIsDisplayed();
    }

    @Step
    public void clickOnThirdTextTest(){
        widgetsPage.clickOnThirdTextTitle();
    }

    @Step
    public void verifyIfThirdTextIsDisplayed(){
        widgetsPage.verifyIfThirdTextIsDisplayed();
    }

    @Step
    public void clickOnAutoCompleteButton(){
        widgetsPage.clickOnAutoCompleteButton();
    }

    @Step
    public void setMultipleInputColorField(){
        widgetsPage.setMultipleInputColorField();
    }

    @Step
    public void verifyIfColorWasAdded(String color){
        Assert.assertTrue(widgetsPage.verifyIfColorWasAdded(color));
    }

    @Step
    public void deleteFromMultipleColorField(String color){
        widgetsPage.deleteFromMultipleColorField(color);
    }

    @Step
    public void setSingleInputColorField(){
        widgetsPage.setSingleInputColorField();
    }

    @Step
    public void verifyIfOneColorWasAdded(String color){
        Assert.assertTrue("The color does not exist", widgetsPage.verifyIfOneColorWasAdded(color));
    }

    @Step
    public void clearTheSingleColorField(){
        widgetsPage.clearTheSingleColorField();
    }

    @Step
    public void verifyIfTheSingleColorFieldIsClear(){
        widgetsPage.verifyIfTheSingleColorFieldIsClear();
    }

    @Step
    public void clickOnSliderButton(){
        widgetsPage.clickOnSliderButton();
    }

    @Step
    public void slideTheSlider(int sliderValue){
        widgetsPage.slideTheSlider(sliderValue);
    }

    @Step
    public void hooverOverTheSliderButton(){
        widgetsPage.hooverOverTheSliderButton();
    }

    @Step
    public void verifyIfTheSliderMovesLikeJagger(){
        Assert.assertTrue(widgetsPage.verifyIfTheSliderMovesLikeJagger());
    }

    @Step
    public void clickOnProgressBarButton(){
        widgetsPage.clickOnProgressBarButton();
    }

    @Step
    public void clickOnStartProgressBarButton(){
        widgetsPage.clickOnStartProgressBarButton();
    }

    @Step
    public void verifyIfProgressBarIsCompleted(){
        Assert.assertTrue(widgetsPage.verifyIfProgressBarIsCompleted());
    }

    @Step
    public void clickOnStartAndStopProgressBarButton(){
        widgetsPage.clickOnStartAndStopProgressBarButton();
    }
    @Step
    public void verifyIfProgressBarProcentIsCorrect(){
        Assert.assertTrue(widgetsPage.verifyIfProgressBarProcentIsCorrect());
    }

    @Step
    public void clickOnToolTipsButton(){
        widgetsPage.clickOnToolTipsButton();
    }

    @Step
    public void hoverOverHoverMeButton(){
        widgetsPage.hoverOverHoverMeButton();
    }

    @Step
    public void hoverOverHoverMeTextField(){
        widgetsPage.hoverOverHoverMeTextField();
    }

    @Step
    public void clickOnMenuButton(){
        widgetsPage.clickOnMenuButton();
    }

    @Step
    public void clickOnMainItem1Text(){
        widgetsPage.clickOnMainItem1Text();
    }

    @Step
    public void clickOnMainItem2Text(){
        widgetsPage.clickOnMainItem2Text();
    }

    @Step
    public void clickOnSubSubListText(){
        widgetsPage.clickOnSubSubListText();
    }

    @Step
    public void clickOnSubSubItem1Text(){
        widgetsPage.clickOnSubSubItem1Text();
    }

    @Step
    public void verifyIfMainItem1IsClickable(){
        Assert.assertTrue(widgetsPage.verifyIfMainItem1IsClickable());
    }

    @Step
    public void verifyIfMainItem2IsClickable(){
        Assert.assertTrue(widgetsPage.verifyIfMainItem2IsClickable());
    }

    @Step
    public void verifyIfSubSubListIsClickable(){
        Assert.assertTrue(widgetsPage.verifyIfSubSubListIsClickable());
    }

    @Step
    public void verifyIfSubSubItem1IsClickable(){
        Assert.assertTrue(widgetsPage.verifyIfSubSubItem1IsClickable());
    }

    @Step
    public void clickOnSelectMenuButton(){
        widgetsPage.clickOnSelectMenuButton();
    }

    @Step
    public void setTheFirstDropDownValue(String value){
        widgetsPage.setTheFirstDropDownValue(value);
    }

    @Step
    public void setTheTitleDropdown(String titleValue){
        widgetsPage.setTheTitleDropdown(titleValue);
    }

    @Step
    public void selectColorFromOldStyleSelectDropdown(){
        widgetsPage.selectColorFromOldStyleSelectDropdown();
    }

    @Step
    public void selectFromMultiselectDropdown(){
        widgetsPage.selectFromMultiselectDropdown();
    }

    @Step
    public void selectFromCarsSelector(){
        widgetsPage.selectFromCarsSelector();
    }

    @Step
    public void clickOnDatePickerButton(){
        widgetsPage.clickOnDatePickerButton();
    }

    @Step
    public void clickOnDateFirstField(){
        widgetsPage.clickOnDateFirstField();
    }

    @Step
    public void setMonthFromFirstField(){
        widgetsPage.setMonthFromFirstField();
    }

    @Step
    public void setYearFromFirstField(){
        widgetsPage.setYearFromFirstField();
    }

    @Step
    public void clickOnDateAndTimeSelector(){
        widgetsPage.clickOnDateAndTimeSelector();
    }

    @Step
    public void getTheMonthSet(String month){
        widgetsPage.getTheMonthSet(month);
    }

    @Step
    public void getTheYearSet(String year){
        widgetsPage.getTheYearSet(year);
    }

    @Step
    public void getTheHourSet(String hour){
        widgetsPage.getTheHourSet(hour);
    }

    @Step
    public void clickOnMonthDropdownButton(){
        widgetsPage.clickOnMonthDropdownButton();
    }

    @Step
    public void clickOnYearDropDownButton(){
        widgetsPage.clickOnYearDropDownButton();
    }

    @Step
    public void setDateFromFirstField(int date){
        widgetsPage.setDateFromFirstField(date);
    }

    @Step
    public void verifyIfTheDateIsCorrect(String birthDate){
        Assert.assertEquals(birthDate, widgetsPage.verifyIfTheDateIsCorrect());
    }






}
