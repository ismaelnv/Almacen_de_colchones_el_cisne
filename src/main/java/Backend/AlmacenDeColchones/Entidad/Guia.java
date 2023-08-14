package Backend.AlmacenDeColchones.Entidad;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "guia")
public class Guia {

    @Id
    private Integer id_guia;
    private Integer id_empleado;
    private String estado;
    private LocalDateTime fechaDeEntrega;
    private Integer id_Proveedor;
    private String puntoDePartida;
    private Integer idCliente;

    @ManyToOne
    @JoinColumn(name = "id_empleado", insertable = false, updatable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "idCliente", insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_Proveedor", insertable = false, updatable = false)
    private Proveedor proveedor;

    public Guia(Integer id_guia, Integer id_empleado, String estado, LocalDateTime fechaDeENtrega,
            Integer id_Proveedor, String puntoDePartida, Integer idCliente) {
        this.id_guia = id_guia;
        this.id_empleado = id_empleado;
        this.estado = estado;
        this.fechaDeEntrega = fechaDeENtrega;
        this.id_Proveedor = id_Proveedor;
        this.puntoDePartida = puntoDePartida;
        this.idCliente = idCliente;
    }

    public Integer getIdGuia() {
        return this.id_guia;
    }

    public Integer getIdEmpleado() {
        return this.id_empleado;
    }

    public String getEstado() {
        return this.estado;
    }

    public LocalDateTime getFechaDeEntrega() {
        return this.fechaDeEntrega;
    }

    public Integer getIdProveedor() {
        return this.id_Proveedor;
    }

    public String getPuntoDePartida() {
        return puntoDePartida;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdGuia(Integer id_guia) {
        this.id_guia = id_guia;
    }

    public void setIdEmpleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechadeEntrega(LocalDateTime fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public void setIdProveedor(Integer id_Proveedor) {
        this.id_Proveedor = id_Proveedor;
    }

    public void setPuntoDePartida(String puntoDePartida) {
        this.puntoDePartida = puntoDePartida;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

}
