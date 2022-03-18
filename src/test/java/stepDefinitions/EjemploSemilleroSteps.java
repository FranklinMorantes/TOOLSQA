package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.AgregarProducto;
import task.BuscarProducto;
import userinterfaces.HomePAge;
import userinterfaces.PagsAlerts;

public class EjemploSemilleroSteps {
    @Managed(driver = "chrome")
    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor = Actor.named("Global");
    private HomePAge homePage = new HomePAge();


    public EjemploSemilleroSteps() {
    }


    @Dado("que un cliente accede a la web de compras")
    public void queUnClienteAccederAlaWebDeComprar() {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();

        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn((PageObject) homePage));


    }

    @Cuando("^el agrega de (.*) de (.*) al correo (.*) con (.*) años y salario de (.*) y departamento (.*) con fecha (.*) y (.*)$")
    public void elAgregaUnProductoAlCarrito(String Nombre, String Apellido, String Email, String Edad, String Salario, String Departamento, String Fecha, String Hora) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(Nombre, Apellido, Email, Edad, Salario, Departamento),
                AgregarProducto.cantidad(Fecha, Hora),
                PagsAlerts.Alertas(Nombre));


    }

    @Entonces("el ve los productos en el carrito de compras")
    public void elVeLosProductosEnElCarritoDeCompras() {


    }

    @Cuando("el agrega un producto al carrito")
    public void elAgregaUnProductoAlCarrito(io.cucumber.datatable.DataTable dataTable) {


    }

}