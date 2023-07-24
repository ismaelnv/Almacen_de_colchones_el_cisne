package Backend.AlmacenDeColchones.Entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    private Integer id_proveedor;
    private String nombre;
    private String direccionProveedor;
    private String rucProveedor;
    private String telefono;
    private String correo_electronico;

    @OneToMany(mappedBy = "proveedor")
    private List<Guia> guia;

    public Proveedor(Integer id_proveedor, String nombre, String direccionProveedor, String rucProveedor,
            String telefono, String correo_electronico) {

        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.direccionProveedor = direccionProveedor;
        this.rucProveedor = rucProveedor;
        this.direccionProveedor = direccionProveedor;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;

    }

    public Integer getIProveedor() {
        return this.id_proveedor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccionProveedor() {
        return this.direccionProveedor;
    }

    public String getRucProveedor() {
        return this.rucProveedor;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getCorreoElectronico() {
        return this.correo_electronico;
    }

    public void setIdProveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

}
