package allureExample;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MyTests {

    @Test
    @Owner("allure8")
    @AllureId("10857")
    @DisplayName("Authorization")
    void testAuthorization() {
        step("Open home page", () -> {
            step("Click the button 'My account'");
        });
        step("Click the button 'My account'");
        step("Fill the input 'Login'");
        step("Fill the input 'Password'");
        step("Click the button 'Logout'");
        step("Log out");
    }
}
