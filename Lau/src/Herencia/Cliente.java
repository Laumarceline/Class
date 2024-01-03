package Herencia;

public class Cliente {

    protected String nombre;

    protected String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarInfo() {
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi correo electronico es: " + email);
    }
}
