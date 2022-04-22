package locatorsUI.LoginLocators;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ProjectExploreUI extends PageObject {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[1]/nav/div[2]/div/i")
    public WebElementFacade LogoutBtn;
}
