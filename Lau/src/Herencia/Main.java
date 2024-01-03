package Herencia;

public class Main {

    public static void main(String[] args) {

        Cliente c = new Cliente( "Sergio",  "correo@correo.com");

        VIP vip = new VIP( "Juan","juan@juan.com", 1);

        c.mostrarInfo();
        vip.mostrarInfo();
    }
}
