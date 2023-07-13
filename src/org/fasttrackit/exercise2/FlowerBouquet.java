package org.fasttrackit.exercise2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class FlowerBouquet {

    private List<String> flowers;

    public FlowerBouquet() {
        flowers = new ArrayList<>();
    }

    public Collection<String> getAll() {
        return new HashSet<>(flowers);
    }

    public boolean add(String flower) {
        return flowers.add(flower);
    }

    public boolean remove(String flower) {
        return flowers.remove(flower);
    }
}
