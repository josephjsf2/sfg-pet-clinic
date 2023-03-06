package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> saveAll();
}
