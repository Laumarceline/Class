import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        //Inicializa el scanner
        Scanner sc = new Scanner(System.in);

        //recibir un número por consola
        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        //mientras ese número sea menos o igual a 500
        while (num <= 500) {
            //ingresar número en una lista
            listaNumeros.add(num);
            //recibir un número nuevo
            System.out.println("Ingrese otro número: ");
            num = sc.nextInt();
        }
        //mostrar los valores
        int i = 0;
        while (i < listaNumeros.size()) {
            System.out.println(listaNumeros.get(i));
            i = i + 1;
        }

        System.out.println((listaNumeros.size()));
        System.out.println("Se ingresaron " + listaNumeros.size() + " números");

        if (listaNumeros.size() < 10) {
            System.out.println("Pocos números"); }
        else {
            System.out.println("Muchos números");            }
        }


    }
