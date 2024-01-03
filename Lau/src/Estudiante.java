public class Estudiante {
    //definir atributos
    private Integer id;
    private String nombreCompleto;
    private Float promedio;

    //definir constructor. Siempre tiene el mismo nombre de la clase
    public Estudiante() {}

    //dentro del paréntesis van los datos que requiere para crear el objeto
    public Estudiante(Integer idParámetro, String nombreCompletoParámetro, Float promedioParámetro) {
        this.id = idParámetro;
        this.nombreCompleto = nombreCompletoParámetro;
        this.promedio = promedioParámetro;

    }

    public Integer getid() {
        return id;
    }

    public void setId(Integer nuevoId) {
        this.id = nuevoId;
    }
}
