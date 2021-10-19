
/**
 * Write a description of class UnicorioTron here.
 * 
 * @author (Jose Brayan Mamani Rodriguez) 
 * @version ()
 */
public class UnicorioTron{
    private int dinero;
    private int numeroSecreto;
    private int numeroDeFichas;
    
    public UnicorioTron(int valorDinero){
        dinero = valorDinero;
        numeroSecreto = (int)(Math.random()*20)+1; 
        numeroDeFichas = 0;
    }
    
    public String consultarDinero(){
        return "El dinero actual es: "+dinero;
    }
    
    public void insertarFichas(int cantidad){
        numeroDeFichas = numeroDeFichas+cantidad; 
    }
    
    public String empezarJuego(int valorNumero){
        String res = "";
        if(dinero>0){
            if(numeroDeFichas>0){
              numeroDeFichas--;
              if(valorNumero == numeroSecreto){
               res = "Muy Bien, Ganaste "+dinero+" bolivianos";
               dinero = 0;
              }else{
              res = "Intentalo de nuevo";
              }
            }else{
                res = "No tienes fichas, ingresa una para jugar";
            }
        }else{
            res = "No hay dinero, pronto recargaran";
        }
        return res;
    }
    
    public void recargarDinero(int valor){
        if(dinero==0){
            dinero = valor; 
        }
    }
}
