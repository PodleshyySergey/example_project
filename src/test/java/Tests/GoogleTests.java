package Tests;

import Config.ConfigHelper;
import Config.WebConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @Test
    public void searchTest() {
//        WebConfig webConfig = ConfigFactory.newInstance().create(WebConfig.class);
//
//        String browserName = webConfig.browserName();
//        String baseURL = webConfig.baseURL();
//        String searchItem = webConfig.searchItem();
//        String searchSite = webConfig.searchSite();

        Configuration.browser = ConfigHelper.getBrowserName();
        Configuration.startMaximized=true;
        open(ConfigHelper.getBaseUrl());
        $(byName("q")).setValue(ConfigHelper.getSearchItem()).pressEnter();
        $("html").shouldHave(text(ConfigHelper.getSearchSite()));
    }

}
