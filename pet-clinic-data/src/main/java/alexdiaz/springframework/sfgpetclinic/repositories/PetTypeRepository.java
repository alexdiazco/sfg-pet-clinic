package alexdiaz.springframework.sfgpetclinic.repositories;

import alexdiaz.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
