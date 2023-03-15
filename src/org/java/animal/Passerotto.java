package org.java.animal;

public class Passerotto extends Animale{
    //ATTRIBUTES
    private String alimento;

    //CONSTRUCTORS
    public Passerotto(String specie) {
        super(specie);
        this.alimento = "insetti" ;
    }

    //GETTER & SETTER


    @Override
    public String getSpecie() {
        return super.getSpecie();
    }

    public String getAlimento() {
        return alimento;
    }

    @Override
    public void setSpecie(String specie) {
        super.setSpecie(specie);
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
    public void mangia() {
        System.out.println(getAlimento());

    }
}
