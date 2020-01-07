package alexdiaz.springframework.sfgpetclinic.repositories;

import alexdiaz.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
