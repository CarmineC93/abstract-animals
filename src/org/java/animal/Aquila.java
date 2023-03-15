package org.java.animal;

public class Aquila extends Animale{
    //ATTRIBUTES
    private String alimento;

    //CONSTRUCTORS
    public Aquila(String nome) {
        super(nome);
    }

    //GETTER & SETTER


    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    //METHODS
    @Override
    public void dormi() {
        System.out.println("zzz");
    }

    @Override
    public void verso() {
        System.out.println("iiiiii");

    }

    @Override
    public void mangia(String alimento) {
        System.out.println("zzz");

    }
}
