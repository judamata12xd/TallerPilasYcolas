import java.util.Scanner;
import java.util.Stack;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public Stack<Integer> Llenar(Stack<Integer> p) {
        validaciones v = new validaciones();
        boolean bandera = true;
        int opt;
        while (bandera) {
            System.out.println("Ingrese un numero:");
            p.push(v.ValidarEntero(sc));
            System.out.println("Desea agregar mas numeros? 1. si ; 2. no");
            opt = v.ValidarEntero(sc);
            opt = v.ValidarRango(1, 2, opt);
            if (opt == 2) {
                bandera = false;
            }
        }
        return p;
    }

    public void Mostar(Stack<Integer> p) {
        System.out.println(p);
    }

    public Stack<Integer> CambioNumeros(Stack<Integer> p) {
        Stack<Integer> auxp = new Stack<>();
        int n = p.size();

        for (int i = 0; i < n; i++) {
            if (p.peek() < 0) {
                p.pop();
                auxp.push(0);
            } else if (p.peek() >= 8 && p.peek() <= 20) {
                p.pop();
                auxp.push(50);
            } else if (p.peek() > 60 && p.peek() < 62) {
                p.pop();
                auxp.push(100);
            } else {
                auxp.push(p.pop());
            }
        }
        for (int i = 0; i < n; i++) {
            p.push(auxp.pop());
        }
        return p;
    }
}
