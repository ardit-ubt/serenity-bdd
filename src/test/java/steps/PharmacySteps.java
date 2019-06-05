package steps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;
import pages.PharmacyPage;

public class PharmacySteps extends ScenarioSteps {

    HomePage homePage;
    PharmacyPage pharmacyPage;


    public void verifyPharmaciesPage() {
//        Assertions
    }

    public void createNewPharmacy() {
        pharmacyPage.waitForVisibility(pharmacyPage.getCreateNewButton()).click();
    }
}
