package Backend.AlmacenDeColchones.Entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    private Integer idCliente;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String dni;
    private String genero;
    private String direccionCliente;
    private String telefono;
    private String correoElectronico;

    @Column(name = "IdDistrito")
    private Integer idDistrito;

    @ManyToOne
    @JoinColumn(name = "idDistrito", insertable = false, updatable = false)
    private Distrito distrito;

    @OneToMany(mappedBy = "cliente")
    private List<Guia> guia;

    public Cliente(Integer idCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
            String genero, String direccionCliente, String telefono, String correoElectronico, Integer idDIstrito) {

        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.genero = genero;
        this.direccionCliente = direccionCliente;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.idDistrito = idDIstrito;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getDni() {
        return dni;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

}
