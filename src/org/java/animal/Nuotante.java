package org.java.animal;

public interface Nuotante {
    default void nuota(){
        System.out.println("sto nuotando");
    };

}
