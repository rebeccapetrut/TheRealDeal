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



}
