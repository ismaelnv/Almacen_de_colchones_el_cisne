package Backend.AlmacenDeColchones.Entidad;

public class Insumo {

    private Integer id_insumo;
    private String nombre;
    private Integer id_categoria;
    private Float precio;
    private Integer stock;

    public Insumo(Integer id_insumo, String nombre, Integer id_categoria, Float precio, Integer stock) {
        this.id_insumo = id_insumo;
        this.nombre = nombre;
        this.id_categoria = id_categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public Integer getIdInsumo() {
        return this.id_insumo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getIdCategoria() {
        return this.id_categoria;
    }

    public Float getPrecio() {
        return this.precio;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setIdInsumo(Integer id_insumo) {
        this.id_insumo = id_insumo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCategoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
