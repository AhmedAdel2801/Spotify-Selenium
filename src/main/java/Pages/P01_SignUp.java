package Pages;

import com.shaft.driver.SHAFT;
import com.shaft.validation.Validations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P01_SignUp {
    SHAFT.GUI.WebDriver driver;

    public P01_SignUp(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    By inputEmail = By.cssSelector("#username");
    By Button = By.cssSelector(".ButtonInner-sc-14ud5tc-0.hvvTXU.encore-bright-accent-set");
    By Password = By.cssSelector("#new-password");
    By UserName= By.cssSelector("#displayName");
    By Day=By.cssSelector("#day");
    By Month=By.cssSelector("#month");
    By MonthIndex=By.xpath("//option[@value='3']");
    By Year=By.cssSelector("#year");
    By GenderSelection=By.xpath("//label[@for='gender_option_male']");
    By CheckBox1=By.xpath("(//span[@class='Indicator-sc-1airx73-0 lhZnAn'])[1]");
    By CheckBox2=By.xpath("(//span[@class='Indicator-sc-1airx73-0 lhZnAn'])[2]");
    By SignupButton = By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 hvvTXU encore-bright-accent-set']");



    public P01_SignUp enterEmail(String email) {
        driver.element().type(inputEmail,email);
        WebDriverWait wait= new WebDriverWait(driver.getDriver(),Duration.ofSeconds(2));
     wait.until(d ->driver.element().waitUntilPresenceOfAllElementsLocatedBy(Button));
        driver.element().click(Button);
    return this;
    }

   public P01_SignUp enterPassword(String password) {
       driver.element().type(Password,password);
       WebDriverWait wait= new WebDriverWait(driver.getDriver(),Duration.ofSeconds(2));
       wait.until(d ->driver.element().waitUntilPresenceOfAllElementsLocatedBy(Button));
       driver.element().click(Button);
       return this;
   }
    public P01_SignUp aboutYourSelf(String userName,String day,String year) {
        WebDriverWait wait= new WebDriverWait(driver.getDriver(),Duration.ofSeconds(2));

        driver.element().type(UserName,userName);
        driver.element().type(Day,day);
        wait.until(d ->driver.element().waitUntilPresenceOfAllElementsLocatedBy(Month));
        driver.element().click(Month);
        wait.until(d ->driver.element().waitUntilPresenceOfAllElementsLocatedBy(MonthIndex));
        driver.element().click(MonthIndex)
                .and().type(Year,year)
                .and().click(GenderSelection);
        wait.until(d ->driver.element().waitUntilPresenceOfAllElementsLocatedBy(Button));
             driver.element().click(Button);
        return this;
    }
public P01_SignUp termsAndCondtions(){
        driver.element().click(CheckBox1);
    driver.element().click(CheckBox2);
    WebDriverWait wait= new WebDriverWait(driver.getDriver(),Duration.ofSeconds(2));
    wait.until(d ->driver.element().waitUntilPresenceOfAllElementsLocatedBy(Button));
                      driver.element().click(SignupButton);
    return this;
}
}
