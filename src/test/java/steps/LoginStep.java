package steps;

import base.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locatorsUI.LoginLocators.LoginUI;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import pages.Login.LoginPage;
import pages.Login.ProjectExplorePage;
import steps.serenity.Login.Serenity.LoginSerenity;
import steps.serenity.Login.Serenity.ProjectExploreSerenity;

public class LoginStep extends PageObject {

    @Steps
    LoginSerenity loginSerenity;
    CommonMethods commonMethods;
    ProjectExploreSerenity projectExploreSerenity;
    LoginPage loginPage;

    @Given("^I open Login page$")
    public void OpenLoginPage() {
        loginPage.openLoginPage();
    }

    @Then("^I want to verify RememberMe checkbox isn't selected in default$")
    public void VerifyRememberMeCheckBoxIsNotSelectedInDefault()  {
        commonMethods.compareFalse(loginSerenity.RememberMe_isChecked());
    }

    @When("^I login with email blank and valid password is (.*)$")
    public void Login_EmailBlank(String pass) {
        loginSerenity.EnterPassWord(pass);
        loginSerenity.ClickLoginBtn();
    }

    @Then("^System displays the (.*) message under email field$")
    public void VerifyAlertEmailDisplays(String alert){
        commonMethods.compareText(alert, loginSerenity.getTextAlert().trim());
    }
    @When("^I login with password blank and valid email is (.*)$")
    public void Login_PassWordBlank(String email) {
        loginSerenity.EnterEmail(email);
        loginSerenity.ClickLoginBtn();
    }

    @Then("^System displays the (.*) message under password field$")
    public void VerifyAlertPassWordDisplays(String alert) {
        commonMethods.compareText(alert, loginSerenity.getTextAlertPass().trim());
    }

    @When("^I login with wrong format of email is (.*) and valid password is (.*)$")
    public void Login_EmailWrongFormat(String WrongEmailF, String pass) {
        loginSerenity.loginToIResource(WrongEmailF, pass);
    }

    @Then("^System displays the (.*) message in the email field$")
    public void VerifyAlertEmailWrongDisplays(String alert) {
        commonMethods.compareText(alert, loginSerenity.getTextInvalidEmailAlert().trim());
    }

    @When("^I login with invalid password is (.*) and valid email is (.*)$")
    public void Login_InvalidPassWord(String email, String invalidPass) {
        loginSerenity.loginToIResource(email, invalidPass);
    }

    @Then("^System displays the (.*) message in the right top of page$")
    public void VerifyAlertDisplays_TopRight(String alert) {
        commonMethods.compareText(alert, loginSerenity.getTextInvalidPassAlert().trim());
    }

    @When("^I login with valid data are (.*) and (.*)$")
    public void Login_ValidData(String email, String pass) throws InterruptedException {
        loginSerenity.loginToIResource(email, pass);
        commonMethods.ThreadSleep(2000);
    }

    @Then("^System navigate to Explore Project page with (.*)$")
    public void VerifyUserNameDisplayInNextPage(String URL) {
        commonMethods.compareText(URL,commonMethods.getURL());
        projectExploreSerenity.Logout();
    }
}
