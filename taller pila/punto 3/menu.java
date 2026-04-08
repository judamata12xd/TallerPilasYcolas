import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        validaciones v = new validaciones();
        Stack<Integer> pila = new Stack<>();
        boolean seguir = true;
        int opt;
        while (seguir) {
            System.out.println("Que desea realizar");
            System.out.println("1) llenarPila");
            System.out.println("2) mostrar Pila");
            System.out.println("3) ver modificacion de pila");
            System.out.println("4) Salir");
            opt = v.ValidarEntero(sc);
            switch (opt) {
                case 1:
                pila = m.Llenar(pila);
                    break;
                case 2:
                    m.Mostar(pila);
                    break;
                case 3:
                    pila = m.CambioNumeros(pila);
                    break;
                default:
                    System.out.println("home de 1 a 3 no joda");
                    break;
            }

        }
    }
}
