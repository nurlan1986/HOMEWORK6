package com.geektech;

public class Weapon {
    private String type;
    private int model;

    public Weapon(String type, int model) {
        this.type = type;
        this.model = model;
    }
    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getModel(){
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
}
