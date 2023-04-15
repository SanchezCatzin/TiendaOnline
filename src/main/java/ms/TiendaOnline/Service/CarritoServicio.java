package ms.TiendaOnline.Service;

import ms.TiendaOnline.Entity.Carrito;
import ms.TiendaOnline.Repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoServicio {

    @Autowired
    CarritoRepository carritoRepository;

    public Optional<Carrito> getCarrito(Integer id){
        return carritoRepository.findById(id);
    }

    public List<Carrito> getCarritos(){
        return carritoRepository.findAll();
    }

    public Carrito insertarCarrito(Carrito carrito){
        return carritoRepository.save(carrito);
    }

    public Carrito modificarCarrito(Carrito carrito){
        return carritoRepository.save(carrito);
    }

    public void borrarCarrito(Integer id){
        carritoRepository.deleteById(id);
    }



}
