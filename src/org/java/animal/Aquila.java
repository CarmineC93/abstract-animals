package org.java.animal;

public class Aquila extends Animale implements Volante{
    //ATTRIBUTES
    private String alimento;

    //CONSTRUCTORS
    public Aquila(String specie) {
        super(specie);
        this.alimento = "topi";
    }

    //GETTER & SETTER
    public String getAlimento() {
        return alimento;
    }


    @Override
    public String getSpecie() {
        return super.getSpecie();
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
        System.out.println("iiiiii");
    }

    @Override
    public void mangia() {
        System.out.println("mangia: " + getAlimento());
    }

    @Override
    public void vola() {
        System.out.println("sto volando jack");
    }

}
