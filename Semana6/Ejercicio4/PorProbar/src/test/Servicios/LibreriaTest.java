package test.Servicios;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;

public class LibreriaTest {
    @Test
    public void testPrestar(){
        Libro miLibro = new Libro("Moby Dick", "Herman Melvile");
        Libreria miLibreria = new Libreria();
        try{
            miLibreria.prestar(miLibro);
            fail();
        } catch(Exception ex){
            assertTrue(true);
        }
    }
    @Test
    public void testDevolver(){
        Libro miLibro = new Libro("Moby Dick", "Herman Melvile");
        Libreria miLibreria = new Libreria();
        try{
            miLibreria.devolver(miLibro);
            fail();

        } catch(Exception ex){
            assertTrue(true);
        }           
    }
}
