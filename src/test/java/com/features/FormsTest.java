package com.features;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// csv file
@UseTestDataFrom("testdata/infos.csv")
@RunWith(SerenityParameterizedRunner.class)
public class FormsTest extends BaseTest {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

//    @Test
    public void practiceFillingTest(){
        formsSteps.clickOnFormsButton();
        formsSteps.clickOnPracticeFormButton();
        elementsSteps.clickOnCloseAddButton();
        formsSteps.setFirstNameField(firstName);
        formsSteps.setLastNameField(lastName);
        formsSteps.setFEmailField(email);
        formsSteps.checkGenderCheckbox("Female");
        formsSteps.setPhoneNumberField(phone);
        formsSteps.clickOnBirthdayField();
        formsSteps.clickOnBirthdayDate();
        formsSteps.setSubjectsField();
        formsSteps.checkHobbies();
        formsSteps.scrollDown();
        formsSteps.setAddressField("Cluj");
        formsSteps.getTheState("NCR");
        formsSteps.getTheCity("Delhi");
        formsSteps.clickOnSubmitButton();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



//    @Test
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
        formsSteps.getTheCity("Delhi");
        formsSteps.clickOnSubmitButton();
    }


    // java properties file
//    @Test
    public void practiceFillingTestTakeTwo() throws IOException {
        // basePage?

        FileInputStream file = new FileInputStream("/Users/petrutrebecca/Desktop/TheRealDeal/src/test/resources/testdata/info.properties");

        Properties properties = new Properties();
        properties.load(file);


        String firstName = properties.getProperty("firstname");
        String lastName = properties.getProperty("lastname");
        String email = properties.getProperty("email");
        String phone = properties.getProperty("phone");


        formsSteps.clickOnFormsButton();
        formsSteps.clickOnPracticeFormButton();
        elementsSteps.clickOnCloseAddButton();
        formsSteps.setFirstNameField(firstName);
        formsSteps.setLastNameField(lastName);
        formsSteps.setFEmailField(email);
        formsSteps.checkGenderCheckbox("Female");
        formsSteps.setPhoneNumberField(phone);
        formsSteps.clickOnBirthdayField();
        formsSteps.clickOnBirthdayDate();
        formsSteps.setSubjectsField();
        formsSteps.checkHobbies();
        formsSteps.scrollDown();
        formsSteps.setAddressField("Cluj");
        formsSteps.getTheState("NCR");
        formsSteps.getTheCity("Delhi");
        formsSteps.clickOnSubmitButton();
    }


    // ruleaza de 2x cu aceleasi date
    @Test
    public void practiceFillingTestTakeThree() throws FileNotFoundException {
        JsonParser jsonParser = new JsonParser();
        FileReader reader = new FileReader("/Users/petrutrebecca/Desktop/TheRealDeal/src/test/resources/testdata/infos.json");
        Object object = jsonParser.parse(reader);
        JsonObject infosJson = (JsonObject)object;

        String firstName = infosJson.get("firstName").toString();
        String lastName = infosJson.get("lastName").toString();
        String email = infosJson.get("email").toString();
        String phone = infosJson.get("phone").toString();

        formsSteps.clickOnFormsButton();
        formsSteps.clickOnPracticeFormButton();
        elementsSteps.clickOnCloseAddButton();
        formsSteps.setFirstNameField(firstName);
        formsSteps.setLastNameField(lastName);
        formsSteps.setFEmailField(email);
        formsSteps.checkGenderCheckbox("Female");
        formsSteps.setPhoneNumberField(phone);
        formsSteps.clickOnBirthdayField();
        formsSteps.clickOnBirthdayDate();
        formsSteps.setSubjectsField();
        formsSteps.checkHobbies();
        formsSteps.scrollDown();
        formsSteps.setAddressField("Cluj");
        formsSteps.getTheState("NCR");
        formsSteps.getTheCity("Delhi");
        formsSteps.clickOnSubmitButton();
    }


}
