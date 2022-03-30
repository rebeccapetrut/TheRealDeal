package com.steps;

import io.cucumber.java.bs.A;
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

    @Step
    public void clickOnDroppableButton(){
        interactionsPage.clickOnDroppableButton();
    }

    @Step
    public void dragTheButtonIntoField(){
        interactionsPage.dragTheButtonIntoField();
    }

    @Step
    public void verifyIfTheButtonWasDraggedIntoField(){
        interactionsPage.verifyIfTheButtonWasDraggedIntoField();
    }

    @Step
    public void verifyIfTheFieldTextWasModifiedAfterTheButtonWasDropped(){
        Assert.assertTrue(interactionsPage.verifyIfTheButtonWasDropped());
    }

    @Step
    public void clickOnAcceptButton(){
        interactionsPage.clickOnAcceptButton();
    }

    @Step
    public void dragTheAcceptableButtonIntoDropHereField(){
        interactionsPage.dragTheAcceptableButtonIntoDropHereField();
    }

    @Step
    public void dragTheNonAcceptableButtonIntoDropHereField(){
        interactionsPage.dragTheNonAcceptableButtonIntoDropHereField();
    }

    @Step
    public void verifyIfTheTitleWasModifiedAfterDroppingTheAcceptableButton(){
        Assert.assertTrue(interactionsPage.verifyIfTheTitleWasModifiedAfterDroppingTheAcceptableButton());
    }

    @Step
    public void verifyIfTheTitleWasNotModifiedAfterDroppingTheNonAcceptableButton(){
        Assert.assertTrue(interactionsPage.verifyIfTheTitleWasNotModifiedAfterDroppingTheNonAcceptableButton());
    }

    @Step
    public void clickOnPreventPropagationButton(){
        interactionsPage.clickOnPreventPropagationButton();
    }

    @Step
    public void dragTheDragMeButtonIntoNotGreedyDropBox(){
        interactionsPage.dragTheDragMeButtonIntoNotGreedyDropBox();
    }

    @Step
    public void dragTheDragMeButtonIntoNotGreedyInnerDropBox(){
        interactionsPage.dragTheDragMeButtonIntoNotGreedyInnerDropBox();
    }

    @Step
    public void verifyIfTheButtonWasDroppedIntoNotGreedyDropBox(){
        Assert.assertTrue(interactionsPage.verifyIfTheButtonWasDroppedIntoNotGreedyDropBox());
    }

    @Step
    public void verifyIfDragMeButtonWasDroppedIntoInnerNotGreedyDropBox(){
        Assert.assertTrue(interactionsPage.verifyIfDragMeButtonWasDroppedIntoInnerNotGreedyDropBox());
    }

    @Step
    public void clickOnRevertDraggableButton(){
        interactionsPage.clickOnRevertDraggableButton();
    }

    @Step
    public void dragTheRevertableButtonIntoField(){
        interactionsPage.dragTheRevertableButtonIntoField();
    }

    @Step
    public void verifyIfTheTitleIsChangedAfterDroppingTheRevertableButton(){
        Assert.assertTrue(interactionsPage.verifyIfTheTitleIsChangedAfterDroppingTheRevertableButton());
    }

    @Step
    public void dragTheNonRevertableButtonIntoField(){
        interactionsPage.dragTheNonRevertableButtonIntoField();
    }

    @Step
    public void verifyIfTheNonRevertableButtonIsWorking(){
        Assert.assertTrue(interactionsPage.verifyIfTheNonRevertableButtonIsWorking());
    }

    @Step
    public void clickOnDragabbleButton(){
        interactionsPage.clickOnDragabbleButton();
    }

    @Step
    public void dragTheDragabbleDragMeButton(){
        interactionsPage.dragTheDragabbleDragMeButton();
    }

    @Step
    public void clickOnAxisRestrictedButton(){
        interactionsPage.clickOnAxisRestrictedButton();
    }

    @Step
    public void moveTheOnlyXButton(){
        interactionsPage.moveTheOnlyXButton();
    }

    @Step
    public void moveTheOnlyYButton(){
        interactionsPage.moveTheOnlyYButton();
    }

    @Step
    public void clickOnContainerRestrictedButton(){
        interactionsPage.clickOnContainerRestrictedButton();
    }

    @Step
    public void dragTheBoxInsideTheBox(){
        interactionsPage.dragTheBoxInsideTheBox();
    }

    @Step
    public void dragTheTextInsideTheBox(){
        interactionsPage.dragTheTextInsideTheBox();
    }

    @Step
    public void clickOnCursorStyleButton(){
        interactionsPage.clickOnCursorStyleButton();
    }

    @Step
    public void dragTheCursorCenterButton(){
        interactionsPage.dragTheCursorCenterButton();
    }









}


