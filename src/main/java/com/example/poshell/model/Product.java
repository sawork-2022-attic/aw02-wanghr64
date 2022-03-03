package com.example.poshell.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private double price;

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        return id.equals(((Product) obj).id) && name.equals(((Product) obj).name) && price == ((Product) obj).price;
    }

}
