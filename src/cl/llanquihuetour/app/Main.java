package cl.llanquihuetour.app;

import cl.llanquihuetour.model.Direccion;
import cl.llanquihuetour.model.Empleado;
import cl.llanquihuetour.model.Persona;

public class Main {
    public static void main(String[] args) {

        Direccion direccion = new Direccion("Av. Brasil", "23", "La Florida", "Santiago", "Metropolitana");

        Persona persona = new Persona("Juan Carlos Bodoque", 23, "123456", direccion);

        Empleado empleado = new Empleado("Juan Carlos Bodoque", 23, "123456", direccion, "056", "Periodista", 800000,true );


        System.out.println("\n- - - DIRECCION - - -");
        System.out.println(direccion.toString() + "\n");

        System.out.println("- - - PERSONA - - -");
        System.out.println(persona.toString() + "\n");

        System.out.println("- - - EMPLEADO - - -");
        System.out.println(empleado.toString());


    }
}