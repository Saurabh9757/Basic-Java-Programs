package com.company;

public class Smartphone {
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling a Friend...");
    }
    public static void main(String[] args) {
        Smartphone samsung= new Smartphone();
        samsung.callFriend();
        samsung.ring();
        samsung.vibrate();

    }

}
