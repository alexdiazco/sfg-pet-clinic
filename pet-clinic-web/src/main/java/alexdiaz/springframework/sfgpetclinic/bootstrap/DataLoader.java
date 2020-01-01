package alexdiaz.springframework.sfgpetclinic.bootstrap;

import alexdiaz.springframework.sfgpetclinic.model.Owner;
import alexdiaz.springframework.sfgpetclinic.model.Pet;
import alexdiaz.springframework.sfgpetclinic.model.PetType;
import alexdiaz.springframework.sfgpetclinic.model.Vet;
import alexdiaz.springframework.sfgpetclinic.services.OwnerService;
import alexdiaz.springframework.sfgpetclinic.services.PetTypeService;
import alexdiaz.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 *
 *  Initialize data
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();

        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brick");
        owner1.setCity("Miami");
        owner1.setTelephone("112233445");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate( LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);


        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("122 Brok");
        owner2.setCity("Miami");
        owner2.setTelephone("133335");

        Pet fionasCat = new Pet();
        fionasCat.setName("just cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Joe");
        vet2.setLastName("Joe");

        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
