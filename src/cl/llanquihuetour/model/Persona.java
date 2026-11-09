package cl.llanquihuetour.model;

/**
 *Representamos a la clase Persona
 * Formamos una relación de composición con la clase Dirección
 */

public class Persona {

    private String nombre;
    private int edad;
    private String telefono;
    private Direccion direccion;

    /** Constructor de la clase Persona*/
    public Persona (String nombre, int edad, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /** GETTERS AND SETTERS */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    /** Metodo toString que nos devuelve una descripción */
    @Override
    public String toString() {
        return "Persona { " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", direccion=" + direccion +
                "}";
    }
}
