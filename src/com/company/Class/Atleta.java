package com.company.Class;

public class Atleta extends Person{
    private String specialità;
    //Constructor
    public Atleta(){
        //Costruttore vuoto
        super();
        this.specialità="";
    }
    public Atleta(String nome, String cognome, double altezza, double peso, String dataDiNascita, String specialità){
        //Costruttore riempimento
        super(nome, cognome, altezza, peso, dataDiNascita);
        this.specialità=specialità;
    }
    public Atleta(Atleta atleta){
        //Costruttore copia
        super(atleta);
        this.specialità= atleta.specialità;
    }

    //Getter and Setter
    public String getSpecialità() {
        return this.specialità;
    }
    public void setSpecialità(String specialità) {
        this.specialità = specialità;
    }

    @Override
    public String toString() {
        return super.toString() + " Specialità= " + this.specialità;
    }
}
