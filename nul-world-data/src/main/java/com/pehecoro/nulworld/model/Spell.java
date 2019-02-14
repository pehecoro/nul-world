package com.pehecoro.nulworld.model;

public class Spell extends BaseEntity {

    private String name;
    private SpellType spellType;
    private Double magnitude;
    private SpellCostType spellCostType;
    private Long cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Double magnitude) {
        this.magnitude = magnitude;
    }

    public SpellCostType getSpellCostType() {
        return spellCostType;
    }

    public void setSpellCostType(SpellCostType spellCostType) {
        this.spellCostType = spellCostType;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
}
