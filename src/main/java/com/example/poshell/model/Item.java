package com.example.poshell.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private Product product;
    private int amount;

    @Override
    public String toString() {
        return product.toString() + "\t" + amount;
    }

    public Product getProduct() {
        return this.product;
    }

    public boolean modify(int amount) {
        if (amount > this.amount)
            return false;
        else {
            this.amount += amount;
            return true;
        }
    }

    public int getAmount() {
        return this.amount;
    }
}
