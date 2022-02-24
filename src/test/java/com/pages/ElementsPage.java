package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


import java.util.List;


public class ElementsPage extends BasePage {

    @FindBy(css = ".card.mt-4.top-card:first-child")
    private WebElementFacade elementsButton;

    @FindBy(css = ".element-list.collapse.show li:first-child")
    private WebElementFacade textBoxButton;

    @FindBy(id = "userName")
    private WebElementFacade userNameField;

    @FindBy(id = "userEmail")
    private WebElementFacade emailField;

    @FindBy(id = "currentAddress")
    private WebElementFacade addressField;

    @FindBy(id = "permanentAddress")
    private WebElementFacade permanentAddressField;

    @FindBy(css = ".text-right .btn.btn-primary")
    private WebElementFacade submitButton;

    @FindBy(css = ".border")
    private WebElementFacade verificationMessage;

    @FindBy(id = "name")
    private WebElementFacade verificationName;

    @FindBy(id = "email")
    private WebElementFacade verificationEmail;

    @FindBy(css = ".border #currentAddress")
    private WebElementFacade verificationAddress;

    @FindBy(css = ".border #permanentAddress")
    private WebElementFacade verificationPermanentAddress;

    @FindBy(css = ".element-list.collapse.show li:nth-child(2)")
    private WebElementFacade checkBoxButton;

    @FindBy(css = "[title='Expand all']")
    private WebElementFacade expandButton;

    @FindBy(css = "[for='tree-node-home'] .rct-checkbox")
    private WebElementFacade homeCheckbox;

    @FindBy(css = "[for='tree-node-documents'] .rct-checkbox")
    private WebElementFacade documentsCheckbox;

    @FindBy(id = "result")
    private WebElementFacade verifyHomeCheckboxIsClicked;

    @FindBy(css = ".element-list.collapse.show li:nth-child(3)")
    private WebElementFacade radioButton;

    @FindBy(css = "[for='yesRadio']")
    private WebElementFacade yesRadioButton;

    @FindBy(css = "[fora = 'impressiveRadio'")
    private WebElementFacade impressiveRadioButton;

    @FindBy(id = "noRadio")
    private WebElementFacade noRadioButton;

    @FindBy(css = ".text-success")
    private WebElementFacade successMessage;

    @FindBy(css = "[for='yesRadio']")
    private WebElementFacade yesTextFromRadioButton;

    @FindBy(css = "[for='impressiveRadio']")
    private WebElementFacade impressiveTextFromRadioButton;

    @FindBy(css = ".element-list.collapse.show li:nth-child(4)")
    private WebElementFacade webTablesButton;

    @FindBy(id = "addNewRecordButton")
    private WebElementFacade addButton;

    @FindBy(css = "[id='firstName']")
    private WebElementFacade firstNameField;

    @FindBy(css = "[id='lastName']")
    private WebElementFacade lastNameField;

    @FindBy(id = "age")
    private WebElementFacade ageField;

    @FindBy(id = "salary")
    private WebElementFacade salaryField;

    @FindBy(id = "department")
    private WebElementFacade departmentField;

    @FindBy(id = "submit")
    private WebElementFacade submitWebTablesButton;

    @FindBy(css = ".rt-tr-group")
    private List<WebElementFacade> listOfPeople;

    @FindBy(css = ".element-list.collapse.show li:nth-child(5)")
    private WebElementFacade buttons;

    @FindBy(id = "doubleClickBtn")
    private WebElementFacade doubleClickButton;

    @FindBy(id = "rightClickBtn")
    private WebElementFacade rightClickButton;

    @FindBy(css = ".col-12.mt-4.col-md-6 div:nth-child(3) button")
    private WebElementFacade clickMeClickButton;

    @FindBy(id = "doubleClickMessage")
    private WebElementFacade doubleClickConfirmation;

    @FindBy(id = "rightClickMessage")
    private WebElementFacade rightClickConfirmation;

    @FindBy(id = "dynamicClickMessage")
    private WebElementFacade dynamicClickConfirmation;

    @FindBy(css = ".element-list.collapse.show li:nth-child(6)")
    private WebElementFacade linksButton;

    @FindBy(css = "header a")
    private WebElementFacade newTabTitleVerification;

    @FindBy(id = "close-fixedban")
    private WebElementFacade closeAddButton;

    @FindBy(id = "simpleLink")
    private WebElementFacade homeLinkButton;




    public void clickOnElementsButton(){
        clickOn(elementsButton);
    }

    public void clickOnTextBoxButton(){
        clickOn(textBoxButton);
    }

    public void setUserNameField(String userName){
        typeInto(userNameField, userName);
    }

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setAddressField(String address){
        typeInto(addressField, address);
    }

    public void setPermanentAddressField(String permanentAddress){
        typeInto(permanentAddressField, permanentAddress);
    }

    public void clickOnSubmitButton(){
       clickOn(submitButton);
    }

    public boolean isVerificationMessagePresent(){
        if(verificationMessage.isPresent()){
            return true;
        }
        return false;
    }

