package Backend.AlmacenDeColchones.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Backend.AlmacenDeColchones.Entidad.Cargo;

@Repository
public interface ICargo extends CrudRepository<Cargo, Integer> {

}
