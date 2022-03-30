package com.features;


import org.junit.Test;


public class ElementsTest extends BaseTest {

    @Test
    public void completeTheTextBoxTest() {
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnTextBoxButton();
        elementsSteps.setUserNameField("Rebeca");
        elementsSteps.setEmailField("rebecapetrut@mailinator.com");
        elementsSteps.setAddressField("Home");
        elementsSteps.setPermanentAddressField("Cluj");
        elementsSteps.clickOnSubmitButton();
        elementsSteps.verifyIfVerificationMessageIsPresent();
        elementsSteps.verifyIfDataAreCorrect("Rebeca", "rebecapetrut@mailinator.com", "Home", "Cluj");
    }

    @Test
    public void checkTheHomeCheckboxTest() {
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCheckBoxButton();
        elementsSteps.clickOnExpandButton();
        elementsSteps.clickOnHomeCheckBox();
        elementsSteps.verifyIfHomeCheckboxIsChecked();
    }

    @Test
    public void checkTheDocumentsCheckboxTest() {
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCheckBoxButton();
        elementsSteps.clickOnExpandButton();
        elementsSteps.clickOnDocumentsCheckBox();
        elementsSteps.verifyIfDocumentsCheckboxIsChecked();
    }


    @Test
    public void checkTheYesRadioButtonTest() {
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnRadioButton();
        elementsSteps.clickOnYesRadioButton();
        elementsSteps.verifyIfYesSuccessMessageIsDisplayedCorrectly();
    }

    @Test
    public void checkTheImpressiveRadioButtonTest() {
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnRadioButton();
        elementsSteps.clickOnImpressiveRadioButton();
        elementsSteps.verifyIfImpressiveSuccessMessageIsDisplayedCorrectly();
    }

    @Test
    public void checkThatNoRadioButtonIsDisableTest(){
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnRadioButton();
        elementsSteps.verifyNoRadioButtonIsNotClickable();
    }


    @Test
    public void typeIntoWebTablesTest() {
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnWebTablesButton();
        elementsSteps.clickOnAddButton();
        elementsSteps.setFirstNameField("Rebeca");
        elementsSteps.setLastNameField("Petrut");
        elementsSteps.setEmailField("rebecapetrut@mailinator.com");
        elementsSteps.setAgeField("24");
        elementsSteps.setSalaryField("10");
        elementsSteps.setDepartmentField("Testing");
        elementsSteps.clickOnSubmitWebTablesButton();
        elementsSteps.verifyNewPersonIsAdded("Rebeca");
    }

    // assert
    @Test
    public void modifyFieldFromRecordTest() {
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnWebTablesButton();
        elementsSteps.clickOnAddButton();
        elementsSteps.setFirstNameField("Rebeca");
        elementsSteps.setLastNameField("Petrut");
        elementsSteps.setEmailField("rebecapetrut@mailinator.com");
        elementsSteps.setAgeField("24");
        elementsSteps.setSalaryField("10");
        elementsSteps.setDepartmentField("Testing");
        elementsSteps.clickOnSubmitWebTablesButton();
        elementsSteps.verifyNewPersonIsAdded("Rebeca");
        elementsSteps.editASpecificRecord("Rebeca");
        elementsSteps.clearEditedField();
        elementsSteps.setSalaryField("10000");
        elementsSteps.clickOnSubmitWebTablesButton();
        elementsSteps.verifyIfTheEditWasMade("Rebeca", "10000");
    }


    // assert
    @Test
    public void deleteASpecificRecordTest() {
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnWebTablesButton();
        elementsSteps.clickOnAddButton();
        elementsSteps.setFirstNameField("Rebeca");
        elementsSteps.setLastNameField("Petrut");
        elementsSteps.setEmailField("rebecapetrut@mailinator.com");
        elementsSteps.setAgeField("24");
        elementsSteps.setSalaryField("10");
        elementsSteps.setDepartmentField("Testing");
        elementsSteps.clickOnSubmitWebTablesButton();
        elementsSteps.verifyNewPersonIsAdded("Rebeca");
        elementsSteps.deleteASpecificRecord("Alden");
        elementsSteps.verifyIfRecordWasDeleted("Rebeca");
    }


    @Test
    public void clickOnDoubleClickButtonTest(){
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCloseAddButton();
        elementsSteps.clickOnButtonsButton();
        elementsSteps.clickOnDoubleClickButton();
        elementsSteps.verifyIfDoubleButtonWasPressed();
    }

    @Test
    public void clickOnRightClickButtonTest(){
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCloseAddButton();
        elementsSteps.clickOnButtonsButton();
        elementsSteps.clickOnRightClickButton();
        elementsSteps.verifyIfRightButtonWasPressed();
    }

    @Test
    public void clickOnClickMeButtonTest(){
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCloseAddButton();
        elementsSteps.clickOnButtonsButton();
        elementsSteps.clickOnClickMeButton();
        elementsSteps.verifyIfDynamicButtonWasPressed();
    }

    @Test
    public void clickOnLinksButtonTest(){
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCloseAddButton();
        elementsSteps.clickOnLinksButton();
        elementsSteps.clickOnHomeLinkButton();
        elementsSteps.switchToNewWindow();
        elementsSteps.verifyIfTheNewTabIsOpened();
    }

    @Test
    public void clickOnEnableAfterButtonTest(){
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCloseAddButton();
        elementsSteps.scrollThePageDown();
        elementsSteps.clickOnDynamicPropertiesButton();
        elementsSteps.clickOnEnableAfterButton();
        elementsSteps.verifyIfTheButtonIsEnabled();
    }

    @Test
    public void waitForTheColorChangeButtonTest(){
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCloseAddButton();
        elementsSteps.scrollThePageDown();
        elementsSteps.clickOnDynamicPropertiesButton();
        elementsSteps.waitForTheColorChangeButton();
        elementsSteps.verifyIfTheColorWasChanged();
    }

    @Test
    public void clickOnVisibleAfterButtonTest(){
        elementsSteps.clickOnElementsButton();
        elementsSteps.clickOnCloseAddButton();
        elementsSteps.scrollThePageDown();
        elementsSteps.clickOnDynamicPropertiesButton();
        elementsSteps.clickOnVisibleAfterButton();
        elementsSteps.verifyIfTheVisibleAfterButtonIsPresent();
    }





}





