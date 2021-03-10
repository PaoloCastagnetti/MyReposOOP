package com.company.Exercises;

import com.company.Class.Atleta;

public class Main {

    public static void main(String[] args) {
        /*Atleta[] vettore = new Atleta[3];
        Atleta OBJ = new Atleta();
        vettore[0]=new Atleta("Giorgio","Calcetto",1.70,52.0,"20/05/1998","Lancio del peso");
        vettore[1]=new Atleta("Manuel","Gennarini",1.90,82.0,"19/02/1999","Lancio del peso");
        vettore[2]=new Atleta("Bi","Bong",1.80,65.0,"01/01/2000","Lancio del giavellotto");
        OBJ.printAtletiBySearch("Lancio del peso", vettore);*/
        Atleta giorgio = new Atleta();
        giorgio.setDataDiNascita("10/05/2000");
        System.out.println(giorgio.getAge());
    }
}
