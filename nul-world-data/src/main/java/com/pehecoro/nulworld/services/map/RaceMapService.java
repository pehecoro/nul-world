package com.pehecoro.nulworld.services.map;

import com.pehecoro.nulworld.model.Race;
import com.pehecoro.nulworld.services.CrudService;

import java.util.Set;

public class RaceMapService extends AbstractMapService<Race, Long> implements CrudService<Race, Long> {

    @Override
    public Set<Race> findAll() {
        return super.findAll();
    }

    @Override
    public Race findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Race save(Race object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Race object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
