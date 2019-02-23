package com.pehecoro.nulworld.services;

import com.pehecoro.nulworld.model.Character;

public interface CharacterService extends CrudService<Character, Long>{

    Character findByLastName(String lastName);

}
