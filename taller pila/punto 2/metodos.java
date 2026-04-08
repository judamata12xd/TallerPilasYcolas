
import java.util.Stack;

public class metodos {

    public String Invertir(String cadena){

        Stack<Character> p = new Stack<>();
        String invertida ="";

        int contador = cadena.length();

        System.out.println("Cantidad de la cadena " + contador);

        for (int i = 0; i < cadena.length(); i++) {
            p.push(cadena.charAt(i));
        }

        while(!p.isEmpty()){
            invertida += p.pop();
        }
        return invertida;
    }
    
}
