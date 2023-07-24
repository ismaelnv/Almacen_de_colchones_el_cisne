package Backend.AlmacenDeColchones.Entidad;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_guia")
public class DetalleDeGuia {

    @EmbeddedId
    private DetalleDeGuiaPK id_detalle_guia;

    @Column(name = "can_insumo")
    private Integer canInsumo;
    private String descripcion;
    private String estado;

    public DetalleDeGuia(DetalleDeGuiaPK id_detalle_guia, Integer canInsumo, String descripcion, String estado) {

        this.id_detalle_guia = id_detalle_guia;
        this.canInsumo = canInsumo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public DetalleDeGuiaPK getId_detalle_guia() {
        return this.id_detalle_guia;
    }

    public Integer getCanInsumo() {
        return this.canInsumo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setId_detalle_guia(DetalleDeGuiaPK id_detalle_guia) {
        this.id_detalle_guia = id_detalle_guia;
    }

    public void setCanInsumo(Integer canInsumo) {
        this.canInsumo = canInsumo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
