package com.company.Class;

import javax.swing.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Person {
    private String nome;
    private String cognome;
    private double altezza;
    private double peso;
    private String dataDiNascita;

    //Constructor
    public Person(){
        this.nome="";
        this.cognome="";
        this.altezza=0.0;
        this.peso=0.0;
        this.dataDiNascita="";
    }
    public Person(String nome, String cognome, double altezza, double peso, String dataDiNascita){
        this.nome=nome;
        this.cognome=cognome;
        this.altezza=altezza;
        this.peso=peso;
        this.dataDiNascita=dataDiNascita;
    }
    public Person(Person person){
        this.nome= person.nome;
        this.cognome= person.cognome;
        this.altezza= person.altezza;
        this.peso= person.peso;
        this.dataDiNascita= person.dataDiNascita;
    }

    //Getter and Setter
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public double getAltezza() {
        return altezza;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getDataDiNascita() {
        return dataDiNascita;
    }
    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    //Methods
    /*public void printAtletiBySearch(String specialità, Atleta[] atleti){
        for(int i=0 ; i< atleti.length ; ++i){
            if(specialità == atleti[i].getSpecialità()){
                System.out.println("Nome: " + atleti[i].getNome() + " Cognome: " + atleti[i].getCognome() + " Data di nascita: "+atleti[i].getDataDiNascita());
            }
        }
    }
     */

    @Override
    public String toString() {
        return  "Nome= " + this.nome +
                ", Cognome= " + this.cognome +
                ", Altezza= " + this.altezza +
                ", Peso= " + this.peso +
                ", DataDiNascita= " + this.dataDiNascita;
    }
    public int getAge(){
        Date birthDate = new Date(this.dataDiNascita);
        Date currentDate = new Date();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(currentDate));
        return ((d2 - d1) / 10000);
    }
}
