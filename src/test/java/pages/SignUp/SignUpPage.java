package pages.SignUp;

import base.CommonMethods;
import locatorsUI.SignUpLocators.SignUpUI;
import net.thucydides.core.pages.PageObject;

public class SignUpPage extends PageObject {
    SignUpUI signUpUI;
    CommonMethods commonMethods;

    public void EnterFirstName(String firstname) {
        commonMethods.sendKeys(signUpUI.FirstName, firstname);
    }

    public void EnterLastName(String lastname) {
        commonMethods.sendKeys(signUpUI.LastName, lastname);
    }

    public void EnterEmail(String email) {
        commonMethods.sendKeys(signUpUI.Email, email);
    }

    public void EnterPassWord(String password) {
        commonMethods.sendKeys(signUpUI.PassWord, password);
    }

    public void EnterCfmPass(String cfmpass) {
        commonMethods.sendKeys(signUpUI.ConfirmPassWord, cfmpass);
    }

    public void ClickSignUpBt() {
        commonMethods.click(signUpUI.SignUpBtn);
    }

    public void RadioBtnChecked() {
        commonMethods.compareTrue(commonMethods.isSelected(signUpUI.InternalPersona));
    }

    public String getTextFirstNameAlert() {
        return commonMethods.getText(signUpUI.FirstNameAlert);
    }

    public String getTextCfmPassAlert() {
        return commonMethods.getText(signUpUI.CfmPassAlert);
    }

}
