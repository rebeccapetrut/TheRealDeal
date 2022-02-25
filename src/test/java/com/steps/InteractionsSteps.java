package com.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InteractionsSteps extends BaseSteps {


    @Step
    public void scrollThePageDown(){
        interactionsPage.scrollToPageBottom();
    }

    @Step
    public void clickOnInteractionsButton(){
        interactionsPage.clickOnInteractionsButton();
    }

    @Step
    public void clickOnSortableButton(){
        interactionsPage.clickOnSortableButton();
    }

    @Step
    public void switchBetweenTheFirstAndSecondNumbers(){
        interactionsPage.switchBetweenTheFirstAndSecondNumbers();
    }

    @Step
    public void verifyIfTheFirstTwoNumbersWereSwitched(String first, String second){
        Assert.assertTrue(interactionsPage.verifyIfTheFirstTwoNumbersWereSwitched(first, second));
    }

    @Step
    public void rearrangeNumbersFromList(){
        interactionsPage.rearrangeNumbersFromList();
    }

    @Step
    public void clickOnSelectableButton(){
        interactionsPage.clickOnSelectableButton();
    }

    @Step
    public void clickOnFirstSelectableField(){
        interactionsPage.clickOnFirstSelectableField();
    }

    @Step
    public void clickOnResizableButton(){
        interactionsPage.clickOnResizableButton();
    }

    @Step
    public void resizeTheFirstFieldWithRestrictions(){
        interactionsPage.resizeTheFirstFieldWithRestrictions();
    }

}


