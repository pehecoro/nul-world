package com.pehecoro.nulworld.services;

import com.pehecoro.nulworld.model.Spell;

import java.util.Set;

public interface SpellService {

    Spell findById(Long id);

    Spell save(Spell spell);

    Set<Spell> findAll();
}
