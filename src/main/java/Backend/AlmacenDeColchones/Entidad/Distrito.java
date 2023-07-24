package Backend.AlmacenDeColchones.Entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "distrito")
public class Distrito {

    @Id
    private Integer idDistrito;
    private String nombreDistrito;
    private String codigoPostal;

    @OneToMany(mappedBy = "distrito")
    private List<Cliente> cliente;

    public Distrito(Integer idDistrito, String nombreDistrito, String codigoPostal) {
        this.idDistrito = idDistrito;
        this.nombreDistrito = nombreDistrito;
        this.codigoPostal = codigoPostal;
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

}
