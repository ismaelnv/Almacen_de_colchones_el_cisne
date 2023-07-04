package Backend.AlmacenDeColchones.Entidad;

public class Cargo {

    private Integer id_cargo;
    private String nombre;

    public Cargo(Integer id_cargo, String nombre) {
        this.id_cargo = id_cargo;
        this.nombre = nombre;
    }

    public Integer getIdCargo() {
        return this.id_cargo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setIdCargo(Integer id_cargo) {
        this.id_cargo = id_cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
