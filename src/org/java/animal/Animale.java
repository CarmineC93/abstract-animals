package org.java.animal;

public abstract class Animale {

    //ATTRIBUTES
    private String nome;

    //CONSTRUCTORS
    public Animale(String nome) {
        this.nome = nome;
    }

    //GETTER & SETTER
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    //METHODS
    public abstract void dormi();
    public abstract void verso();
    public abstract void mangia (String alimento);


}
