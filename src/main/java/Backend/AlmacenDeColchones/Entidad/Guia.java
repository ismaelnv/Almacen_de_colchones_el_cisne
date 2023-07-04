package Backend.AlmacenDeColchones.Entidad;

import java.sql.Date;

public class Guia {

    private Integer id_guia;
    private Integer id_empleado;
    private Date fecha_de_guia;
    private Integer numero_documento;
    private String estado;

    public Guia(Integer id_guia, Integer id_empleado, Date fecha_de_guia, Integer numero_documento, String estado) {
        this.id_guia = id_guia;
        this.id_empleado = id_empleado;
        this.fecha_de_guia = fecha_de_guia;
        this.numero_documento = numero_documento;
        this.estado = estado;
    }

    public Integer getIdGuia() {
        return this.id_guia;
    }

    public Integer getIdEmpleado() {
        return this.id_empleado;
    }

    public Date getFechaDeGuia() {
        return this.fecha_de_guia;
    }

    public Integer getNumeroDeDocumento() {
        return this.numero_documento;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setIdGuia(Integer id_guia) {
        this.id_guia = id_guia;
    }

    public void setIdEmpleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setFechaDeGuia(Date fecha_de_guia) {
        this.fecha_de_guia = fecha_de_guia;
    }

    public void setNumeroDeDocumento(Integer numero_de_documento) {
        this.numero_documento = numero_de_documento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
