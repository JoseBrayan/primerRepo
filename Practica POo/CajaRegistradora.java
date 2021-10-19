
/**
 * Write a description of class CajaRegistradora here.
 * 
 * @author (Jose Brayan Mamani Rodriguez) 
 * @version (a version number or a date)
 */
public class CajaRegistradora{
    private int total;

    public CajaRegistradora(){
        total = 0;
    }
    
    public String registrarPrecio(int precio, int cantidad){
        total = total+(precio*cantidad);
        return "precio registrado";
    } 
    
    public String consultarTotal(){
        return "El total por pagar es: "+total+"bs.";
    }
    
    public String cobrar(int dinero){
        String respuesta = ""; 
        if(dinero<total){
            respuesta = "Error: El dinero no cubre la compra";
        }else{
            int cambio = dinero-total;
            respuesta = "cobro exitoso, el cambio es: "+cambio+"bs.";
            total = 0;
        }
        return respuesta;
    }
}
