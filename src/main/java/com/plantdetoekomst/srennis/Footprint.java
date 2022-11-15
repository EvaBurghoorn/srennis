package com.plantdetoekomst.srennis;

import java.util.Arrays;
import java.util.List;

public class Footprint {
    private Double size;

    private String yourtip;

    private List<String> yourtips = Arrays.asList(new String[]{"Vermijd vlees", "Vermijd vliegen", "Vermijd plastic"});;

    public Footprint(Double size) {
        this.size = size;
        yourtip = yourtips.get((int) (Math.random() * yourtips.size()));
    }

    public Double getSize() {
        return size;
    }

    public String getYourtip() {
        return yourtip;
    }

    public void setSize(Double size) {
        this.size = size;
        yourtip = yourtips.get((int) (Math.random() * yourtips.size()));
    }
}
