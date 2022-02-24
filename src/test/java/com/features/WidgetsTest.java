package com.features;

import org.junit.Test;

public class WidgetsTest extends BaseTest {

    @Test
    public void clickOnFirstTextTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAccordianButton();
        widgetsSteps.clickOnFirstTextTitle();
        widgetsSteps.verifyIfFirstTextIsDisplayed();
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

    // assert
    @Test
    public void setMultipleInputColorFieldTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnAutoCompleteButton();
        widgetsSteps.setMultipleInputColorField();
        widgetsSteps.verifyIfColorWasAdded("red");
    }

    // le sterge pe toate, nu doar una
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


    // selector slider
    @Test
    public void slideTheSliderTest(){
        widgetsSteps.clickOnWidgetsButton();
        widgetsSteps.scrollThePageDown();
        widgetsSteps.clickOnSliderButton();
        widgetsSteps.slideTheSlider();

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
        widgetsSteps.selectValueFromFirstDropdown();
        widgetsSteps.selectTitleFromTitleDropdown();
        widgetsSteps.selectColorFromOldStyleSelectDropdown();
        widgetsSteps.selectFromMultiselectDropdown();
        widgetsSteps.selectFromCarsSelector();
    }


}
