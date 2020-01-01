package alexdiaz.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public Pet setName(String name) {
        this.name = name;
        return this;
    }

    public PetType getPetType() {
        return petType;
    }

    public Pet setPetType(PetType petType) {
        this.petType = petType;
        return this;
    }

    public Owner getOwner() {
        return owner;
    }

    public Pet setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Pet setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }
}
