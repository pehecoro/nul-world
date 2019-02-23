package com.pehecoro.nulworld.services.map;

import com.pehecoro.nulworld.model.Inventory;
import com.pehecoro.nulworld.services.CrudService;

import java.util.Set;

public class InventoryMapService extends AbstractMapService<Inventory, Long> implements CrudService<Inventory, Long> {

    @Override
    public Set<Inventory> findAll() {
        return super.findAll();
    }

    @Override
    public Inventory findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Inventory save(Inventory object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Inventory object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
