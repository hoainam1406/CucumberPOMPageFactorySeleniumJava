package steps.serenity.SignUp.Serenity;

import net.thucydides.core.steps.ScenarioSteps;
import pages.SignUp.SignUpPage;

public class SignUpSerenity extends ScenarioSteps {
    SignUpPage signUpPage;

    public void EnterFirstName(String firstname) {
        signUpPage.EnterFirstName(firstname);
    }

    public void EnterLastName(String lastname) {
        signUpPage.EnterLastName(lastname);
    }
    public void EnterEmail(String email){
        signUpPage.EnterEmail(email);
    }

    public void EnterPassWord(String password) {
        signUpPage.EnterPassWord(password);
    }

    public void EnterCfmPass(String cfmpass) {
        signUpPage.EnterCfmPass(cfmpass);
    }

    public void ClickSignUpBt() {
        signUpPage.ClickSignUpBt();
    }

    public void RadioBtnChecked() {
        signUpPage.RadioBtnChecked();
    }
    public String getTextFirstNameAlert(){
       return signUpPage.getTextFirstNameAlert();
    }
    public String getTextCfmPassAlert(){
        return signUpPage.getTextCfmPassAlert();
    }

}
