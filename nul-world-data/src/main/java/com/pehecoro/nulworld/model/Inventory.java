package com.pehecoro.nulworld.model;

import java.util.List;

public class Inventory extends BaseEntity {

    private Character character;
    private List<Slot> slots;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }
}
