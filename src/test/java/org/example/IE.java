package org.example;

import org.openqa.selenium.WebDriver;
import     org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.ie.driver", "C:\\Soft\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("https://www.amazon.co.uk");

        driver.close();


    }


}
