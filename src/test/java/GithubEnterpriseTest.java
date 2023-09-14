import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubEnterpriseTest {


    @BeforeAll
    static void beforeAll() {
        baseUrl = "https:github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
    }

    @Test
    void shouldFindEterprise() {
        open(baseUrl);
$(byText("Solutions")).hover();
$(byText("Enterprise")).click();
$(withText("GitHub for enterprises")).shouldBe(Condition.visible);

    }
}
// подскажите можно ли как то проверить именно нахождение на https://github.com/enterprise ???
