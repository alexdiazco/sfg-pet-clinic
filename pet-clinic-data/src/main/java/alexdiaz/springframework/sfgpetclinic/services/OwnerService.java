package alexdiaz.springframework.sfgpetclinic.services;

import alexdiaz.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findLastName(String name);



}
