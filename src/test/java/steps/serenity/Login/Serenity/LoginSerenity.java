package steps.serenity.Login.Serenity;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Login.LoginPage;

public class LoginSerenity extends PageObject {
    LoginPage loginPage;

    public void open_Login_Page(){
        loginPage.open();
    }
    public void loginToIResource(String username, String pass) {
        loginPage.loginToIResource(username, pass);
    }
    public void EnterEmail(String username) {
        loginPage.EnterEmail(username);
    }
    public void EnterPassWord(String password) {
        loginPage.EnterPassWord(password);
    }
    public void ClickLoginBtn() {
        loginPage.ClickLoginBtn();
    }
    public void clickSignUpHere() {
        loginPage.clickSignUpHere();
    }
    public String getTextLogInTitle() {
        return loginPage.getTextLogInTitle();
    }
    public String getTextInvalidEmailAlert() {
        return loginPage.getTextInvalidEmailAlert();
    }
    public String getTextInvalidPassAlert() {
        return loginPage.getTextInvalidPassAlert();
    }
    public boolean RememberMe_isChecked() {
        return loginPage.RememberMe_isChecked();
    }
    public String getTextAlert() {
        return loginPage.getTextAlert();
    }
    public String getTextAlertPass() {
        return loginPage.getTextAlertPass();
    }
}
