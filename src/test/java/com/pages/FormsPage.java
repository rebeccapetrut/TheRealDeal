package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormsPage extends BasePage {

    @FindBy(css = ".card.mt-4.top-card:nth-child(2)")
    private WebElementFacade formsButton;

    @FindBy(css = ".element-list.collapse.show li:first-child")
    private WebElementFacade practiceFormButton;

    @FindBy(id = "firstName")
    private WebElementFacade firstNameField;

    @FindBy(id = "lastName")
    private WebElementFacade lastNameField;

    @FindBy(id = "userEmail")
    private WebElementFacade emailField;

    @FindBy(css = "#genterWrapper .custom-control")
    private List<WebElementFacade> genderCheckBoxList;

    @FindBy(id = "userNumber")
    private WebElementFacade phoneNumberField;

    @FindBy(id = "dateOfBirthInput")
    private WebElementFacade birthdayField;

    @FindBy(css = ".react-datepicker__month .react-datepicker__week:first-child div:nth-child(3)")
    private WebElementFacade birthdayDateButton;

    @FindBy(id = "subjectsInput")
    private WebElementFacade subjectsField;

    @FindBy(css = "[for='hobbies-checkbox-3']")
    private WebElementFacade hobbiesCheckBox;

    @FindBy(id = "currentAddress")
    private WebElementFacade addressField;

    @FindBy(css = "#state .css-1wy0on6")
    private WebElementFacade stateField;

    @FindBy(css = ".css-11unzgr")
    private WebElementFacade stateMenuOption;

    @FindBy(id = "react-select-5-option")
    private List<WebElementFacade> listOfStates;

//    #react-select-5-option-0

    @FindBy(id = "react-select-4-input")
    private WebElementFacade cityField;

    @FindBy(id = "submit")
    private WebElementFacade submitButton;

    public void clickOnFormsButton(){
        clickOn(formsButton);
    }

    public void clickOnPracticeFormButton(){
        clickOn(practiceFormButton);
    }

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public boolean checkGenderCheckbox(String gender){
        for (WebElementFacade element : genderCheckBoxList) {
            if (element.getText().equals(gender)) {
                clickOn(element);
            }
        }
        return false;
    }

    public void setPhoneNumberField(String phoneNumber){
        typeInto(phoneNumberField, phoneNumber);
    }

    public void clickOnBirthdayField(){
        clickOn(birthdayField);
    }

    public void clickOnBirthdayDate(){
        clickOn(birthdayDateButton);
    }

    public void setSubjectsField(){
        clickOn(subjectsField);
//        subjectsField.sendKeys(Keys.ADD);
        subjectsField.sendKeys("Maths");
//        subjectsField.sendKeys(Keys.ARROW_DOWN);
        subjectsField.sendKeys(Keys.ENTER);
//        typeInto(subjectsField, subject);
    }

    public void checkHobbies(){
        clickOn(hobbiesCheckBox);
    }

    public void setAddressField(String address){
        typeInto(addressField, address);
    }

    public void setStateField(String stateName){
        clickOn(stateField);
//        clickOn(stateField);
//        withAction().moveToElement(stateField).sendKeys(Keys.ARROW_DOWN).click().perform();
    }

    public void getTheState(String stateName){
        for(WebElement element : listOfStates){
            if(element.findElement(By.id("react-select-5-option")).getText().equalsIgnoreCase(stateName))
                element.findElement(By.id("react-select-5-option")).click();
        }
    }

    public void setCityField(){
        cityField.select().byVisibleText("Noida");
    }

    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }



}
