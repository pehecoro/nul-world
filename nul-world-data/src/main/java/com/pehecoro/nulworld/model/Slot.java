package com.pehecoro.nulworld.model;

public class Slot extends BaseEntity {

    private Item item;
    private Long amount;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
