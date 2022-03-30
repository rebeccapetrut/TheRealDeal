package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class InteractionsPage extends BasePage {

    @FindBy(css = ".card.mt-4.top-card:nth-child(5)")
    private WebElementFacade interactionsButton;

    @FindBy(css = ".element-list.collapse.show li:first-child")
    private WebElementFacade sortableButton;

    @FindBy(css = ".vertical-list-container :first-child")
    private WebElementFacade fieldOneFromList;

    @FindBy(css = ".vertical-list-container :nth-child(2)")
    private WebElementFacade fieldTwoFromList;

    @FindBy(css = ".vertical-list-container .list-group-item")
    private List<WebElementFacade> listOfNumbers;

    @FindBy(css = ".element-list.collapse.show li:nth-child(2)")
    private WebElementFacade selectableButton;

    @FindBy(css = "#verticalListContainer :first-child")
    private WebElementFacade firstSelectableField;

    @FindBy(css = ".element-list.collapse.show li:nth-child(3)")
    private WebElementFacade resizableButton;

    @FindBy(css = "#resizableBoxWithRestriction span")
    private WebElementFacade resizableWithRestrictionsButton;

    @FindBy(css = ".top-content")
    private WebElementFacade restrictedField;

    @FindBy(css = "#resizable span")
    private WebElementFacade resizableWithoutRestrictionsButton;

    @FindBy(css = ".element-list.collapse.show li:nth-child(4)")
    private WebElementFacade droppableButton;

    @FindBy(css = "#simpleDropContainer :first-child")
    private WebElementFacade dragMeButton;

    @FindBy(css = "#simpleDropContainer :nth-child(2)")
    private WebElementFacade dropHereField;

    @FindBy(css = "#simpleDropContainer :nth-child(2) p")
    private WebElementFacade dropHereFieldTitle;

    @FindBy(id = "droppableExample-tab-accept")
    private WebElementFacade acceptButton;

    @FindBy(id = "droppableExample-tab-preventPropogation")
    private WebElementFacade preventPropogationButton;

    @FindBy(id= "droppableExample-tab-revertable")
    private WebElementFacade revertDraggableButton;

    @FindBy(css = "#acceptDropContainer #droppable")
    private WebElementFacade acceptDropHereField;

    @FindBy(css = "#acceptDropContainer #acceptable")
    private WebElementFacade acceptableButton;

    @FindBy(css = "#acceptDropContainer #notAcceptable")
    private WebElementFacade notAcceptableButton;

    @FindBy(css = "#acceptDropContainer #droppable p")
    private WebElementFacade acceptDropHereFieldTitle;

    @FindBy(id = "notGreedyDropBox")
    private WebElementFacade notGreedyDropBox;

    @FindBy(css = "#notGreedyDropBox > p")
    private WebElementFacade notGreedyDropBoxTitle;

    @FindBy(id = "notGreedyInnerDropBox")
    private WebElementFacade notGreedyInnerDropBox;

    @FindBy(css = "#notGreedyInnerDropBox > p")
    private WebElementFacade notGreedyInnerDropBoxTitle;

    @FindBy(id = "dragBox")
    private WebElementFacade dragBoxButton;

    @FindBy(css = "#revertableDropContainer #droppable")
    private WebElementFacade revertDropHereField;

    @FindBy(id = "revertable")
    private WebElementFacade revertableButton;

    @FindBy(id = "notRevertable")
    private WebElementFacade nonRevertableButton;

    @FindBy(css = "#revertableDropContainer #droppable p")
    private WebElementFacade revertDropHereFieldTitle;

    @FindBy(css = ".element-list.collapse.show li:nth-child(5)")
    private WebElementFacade dragabbleButton;

    @FindBy(id = "dragBox")
    private WebElementFacade dragabbleDragMeButton;

    @FindBy(id = "draggableExample-tab-axisRestriction")
    private WebElementFacade axisRestrictedButton;

    @FindBy(id = "restrictedX")
    private WebElementFacade restrictedXButton;

    @FindBy(id = "restrictedY")
    private WebElementFacade restrictedYButton;

    @FindBy(id = "draggableExample-tab-containerRestriction")
    private WebElementFacade containerRestrictedButton;

    @FindBy(css = ".containment-wrapper >div")
    private WebElementFacade boxInsideTheBox;

    @FindBy(css = ".ui-widget-header")
    private WebElementFacade textInsideTheBox;

    @FindBy(id = "draggableExample-tab-cursorStyle")
    private WebElementFacade cursorStyleButton;

    @FindBy(id = "cursorCenter")
    private WebElementFacade cursorCenterButton;

    @FindBy(id = "cursorTopLeft")
    private WebElementFacade cursorTopLeftButton;

    @FindBy(id = "cursorBottom")
    private WebElementFacade cursorBottomButton;



    public void clickOnInteractionsButton(){
        clickOn(interactionsButton);
    }

    public void clickOnSortableButton(){
        clickOn(sortableButton);
    }

    public void switchBetweenTheFirstAndSecondNumbers(){
        withAction().clickAndHold(fieldOneFromList).moveToElement(fieldTwoFromList).release().build().perform();
        waitFor(3).seconds();
    }

    public boolean verifyIfTheFirstTwoNumbersWereSwitched(String first, String second){
        return fieldOneFromList.getText().equals(second) && fieldTwoFromList.getText().equals(first);
    }

    public void rearrangeNumbersFromList(){
        System.out.println(listOfNumbers.get(0).getText());
        withAction().clickAndHold(listOfNumbers.get(3)).moveToElement(listOfNumbers.get(1)).release().build().perform();
    }

    public void clickOnSelectableButton(){
        clickOn(selectableButton);
    }

    public void clickOnFirstSelectableField(){
        clickOn(firstSelectableField);
    }

    public void clickOnResizableButton(){
        clickOn(resizableButton);
    }

    public void resizeTheFirstFieldWithRestrictions(){
        withAction().clickAndHold(resizableWithRestrictionsButton).build().perform();
        withAction().moveToElement(resizableWithRestrictionsButton).moveByOffset(250,-150).release().build().perform();
//        withAction().dragAndDrop(resizableWithRestrictionsButton, restrictedField).build().perform();
        System.out.println(restrictedField.getSize().getWidth());
        System.out.println(restrictedField.getSize().getHeight());
        waitFor(3).seconds();

    }

    public void clickOnDroppableButton(){
        clickOn(droppableButton);
    }

    public void dragTheButtonIntoField(){
        withAction().moveToElement(dragMeButton).clickAndHold(dragMeButton).build().perform();
        withAction().dragAndDrop(dragMeButton, dropHereField).release().perform();
    }

    public boolean verifyIfTheButtonWasDraggedIntoField(){
       return dropHereField.containsElements(By.cssSelector("#simpleDropContainer :first-child"));
    }

    public boolean verifyIfTheButtonWasDropped(){
        return (dropHereFieldTitle.containsOnlyText("Dropped!"));
    }

    public void clickOnAcceptButton(){
        acceptButton.click();
    }

    public void dragTheAcceptableButtonIntoDropHereField(){
        withAction().clickAndHold().build().perform();
        withAction().moveToElement(acceptDropHereField).release().build().perform();
    }

    public void dragTheNonAcceptableButtonIntoDropHereField(){
        withAction().clickAndHold(notAcceptableButton).build().perform();
        withAction().moveToElement(acceptDropHereField).release().build().perform();
    }

    public boolean verifyIfTheTitleWasModifiedAfterDroppingTheAcceptableButton(){
        return acceptDropHereFieldTitle.containsOnlyText("Dropped!");
    }

    public boolean verifyIfTheTitleWasNotModifiedAfterDroppingTheNonAcceptableButton(){
        return acceptDropHereFieldTitle.containsOnlyText("Drop here");
    }

    public void clickOnPreventPropagationButton(){
        clickOn(preventPropogationButton);
    }

    public void dragTheDragMeButtonIntoNotGreedyDropBox(){
        withAction().clickAndHold(dragBoxButton).build().perform();
        withAction().moveToElement(notGreedyDropBoxTitle).release().build().perform();
    }

    public void dragTheDragMeButtonIntoNotGreedyInnerDropBox(){
        withAction().clickAndHold(dragBoxButton).build().perform();
        withAction().moveToElement(notGreedyInnerDropBox).release().build().perform();
    }

    public boolean verifyIfTheButtonWasDroppedIntoNotGreedyDropBox(){
        return notGreedyDropBoxTitle.containsOnlyText("Dropped!");
    }

    public boolean verifyIfDragMeButtonWasDroppedIntoInnerNotGreedyDropBox(){
        return notGreedyInnerDropBoxTitle.containsOnlyText("Dropped!");
    }

    public void clickOnRevertDraggableButton(){
        clickOn(revertDraggableButton);
    }

    public void dragTheRevertableButtonIntoField(){
        withAction().clickAndHold(revertableButton).build().perform();
        withAction().moveToElement(revertDropHereField).release().build().perform();
    }

    public void dragTheNonRevertableButtonIntoField(){
        withAction().clickAndHold(nonRevertableButton).build().perform();
        withAction().moveToElement(revertDropHereField).release().build().perform();
    }

    public boolean verifyIfTheTitleIsChangedAfterDroppingTheRevertableButton(){
        return revertDropHereFieldTitle.containsOnlyText("Dropped!");
    }

    // ?
    public boolean verifyIfTheNonRevertableButtonIsWorking(){
        return revertDropHereField.findElement(By.id("notRevertable")).isDisplayed();
    }

    public void clickOnDragabbleButton(){
        clickOn(dragabbleButton);
    }

    // off set + assert
    public void dragTheDragabbleDragMeButton(){
        withAction().clickAndHold(dragabbleDragMeButton).build().perform();
        withAction().moveByOffset(400, -150).release().build().perform();
        waitFor(2).seconds();
    }

    public void clickOnAxisRestrictedButton(){
        clickOn(axisRestrictedButton);
    }

    public void moveTheOnlyXButton(){
        withAction().clickAndHold(restrictedXButton).moveByOffset( 400, 0).build().perform();
        waitFor(2).seconds();
    }

    public void moveTheOnlyYButton(){
        withAction().clickAndHold(restrictedYButton).moveByOffset( 0, -200).build().perform();
        waitFor(2).seconds();
    }

    public void clickOnContainerRestrictedButton(){
        clickOn(containerRestrictedButton);
    }

    public void dragTheBoxInsideTheBox(){
        withAction().dragAndDropBy(boxInsideTheBox, 400, -200).build().perform();
    }

    public void dragTheTextInsideTheBox(){
        withAction().dragAndDropBy(textInsideTheBox, 400, -400).build().perform();
    }

    public void clickOnCursorStyleButton(){
        clickOn(cursorStyleButton);
    }

    public void dragTheCursorCenterButton(){
        withAction().dragAndDropBy(cursorCenterButton, 200, -200).build().perform();
        waitFor(2).seconds();
    }











}
