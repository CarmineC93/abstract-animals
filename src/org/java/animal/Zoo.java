package org.java.animal;

public class Zoo {
    public static void main(String[] args) {

        Animale [] zoo = new Animale[2]; //anche se la classe è abstract posso creare array di quel tipo

        Animale tommy = new Cane("cane");
        tommy.mangia();
        zoo[0]=tommy;

        Animale pio = new Passerotto("passerotto");
        pio.dormi();
        zoo[1]=pio;

    }
}