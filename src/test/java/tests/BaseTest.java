package tests;

import core.Driver;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private static WebDriver driver;

    @BeforeClass
    public static void init(){
        driver = Driver.get();
        driver.manage().window().maximize();
    }

//TODO: uncomment some day
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}
