package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmHome extends BrowserUtils {
    public OrangeHrmHome(){
        PageFactory.initElements(driver, this);
    }
}
