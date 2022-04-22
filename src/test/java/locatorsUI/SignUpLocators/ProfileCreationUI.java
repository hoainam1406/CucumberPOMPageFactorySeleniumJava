package locatorsUI.SignUpLocators;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileCreationUI extends PageObject {
    @FindBy(xpath = "/html/body/div/div/div[1]/div/div[1]/nav/div[1]/ul/li/a/span")
    private WebElement ProfileCreation;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[1]/nav/div[2]/div/i")
    private WebElement LogoutBtn;
}
