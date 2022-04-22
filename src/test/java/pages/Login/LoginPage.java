package pages.Login;

import base.CommonMethods;
import locatorsUI.LoginLocators.LoginUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://iresource.smartdev.vn/")
public class LoginPage extends PageObject {
    LoginUI loginUI;
    CommonMethods commonMethods;

    public void openLoginPage(){
        open();
    }

    public void loginToIResource(String strUserName, String strPassword) {
            commonMethods.sendKeys(loginUI.emailInput, strUserName );
            commonMethods.sendKeys(loginUI.passwordInput, strPassword );
            commonMethods.click(loginUI.loginBtn);
    }
    public void EnterEmail(String username) {
        commonMethods.sendKeys(loginUI.emailInput,username);
    }
    public void EnterPassWord(String password) {
        commonMethods.sendKeys(loginUI.passwordInput, password );
    }
    public void ClickLoginBtn() {
        commonMethods.click(loginUI.loginBtn);
    }
    public void clickSignUpHere() {
        commonMethods.click(loginUI.SignUpHere);
    }
    public String getTextLogInTitle() {
        return commonMethods.getText(loginUI.LogInTitle);
    }
    public String getTextInvalidEmailAlert() {
        return commonMethods.getText(loginUI.InvalidEmailAlert);
    }
    public String getTextInvalidPassAlert() {
        return commonMethods.getText(loginUI.InvalidPassAlert);
    }
    public boolean RememberMe_isChecked() {
        System.out.println(loginUI.RememberMe);
        System.out.println("CHECK loginUI.RememberMe");
        return commonMethods.isSelected(loginUI.RememberMe);
    }
    public String getTextAlert() {
        return commonMethods.getText(loginUI.alertEmail);
    }
    public String getTextAlertPass() {
        return commonMethods.getText(loginUI.alertPass);
    }
}
