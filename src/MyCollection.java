import java.util.Date;
import java.util.Map;
//CSV file handler dependencies
package com.journaldev.csv.opencsv.parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.journaldev.csv.model.Employee;
import com.opencsv.CSVReader;

class Employe {
    String fisrtName;
    String lastName;
    Date dateOfBirth;
    double experience;
}

public class MyCollection{
    Employe[] employes = new Employe[300];
    int writeCounter=0,readCounter=0;

    private void addEmploye(Employe newEmploye){
        employes[writeCounter++] = newEmploye;
    }

    private Employe getEmploye(){
        return this.employes[readCounter++];
    }

    private void printListEmployes(){
        //int ite = 0;
        for(int ite=0;ite<this.writeCounter;ite++){
            System.out.println(this.employes[ite]);
        }
    }

    public static void main(String[] args){
        MyCollection collectionObj = new MyCollection();
        Employe newEmploye = new Employe();
        newEmploye.dateOfBirth = new Date(1984,03,31);
        newEmploye.experience = 2.25;
        newEmploye.fisrtName = "Alok";
        newEmploye.lastName = "Mehra";
        collectionObj.addEmploye(newEmploye);
        collectionObj.addEmploye(newEmploye);
        collectionObj.addEmploye(newEmploye);
        collectionObj.addEmploye(newEmploye);
        System.out.println(collectionObj.getEmploye());
        collectionObj.printListEmployes();
        CSVFileHandler csvObj = new CSVFileHandler();
        csvObj.write();
    }
}

interface MyFileHandler{
    Employe read();
    void write(Employe insEmploye);
}

class CSVFileHandler implements MyFileHandler{
    public Employe read(){
        System.out.println("CSV read method");
        Employe empObj = new Employe();
        return empObj;

    }
    public void write(Employe insEmploye){
        System.out.println("CSV file writer");
    }
}

/*
Array of 300 entries of Employee class
writeCounter
readCounter
The following methods to be syncronized
add(Employee) -> new element should be added at writeCounter, writeCounter should be increment after every insert
Employee get() -> element should be readCounter, readCounter should be incremented after every read operation
*/