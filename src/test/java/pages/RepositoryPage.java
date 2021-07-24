package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RepositoryPage {

    @Step("Открываем репозиторий")
        public RepositoryPage openRepository(){
            open("/ElenaPchelkina/qa_guru_7_6DZ");

            return this;

        }

        @Step("Проверяем что существует Issues в репозитории")
        public RepositoryPage shouldSeeIssues(String value){
            $(".UnderlineNav-body").shouldHave(text(value));

            return this;

        }
    }
