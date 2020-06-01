package com.company;

public class Main {

    public static void main(String[] args) {
        int a[]  = {10, 20, 30, 10, 20};
        int ele = 30;
        WyszukiwanieRownych wyszukajRowna = new WyszukiwanieRownych();
        int index = wyszukajRowna.szukaj(a, ele);
        if (index == -1) {
            System.out.println("Nie znaleziono");
        } else {
            System.out.println("Znaleziono w indeksie numer: " + index);
        }
    }
}

abstract class Wyszukiwanie {
    abstract boolean porownaj(int a, int b);


    public int szukaj(int a[],int ele) {
        for(int i=0; i<a.length; i++) {
            if (porownaj(a[i],ele) ) {return i;} } return -1;
        }
}

class WyszukiwanieRownych extends Wyszukiwanie {
    public boolean porownaj(int a, int b) {
        if (a == b) return true;
        else return false;
    }
}
class WyszukiwanieNieRownych extends Wyszukiwanie {
    public boolean porownaj(int a, int b) {
        if (a != b) return true;
        else return false;
    }
}