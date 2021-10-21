public class Rol 
    extends Entidad 
    implements Imprimible{

    public int getId(){return this.id;};
    public void setID(int valor){
        this.id = valor;
    }
    @Override
    public String Imprimir() {
        // TODO Auto-generated method stub
        return "ID: " + Integer.toString(this.id) + ", Rol: " + this.nombre;
    }
}
