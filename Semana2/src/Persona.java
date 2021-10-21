public class Persona {
    int id;
    String nombre;
    String apellido;
    short edad;

    void setId(int valor){
        if(id <= 0){
            id = valor;
        }
    }
    
    int getId(){
        return id;
    }

    public void saludar(){
        System.out.println(mensaje());
    }

        public String imprimir(){
        return "Soy " + nombre;
    }

    private String mensaje(){
        return "Hola me llamo "+ nombre + "y mi ID es " + id;
    }
}