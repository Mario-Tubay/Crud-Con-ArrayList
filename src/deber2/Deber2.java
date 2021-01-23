package deber2;


import Class.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Deber2 {
    static ArrayList<Estudiante> listEst = new ArrayList<Estudiante>();
    static ArrayList<Profesor> listPro = new ArrayList<Profesor>();
    static ArrayList<secretario> listSec = new ArrayList<secretario>();
    static ArrayList<Conserje> listCons = new ArrayList<Conserje>();
    static ArrayList<Materia> listMat = new ArrayList<Materia>();
    
    public static void main(String[] args) {
     
        Estudiante e;
        
        while(menu()!=4){//Menu Principal 
            switch(menu()){//Dependiendo de la opcion saldra el tipo
                case 1://ingreso 
                    while(menuTipo()!= 6){//menu para escoger el tipo de persona 
                        switch(menuTipo()){//dependiendo que cojamos nos muestra para el ingreso 
                            case 1://ingreso de estudiantes
                                ingresoEstudiantes();
                                break;
                            case 2://ingreso de Profesor
                                ingresoProfesor();
                                break;
                            case 3://ingreso de Materia
                                ingresoMateria();
                                break;
                            case 4://ingreso de Secretario
                                ingresoSecretario();
                                break;
                            case 5://ingreso de Conserje 
                                ingresoConserje();
                                break;
                        }
                    }
                    break;
                case 2:
                     while(menuTipo()!= 6){
                        
                    }
                    break;
                case 3:
                     while(menuTipo()!= 6){
                        
                    }
                    break;
                
            }
        }
    }
    
    public static int menu (){
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("1) Ingreso");
        System.out.println("2) Modificacion");
        System.out.println("3) Eliminacion ");
        System.out.println("4) Salir");
        System.out.print("Opcion: ");
        opc = sc.nextInt();
        return opc;
        
    }
     public static int menuTipo (){
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("1) Estudiante");
        System.out.println("2) Profesor ");
        System.out.println("3) Materia");
        System.out.println("4) Secretario");
        System.out.println("5) Conserje");
        System.out.println("6) Salir");
         System.out.print("Opcion: ");
        opc = sc.nextInt();
        return opc;
    }
     public static void ingresoEstudiantes(){
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String Carrera;
    int semestre;
    String fecha_inicio;
    Date fecha_inicio1= null;
    String fecha_finalizacion, fech_nac;
    Date fecha_finalizacion1=null, fech_nac1= null;
    int materiaSemestre;
    String nombre, apellido, cedula;
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Cedula: ");     
        cedula= sc.next();
        System.out.print("Nombre: ");
        nombre= sc.next();
        System.out.print("Apellido: ");
        apellido = sc.next();
        System.out.print("Fecha de Nacimiento: ");
        fech_nac = sc.next();
         try {
        fech_nac1= formato.parse(fech_nac);
         } catch (Exception e) {
         }
        System.out.print("Carrera: ");
        Carrera = sc.next();
        System.out.print("Semestre: ");
        semestre = sc.nextInt();
        System.out.print("Materia por semestre: ");
        materiaSemestre = sc.nextInt();
        System.out.print("Fecha de Inicio: ");
        fecha_inicio = sc.next();
         try {
        fecha_inicio1= formato.parse(fech_nac);
         } catch (Exception e) {
             System.out.println(""+e.getMessage());
         }
         System.out.println("fecha nac "+ fech_nac1);
           System.out.print("Fecha de Finalizacion: ");
        fecha_finalizacion = sc.next();
         try {
        fecha_finalizacion1 = formato.parse(fech_nac);
         } catch (Exception e) {
             System.err.println(""+e.getMessage());
         }
        
        Estudiante e = new Estudiante(Carrera, semestre, fecha_inicio1, fecha_finalizacion1, materiaSemestre, cedula, nombre, apellido, fecha_finalizacion1);
        listEst = e.ingresar(e);
        for(int i =0; i<listEst.size();i++){
            System.out.println(""+listEst.get(i).toString());
        }
     }
    
     
     
     
     public static void ingresoProfesor(){
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
   

    String fech_nac;
    Date fech_nac1= null;
   
    
    int cantMaterias;
    String Titulo;
    String nombre, apellido, cedula, materias, carreras;
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Cedula: ");     
        cedula= sc.next();
        System.out.print("Nombre: ");
        nombre= sc.next();
        System.out.print("Apellido: ");
        apellido = sc.next();
        System.out.print("Fecha de Nacimiento: ");
        fech_nac = sc.next();
         try {
        fech_nac1= formato.parse(fech_nac);
         } catch (Exception e) {
         }
         
         System.out.print("Materias: ");
         materias = sc.next();
         System.out.print("Carreras: ");
         carreras = sc.next();
         System.out.print("Titulo: ");
         Titulo = sc.next();
        Profesor p = new Profesor(carreras, materias, Titulo, cedula, nombre, apellido, fech_nac1);
        listPro = p.ingresar(p);
        for(int i =0; i<listPro.size();i++){
            System.out.println(""+listPro.get(i).toString());
        }
     }
    public static void ingresoSecretario(){
    String nombre, apellido, cedula;
    String fech_nac;
    Date fech_nac1= null;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String carreras, turno,  fechaIngreso;
    Date fechaIngreso1 = null;
    int años_servicio;
   
  
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Cedula: ");     
        cedula= sc.next();
        System.out.print("Nombre: ");
        nombre= sc.next();
        System.out.print("Apellido: ");
        apellido = sc.next();
        System.out.print("Fecha de Nacimiento: ");
        fech_nac = sc.next();
         try {
        fech_nac1= formato.parse(fech_nac);
         } catch (Exception e) {
         }

         System.out.print("Carrera: ");
         carreras = sc.next();
         System.out.print("Turno: ");
         turno = sc.next();
       System.out.print("Fecha de Ingreso: ");
        fechaIngreso = sc.next();
         try {
        fechaIngreso1= formato.parse(fechaIngreso);
         } catch (Exception e) {
         }
         System.out.print("Años de servicios: ");
         años_servicio = sc.nextInt();
         
         secretario s = new secretario(carreras, fechaIngreso1, años_servicio, turno, cedula, nombre, apellido, fech_nac1);
         listSec = s.ingresar(s);
        for(int i =0; i<listSec.size();i++){
            System.out.println(""+listSec.get(i).toString());
        }
     }
    
    public static void ingresoConserje(){
    String nombre, apellido, cedula;
    String fech_nac;
    Date fech_nac1= null;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String carreras, turno,  fechaIngreso;
    Date fechaIngreso1 = null;
    int años_servicio;
   
  
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Cedula: ");     
        cedula= sc.next();
        System.out.print("Nombre: ");
        nombre= sc.next();
        System.out.print("Apellido: ");
        apellido = sc.next();
        System.out.print("Fecha de Nacimiento: ");
        fech_nac = sc.next();
         try {
        fech_nac1= formato.parse(fech_nac);
         } catch (Exception e) {
         }

         System.out.print("Carrera: ");
         carreras = sc.next();
         System.out.print("Turno: ");
         turno = sc.next();
       System.out.print("Fecha de Ingreso: ");
        fechaIngreso = sc.next();
         try {
        fechaIngreso1= formato.parse(fechaIngreso);
         } catch (Exception e) {
         }
         System.out.print("Años de servicios: ");
         años_servicio = sc.nextInt();
         
         Conserje s = new Conserje(carreras, fechaIngreso1, años_servicio, turno, cedula, nombre, apellido, fech_nac1);
         listSec = s.ingresar(s);
        for(int i =0; i<listCons.size();i++){
            System.out.println(""+listCons.get(i).toString());
        }
     }
    public static void ingresoMateria(){
         String nombre;
         int codigo; 
         int semestre;
         Scanner sc = new Scanner(System.in);
         System.out.print("Nombre de la Materia: ");
         nombre = sc.next();
         System.out.print("Codigo de la Materia: ");
         codigo = sc.nextInt();
         System.out.print("Semestre de la Materia: ");
         semestre = sc.nextInt();
         
         Materia m = new Materia(nombre, codigo, semestre);
         listMat.add(m);
         
         for(int i =0; i<listMat.size();i++){
             System.out.println(""+listMat.get(i).toString());
         }
         
         
    }
}
