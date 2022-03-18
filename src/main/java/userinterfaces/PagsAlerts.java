package userinterfaces;

import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import task.AgregarProducto;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static task.TaskAlerts.*;
import static userinterfaces.HomePAge.INPUT_TXT_FIRTSNAME;

public class PagsAlerts implements Task {

    private final String Nombre;
    private Actor actor;
    private WebDriver driver;

    public PagsAlerts(String Nombre) {
        //CREAR VARIABLE

        this.Nombre=Nombre;
        //this.Hora=Hora;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TiempoEspera.unMomento(5),
                Click.on(CLICK_ALERTS),
                TiempoEspera.unMomento(2),
                (Scroll.to(CLICK_ALERTS1)),
                TiempoEspera.unMomento(2),
                Click.on(CLICK_ALERTS1),
                TiempoEspera.unMomento(4),
                Click.on(CLICK_CLICK1),
                TiempoEspera.unMomento(4));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                TiempoEspera.unMomento(4),
               Click.on(CLICK_CLICK2),
                TiempoEspera.unMomento(15));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(CLICK_CLICK3),
                TiempoEspera.unMomento(4));
        //ACEPTAR ALERTA O POPUP
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(CLICK_CLICK4),
        TiempoEspera.unMomento(4));

        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        TiempoEspera.unMomento(5);
        alert.sendKeys(String.valueOf(Nombre));
        TiempoEspera.unMomento(15);
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
        actor.attemptsTo(TiempoEspera.unMomento(5));

       // BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys("Franklin");
        //BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
        //actor.attemptsTo(TiempoEspera.unMomento(2));

    }

    public static PagsAlerts Alertas(String Nombre){
        return instrumented(PagsAlerts.class,Nombre);

    }

}

