package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

/**
 * Created by Taulant Dema
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    public void login(){
        loginPage.getEmailInput().type("geasyy_tuli@hotmail.com");
        loginPage.getPasswordInput().type("tuli8888");
        loginPage.getLoginButton().click();
    }
}