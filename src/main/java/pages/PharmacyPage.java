package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class PharmacyPage extends AbstractPage {

    @FindBy(xpath = "//th[contains(text(), \"EmriFarmacise\")]")
    WebElementFacade pharmacyNameLabel;

    @FindBy(css = "href=\"/Farmacias/Create\"")
    WebElementFacade createNewButton;


}
