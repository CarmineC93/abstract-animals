package org.java.animal;

public class Zoo {

/*    Scrivere un programma avente 2 metodi :
        void faiVolare(IVolante animale)
        void faiNuotare(INuotante animale)
    Questi metodi prendono come parametro un animale che può o volare / nuotare e richiamano il corrispondente metodo vola() / nuota().*/
    public static void faiVolare(Volante animale ){ //metodi devono essere static
        animale.vola();
    }
    public static void faiNuotare(Nuotante animale){
        animale.nuota();
    }


    public static void main(String[] args) {

        Animale [] zoo = new Animale[3]; //anche se la classe è abstract posso creare array di quel tipo

        Animale tommy = new Cane("cane");
        tommy.mangia();
        zoo[0]=tommy;

        Animale pio = new Passerotto("passerotto");
        pio.dormi();
        zoo[1]=pio;

        Animale flipper = new Delfino("delfino");
        flipper.mangia();
        zoo[2]=flipper;

        //Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare passandoglieli come parametro.

        faiVolare((Volante)pio);
        faiNuotare((Nuotante)flipper);


    }
}