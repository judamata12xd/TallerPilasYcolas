import java.util.Scanner;

public class validaciones {

    Scanner sc = new Scanner(System.in);

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

      public int ValidarRango(int n1, int n2, int numero) {
        validaciones v = new validaciones();
        while (numero < n1 || numero > n2) {
            System.out.println("Por favor ingrese un rango de :" + n1 + " hasta " + n2);
            numero = v.ValidarEntero(sc);
        }
        return numero;
    }
}
