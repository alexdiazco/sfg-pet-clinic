package alexdiaz.springframework.sfgpetclinic.services.springdatajpa;

import alexdiaz.springframework.sfgpetclinic.model.Owner;
import alexdiaz.springframework.sfgpetclinic.repositories.OwnerRepositories;
import alexdiaz.springframework.sfgpetclinic.repositories.PetRepository;
import alexdiaz.springframework.sfgpetclinic.repositories.PetTypeRepository;
import alexdiaz.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepositories ownerRepositories;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepositories ownerRepositories, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepositories = ownerRepositories;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findLastName(String name) {
        return ownerRepositories.findByLastName(name);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();

     ownerRepositories.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepositories.findById(aLong).orElse(null);


    }

    @Override
    public Owner save(Owner object) {
        return ownerRepositories.save(object);
    }

    @Override
    public void delete(Owner object) {
    ownerRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepositories.deleteById(aLong);

    }
}
