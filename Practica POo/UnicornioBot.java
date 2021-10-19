
/**
 * Write a description of class UniconioBot here.
 * 
 * @author (Jose Brayan Mamani Rodriguez) 
 * @version (a version number or a date)
 */
public class UnicornioBot{
    private String nombre;
    
    public UnicornioBot(String nombre){
     this.nombre = nombre;  
    }
 
    public String saludar(){
     String saludo =  "Hola "+nombre;
     return saludo;
    }
 
    public void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
}
