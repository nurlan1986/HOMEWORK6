package com.geektech;

public class Main {
    String colt;
    int damage;
    int healthy;
    public static void main(String[] args) {
        Boss goro = new Boss(324,45,"P12");
        goro.setHealthy(342);
        goro.setColt("P12");
        goro.setDamage(100);


        System.out.println("БОСС ПОЛУЧИЛИ ЗДОРОВЬЕ " + " " +goro.getHealthy() + " " + "БОСС ПОЛУЧИЛ УРОН 45 " + goro.getDamage()+ "БОСС ПОЛУЧИЛ ОРУЖИЕ КОЛТ P12");

    }


}
