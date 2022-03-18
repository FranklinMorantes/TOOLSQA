package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class DetallesArticulo extends PageObject {

    public static final Target CLICK_WIDGETS =
            Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA")
                    .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]"));
    public static final Target CLICK_DATA_PICKERS =
            Target.the("SELECCIONAR DATE PICKER")
                    .located(By.xpath("//span[contains(text(),'Date Picker')]"));
    public static final Target INPUT_FECHA=
            Target.the("SELECCIONAR FECHA")
                    .located(By.xpath("//input[@id='datePickerMonthYearInput']"));
    public static final Target INPUT_DATATIME=
            Target.the("SELECCIONAR FECHA")
                    .located(By.xpath("//input[@id='dateAndTimePickerInput']"));

}
