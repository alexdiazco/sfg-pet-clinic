package alexdiaz.springframework.sfgpetclinic.model;

public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public Speciality setDescription(String description) {
        this.description = description;
        return this;
    }
}
