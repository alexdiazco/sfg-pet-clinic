package alexdiaz.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speaciality> specialities = new HashSet<>();

    public Set<Speaciality> getSpecialities() {
        return specialities;
    }

    public Vet setSpecialities(Set<Speaciality> specialities) {
        this.specialities = specialities;
        return this;
    }
}
