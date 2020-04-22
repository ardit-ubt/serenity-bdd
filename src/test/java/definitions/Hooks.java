package definitions;

import cucumber.api.java.Before;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * Created by Ardit Podrimaj
 */

public class Hooks {

    @Before
    public void setup() {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Help\\Desktop\\Test\\serenity-bdd\\drivers\\geckodriver.exe");
        getWebdriverManager().getWebdriver().get("https://facebook.com");
    }
}