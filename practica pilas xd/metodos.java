import java.util.Scanner;
import java.util.Stack;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public Stack<objPilas> Llenar() {
        Stack<objPilas> p = new Stack<>();

        boolean pedir = true;
        int opt;

        while (pedir) {
            objPilas o = new objPilas();
            System.out.println("Ingrese la URL");
            o.setUrl(sc.next());
            System.out.println("Ingrese el titulo");
            o.setTitulo(sc.next());
            System.out.println("Ingrese la fecha");
            o.setFecha(sc.next());
            p.push(o);

            System.out.println("Desea continuar 1 si 2 no xd");
            opt = sc.nextInt();

            if (opt == 2) {
                pedir = false;
            }
        }
        return p;
    }

    public void Mostrar(Stack<objPilas> p) {
        for (objPilas o : p) {
            System.out.println("\n URL:" + o.getUrl());
            System.out.println("Titulo: " + o.getTitulo());
            System.out.println("Fecha: " + o.getFecha());
        }
    }

    public Stack<objPilas> VisitarNueva(Stack<objPilas> p) {
        objPilas o = new objPilas();
        System.out.println("Ingrese la nueva url");
        o.setUrl(sc.next());
        System.out.println("Ingrese el titulo");
        o.setTitulo(sc.next());
        System.out.println("Ingrese la fecha");
        o.setFecha(sc.next());
        p.push(o);
        System.out.println("Nueva pagina ingresada correctamente :>");
        return p;
    }

    public Stack<objPilas> Devolver(Stack<objPilas> p){

        objPilas Eliminada = p.pop();
        System.out.println("La pagina eliminada fue: " + Eliminada.getTitulo());

        if(!p.isEmpty()){
            System.out.println("Pagina actual");
            System.out.println("URL" + p.peek().getUrl());
            System.out.println("Titulo" + p.peek().getTitulo());
        } else {
            System.out.println("No quedan paginas abiertas :<");
        }
        return p;
    }
}
