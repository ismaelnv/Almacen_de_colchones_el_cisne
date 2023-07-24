package Backend.AlmacenDeColchones.Entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    private Integer id_categoria;
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<Insumo> insumo;

    public Categoria(Integer id_categoria, String nombre) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return this.id_categoria;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCategoria(Integer idCategoria) {
        this.id_categoria = idCategoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
