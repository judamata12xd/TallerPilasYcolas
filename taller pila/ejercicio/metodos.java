
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public Queue<objPizzeria> ingresar(Queue<objPizzeria> c) {
        boolean bandera = true;

        while (bandera) {
            objPizzeria o = new objPizzeria();

            System.out.println("Ingrese el nombre del cliente: ");
            o.setNombreCliente(sc.next());
            System.out.println("Ingrese el numero del pedido: ");
            o.setNumedido(sc.nextInt());
            System.out.println("Ingrese el tipo de pizza");
            o.setTipoPizza(sc.next());
            System.out.println("Ingrese el estado 1. si fue entregada 0. si esta pendiente");
            o.setEstado(sc.nextInt());
            c.offer(o);

            System.out.println("1 para ingresar otro paciente, cualquier numero para salir");
            int opt = sc.nextInt();
            if (opt > 1) {
                bandera = false;
            }
        }
        return c;
    }

    public Stack<objPizzeria> Atentidos(Queue<objPizzeria> c) {
        Stack<objPizzeria> atentidos = new Stack<>();

        for (objPizzeria o : c) {
            if (o.getEstado() == 1) {
                atentidos.push(o);
            }
        }
        return atentidos;
    }

    public Queue<objPizzeria> Modificar(Queue<objPizzeria> c) {
        System.out.println("numero del pedido que quiere modificar ");

        int NumPedido = sc.nextInt();
        for (objPizzeria o : c) {
            if (o.getNumedido() == NumPedido) {
                o.setTipoPizza(sc.next());
            }
        }
        return c;
    }

    public Queue<objPizzeria> Eliminar(Queue<objPizzeria> c) {
        System.out.println("numero del pedido que quiere eliminar ");
        int numero = sc.nextInt();
        c.removeIf(o -> o.getNumedido() == numero);

        return c;
     }

     public Stack<objPizzeria> EliminarUltimo(Stack<objPizzeria> p ){
        objPizzeria Eliminada = p.pop();
        System.out.println("Registro eliminado " + Eliminada.getTipoPizza());
        return p;
     }

     public void MostarPendientes(Queue<objPizzeria> c){
        System.out.println("pedidos pendientes");
        for (objPizzeria o : c) {
            if(o.getEstado() == 0){
                System.out.println("nombre" + o.getNombreCliente());
                System.out.println("numero pedido: " + o.getNumedido());
                System.out.println("TIPO: " + o.getTipoPizza());
            } else {
                System.out.println("NO hay pedidos pendientes");
            }
        }
     }

     public void MostarEntregados(Stack<objPizzeria> p){
        System.out.println("Pedios entregados");
        for (objPizzeria o : p) {
            System.out.println("Nombre " + o.getNombreCliente());
            System.out.println("Numero pedido " + o.getTipoPizza());
            System.out.println("Tipo: " + o.getTipoPizza());
        }
     }
}