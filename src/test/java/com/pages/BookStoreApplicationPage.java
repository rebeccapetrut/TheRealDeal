package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookStoreApplicationPage extends BasePage {

    @FindBy(css = ".card.mt-4.top-card:nth-child(6)")
    private WebElementFacade bookStoreApplicationButton;

    @FindBy(css = ".element-list.collapse.show li:first-child")
    private WebElementFacade loginButton;

    @FindBy(id = "newUser")
    private WebElementFacade newUserButton;

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "userName")
    private WebElementFacade userNameField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = ".rc-inline-block:first-child")
    private WebElementFacade recaptchaCheckBox;

    @FindBy(css = ".text-center.button > button")
    private WebElementFacade registerButton;

    public void clickOnBookStoreApplicationButton(){
        clickOn(bookStoreApplicationButton);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }

    public void clickOnNewUserButton(){
        clickOn(newUserButton);
    }

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void setUserNameField(String userName){
        typeInto(userNameField, userName);
    }

    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }

    // ??
    public void clickOnRecaptchaCheckBox(){
        WebElement element = find(By.cssSelector("iframe[title='reCAPTCHA']"));
        withAction().moveToElement(element).build().perform();
        withAction().moveByOffset(3, 2).build().perform();
        withAction().moveToElement(passwordField).build().perform();
        withAction().moveByOffset(10,20).build().perform();
        getDriver().switchTo().frame(element);
        clickOn(recaptchaCheckBox);
        waitFor(5).seconds();
//        getDriver().switchTo().alert().accept();
////        getAlert().accept();
//        getDriver().switchTo().defaultContent();
    }

    public void clickOnRegisterButton(){
        withAction().moveToElement(registerButton).click().build().perform();
//        clickOn(registerButton);
        waitFor(5).seconds();
        getAlert().accept();
    }

    public void verifyIfTheRegisterWasMade(){
        getAlert().accept();
    }

}
