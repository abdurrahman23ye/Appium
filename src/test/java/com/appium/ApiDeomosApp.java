package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApiDeomosApp {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion","10.0");
        desiredCapabilities.setCapability("deviceName", "Api_29");
        desiredCapabilities.setCapability("noReset", true);

        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\asus\\IdeaProjects\\AppiumAutomationProject\\Calculator.apk");


        AndroidDriver<AndroidElement> driver =  new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);

    }
}
