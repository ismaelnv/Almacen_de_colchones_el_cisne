package Backend.AlmacenDeColchones.Entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    private Integer id_cargo;
    private String nombre;

    @OneToMany(mappedBy = "cargo")
    private List<Empleado> empleado;

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
