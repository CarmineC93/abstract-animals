package org.java.animal;

public class Delfino extends Animale implements Nuotante{
    //ATTRIBUTES
    private String alimento;

    //CONTRUCTORS
    public Delfino(String specie) {
        super(specie);
        this.alimento = "pesciolini";
    }

    //GETTER & SETTER
    @Override
    public String getSpecie() {
        return super.getSpecie();
    }

    @Override
    public void setSpecie(String specie) {
        super.setSpecie(specie);
    }

    public String getAlimento() {
        return alimento;
    }


    //METHODS
    @Override
    public void dormi() {
        System.out.println("zzz");
    }

    @Override
    public void verso() {
        System.out.println("friiii");
    }

    @Override
    public void mangia() {
        System.out.println("mangia: " + getAlimento());
    }

    public void nuota(){
        System.out.println("sto nuotando");
    };
}
