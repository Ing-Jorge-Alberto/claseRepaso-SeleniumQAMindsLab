package Steps;

import org.openqa.selenium.WebDriver;
import Pages.elementsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class elementSteps extends baseSteps{
    elementsPage elementsPage=new elementsPage(webDriver);

    public elementSteps(WebDriver webDriver) {
        super(webDriver);
    }
    //Validar que este la opcion Text Box
    public String getText(){
        String texto = elementsPage.getElementOption().getText();
        return texto;
    }
    //Dar clic en la opcion Text Box
    public void clickOptionTextBox(int option){
        elementsPage.getMenuOptionsElements().get(option).click();
    }
    //Validar que este el campo Full Name
    public String getTextFullName(){
        String texto = elementsPage.getElementFullName().getText();
        return texto;
    }
    //Validar que este el campo Email
    public String getTextEmail(){
        String texto = elementsPage.getElementEmail().getText();
        return texto;
    }
    //Validar que este el campo Current Address
    public String getTextCurrentAddress(){
        String texto = elementsPage.getElementCurrentAddress().getText();
        return texto;
    }
    //Validar que este el campo Permanent Address
    public String getTextPermanentAddress(){
        String texto = elementsPage.getElementPermanentAddress().getText();
        return texto;
    }
    //Validar que este el boton Submit
    public String getTextSubmit(){
        String texto = elementsPage.getElementSubmit().getText();
        return texto;
    }

    //Drop Down Colors
    public void selectFavoriteColor(String color){
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByVisibleText(color);
    }
    public void selectFavoriteColorByIndex(int index){
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByIndex(index);
    }
    public void selectFavoriteColorByValue(String value){
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByValue(value);
    }
    public boolean isSelectMultiple(){
        Select dropDownColors = elementsPage.getDropDownColors();
        return dropDownColors.isMultiple();
    }
    public String getSelectedColor(){
        Select dropDownColors = elementsPage.getDropDownColors();
        WebElement selectedOption = dropDownColors.getFirstSelectedOption();
        return selectedOption.getText();
    }

    //Drop Down Cars
    public void selectFavoriteCar(String car){
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByVisibleText(car);
    }
    public void selectFavoriteCarByIndex(int index){
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByIndex(index);
    }
    public void selectFavoriteCarByValue(String value){
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByValue(value);
    }
    public boolean isCarSelectMultiple(){
        Select dropDownCars = elementsPage.getDropDownCars();
        return dropDownCars.isMultiple();
    }
}