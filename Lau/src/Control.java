public class Control {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        if (a > b) {
            System.out.println("a es mayor a b");
        } else if (a == b) {
            System.out.println("a es igual a b");
        } else {
        System.out.println("a es menor a b");
        }

        // solamente puedo usar switch en igualdad ==
    switch (a) {
        case 1:
            System.out.println("a es 1");
            break;
        case 2:
            System.out.println("a es 2");
            break;
        default:
            System.out.println("a no es 1 ni 2");
        }
    }
}
