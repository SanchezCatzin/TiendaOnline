package ms.TiendaOnline.Controller;

import ms.TiendaOnline.Entity.Producto;
import ms.TiendaOnline.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/producto/{id}")
    public Optional<Producto> getProducto(@PathVariable Integer id){
        return productoService.getProducto(id);
    }

    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }

    @PostMapping("/producto/insert")
    public Producto insertProducto(@RequestBody Producto producto){
        return productoService.insertarProducto(producto);
    }

    @PutMapping("/producto/modificar")
    public Producto modificar(@RequestBody Producto producto){
        return productoService.modificarProducto(producto);
    }

    @DeleteMapping("/producto/delete/{id}")
    public void delete(@PathVariable Integer id){
        productoService.borrarProducto(id);
    }

}
