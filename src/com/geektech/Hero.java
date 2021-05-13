package com.geektech;

 public class Hero {
     String nickname;
     String realname;
     int age;
     int weight;
     public Hero(){

     }

     public  Hero(String nickname,String realname,int age){
         this.age = age;
         this.realname = realname;
         this.nickname = nickname;
     }
      public Hero(String nickname,String realname,int age,int weight){
         this.nickname = nickname;
         this.realname = realname;
         this.age = age;
         this.weight = weight;
      }
 }
