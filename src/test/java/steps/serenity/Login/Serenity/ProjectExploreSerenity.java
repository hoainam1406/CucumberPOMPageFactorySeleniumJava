package steps.serenity.Login.Serenity;

import net.thucydides.core.steps.ScenarioSteps;
import pages.Login.ProjectExplorePage;

public class ProjectExploreSerenity extends ScenarioSteps {
    ProjectExplorePage projectExplorePage;

    public void Logout(){
        projectExplorePage.Logout();
    }
}
