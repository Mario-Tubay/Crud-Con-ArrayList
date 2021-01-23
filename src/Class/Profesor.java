/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;
import java.util.Date;

public class Profesor extends Persona{
    private String Carreras;
    private String Materias;
    private String Titulo;
    static ArrayList<Persona> listPersona = new ArrayList<Persona>();

    public Profesor() {
    }

    public Profesor(String Carreras, String Materias, String Titulo, String cedula, String Nombre, String Apellido, Date fecha_de_nacimiento) {
        super(cedula, Nombre, Apellido, fecha_de_nacimiento);
        this.Carreras = Carreras;
        this.Materias = Materias;
        this.Titulo = Titulo;
    }

    public String getCarreras() {
        return Carreras;
    }

    public void setCarreras(String Carreras) {
        this.Carreras = Carreras;
    }

    public String getMaterias() {
        return Materias;
    }

    public void setMaterias(String Materias) {
        this.Materias = Materias;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public static ArrayList<Persona> getListPersona() {
        return listPersona;
    }

    public static void setListPersona(ArrayList<Persona> listPersona) {
        Profesor.listPersona = listPersona;
    }

   

    @Override
    public ArrayList ingresar(Object e) {
        listPersona.add((Persona) e);
        return listPersona;
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cedula: "+getCedula()+" Nombre: "+getNombre()+" Apellido: "+getApellido()+" Fecha Nacimiento: "+getFecha_de_nacimiento()+
                " Materias: "+getMaterias()+" Carreras: "+getCarreras()+" Titulo: "+getTitulo();
    }

    
  
    
}
