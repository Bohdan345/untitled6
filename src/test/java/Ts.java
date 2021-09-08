import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Ts {

    @Test
    public void test() {
        open("https://preprod.snov.io/login");
        closeWebDriver();
    }
}
