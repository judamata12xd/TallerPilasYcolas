
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        metodos m = new metodos();

        Stack<objPizzeria> pila = new Stack<>();
        Queue<objPizzeria> cola = new LinkedList<>();

        while(seguir){
            System.out.println("QUE DESEA REALIZAR");
            System.out.println("1. agregar pedidos");
            System.out.println("2. mostar pedios entregado");
            System.out.println("3. mostar pedidos pendientes");
            System.out.println("4. modificar pedido");
            System.out.println("5. eliminar pedido");
            System.out.println("6. eliminar ultimo pedidio entregado");
            System.out.println("7. salir");
            int opt = sc.nextInt();

            switch (opt) {
                case 1 :
                    cola = m.ingresar(cola);
                    break;
                case 2:
                    pila = m.Atentidos(cola);
                    m.MostarEntregados(pila);
                    break;  
                case 3:
                    m.MostarPendientes(cola); 
                    break;
                case 4:
                    m.Modificar(cola);
                    break;
                case 5:
                    m.Eliminar(cola);
                    break;   
                case 6:
                    m.EliminarUltimo(pila);
                    break;              
                default:
                    System.out.println("Adios xd");
                    seguir = false;
            }

        }
        
    }
    
}
