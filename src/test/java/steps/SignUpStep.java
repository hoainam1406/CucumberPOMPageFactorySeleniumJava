package steps;

import base.CommonMethods;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import steps.serenity.Login.Serenity.LoginSerenity;
import steps.serenity.SignUp.Serenity.SignUpSerenity;

public class SignUpStep extends PageObject {
    @Steps
    LoginSerenity loginSerenity;
    SignUpSerenity signUpSerenity;
    CommonMethods commonMethods;

    @Given("^I want to open Login page$")
    public void openLoginPage() {
        loginSerenity.open_Login_Page();
    }

    @When("^I click on Sign Up Here hyperlink$")
    public void ClickOnSignUpHere() {
        loginSerenity.clickSignUpHere();
    }

    @Then("^The system navigate to SignUp page with (.*)$")
    public void VerifySignUpPageDisplays(String URL) {
        commonMethods.compareText(URL, commonMethods.getURL());
    }

    @Then("^The Internal Personal RadioBtn is selected in default$")
    public void VerifyInternalPersonalRadioBtn_isSelectedInDefault() {
        signUpSerenity.RadioBtnChecked();
    }

    @And("^I enter (.*), (.*), (.*), (.*)$")
    public void EnterData_WithoutFirstName(String lastName, String email, String pass, String cfmPass) {
        signUpSerenity.EnterLastName(lastName);
        signUpSerenity.EnterEmail(email);
        signUpSerenity.EnterPassWord(pass);
        signUpSerenity.EnterCfmPass(cfmPass);
    }

    @And("^I click SignUp button$")
    public void clickSignUp() {
        signUpSerenity.ClickSignUpBt();
    }

    @Then("^The (.*) displays under FirstName field$")
    public void VerifyAlertFirstNameDisplays(String alert) {
        commonMethods.compareText(alert, signUpSerenity.getTextFirstNameAlert().trim());
    }

    @And("^I enter valid data into (.*), (.*), (.*)$")
    public void EnterData_PassWordDontMatch(String firstname, String lastname, String email) {
        signUpSerenity.EnterFirstName(firstname);
        signUpSerenity.EnterLastName(lastname);
        signUpSerenity.EnterEmail(email);
    }

    @But("^I enter (.*) don't match with (.*)$")
    public void PasswordDontMatch(String pass, String cfmpass) {
        signUpSerenity.EnterPassWord(pass);
        signUpSerenity.EnterCfmPass(cfmpass);
    }

    @Then("^The (.*) displays under Confirm Password field$")
    public void VerifyAlertPasswordDontMatchDisplays(String alert) {
        commonMethods.compareText(alert, signUpSerenity.getTextCfmPassAlert().trim());
    }

    @When("^ I enter (.*), (.*), (.*), (.*), (.*)$")
    public void EnterValidData(String fname, String lname, String email, String pass, String cfmpass) {
        signUpSerenity.EnterFirstName(fname);
        signUpSerenity.EnterLastName(lname);
        signUpSerenity.EnterEmail(email);
        signUpSerenity.EnterPassWord(pass);
        signUpSerenity.EnterCfmPass(cfmpass);
    }

    @And("^I wait 10 seconds$")
    public void WaitForPageLoad() throws InterruptedException {
        commonMethods.ThreadSleep(10000);
    }

    @Then("^System navigate to VerifyEmail page with new (.*)$")
    public void VerifyNavigateToVerifyEmailPage(String URL) {
        commonMethods.compareText(URL, commonMethods.getURL());
    }
}
