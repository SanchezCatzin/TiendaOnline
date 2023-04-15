package ms.TiendaOnline.Repository;

import ms.TiendaOnline.Entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends JpaRepository <Carrito, Integer> {

}
