package com.pehecoro.nulworld.services;

import com.pehecoro.nulworld.model.Race;

import java.util.Set;

public interface RaceService {

    Race findById(Long id);

    Race save(Race race);

    Set<Race> findAll();
}
