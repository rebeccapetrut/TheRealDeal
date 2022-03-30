package com.features;


import org.junit.Test;
import org.w3c.dom.Document;

import static com.pages.BasePage.convertXMLFileToXMLDoc;


public class WidgetsTest extends BaseTest {

    // xml file
    @Test
    public void clickOnFirstTextTest(){
        String inputXMLFile = "/Users/petrutrebecca/Desktop/TheRealDeal/texts.xml";
        Document xmlDoc = convertXMLFileToXMLDoc( inputXMLFile );
        String text = xmlDoc.getFirstChild().getTextContent();

        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAccordianButton();
        widgetsSteps.clickOnFirstTextTitle();
        widgetsSteps.verifyIfFirstTextIsDisplayed(text);
    }

    @Test
    public void clickOnSecondTextTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAccordianButton();
        widgetsSteps.clickOnSecondTextTitle();
        widgetsSteps.verifyIfSecondTextIsDisplayed();
    }

    @Test
    public void clickOnThirdTextTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAccordianButton();
        widgetsSteps.clickOnThirdTextTest();
        widgetsSteps.verifyIfThirdTextIsDisplayed();
    }


    @Test
    public void setMultipleInputColorFieldTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAutoCompleteButton();
        widgetsSteps.setMultipleInputColorField();
        widgetsSteps.verifyIfColorWasAdded("yellow");
    }


    @Test
    public void deleteAColorFromMultipleInputColorFieldTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAutoCompleteButton();
        widgetsSteps.setMultipleInputColorField();
        widgetsSteps.verifyIfColorWasAdded("Black");
        widgetsSteps.deleteFromMultipleColorField("Yellow");
    }

    @Test
    public void setOneColorFieldTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAutoCompleteButton();
        widgetsSteps.setSingleInputColorField();
        widgetsSteps.verifyIfOneColorWasAdded("blue");
    }

    // delete the color field
    @Test
    public void deleteOneColorFieldTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAutoCompleteButton();
        widgetsSteps.setSingleInputColorField();
        widgetsSteps.verifyIfOneColorWasAdded("blue");
        widgetsSteps.clearTheSingleColorField();
        widgetsSteps.verifyIfTheSingleColorFieldIsClear();
    }


    @Test
    public void slideTheSliderTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnSliderButton();
        widgetsSteps.slideTheSlider(0);
        widgetsSteps.hooverOverTheSliderButton();
        widgetsSteps.verifyIfTheSliderMovesLikeJagger();

    }


    @Test
    public void setTheProgressBarTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnProgressBarButton();
        widgetsSteps.clickOnStartProgressBarButton();
        widgetsSteps.verifyIfProgressBarIsCompleted();
    }


    @Test
    public void startAndStopTheProgressBarTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnProgressBarButton();
        widgetsSteps.clickOnStartAndStopProgressBarButton();
        widgetsSteps.verifyIfProgressBarProcentIsCorrect();
    }

    @Test
    public void hoverOverHoverMeButton(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnToolTipsButton();
        widgetsSteps.hoverOverHoverMeButton();
    }

    @Test
    public void hoverOverHoverMeTextField(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnToolTipsButton();
        widgetsSteps.hoverOverHoverMeTextField();
    }

    @Test
    public void clickOnMainItem1Test(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnMenuButton();
        widgetsSteps.clickOnMainItem1Text();
        widgetsSteps.verifyIfMainItem1IsClickable();
    }

    @Test
    public void clickOnMainItem2Test() {
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnMenuButton();
        widgetsSteps.clickOnMainItem2Text();
        widgetsSteps.verifyIfMainItem2IsClickable();
        widgetsSteps.clickOnSubSubListText();
        widgetsSteps.verifyIfSubSubListIsClickable();
        widgetsSteps.clickOnSubSubItem1Text();
        widgetsSteps.verifyIfSubSubItem1IsClickable();
    }

    @Test
    public void selectValuesFromMenuTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnSelectMenuButton();
        widgetsSteps.setTheFirstDropDownValue("Group 2, option 1");
        widgetsSteps.setTheTitleDropdown("Mrs.");
        widgetsSteps.selectColorFromOldStyleSelectDropdown();
        widgetsSteps.selectFromMultiselectDropdown();
        widgetsSteps.selectFromCarsSelector();
    }

    // int/string
    @Test
    public void setDateFromFirstField(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnDatePickerButton();
        widgetsSteps.clickOnDateFirstField();
        widgetsSteps.setMonthFromFirstField();
        widgetsSteps.setYearFromFirstField();
        widgetsSteps.setDateFromFirstField(15);
        widgetsSteps.verifyIfTheDateIsCorrect("07/15/1997");
    }

    //time
    @Test
    public void setDateFromTheSecondField() {
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnDatePickerButton();
        widgetsSteps.clickOnDateAndTimeSelector();
        widgetsSteps.clickOnMonthDropdownButton();
        widgetsSteps.getTheMonthSet("July");
        widgetsSteps.clickOnYearDropDownButton();
        widgetsSteps.getTheYearSet("2020");
        widgetsSteps.setDateFromFirstField(15);
        widgetsSteps.getTheHourSet("17:00");
        widgetsSteps.verifyIfTheDateIsCorrect("07/15/1997");

    }



}
