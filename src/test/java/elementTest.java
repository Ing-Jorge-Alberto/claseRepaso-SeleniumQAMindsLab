import Steps.elementSteps;
import Steps.landingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class elementTest extends baseTest{
    elementSteps elementSteps = new elementSteps(webDriver);
    landingsSteps landingsSteps =new landingsSteps(webDriver);

    @Test(description="Test para dar clic a la opcion TexBox y verificar el campo Full name")
    public void testFormElements() {
        landingsSteps.clickOption(0);
        elementSteps.clickOptionTextBox(0);
        System.out.println(elementSteps.getTextFullName());
        Assert.assertEquals(elementSteps.getTextFullName(), "Full Name");
        System.out.println(elementSteps.getTextEmail());
        Assert.assertEquals(elementSteps.getTextEmail(),"Email");
        System.out.println(elementSteps.getTextCurrentAddress());
        Assert.assertEquals(elementSteps.getTextCurrentAddress(),"Current Address");
        System.out.println(elementSteps.getTextPermanentAddress());
        Assert.assertEquals(elementSteps.getTextPermanentAddress(),"Permanent Address");
        System.out.println(elementSteps.getTextSubmit());
        Assert.assertEquals(elementSteps.getTextSubmit(),"Submit");
    }

    @Test(description = "Test para seleccionar colores del drop down")
    public void testDropDown() {
        webDriver.get("https://demoqa.com/select-menu");
        elementSteps.selectFavoriteColor("Aqua");
        System.out.println("Option selected was: Aqua");
        //Select by index:3
        elementSteps.selectFavoriteColorByIndex(3);
        System.out.println("Option selected was: 3");
        //Select by value:9
        elementSteps.selectFavoriteColorByValue("9");
        System.out.println("Option selected was: '9'");
        System.out.println("Is Select Multiple?:"+elementSteps.isSelectMultiple());
    }

    @Test(description = "Test para selecionar carros del drop down")
    public void testDropDownCars() {
        webDriver.get("https://demoqa.com/select-menu");
        elementSteps.selectFavoriteCar("Audi");
        System.out.println("option selected was: Audi");
        //Select by index:1
        elementSteps.selectFavoriteCarByIndex(1);
        System.out.println("Option selected was: 1");
        //Select by value: volvo
        elementSteps.selectFavoriteCarByValue("volvo");
        System.out.println("Option selected was: volvo");
    }
}
