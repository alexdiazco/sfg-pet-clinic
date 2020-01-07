package alexdiaz.springframework.sfgpetclinic.repositories;

import alexdiaz.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
