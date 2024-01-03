public class Bucles {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 5) {
            System.out.println("Hola mundo");
            counter = counter + 1;
        }

        counter = 0;
        do {
            System.out.println("Buenaaas");
            counter++;
        } while (counter < 5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
    }
}
