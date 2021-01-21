package Class;

import Interface.IMetodos;

public abstract class Persona implements IMetodos{
    private String cedula;
    private String Nombre;
    private String Apellido;
    /*private date fecha_de_nacimiento;
    teléfono, dirección*/
    public Persona() {
    }

    public Persona(String cedula, String Nombre, String Apellido) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

  
}
