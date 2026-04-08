
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        Queue<ObjEmpleado> cola = new LinkedList<>();
        double salario;

        cola = m.Ingresar(cola);
        salario = m.SalarioT(cola);
        m.Mostrar(cola, salario);
    }
    
}
