package org.java.animal;

public class Delfino extends Animale{
    //ATTRIBUTES
    private String alimento;

    //CONTRUCTORS
    public Delfino(String nome) {
        super(nome);
        this.alimento = "pesciolini";
    }

    //GETTER & SETTER
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getAlimento() {
        return alimento;
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
        System.out.println("friiii");
    }

    @Override
    public void mangia(String alimento) {
        System.out.println(getAlimento());

    }
}
