package Assesment;

import Pages.*;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tests {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData;
    //Test Methods
    @Test
    public void AssesmentSignup() throws InterruptedException {
        /*Running the test using signup making you already logged in so kindly in case of trying the login test case please
        * comment P01_SignUp and uncomment P02_login also the navigateToURL down there in @BeforeClass('_')
        * note : you may have to change the testData.json email */
        new P01_SignUp(driver).enterEmail((testData.getTestData("email")));
        new P01_SignUp(driver).enterPassword((testData.getTestData("password")));
        new P01_SignUp(driver).aboutYourSelf((testData.getTestData("name"))
                                            ,(testData.getTestData("day"))
                                            ,(testData.getTestData("year")));
        new P01_SignUp(driver).termsAndCondtions();

//        new P02_Login(driver).login((testData.getTestData("email"))
//                                    ,(testData.getTestData("password")));
new P03_SearchAndPlay(driver).TypeAndPlay((testData.getTestData("artist")));
Thread.sleep(Duration.ofMinutes(1));
    }

    //Before Method
    @BeforeClass
    public void setUp(){
        driver = new SHAFT.GUI.WebDriver();
        //  driver.browser().navigateToURL("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
        driver.browser().navigateToURL("https://www.spotify.com/eg-ar/signup?forward_url=https%3A%2F%2Fopen.spotify.com%2F");
        testData=new SHAFT.TestData.JSON(SHAFT.Properties.paths.testData() + "testData.json");

    }

    //After Method
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}