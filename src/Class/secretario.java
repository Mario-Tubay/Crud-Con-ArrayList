package Class;

import static Class.Profesor.listPersona;
import java.util.ArrayList;
import java.util.Date;

public class secretario extends Persona{
   private String carrera;
   private Date fecha_ingreso;
   private int años_servicio;
   private String turno;
  static ArrayList<Persona> listPersona = new ArrayList<Persona>();
    public secretario() {
    }

    public secretario(String carrera, Date fecha_ingreso, int años_servicio, String turno, String cedula, String Nombre, String Apellido, Date fecha_de_nacimiento) {
        super(cedula, Nombre, Apellido, fecha_de_nacimiento);
        this.carrera = carrera;
        this.fecha_ingreso = fecha_ingreso;
        this.años_servicio = años_servicio;
        this.turno = turno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getAños_servicio() {
        return años_servicio;
    }

    public void setAños_servicio(int años_servicio) {
        this.años_servicio = años_servicio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public ArrayList ingresar(Object t) {
       listPersona.add((Persona) t);
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
                " Carrera: "+getFecha_ingreso()+ " Años: "+getAños_servicio()+" turno"+getTurno();
    }
   
    
}
