package Pages;

import com.shaft.driver.SHAFT;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;

public class P03_SearchAndPlay {
    SHAFT.GUI.WebDriver driver;

    public P03_SearchAndPlay(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    By Search =By.cssSelector("input[placeholder='What do you want to play?']");
    By SingerBox =By.xpath("//div[@data-testid=\"herocard-click-handler\"]");
    By AddSong1 =By.cssSelector("div[role='presentation'] div:nth-child(1) div:nth-child(1) div:nth-child(4) button:nth-child(1) span:nth-child(1) svg");
    By AddSong2 =By.cssSelector("body div[id='main'] div[role='presentation'] div[role='presentation'] div:nth-child(2) div:nth-child(1) div:nth-child(4) button:nth-child(1) span:nth-child(1) svg");
    By PlayMusic=By.cssSelector("span[class='IconWrapper__Wrapper-sc-1hf1hjl-0 ivomLs'] svg");




    public P03_SearchAndPlay TypeAndPlay(String Artist) {
    driver.element().type(Search,Artist)
                    .and().click(SingerBox)
                    .and().click(AddSong1)
                    .and().click(AddSong2)
                    .and().click(PlayMusic);

    return this;
    }


}
