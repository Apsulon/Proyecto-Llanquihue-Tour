package cl.llanquihuetour.model;

/**
 *Representamos a la clase Empleado
 * Formamos una relación de herencia con la clase Persona
 */

public class Empleado extends Persona {

    private String numeroEmpleado;
    private String cargo;
    private double sueldo;
    private boolean activo;

    /** Constructor de la clase Empleado*/
    public Empleado(String nombre, int edad, String telefono, Direccion direccion, String numeroEmpleado, String cargo, double sueldo, boolean activo) {
        super(nombre, edad, telefono, direccion);
        this.numeroEmpleado = numeroEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.activo = activo;
    }

    /** GETTERS AND SETTERS */

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    /** Metodo toString que nos devuelve una descripción completa
     * incluye Empleado, persona y direccion.
     * */
    @Override
    public String toString() {
        return "Empleado { " +
                "numeroEmpleado='" + numeroEmpleado + '\'' +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                ", activo=" + activo +
                '}' + super.toString()
                ;
    }
}
