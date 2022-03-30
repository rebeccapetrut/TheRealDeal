package com.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class BasePage extends PageObject {

    public void scrollToPageBottom() {
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToPageTop() {
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void switchToNewWindow(){
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow)){
                getDriver().switchTo().window(window);
                break;
            }
        }
    }

    public static Document convertXMLFileToXMLDoc(String strXMLFilePath) {
        try
        {
            File file = new File(strXMLFilePath);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document xmlDoc = db.parse(file);
            return xmlDoc;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("/Users/petrutrebecca/Desktop/TheRealDeal/src/test/resources/testdata/info.properties");

        Properties properties = new Properties();
        properties.load(file);

        String firstName = properties.getProperty("firstname");
        String lastName = properties.getProperty("lastname");
        String email = properties.getProperty("email");
        String phone = properties.getProperty("phone");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(phone);
    }







}
