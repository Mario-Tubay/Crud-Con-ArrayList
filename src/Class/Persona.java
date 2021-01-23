package Class;


import Interface.Crud;
import java.util.ArrayList;
import java.util.Date;

public abstract class Persona implements Crud{
    private String cedula;
    private String Nombre;
    private String Apellido;
    private Date fecha_de_nacimiento;
    public Persona() {
    }

    public Persona(String cedula, String Nombre, String Apellido, Date fecha_de_nacimiento) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
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

    public Date getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }


  
}
