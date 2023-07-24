package Backend.AlmacenDeColchones.Entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    private Integer id_empleado;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private Integer id_cargo;
    private String correo_electronico;
    private String dni;

    @OneToMany(mappedBy = "empleado")
    private List<Guia> guia;

    @ManyToOne
    @JoinColumn(name = "id_cargo", insertable = false, updatable = false)
    private Cargo cargo;

    public Empleado(Integer id_empleado, String nombre, String apellido_paterno, String apellido_materno,
            Integer id_cargo, String correo_electronico, String dni) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.id_cargo = id_cargo;
        this.correo_electronico = correo_electronico;
        this.dni = dni;
    }

    public Integer getIdEmpleado() {
        return this.id_empleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidoPaterno() {
        return this.apellido_paterno;
    }

    public String getApellidoMaterno() {
        return this.apellido_materno;
    }

    public Integer getIdCargo() {
        return this.id_cargo;
    }

    public String getCorreoElectronico() {
        return this.correo_electronico;
    }

    public String getDni() {
        return this.dni;
    }

    public void setIdEmpleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public void setApellidoMaterno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public void setIdCargo(Integer id_cargo) {
        this.id_cargo = id_cargo;
    }

    public void setCorreoElectronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
