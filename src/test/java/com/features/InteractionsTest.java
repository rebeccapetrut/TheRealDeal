package com.features;

import org.junit.Test;

public class InteractionsTest extends BaseTest {

    //assert
    @Test
    public void switchBetweenTheFirstAndSecondNumbersTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnSortableButton();
//        interactionsSteps.switchBetweenTheFirstAndSecondNumbers();
        interactionsSteps.rearrangeNumbersFromList();
        interactionsSteps.verifyIfTheFirstTwoNumbersWereSwitched("One", "Two");
    }


    //asert
    @Test
    public void clickOnTheFirstSelectableField(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnSelectableButton();
        interactionsSteps.clickOnFirstSelectableField();
    }

    @Test
    public void resizeTheFieldWithRestrictionsTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnResizableButton();
        interactionsSteps.resizeTheFirstFieldWithRestrictions();
    }



}
