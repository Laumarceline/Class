package Herencia;

public class VIP extends Cliente{

    private int nivel;
     public VIP(String nombre, String email, int nivel) {
         super(nombre, email);
         this.nivel = nivel;
     }
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nivel VIP: " + nivel);
    }
}
