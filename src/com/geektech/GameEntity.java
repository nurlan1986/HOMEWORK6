package com.geektech;

public abstract class GameEntity {
    private int healthy;
    private int damage;
    private Weapon colt;

    public GameEntity(int healthy, int damage,Weapon colt) {
        this.healthy = healthy;
        this.damage = damage;
        this.colt = colt;
    }

    public GameEntity(int i, int i1, String colt) {
    }

    public int getHealthy() {
        return healthy;
    }



    public int getDamage() {
        return damage;
    }

    public void setDamage(int model) {
        this.damage = damage;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public String getColt() {
        return String.valueOf(colt);
    }

    public void setColt(Weapon colt) {
        this.colt = colt;
    }

    public abstract void setColt(String colt);
}


