package Class;
public class Materia {
private String nombre;
private int código; 
private int semestre;

    public Materia() {
    }

    public Materia(String nombre, int código, int semestre) {
        this.nombre = nombre;
        this.código = código;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Codigo: "+getCódigo()+" Semestre: "+getSemestre();
    }

}
