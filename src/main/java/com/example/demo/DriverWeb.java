package com.example.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Component;


@Component
public class DriverWeb {

    private WebDriver driver;

    public DriverWeb(){
        System.setProperty("webdriver.chrome.driver", "config/webdrivers/chromedriver.exe");
        ChromeOptions options = customizeCapabilities(new DesiredCapabilities());
        options.addArguments("start-maximized");
        options.addArguments("--disable-gpu");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(options);
    }

    private static ChromeOptions customizeCapabilities(DesiredCapabilities cap) {
        cap.setJavascriptEnabled(true);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
        return chromeOptions;
    }

    public WebDriver getDriver(){
        return driver;
    }


//    DriverWeb driverWeb=new DriverWeb();

//    General general=new General();
//
//    general.pass(get)
}
