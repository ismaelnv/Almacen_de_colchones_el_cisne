package Backend.AlmacenDeColchones.Entidad;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DetalleDeGuiaPK implements Serializable {

    private Integer id_cargo;
    private Integer id_insumo;

    public Integer getId_cargo() {
        return this.id_cargo;
    }

    public Integer getId_insumo() {
        return this.id_insumo;
    }

    public void setId_cargo(Integer id_cargo) {
        this.id_cargo = id_cargo;
    }

    public void setId_insumo(Integer id_insumo) {
        this.id_insumo = id_insumo;
    }

}
