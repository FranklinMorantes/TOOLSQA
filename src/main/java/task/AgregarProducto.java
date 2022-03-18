package task;


import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetallesArticulo.*;

public class AgregarProducto implements Task {

    private static String Fecha;
    private static String Hora;
    private Actor actor;

    //CREAR NUESTRO CONSTRUCTOR
    public AgregarProducto(String Fecha,String Hora){
        //CREAR VARIABLE

        this.Fecha=Fecha;
        this.Hora=Hora;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TiempoEspera.unMomento(5),
                (Scroll.to(CLICK_WIDGETS)),
                TiempoEspera.unMomento(2),
                Click.on(CLICK_WIDGETS),
                TiempoEspera.unMomento(2),
                Click.on(CLICK_DATA_PICKERS),
                TiempoEspera.unMomento(3),
                //DoubleClick.on(INPUT_FECHA),
                //DoubleClick.on(INPUT_FECHA),
                //Limpiar Barra
                Hit.the(Keys.SHIFT,Keys.HOME).into(INPUT_FECHA),
                Hit.the(Keys.BACK_SPACE).into(INPUT_FECHA),
                Enter.theValue(Fecha).into(INPUT_FECHA),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),
                Hit.the(Keys.SHIFT,Keys.HOME).into(INPUT_DATATIME),
                Hit.the(Keys.BACK_SPACE).into(INPUT_DATATIME),
                 Hit.the(Keys.ENTER).into(INPUT_FECHA),//REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA
                 TiempoEspera.unMomento(2),
                Enter.theValue(Hora).into(INPUT_DATATIME),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),
                Hit.the(Keys.ENTER).into(INPUT_DATATIME),//REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2));

                //Hit.the(Keys.BACK_SPACE).keyIn(INPUT_DATATIME),  Borrado en un input



        //SELECCIONAR COLOR
               // Enter.theValue(cantidad).into(),    //INGRESA EL VALOR A BUSCAR
               // Click.on(),//SELECCIONAR IR A LA CESTA
                //Click.on());//SELECCIONAR VER LA CESTA

    }


    public static AgregarProducto cantidad(String Fecha,String Hora){
        return instrumented(AgregarProducto.class,Fecha,Hora);

    }
}
