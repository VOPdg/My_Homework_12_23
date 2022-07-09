package allureExample;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MyTests {

    @Test
    @Owner("allure8")
    @AllureId("11031")
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

    @Test
    @AllureId("11032")
    @DisplayName("Search air ticket")
    @Owner("allure8")
    void testSearchAirTicket() {
        step("Open belavia.by website");
        step("Input Minsk into From field");
        step("Input Moscow into To field");
        step("Click Return radio button");
        step("Click Departure date", () -> {
            step("Choose 20 July 2022 in Datepicker");
        });
        step("Click Return date", () -> {
            step("Choose 22 July 2022 in Datepicker");
        });
        step("Click Search button");
    }
}
