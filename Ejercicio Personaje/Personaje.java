//Modificador de Acceso, palabra reservada class, nombre De La Clase
/**
 * Write a description of class Personaje here.
 * 
 * @author Jose Brayan Mamani Rodriguez 
 * @version 0.1
 */
public class Personaje{
   //Modificador de Acceso, tipo de dato, nombre del atributo 
    private String nombre;
    private int nivel;
   //this (esto) para buscar desde afuera, este es el constructor 
   public Personaje(String nombre){
        this.nombre = nombre;
        nivel = 1;
    }
   //get = obtener 
   public String getNombre(){
       return nombre;
   }
   public String getNivel(){
       return nivel;
   }
   
   // set = modifica el tipo de dato
   public void setNombre(String kratos){
       nombre = kratos;
   }
}
