package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    // This method will login with helpdesk1@cybertechschool.com user when it is called
    public static void crm_login(WebDriver driver){

        //3. Enter valid username
        WebElement userNameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        //helpdesk1@cybertekschool.com     UserUser
        //Helpdesk2@cybertekschool.com     UserUser

        userNameBox.sendKeys("helpdesk1@cybertekschool.com");


        //4. Enter valid password
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

    }

    public static void crm_login(WebDriver driver, String username, String password){

        //3. Enter valid username
        WebElement userNameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        //helpdesk1@cybertekschool.com     UserUser
        //Helpdesk2@cybertekschool.com     UserUser

        userNameBox.sendKeys(username);


        //4. Enter valid password
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys(password);

        //5. Click to `Log In` button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

    }


}
