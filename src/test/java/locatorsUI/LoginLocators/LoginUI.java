package locatorsUI.LoginLocators;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginUI extends PageObject {

    @FindBy(name = "email")
    public WebElementFacade emailInput;

    @FindBy(id = "password")
    public WebElementFacade passwordInput;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/form/div[5]/button")
    public WebElementFacade loginBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/form/div[2]/p")
    public WebElementFacade alertEmail;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/form/div[3]/p")
    public WebElementFacade alertPass;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[2]/a")
    public WebElementFacade SignUpHere;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/h2")
    public WebElementFacade LogInTitle;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/form/div[2]/p")
    public WebElementFacade InvalidEmailAlert;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[1]")
    public WebElementFacade InvalidPassAlert;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[4]/label/span")
    public WebElementFacade RememberMe;
}
