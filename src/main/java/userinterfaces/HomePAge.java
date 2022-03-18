package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://demoqa.com/")

public class HomePAge extends PageObject {
//SELECCIONAR NUESTRO PRIMER OBJETIVO DENTRO DE LA PAGINA



    public static final Target LINK_ELEMENTS =
            Target.the("SELECCIONAR ELEMENTS")
                    .located(By.xpath("//h5[contains(text(),'Elements')]"));
    public static final Target LINK_WEB_TABLE =
            Target.the("SELECCIONAR WEB TABLE")
                    .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));

    public static final Target LINK_SELECCIONAR_ADD =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").located(By.xpath("//button[@id='addNewRecordButton']"));
    public static final Target INPUT_TXT_FIRTSNAME =
            Target.the("SELECCIONAR PRIMER NOMBRE")
                    .located(By.xpath("//input[@id='firstName']"));
    public static final Target INPUT_TXT_APELLIDO =
            Target.the("SELECCIONAR APELLIDO")
                    .located(By.xpath("//input[@id='lastName']"));
    public static final Target INPUT_TXT_EMAIL =
            Target.the("SELECCIONAR EMAIL")
                    .located(By.xpath("//input[@id='userEmail']"));
    public static final Target INPUT_EDAD =
            Target.the("SELECCIONAR EMAIL")
                    .located(By.xpath("//input[@id='age']"));
    public static final Target INPUT_SALARIO =
            Target.the("SELECCIONAR SALARIO ")
                    .located(By.xpath("//input[@id='salary']"));
    public static final Target INPUT_DEPARTAMENTO =
            Target.the("SELECCIONAR SALARIO ")
                    .located(By.xpath("//input[@id='department']"));
    public static final Target CLICK_SUBMIT =
            Target.the("SELECCIONAR SUBMIT")
                    .located(By.xpath("//button[@id='submit']"));
    public static final Target CLICK_ELIMINAR =
            Target.the("SELECCIONAR ELIMINAR")
                    .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[2]/*[1]"));









    public static final Target LINK_SELECCIONAR_CARRITO =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").locatedBy("p[@id='mlCategory']");

}