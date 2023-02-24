import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DisplayContentSoftAssertionPage {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void softAssertionsJunit5() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).shouldBe(Condition.visible).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));



        sleep(2000);

    }

}
