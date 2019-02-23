package com.pehecoro.nulworld.services.map;

import com.pehecoro.nulworld.model.SpellType;
import com.pehecoro.nulworld.services.CrudService;

import java.util.Set;

public class SpellTypeMapService extends AbstractMapService<SpellType, Long> implements CrudService<SpellType, Long> {

    @Override
    public Set<SpellType> findAll() {
        return super.findAll();
    }

    @Override
    public SpellType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public SpellType save(SpellType object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(SpellType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
