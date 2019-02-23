package com.pehecoro.nulworld.services.map;

import com.pehecoro.nulworld.model.SpellCostType;
import com.pehecoro.nulworld.services.CrudService;

import java.util.Set;

public class SpellCostTypeMapService extends AbstractMapService<SpellCostType, Long> implements CrudService<SpellCostType, Long> {

    @Override
    public Set<SpellCostType> findAll() {
        return super.findAll();
    }

    @Override
    public SpellCostType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public SpellCostType save(SpellCostType object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(SpellCostType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
