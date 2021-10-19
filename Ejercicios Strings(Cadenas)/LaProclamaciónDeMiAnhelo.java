
/**
 * Write a description of class LaProclamaciónDeMiAnhelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaProclamaciónDeMiAnhelo{
    private String cadena;
    
    public LaProclamaciónDeMiAnhelo(){
        cadena = "Y te encuentro en el fondo una vez más, amor, vida, muerte, eres el bien y el mal. Ahora no ¡recitas la oración! Ahora no, ¡presumes de valor!";
    }
    
    public int contarSignos(){
        int res = 0;
        for(int posicion=0; posicion<cadena.length(); posicion++){
            char actual = cadena.charAt(posicion);
            if(esProclamación(actual)){
                res++;
            }
        }
        return res;
    }
    private boolean esProclamación(char signo){
        return signo==',' || signo=='.' || signo=='¡' || signo=='!' || signo==';' || signo==':' || signo=='¿' || signo=='?';
    }
}
