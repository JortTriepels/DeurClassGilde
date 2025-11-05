package org.example;

public class Main {
    public static void main(String[] args) {


        Door voordeur = new Door("Voordeur");

        System.out.println(voordeur.useKey("rechts"));

        System.out.println(voordeur.openDoor());

        System.out.println(voordeur.walkThroughDoor());




    }
}