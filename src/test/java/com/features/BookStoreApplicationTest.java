package com.features;

import org.junit.Test;

public class BookStoreApplicationTest extends BaseTest {

    // no such alert
    @Test
    public void registerToTheBookStore(){
        bookStoreApplicationSteps.clickOnBookStoreApplicationButton();
        bookStoreApplicationSteps.scrollThePageDown();
        bookStoreApplicationSteps.clickOnLoginButton();
        bookStoreApplicationSteps.clickOnNewUserButton();
        bookStoreApplicationSteps.setFirstNameField("Rebeccca");
        bookStoreApplicationSteps.setLastNameField("Petrut");
        bookStoreApplicationSteps.setUserNameField("rebecccapetrut");
        bookStoreApplicationSteps.setPasswordField("Parolaparola15!.");
        bookStoreApplicationSteps.clickOnRecaptchaCheckBox();
//        bookStoreApplicationSteps.verifyIfTheRegisterWasMade();
        bookStoreApplicationSteps.clickOnRegisterButton();

    }

}
