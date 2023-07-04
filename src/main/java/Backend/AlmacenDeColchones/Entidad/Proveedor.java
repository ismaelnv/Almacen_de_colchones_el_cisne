package Backend.AlmacenDeColchones.Entidad;

public class Proveedor {
    private Integer id_proveedor;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String genero;
    private String direccion;
    private Integer telefono;
    private String correo_electronico;

    public Proveedor(Integer id_proveedor, String nombre, String apellido_paterno, String apellido_materno,
            String genero, String direccion,
            Integer telefono, String correo_electronico) {

        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;

    }

    public Integer getIProveedor() {
        return this.id_proveedor;
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

    public String getgenero() {
        return this.genero;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public String getCorreoElectronico() {
        return this.correo_electronico;
    }

    public void setIProveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    public void setgenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

}
