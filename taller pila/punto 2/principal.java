
import java.util.Scanner;


public class principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("Ingrese una palabra");
        String cadena = sc.next();

        String resultado = m.Invertir(cadena);

        System.out.println("Cadena invertida: " + resultado);

    }
}