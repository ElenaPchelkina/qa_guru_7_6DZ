package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RepositoryPage;

public class AnnotatedStepTest {
    RepositoryPage repositoryPage = new RepositoryPage();

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://github.com";
        Configuration.startMaximized = true;
    }
    @Test
    void positiveFillTest(){
        repositoryPage.openRepository()
                .shouldSeeIssues("Issues");
    }

}
