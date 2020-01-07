package alexdiaz.springframework.sfgpetclinic.repositories;

import alexdiaz.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepositories extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
