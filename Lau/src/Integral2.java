import java.util.HashMap;
import java.util.Scanner;

public class Integral2 {
    //Inicializo un scanner


    public static void main(String[] args) {
        //Recibir un numero mediante consola
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();

        HashMap<String, Integer> mapPalabraClave = new HashMap<>();

        //Mientras la palabra sea distinta de "parar"
        while (!palabra.equals("parar")) {
            //definir a la clave palabra el valor del numero
            mapPalabraClave.put(palabra, num);

            //Recibir un nuevo numero
            System.out.println("Ingrese un nuevo numero: ");
            num = sc.nextInt();

            //Recibir una nueva palabra
            System.out.println("Ingrese una nueva palabra: ");
            palabra = sc.next();
        }

        //Mostrar los valores

        for (String clave : mapPalabraClave.keySet()) {
            System.out.println(clave);
            System.out.println("La clave es: " + clave + " y el valor es: " + mapPalabraClave.get(clave));
        }
    }
}


