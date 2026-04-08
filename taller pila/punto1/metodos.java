
import java.util.Scanner;
import java.util.Stack;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public int[][] llenarMatriz(int[][] m){

        for (int i = 0; i < m.length; i++) {        
            for (int j = 0; j < m.length; j++) {
            System.out.println("ingrese los valores de la matriz: ");
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    public Stack<Integer> SumaFilas(int[][] m, Stack<Integer> p){
        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m.length; j++) {
                suma += m[i][j];
            }
            p.push(suma);
        }
        return p;
    }

     public Stack<Integer> SumaColum(int[][] m, Stack<Integer> p){
        for (int j = 0; j < m.length; j++) {
            int suma = 0;
            for (int i = 0; i < m.length; i++) {
                suma += m[i][j];
            }
            p.push(suma);
        }
        return p;
    }

    public int Factorial(int n){
        int fact = 1;

        for (int i=n; i <= n; i++) {
            fact= fact * i;
        }
        return fact;
    }

    public void MostrarMatriz(int[][] m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " - ");
            }   
        }
    }

    public void MostarSumaFilas(Stack<Integer> p){
        System.out.println("La suma de la filas es" + p);
    }

    public void MostarSumaColu(Stack<Integer> p){
        System.out.println("La suma de las columnas es" + p);
    }

    public void MostarFact(int fact){
        System.out.println("El factorial de la dimension es: " + fact);
    }
}
