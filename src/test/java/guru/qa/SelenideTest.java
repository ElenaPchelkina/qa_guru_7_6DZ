package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    static void setup() {
        Configuration.baseUrl = "https://github.com";
        Configuration.startMaximized = true;

    @Test
    public  void testRepositoryIssue(){
        open("/ElenaPchelkina/qa_guru_7_6DZ");
        $(".UnderlineNav-body").shouldHave(text("Issues"));
    }

}
