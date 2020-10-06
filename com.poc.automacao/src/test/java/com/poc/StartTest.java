package com.poc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.seljup.SeleniumJupiter;

/**
 * StartTest
 */
@ExtendWith(SeleniumJupiter.class)
public class StartTest {

    @Test
    public void start(ChromeDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://junit.org/junit5/");        
    }   
}