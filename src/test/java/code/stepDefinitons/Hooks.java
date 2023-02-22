package code.stepDefinitons;

import code.utils.BrowserUtils;
import code.utils.ConfigurationReader;
import code.utils.Driver;
import io.cucumber.java.Before;

public class Hooks extends BrowserUtils {

    @Before
    public void setup(){
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperties("urlHRM"));

    }
}
