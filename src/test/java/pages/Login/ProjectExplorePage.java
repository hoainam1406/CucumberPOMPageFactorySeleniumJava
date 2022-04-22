package pages.Login;

import base.CommonMethods;
import locatorsUI.LoginLocators.ProjectExploreUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class ProjectExplorePage extends PageObject {
    ProjectExploreUI projectExploreUI;
    CommonMethods commonMethods;

    public void Logout() {
        commonMethods.Logout(projectExploreUI.LogoutBtn);
    }


}
