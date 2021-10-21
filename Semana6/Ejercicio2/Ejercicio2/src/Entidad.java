public abstract class Entidad{
    protected int id;
    protected String nombre;
    public void setID(int valor){
        this.id = valor;
    }
    public String getNombre(){
        return this.nombre;}
    public void setNombre(String valor){
        this.nombre = valor;
    }
}