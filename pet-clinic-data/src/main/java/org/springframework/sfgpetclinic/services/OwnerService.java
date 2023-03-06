package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String name);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
