package com.pehecoro.nulworld.services.map;

import com.pehecoro.nulworld.model.Character;
import com.pehecoro.nulworld.services.CrudService;

import java.util.Set;

public class CharacterMapService extends AbstractMapService<Character, Long> implements CrudService<Character, Long> {

    @Override
    public Set<Character> findAll() {
        return super.findAll();
    }

    @Override
    public Character findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Character save(Character object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Character object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
