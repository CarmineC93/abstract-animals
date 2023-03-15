package org.java.animal;

public interface Volante {
    default void vola(){
        System.out.println("sto volando jack");
    };
}
