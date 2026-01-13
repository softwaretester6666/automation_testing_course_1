import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationFormTests {

    @Test
    void passedLoginingTest() {
        open("https://school.qa.guru/");

        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();

        $("[class=stream-title]").shouldHave(text("QA.GURU | Открытые занятия. Полный список."));
    }

    @Test
    void failedLoginingTest() {
        open("https://school.qa.guru/");
        $("[id=xdgetr7101_1_1]").click();

        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("wrong_password").pressEnter();

        $("[id=xdgetr4464_1_1]").shouldHave(text("Неверный пароль"));
    }
}
