package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BookStoreApplicationSteps extends BaseSteps{

    @Step
    public void clickOnBookStoreApplicationButton(){
        bookStoreApplicationPage.clickOnBookStoreApplicationButton();
    }

    @Step
    public void clickOnLoginButton(){
        bookStoreApplicationPage.clickOnLoginButton();
    }

    @Step
    public void clickOnNewUserButton(){
        bookStoreApplicationPage.clickOnNewUserButton();
    }

    @Step
    public void setFirstNameField(String firstName){
        bookStoreApplicationPage.setFirstNameField(firstName);
    }

    @Step
    public void setLastNameField(String lastName){
        bookStoreApplicationPage.setLastNameField(lastName);
    }

    @Step
    public void setUserNameField(String userName){
        bookStoreApplicationPage.setUserNameField(userName);
    }

    @Step
    public void setPasswordField(String pass){
        bookStoreApplicationPage.setPasswordField(pass);
    }

    @Step
    public void clickOnRecaptchaCheckBox(){
        bookStoreApplicationPage.clickOnRecaptchaCheckBox();
    }

    @Step
    public void clickOnRegisterButton(){
        bookStoreApplicationPage.clickOnRegisterButton();
    }

    @Step
    public void verifyIfTheRegisterWasMade(){
        bookStoreApplicationPage.verifyIfTheRegisterWasMade();
    }

    @Step
    public void scrollThePageDown(){
        bookStoreApplicationPage.scrollToPageBottom();
    }





}
