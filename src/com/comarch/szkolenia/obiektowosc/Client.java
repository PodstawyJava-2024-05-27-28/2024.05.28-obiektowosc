package com.comarch.szkolenia.obiektowosc;

public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address = new Address();

    Client() {
    }

    Client(String name, String surname, int age, long pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    int add(int a, int b) {
        return a+b;
    }

    double add(double a, double b) {
        return a+b;
    }

    long add(long a, long b) {
        return a+b;
    }

    int addThreeInts(int a, int b, int c) {
        if(a == 0) {
            return b+c;
        } else {
            return a+b+c;
        }
    }

    void powiedzImie() {
        System.out.println(this.name);
    }

    void powiedzSwojaReferencje() {
        System.out.println(this);
    }
}
