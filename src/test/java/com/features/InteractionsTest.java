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

    @Test
    public void dragTheButtonIntoFieldTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDroppableButton();
        interactionsSteps.dragTheButtonIntoField();
        interactionsSteps.verifyIfTheButtonWasDraggedIntoField();
        interactionsSteps.verifyIfTheFieldTextWasModifiedAfterTheButtonWasDropped();
    }

    @Test
    public void dragTheAcceptableButtonIntoFieldTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDroppableButton();
        interactionsSteps.clickOnAcceptButton();
        interactionsSteps.dragTheAcceptableButtonIntoDropHereField();
        interactionsSteps.verifyIfTheTitleWasModifiedAfterDroppingTheAcceptableButton();
    }

    @Test
    public void dragTheNonAcceptableButtonIntoFieldTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDroppableButton();
        interactionsSteps.clickOnAcceptButton();
        interactionsSteps.dragTheNonAcceptableButtonIntoDropHereField();
        interactionsSteps.verifyIfTheTitleWasNotModifiedAfterDroppingTheNonAcceptableButton();
    }

    @Test
    public void dragTheDragMeButtonIntoNotGreedyDropBoxTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDroppableButton();
        interactionsSteps.clickOnPreventPropagationButton();
        interactionsSteps.dragTheDragMeButtonIntoNotGreedyDropBox();
        interactionsSteps.verifyIfTheButtonWasDroppedIntoNotGreedyDropBox();
    }

    @Test
    public void dragTheDragMeButtonIntoNotGreedyInnerDropBoxTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDroppableButton();
        interactionsSteps.clickOnPreventPropagationButton();
        interactionsSteps.dragTheDragMeButtonIntoNotGreedyInnerDropBox();
        interactionsSteps.verifyIfDragMeButtonWasDroppedIntoInnerNotGreedyDropBox();
    }

    //assert
    @Test
    public void dragTheRevertableButtonIntoFieldTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDroppableButton();
        interactionsSteps.clickOnRevertDraggableButton();
        interactionsSteps.dragTheRevertableButtonIntoField();
        interactionsSteps.verifyIfTheTitleIsChangedAfterDroppingTheRevertableButton();
    }

    //assert
    @Test
    public void dragTheNonRevertableButtonIntoFieldTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDroppableButton();
        interactionsSteps.clickOnRevertDraggableButton();
        interactionsSteps.dragTheNonRevertableButtonIntoField();
        interactionsSteps.verifyIfTheTitleIsChangedAfterDroppingTheRevertableButton();
//        interactionsSteps.verifyIfTheNonRevertableButtonIsWorking();
    }

    // assert
    @Test
    public void dragTheDragabbleDragMeButton(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDragabbleButton();
        interactionsSteps.dragTheDragabbleDragMeButton();
    }

    @Test
    public void moveTheOnlyXButton(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDragabbleButton();
        interactionsSteps.clickOnAxisRestrictedButton();
        interactionsSteps.moveTheOnlyXButton();
    }

    //assert
    @Test
    public void moveTheOnlyYButtonTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDragabbleButton();
        interactionsSteps.clickOnAxisRestrictedButton();
        interactionsSteps.moveTheOnlyYButton();
    }

    // assert +offset
    @Test
    public void dragTheBoxInsideTheBoxTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDragabbleButton();
        interactionsSteps.clickOnContainerRestrictedButton();
        interactionsSteps.dragTheBoxInsideTheBox();
    }

    //assert + offset
    @Test
    public void dragTheTextInsideTheBoxTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDragabbleButton();
        interactionsSteps.clickOnContainerRestrictedButton();
        interactionsSteps.dragTheTextInsideTheBox();
    }

    @Test
    public void dragTheCursorCenterButtonTest(){
        interactionsSteps.clickOnInteractionsButton();
        interactionsSteps.scrollThePageDown();
        interactionsSteps.clickOnDragabbleButton();
        interactionsSteps.clickOnCursorStyleButton();
        interactionsSteps.dragTheCursorCenterButton();
    }







}
