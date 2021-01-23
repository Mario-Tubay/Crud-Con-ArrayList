/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.*;

/**
 *
 * @author mario
 */
public class Estudiante  extends Persona{

   private String Carrera;
   private int semestre;
   private Date fecha_inicio;
   private Date fecha_finalizacion;
   private int materiaSemestre;
   static ArrayList<Persona> listPersona = new ArrayList<Persona>();
    public Estudiante() {
    }

    public Estudiante(String Carrera, int semestre, Date fecha_inicio, Date fecha_finalizacion, int materiaSemestre, String cedula, String Nombre, String Apellido, Date fecha_de_nacimiento) {
        super(cedula, Nombre, Apellido, fecha_de_nacimiento);
        this.Carrera = Carrera;
        this.semestre = semestre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizacion = fecha_finalizacion;
        this.materiaSemestre = materiaSemestre;
    }

 
    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public int getMateriaSemestre() {
        return materiaSemestre;
    }

    public void setMateriaSemestre(int materiaSemestre) {
        this.materiaSemestre = materiaSemestre;
    }

  
     @Override
    public String toString(){
        return "Cedula: "+getCedula()+" Nombre: "+getNombre()+" Apellido: "+getApellido()+" Carrera: "+getCarrera()+""
                + " Fecha Nacimiento: "+getFecha_de_nacimiento()+" Fecha Inicio: "+getFecha_inicio()+" Fecha de Finalizacion: "+getFecha_finalizacion()+""
                +" Matrias por semestre: "+getMateriaSemestre() + " Semestre: "+getSemestre();
    }

    @Override
    public ArrayList ingresar(Object t) {
        listPersona.add((Persona)t);
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

   

    
    
 





   
   
    
}
