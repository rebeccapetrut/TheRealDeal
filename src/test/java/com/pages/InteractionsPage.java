package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

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

    @FindBy(css = "#resizable span")
    private WebElementFacade resizableWithoutRestrictionsButton;



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

//    public boolean verifyIfTheFieldIsSelected(){
//        return firstSelectableField.
//    }

    public void clickOnResizableButton(){
        clickOn(resizableButton);
    }

    public void resizeTheFirstFieldWithRestrictions(){
        withAction().clickAndHold(resizableWithRestrictionsButton).build().perform();
        withAction().moveToElement(resizableWithRestrictionsButton).moveByOffset(445,252).release().build().perform();
    }





}
