package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class HomePage extends AbstractPage {

    @FindBy(css = "[href=\"/Farmacias\"]")
    WebElementFacade pharmacyLink;
}
