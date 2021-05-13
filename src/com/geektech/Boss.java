package com.geektech;

public class Boss extends GameEntity {
    private String colt;
    private String type;
    private int model;

    public Boss(int healthy, int damage, String colt) {
        super(healthy, damage, colt);
    }

    public Boss( int i1, String colt) {
        super(i1, i1, colt);

    }

    @Override
    public String getColt() {
        return colt;
    }

    @Override
    public void setColt(String colt) {
        this.colt = colt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}




