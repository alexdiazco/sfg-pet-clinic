package alexdiaz.springframework.sfgpetclinic.model;

public class Speaciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public Speaciality setDescription(String description) {
        this.description = description;
        return this;
    }
}
