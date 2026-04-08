import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        metodos m = new metodos();
        Stack<objPilas> pila = new Stack<>();
        boolean seguir = true;
        int opt;

        while (seguir) { 
            System.out.println("Bienvedio a el menu xd");
            System.out.println("1. Ingresar paginas weds");
            System.out.println("2. mostrar paginas actuales");
            System.out.println("3. Agregar una nueva pagina");
            System.out.println("4. Volver a visitar pagina anterior"); 
            System.out.println("Salir :>");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    pila = m.Llenar();
                    break;
                case 2:
                    m.Mostrar(pila);
                    break;  
                case 3:
                    pila = m.VisitarNueva(pila);
                    break;
                case 4:
                    pila = m.Devolver(pila);
                    break;          
                default:
                    System.out.println("chao xd ");
                    seguir = false;
                    break;
            }       
        }
    }
}
