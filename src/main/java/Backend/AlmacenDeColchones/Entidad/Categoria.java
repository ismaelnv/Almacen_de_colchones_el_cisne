package Backend.AlmacenDeColchones.Entidad;

public class Categoria {

    private Integer id_categoria;
    private String nombre;

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
