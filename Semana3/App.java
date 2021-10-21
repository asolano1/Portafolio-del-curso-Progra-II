public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        int var = 1;
        Estudiante estudiante = new Estudiante();
        estudiante.id = 1;
        estudiante.nombre = "John";
        estudiante.apellido = "Doe";
        estudiante.edad = 25;
        estudiante.setId(2);
        estudiante.saludar();
        estudiante.setNota(100);
        
        Persona persona = new Persona();
        persona.setId(3); 
    
        verIdPersona(persona);
        verIdPersona(estudiante);
    
    }

 

    static void verIdPersona(Persona persona){
        System.out.println(persona.getId());
        if(persona instanceof Estudiante){
            System.out.println(((Estudiante) persona).setNota);
        }
    }
}