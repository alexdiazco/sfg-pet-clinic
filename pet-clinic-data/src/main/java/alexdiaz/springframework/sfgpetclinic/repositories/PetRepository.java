package alexdiaz.springframework.sfgpetclinic.repositories;

import alexdiaz.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
