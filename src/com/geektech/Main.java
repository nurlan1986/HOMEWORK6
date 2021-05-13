package com.geektech;

import java.util.Arrays;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
	// write your code here
        String nickname;
        String realname;
        int age;
        int weight;

      Hero createHeroes  = new  Hero (nickname ="super man", realname = "clark kent", age = 25);

        System.out.println("Hero" + " " + createHeroes.nickname + " " + createHeroes.realname + " " + createHeroes.age);

        createHeroes = new Hero(nickname = "bat man", realname = "bruce wayne", age = 30);

        System.out.println("Hero" + " " + createHeroes.nickname + " " + createHeroes.realname + " " + createHeroes.age);

        createHeroes = new Hero(nickname = "aqua man", realname = "arthur curry", age = 25, weight = 95);

        System.out.println("Hero" + " " + createHeroes.nickname + " " + createHeroes.realname + " " + createHeroes.age + " " + createHeroes.weight);


        }
    }