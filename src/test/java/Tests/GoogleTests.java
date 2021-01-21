package Tests;

import webconfig.ConfigHelper;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

//    @Test
    public void searchTest() {

        if (ConfigHelper.getIsRemote()) {
            Configuration.remote = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub/";
            Configuration.browser = ConfigHelper.getBrowserName();
            Configuration.browserVersion = ConfigHelper.getBrowserVersion();
        }

        Configuration.browser = ConfigHelper.getBrowserName();
        Configuration.startMaximized=true;
        open(ConfigHelper.getBaseUrl());
        $(byName("q")).setValue(ConfigHelper.getSearchItem()).pressEnter();
        $("html").shouldHave(text(ConfigHelper.getSearchSite()));
    }

}

