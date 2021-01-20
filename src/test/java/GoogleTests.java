import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @Test
    public void searchTest() {

        open("https://google.com");
        $(byText("q")).setValue("selenide").pressEnter();
        $("html").shouldHave(text("selenide.org"));
    }

}
