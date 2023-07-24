package Backend.AlmacenDeColchones.Entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "insumo")
public class Insumo {

    @Id
    private Integer id_insumo;
    private String nombre;
    private Integer id_categoria;
    private Float precio;
    private Integer stock;
    private String estadoInsumo;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    public Insumo(Integer id_insumo, String nombre, Integer id_categoria, Float precio, Integer stock,
            String estadoInsumo) {
        this.id_insumo = id_insumo;
        this.nombre = nombre;
        this.id_categoria = id_categoria;
        this.precio = precio;
        this.stock = stock;
        this.estadoInsumo = estadoInsumo;
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

    public String getEstadoDeInsumo() {
        return this.estadoInsumo;
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

    public void setEstadoDeInsumo(String estadoInsumo) {
        this.estadoInsumo = estadoInsumo;
    }
}
