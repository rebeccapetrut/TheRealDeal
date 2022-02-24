package com.steps;

import net.thucydides.core.annotations.Step;

public class FormsSteps extends BaseSteps {

    @Step
    public void clickOnFormsButton(){
        formsPage.clickOnFormsButton();
    }

    @Step
    public void clickOnPracticeFormButton(){
        formsPage.clickOnPracticeFormButton();
    }

    @Step
    public void setFirstNameField(String firstName){
        formsPage.setFirstNameField(firstName);
    }

    @Step
    public void setLastNameField(String lastName){
        formsPage.setLastNameField(lastName);
    }

    @Step
    public void setFEmailField(String email){
        formsPage.setEmailField(email);
    }

    @Step
    public void checkGenderCheckbox(String gender){
        formsPage.checkGenderCheckbox(gender);
    }

    @Step
    public void setPhoneNumberField(String phoneNumber){
        formsPage.setPhoneNumberField(phoneNumber);
    }

    @Step
    public void clickOnBirthdayField(){
        formsPage.clickOnBirthdayField();
    }

    @Step
    public void clickOnBirthdayDate(){
        formsPage.clickOnBirthdayDate();
    }

    @Step
    public void setSubjectsField(){
        formsPage.setSubjectsField();
    }

    @Step
    public void checkHobbies(){
        formsPage.checkHobbies();
    }

    @Step
    public void setAddressField(String address){
        formsPage.setAddressField(address);
    }

    @Step
    public void setStateField(String stateName){
        formsPage.setStateField(stateName);
    }

    @Step
    public void getTheState(String stateName){
        formsPage.getTheState(stateName);
    }

    @Step
    public void setCityField(){
        formsPage.setCityField();
    }

    @Step
    public void clickOnSubmitButton(){
        formsPage.clickOnSubmitButton();
    }

    @Step
    public void scrollDown(){
        formsPage.scrollToPageBottom();
    }






    }
