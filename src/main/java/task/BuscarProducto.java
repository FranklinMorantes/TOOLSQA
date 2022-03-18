package task;


import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePAge.*;

public class BuscarProducto implements Task {

    private String Nombre;
    private String Apellido;
    private String Email;
    private String Edad;
    private String Salario;
    private String Departamento;


    public BuscarProducto(String Nombre,String Apellido,String Email,String Edad, String Salario,String Departamento)
    {



        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Email=Email;
        this.Edad=Edad;
        this.Salario=Salario;
        this.Departamento=Departamento;


    }


    public static  BuscarProducto conDescripcion(String Nombre, String Apellido, String Email, String Edad, String Salario, String Departamento){


        return instrumented(BuscarProducto.class,Nombre,Apellido,Email,Edad,Salario,Departamento);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPTSTO

        actor.attemptsTo(


                TiempoEspera.unMomento(2),
                (Scroll.to(LINK_ELEMENTS)),
                Click.on(LINK_ELEMENTS),
                TiempoEspera.unMomento(2),
                (Scroll.to(LINK_WEB_TABLE)),
                Click.on(LINK_WEB_TABLE),
                TiempoEspera.unMomento(2),
                Click.on(LINK_SELECCIONAR_ADD),
                TiempoEspera.unMomento(2),
                Enter.theValue(Nombre).into(INPUT_TXT_FIRTSNAME),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                //Hit.the(Keys.ENTER).into(INPUT_TXT_FIRTSNAME),//REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA
                Enter.theValue(Apellido).into(INPUT_TXT_APELLIDO),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                //Hit.the(Keys.ENTER).into(INPUT_TXT_APELLIDO)); //REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA
                 Enter.theValue(Email).into(INPUT_TXT_EMAIL),
                  Enter.theValue(Edad).into(INPUT_EDAD),
                 Enter.theValue(Salario).into(INPUT_SALARIO),
                 Enter.theValue(Departamento).into(INPUT_DEPARTAMENTO),
                TiempoEspera.unMomento(2),
                 Click.on(CLICK_SUBMIT),
                TiempoEspera.unMomento(2),
                Click.on(CLICK_ELIMINAR));





                //Click.on(LINK_SELECCIONAR_PRODUCTO),// SELECCIONA EL PRODUCTO A AGREGAR
                //TiempoEspera.unMomento(4));






    }
}
