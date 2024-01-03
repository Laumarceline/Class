import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        int[] arreglito;
        arreglito = new int[]{1,2,3,4,5};
        System.out.println(arreglito[0]);//le indico el índice del arreglo que quiero que me imprima, es decir el número 1 que es el index 0
        arreglito[0] = 20; //cambio el valor del índice 0
        arreglito[0] = arreglito[0] + 20;
        System.out.println(arreglito[0]); //imprime el nuevo valor de índice

        ArrayList<Integer> listaEnteros = new ArrayList<>(); //no se puede tipos primitivos sino uno estructurado. Integer es un entero. Los estructurados van con mayuscula el inicio
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        System.out.println(listaEnteros.get(0)); //imprime el elemento 1 de la lista
        listaEnteros.remove(0);
        System.out.println(listaEnteros.get(0));

        int num = 10;
        num = num * 3;
        System.out.println(num);
    }
}
