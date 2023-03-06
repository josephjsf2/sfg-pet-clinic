package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Owner findById(long id);

    Owner save(Pet pet);

    Set<Pet> saveAll();
}
