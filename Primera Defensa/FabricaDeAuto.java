
/**
 * Write a description of class FabricaDeAuto here.
 * 
 * @author (Jose Brayan Mamani Rodriguez) 
 * @version (0.1)
 */
public class FabricaDeAuto{
    private String marca;
    private String color;
    private int modelo;
    
    public FabricaDeAuto(String valorMarca, String valorColor, int valorModelo){
        marca = valorMarca;
        color = valorColor;
        modelo = 2021;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public int getModelo(){
        return modelo;
    }
    
    public void setMarca(String valor){
        marca = valor;
    }
    public void setColor(String valor){
        color = valor;
    }
    public void setModelo(int valor){
        modelo = valor;
    }
}
