package guru.qa;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepTest {
    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://github.com";
        Configuration.startMaximized = true;
    }


    @Test
    public void testRepositoryIssue() {
        step("Открываем репозиторий", () -> {
            open("/ElenaPchelkina/qa_guru_7_6DZ");

        });

        step("Проверяем что существует Issues в репозитории", () -> {
            $(".UnderlineNav-body").shouldHave(text("Issues"));
        });

        }
    }
