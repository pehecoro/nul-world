package com.pehecoro.nulworld.services.map;

import com.pehecoro.nulworld.model.Spell;
import com.pehecoro.nulworld.services.CrudService;

import java.util.Set;

public class SpellMapService extends AbstractMapService<Spell, Long> implements CrudService<Spell, Long> {

    @Override
    public Set<Spell> findAll() {
        return super.findAll();
    }

    @Override
    public Spell findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Spell save(Spell object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Spell object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
