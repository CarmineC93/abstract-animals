package org.java.animal;

public abstract class Animale {

    //ATTRIBUTES
    private String specie;

    //CONSTRUCTORS
    public Animale(String specie) {
        this.specie = specie;
    }

    //GETTER & SETTER
    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }


    //METHODS
    public abstract void dormi();
    public abstract void verso();
    public abstract void mangia();


}