    public void verifyDatesAreCorrect(String userName, String email, String address, String permanentAddress){
        verificationName.shouldContainText("Name:"+userName);
        verificationEmail.shouldContainText("Email:"+email);
        verificationAddress.shouldContainText("Current Address :"+address);
        verificationPermanentAddress.shouldContainText("Permananet Address :"+permanentAddress);
    }

    public void clickOnCheckBoxButton(){
        clickOn(checkBoxButton);
    }

    public void clickOnExpandButton(){
        clickOn(expandButton);
    }

    public void clickOnHomeCheckBox(){
        clickOn(homeCheckbox);
    }

    public void clickOnDocumentsCheckBox(){
        clickOn(documentsCheckbox);
    }

    public void verifyIfHomeCheckboxIsChecked(){
        verifyHomeCheckboxIsClicked.shouldContainText("You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
    }

    public void verifyIfDocumentsCheckboxIsChecked(){
        verifyHomeCheckboxIsClicked.shouldContainText("You have selected :\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general");
    }

    public void clickOnRadioButton(){
        clickOn(radioButton);
    }

    public void clickOnYesRadioButton(){
//        withAction().click(yesRadioButton).perform();
        clickOn(yesRadioButton);
    }

    public boolean verifyIfYesSuccessMessageIsDisplayedCorrectly(){
        if(successMessage.getText().equals(yesTextFromRadioButton.getText())){
            return true;
        }
        return false;
    }

    public void clickOnImpressiveRadioButton(){
        clickOn(impressiveRadioButton);
    }

    public boolean verifyIfImpressiveSuccessMessageIsDisplayedCorrectly(){
        if(successMessage.getText().equals(impressiveTextFromRadioButton.getText())){
            return true;
        }
        return false;
    }

    public void verifyNoRadioButtonIsNotClickable(){
         noRadioButton.shouldNotBeEnabled();
    }

    public void clickOnWebTablesButton(){
        clickOn(webTablesButton);
    }

    public void clickOnAddButton(){
        clickOn(addButton);
    }

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    // metoda de set email field

    public void setAgeField(String age){
        typeInto(ageField, age);
    }

    public void setSalaryField(String salary){
        typeInto(salaryField, salary);
    }

    public void setDepartmentField(String department){
        typeInto(departmentField, department);
    }

    public void clickOnSubmitWebTablesButton(){
        clickOn(submitWebTablesButton);
    }

    public boolean verifyNewPersonIsAdded(String firstName){
        for(WebElementFacade element : listOfPeople){
            if(element.findElement(By.cssSelector(".rt-tr-group .rt-td")).getText().equals(firstName)){
                return true;
            }
        }
        return false;
    }

    public boolean editASpecificRecord(String firstName){
        for(WebElementFacade element : listOfPeople){
            if(element.findElement(By.cssSelector(".rt-td")).getText().equals(firstName)){
                element.findElement(By.cssSelector(".mr-2")).click();
                return true;
            }
        }
        return false;
    }

    public void clearEditedField(){
        salaryField.clear();
    }

    // work it
    public boolean verifyIfTheEditWasMade(String firstName, String salary){
        for(WebElementFacade element : listOfPeople){
            if(element.findElement(By.cssSelector(".rt-td")).getText().equals(firstName) && element.findElement(By.cssSelector(".rt-td")).getText().equals(salary)){
                return true;
            }
        }
        return false;
    }

    public boolean deleteASpecificRecord(String firstName){
        for(WebElementFacade element : listOfPeople){
            if(element.findElement(By.cssSelector(".rt-td")).getText().equals(firstName)){
                element.findElement(By.cssSelector("[title='Delete']")).click();
                return true;
            }
        }
        return false;
    }

    // de lucrat
    public boolean verifyIfRecordWasDeleted(String firstName){
        if(listOfPeople.contains(firstName)){
            return false;
        }
        return true;
    }


    public void clickOnButtonsButton(){
        clickOn(buttons);
    }

    public void clickOnDoubleClickButton(){
        withAction().moveToElement(doubleClickButton).doubleClick().perform();
    }

    public boolean verifyIfDoubleButtonWasPressed(){
        if(doubleClickConfirmation.isPresent()){
            return true;
        }
        return false;
    }

    public void clickOnRightClickButton(){
        withAction().contextClick(rightClickButton).perform();
    }

    public boolean verifyIfRightButtonWasPressed(){
        if(rightClickConfirmation.isPresent()){
            return true;
        }
        return false;
    }

    public void clickOnClickMeButton(){
       clickOn(clickMeClickButton);
    }

    public boolean verifyIfDynamicButtonWasPressed(){
        if(dynamicClickConfirmation.isPresent()){
            return true;
        }
        return false;
    }


    public void clickOnLinksButton() {
//        scrollToPageBottom();
//       linksButton.sendKeys(Keys.PAGE_DOWN);
        scrollToElement(linksButton);
        clickOn(linksButton);
    }

    public void clickOnCloseAddButton(){
        clickOn(closeAddButton);
    }

    public void clickOnHomeLinkButton(){
        clickOn(homeLinkButton);
    }

    public boolean verifyIfTheNewTabIsOpened(){
        if(newTabTitleVerification.isPresent()){
            return true;
        }
        return false;
    }























}
