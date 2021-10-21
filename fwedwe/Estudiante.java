public class Estudiante extends Persona{
    private int nota;
    public Estudiante(){}
    public Estudiante(
        int id, String nombre, String apellido){
            super(id, nombre, apellido);
        }
    public void setNota(int value){
        this.nota = value;
    }
    public int getNota(){
        return this.nota;
    }
}