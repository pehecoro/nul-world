package com.pehecoro.nulworld.services;

import com.pehecoro.nulworld.model.Character;

import java.util.Set;

public interface CharacterService {

    Character findByLastName(String lastName);

    Character findById(Long id);

    Character save(Character character);

    Set<Character> findAll();
}
