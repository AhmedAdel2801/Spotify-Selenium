package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P02_Login {
    SHAFT.GUI.WebDriver driver;

    public P02_Login(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    By UserName =By.cssSelector("#login-username");
    By PassWord =By.cssSelector("#login-password");
    By LoginButton =By.cssSelector(".ButtonInner-sc-14ud5tc-0.hvvTXU.encore-bright-accent-set");

    public P02_Login login(String Username,String Password) {
        driver.element().type(UserName,Username)
                .and().type(PassWord,Password)
                .and().click(LoginButton);
        return this;
    }


}
