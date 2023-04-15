package ms.TiendaOnline.Controller;

import ms.TiendaOnline.Entity.Carrito;
import ms.TiendaOnline.Service.CarritoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev")
public class CarritoController {

    @Autowired
    CarritoServicio carritoServicio;

    @GetMapping("/carrito/{id}")
    public Optional<Carrito> getCarrito(@PathVariable Integer id){
        return carritoServicio.getCarrito(id);
    }

    @GetMapping("/carritos")
    public List<Carrito> getProductos(){
        return carritoServicio.getCarritos();
    }

    @PostMapping("/carrito/insert")
    public Carrito insertarCarrito(@RequestBody Carrito carrito){
        return carritoServicio.insertarCarrito(carrito);
    }

    @PutMapping("/carrito/modificar")
    public Carrito modificarCarrito(@RequestBody Carrito carrito){
        return carritoServicio.modificarCarrito(carrito);
    }

    @DeleteMapping("/carrito/delete/{id}")
    public void borrarCarrito(@PathVariable Integer id){
      carritoServicio.borrarCarrito(id);
    }

}
