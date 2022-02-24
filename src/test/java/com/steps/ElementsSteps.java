package com.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ElementsSteps extends BaseSteps {

    @Step
    public void clickOnElementsButton(){
        elementsPage.clickOnElementsButton();
    }

    @Step
    public void clickOnTextBoxButton(){
        elementsPage.clickOnTextBoxButton();
    }

    @Step
    public void setUserNameField(String userName){
        elementsPage.setUserNameField(userName);
    }

    @Step
    public void setEmailField(String email){
        elementsPage.setEmailField(email);
    }

    @Step
    public void setAddressField(String address){
        elementsPage.setAddressField(address);
    }

    @Step
    public void setPermanentAddressField(String permanentAddress){
        elementsPage.setPermanentAddressField(permanentAddress);
    }

    @Step
    public void clickOnSubmitButton(){
        elementsPage.clickOnSubmitButton();
    }

    @Step
    public void verifyIfVerificationMessageIsPresent(){
        elementsPage.isVerificationMessagePresent();
    }

    @Step
    public void verifyIfDataAreCorrect(String userName, String email, String address, String permanentAddress){
        elementsPage.verifyDatesAreCorrect(userName, email, address, permanentAddress);
    }

    @Step
    public void clickOnCheckBoxButton(){
        elementsPage.clickOnCheckBoxButton();
    }

    @Step
    public void clickOnExpandButton(){
        elementsPage.clickOnExpandButton();
    }

    @Step
    public void clickOnHomeCheckBox(){
        elementsPage.clickOnHomeCheckBox();
    }

    @Step
    public void clickOnDocumentsCheckBox(){
        elementsPage.clickOnDocumentsCheckBox();
    }

    @Step
    public void verifyIfHomeCheckboxIsChecked(){
        elementsPage.verifyIfHomeCheckboxIsChecked();
    }

    @Step
    public void verifyIfDocumentsCheckboxIsChecked(){
        elementsPage.verifyIfDocumentsCheckboxIsChecked();
    }

    @Step
    public void clickOnRadioButton(){
        elementsPage.clickOnRadioButton();
    }

    @Step
    public void clickOnYesRadioButton(){
        elementsPage.clickOnYesRadioButton();
    }

    @Step
    public void verifyIfYesSuccessMessageIsDisplayedCorrectly(){
        elementsPage.verifyIfYesSuccessMessageIsDisplayedCorrectly();
    }

    @Step
    public void clickOnImpressiveRadioButton(){
        elementsPage.clickOnImpressiveRadioButton();
    }

    @Step
    public void verifyIfImpressiveSuccessMessageIsDisplayedCorrectly(){
        Assert.assertTrue(elementsPage.verifyIfImpressiveSuccessMessageIsDisplayedCorrectly());
    }

    @Step
    public void verifyNoRadioButtonIsNotClickable(){
        elementsPage.verifyNoRadioButtonIsNotClickable();
    }

    @Step
    public void clickOnWebTablesButton(){
        elementsPage.clickOnWebTablesButton();
    }

    @Step
    public void clickOnAddButton(){
        elementsPage.clickOnAddButton();
    }

    @Step
    public void setFirstNameField(String firstName){
        elementsPage.setFirstNameField(firstName);
    }

    @Step
    public void setLastNameField(String lastName){
        elementsPage.setLastNameField(lastName);
    }

    //step de set email

    @Step
    public void setAgeField(String age){
        elementsPage.setAgeField(age);
    }

    @Step
    public void setSalaryField(String salary){
        elementsPage.setSalaryField(salary);
    }

    @Step
    public void setDepartmentField(String department){
        elementsPage.setDepartmentField(department);
    }

    @Step
    public void clickOnSubmitWebTablesButton(){
        elementsPage.clickOnSubmitWebTablesButton();
    }

    @Step
    public void verifyNewPersonIsAdded(String firstName){
        Assert.assertTrue(elementsPage.verifyNewPersonIsAdded(firstName));
    }

    @Step
    public void editASpecificRecord(String firstName){
        elementsPage.editASpecificRecord(firstName);
    }

    @Step
    public void clearEditedField(){
        elementsPage.clearEditedField();
    }

    @Step
    public void verifyIfTheEditWasMade(String firstName, String salary){
        Assert.assertTrue(elementsPage.verifyIfTheEditWasMade(firstName, salary));
    }

    @Step
    public void deleteASpecificRecord(String firstName){
        Assert.assertTrue(elementsPage.deleteASpecificRecord(firstName));
    }

    @Step
    public void verifyIfRecordWasDeleted(String firstName){
        Assert.assertFalse("Record not deleted", elementsPage.verifyIfRecordWasDeleted(firstName));
    }

    @Step
    public void clickOnButtonsButton(){
        elementsPage.clickOnButtonsButton();
    }

    @Step
    public void clickOnDoubleClickButton(){
        elementsPage.clickOnDoubleClickButton();
    }

    @Step
    public void verifyIfDoubleButtonWasPressed(){
        Assert.assertTrue(elementsPage.verifyIfDoubleButtonWasPressed());
    }

    @Step
    public void clickOnRightClickButton(){
        elementsPage.clickOnRightClickButton();
    }

    @Step
    public void verifyIfRightButtonWasPressed(){
        Assert.assertTrue(elementsPage.verifyIfRightButtonWasPressed());
    }

    @Step
    public void clickOnClickMeButton(){
        elementsPage.clickOnClickMeButton();
    }

    @Step
    public void verifyIfDynamicButtonWasPressed(){
        Assert.assertTrue(elementsPage.verifyIfDynamicButtonWasPressed());
    }

    @Step
    public void clickOnLinksButton(){
        elementsPage.clickOnLinksButton();
    }

    @Step
    public void clickOnCloseAddButton(){
        elementsPage.clickOnCloseAddButton();
    }

    @Step
    public void clickOnHomeLinkButton(){
        elementsPage.clickOnHomeLinkButton();
    }

    @Step
    public void switchToNewWindow(){
        elementsPage.switchToNewWindow();
    }

    @Step
    public void verifyIfTheNewTabIsOpened(){
        Assert.assertTrue(elementsPage.verifyIfTheNewTabIsOpened());
    }



















}
