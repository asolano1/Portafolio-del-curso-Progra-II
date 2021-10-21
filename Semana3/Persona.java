package Origen;
public class Persona {
    int id;
    String nombre;
    String apellido;
    short edad;
    public Persona(){}
    public Persona(int id){
        this.id = id;
    }
    public Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;  
    }
    public Persona(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;    
    }
    public void  setId(int id){
        if(this.id <= 0){
            this.id = id;
        }
    }   


    @Override
    public String toString(){
        this.me = "ID: " + Integer.toString(this.id);
        this.me += " Nombre: " + this.nombre;
        this.me += " Apellido: " + this.Apellido;
        this.me += " Edad: " + Integer.toString(this.Edad);
        return this.me;
    }
}