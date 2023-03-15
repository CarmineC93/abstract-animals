package org.java.animal;

public class Passerotto extends Animale{
    //ATTRIBUTES
    private String alimento;

    //CONSTRUCTORS
    public Passerotto(String nome) {
        super(nome);
        this.alimento = "insetti" ;
    }

    //GETTER & SETTER


    @Override
    public String getNome() {
        return super.getNome();
    }

    public String getAlimento() {
        return alimento;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    //METHODS
    @Override
    public void dormi() {
        System.out.println("zzz");
    }

    @Override
    public void verso() {
        System.out.println("pio pio");
    }

    @Override
    public void mangia(String alimento) {
        System.out.println(getAlimento());

    }
}
