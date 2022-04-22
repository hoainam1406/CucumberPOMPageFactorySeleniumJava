package locatorsUI.SignUpLocators;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyEmailUI extends PageObject {
    @FindBy(xpath = "/html/body/div/div/div[1]/div/div[2]/div[2]/div/form/div[1]/p[1]")
    private WebElement VerifyEmailText;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/div[2]/input")
    private WebElement TextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")
    private WebElement ConfirmBtn;
}
