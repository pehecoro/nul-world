package com.pehecoro.nulworld.services.map;

import com.pehecoro.nulworld.model.Slot;
import com.pehecoro.nulworld.services.CrudService;

import java.util.Set;

public class SlotMapService extends AbstractMapService<Slot, Long> implements CrudService<Slot, Long> {

    @Override
    public Set<Slot> findAll() {
        return super.findAll();
    }

    @Override
    public Slot findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Slot save(Slot object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Slot object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
