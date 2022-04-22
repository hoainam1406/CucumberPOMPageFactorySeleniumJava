package base;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class CommonMethods extends PageObject {

    public void compareText(String expected, String actual) {
        Assert.assertEquals(actual, expected);
    }
    public boolean compareFalse(boolean conditionF) {
        Assert.assertFalse(conditionF);
        return false;
    }
    public boolean compareTrue(boolean conditionT) {
        Assert.assertTrue(conditionT);
        return true;
    }
    public void RefreshPage() {
        getDriver().navigate().refresh();
    }
    public void ThreadSleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }
    public void Logout(WebElement element) {
        element.click();
    }
    public String getURL( ) {
        return getDriver().getCurrentUrl();
    }
    public String getText(WebElement element){
        return element.getText();
    }

    public void sendKeys(WebElement element, String content){
        element.sendKeys(content);
    }
    public void click(WebElement element){
        element.click();
    }
    public boolean isSelected(WebElement element){
        return element.isSelected();
    }
}
