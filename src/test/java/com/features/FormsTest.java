package com.features;

import org.junit.Test;

public class FormsTest extends BaseTest {


    //dropdown
    @Test
    public void fillPracticeFormTest(){
        formsSteps.clickOnFormsButton();
        formsSteps.clickOnPracticeFormButton();
        elementsSteps.clickOnCloseAddButton();
        formsSteps.setFirstNameField("Rebeca");
        formsSteps.setLastNameField("Petrut");
        formsSteps.setFEmailField("rebecapetrut@mailinator.com");
        formsSteps.checkGenderCheckbox("Female");
        formsSteps.setPhoneNumberField("010101010101");
        formsSteps.clickOnBirthdayField();
        formsSteps.clickOnBirthdayDate();
        formsSteps.setSubjectsField();
        formsSteps.checkHobbies();
        formsSteps.scrollDown();
        formsSteps.setAddressField("Cluj");
        formsSteps.getTheState("NCR");
//        formsSteps.setStateField("NCR");
        formsSteps.setCityField();
        formsSteps.clickOnSubmitButton();
    }


}
