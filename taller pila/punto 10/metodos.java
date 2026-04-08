import java.util.Queue;
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public Queue<ObjEmpleado> Ingresar(Queue<ObjEmpleado> c) {
        boolean bandera = true;
        int opt;

        while (bandera) {
            ObjEmpleado o = new ObjEmpleado();
            System.out.println("Ingrese el nombre del empleado: ");
            o.setNombre(sc.next());
            System.out.println("Ingrese las horas trabajadas: ");
            o.setHoras(sc.nextInt());
            System.out.println("Ingrese su salario; ");
            o.setSalario(sc.nextDouble());
            c.offer(o);

            System.out.println("Si desea continuar ingrese 1 si no ingrese 2");
            opt = sc.nextInt();

            if (opt == 2) {
                bandera = false;
            }
        }

        return c;
    }

    public double SalarioT(Queue<ObjEmpleado> c) {
        double salario = 0;
        for (ObjEmpleado o : c) {
            int horasex = o.getHoras() - 40;
            if (o.getHoras() > 40 && horasex <= 8) {
                salario = (40 * o.getSalario()) + (horasex * (2 * o.getSalario()));
            } else if (o.getHoras() > 40 && horasex > 8) {
                salario = (40 * o.getSalario()) + (horasex * (3 * o.getSalario()));
            } else {
                salario = o.getSalario() * o.getHoras();
            }
        }
        return salario;
    }

    public void Mostrar(Queue<ObjEmpleado> c, double salario) {
        for (ObjEmpleado o : c) {
            System.out.println("nombre: " + o.getNombre());
            System.out.println("Salario: " + salario);
        }
    }
}
