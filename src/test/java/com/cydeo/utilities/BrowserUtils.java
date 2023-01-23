package com.cydeo.utilities;


import org.openqa.selenium.*;

import java.util.List;


public class BrowserUtils {

    public static WebElement getElement(By by){
        return Driver.getDriver().findElement(by);
    }

    public static List<WebElement> getElements(By by){
        return Driver.getDriver().findElements(by);
    }


}

