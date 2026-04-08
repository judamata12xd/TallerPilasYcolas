import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        metodos m = new metodos();
        System.out.println("Ingrese dimension de la matriz");
        int n = sc.nextInt(), opcion;
        boolean seguir = false;

        int Matriz[][] = new int[n][n];

        Matriz = m.llenarMatriz(Matriz);
        Stack<Integer> p = new Stack<>();

        while (seguir == false) {
            System.out.println("\n 1. mostrar matriz");
            System.out.println("2. suma de filas matriz");
            System.out.println("3. suma columnas matriz");
            System.out.println("4. factorial de la dimension");
            System.out.println("5. salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    m.MostrarMatriz(Matriz);
                    break;
                case 2:
                    p = m.SumaFilas(Matriz, p);
                    m.MostarSumaFilas(p);
                    break;
                case 3:
                    p = m.SumaColum(Matriz, p);
                    m.MostarSumaColu(p);
                    break;
                case 4:
                     n= m.Factorial(n);
                     m.MostarFact(n);
                    break;
                default:
                    System.out.println("chao xd ");
                    seguir = true;
            }
        }
    }
}
