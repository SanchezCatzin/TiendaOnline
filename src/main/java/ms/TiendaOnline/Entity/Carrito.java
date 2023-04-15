package ms.TiendaOnline.Entity;

import javax.persistence.*;

@Entity
@Table(name = "sleccion")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidad")
    private Integer cantidadProducto;

    @Column(name = "num_compra")
    private Integer numCompra;

    public Carrito() {
    }

    public Carrito(Integer id, Integer cantidadProducto, Integer numCompra) {
        this.id = id;
        this.cantidadProducto = cantidadProducto;
        this.numCompra = numCompra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(Integer numCompra) {
        this.numCompra = numCompra;
    }
}
