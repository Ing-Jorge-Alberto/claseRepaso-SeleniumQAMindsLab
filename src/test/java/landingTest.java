import Steps.elementSteps;
import Steps.landingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class landingTest extends baseTest{
    elementSteps elementSteps =new elementSteps(webDriver);
    landingsSteps landingsSteps =new landingsSteps(webDriver);

    @Test
    public void testMenuOptionElement() {
        landingsSteps.clickOption(0);
        System.out.println(elementSteps.getText());
        Assert.assertEquals(elementSteps.getText(), "Text Box");
    }

}
