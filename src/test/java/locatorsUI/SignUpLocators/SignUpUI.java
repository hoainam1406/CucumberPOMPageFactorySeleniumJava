package locatorsUI.SignUpLocators;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class SignUpUI extends PageObject {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[1]/div[1]")
    public WebElementFacade InternalPersona;

    @FindBy(name = "firstname")
    public WebElementFacade FirstName;

    @FindBy(name = "lastname")
    public WebElementFacade LastName;

    @FindBy(name = "email")
    public WebElementFacade Email;

    @FindBy(name = "password")
    public WebElementFacade PassWord;

    @FindBy(name = "confirmPassword")
    public WebElementFacade ConfirmPassWord;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div[2]/form/div/div[6]/button")
    public WebElementFacade SignUpBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[2]/div[1]/p")
    public WebElementFacade FirstNameAlert;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[5]/p")
    public WebElementFacade CfmPassAlert;
}
