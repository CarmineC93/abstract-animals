package org.java.animal;

public class Passerotto extends Animale implements Volante{
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
        System.out.println("mangia: " + getAlimento());
    }

}
