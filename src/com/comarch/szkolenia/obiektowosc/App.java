package com.comarch.szkolenia.obiektowosc;

import java.util.Random;

import com.comarch.szkolenia.obiektowosc.p2.Pies;

public class App {
    public static void main(String[] args) {
        Client c1 = new Client();
        Client c2 = new Client();
        int[] tab = new int[10];
        Random losowacz = new Random();
        int x = 5;

        System.out.println(c1);
        System.out.println(tab);

        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 30;
        c1.pesel = 123123;

        c2.name = "Wiesiek";
        c2.surname = "Malinowski";
        c2.age = 40;
        c2.pesel = 345345;

        System.out.println(c1.name);
        System.out.println(c2.name);

        Address address = new Address();
        address.street = "Ogrodowa";
        address.no = "50B";
        address.postCode = "12-123";
        c1.address = address;

        System.out.println(c1.address.street);

        c2.address = new Address();
        c2.address.street = "Jakas";
        c2.address.no = "30";
        c2.address.postCode = "23-234";

        Pies pies = new Pies();
        com.comarch.szkolenia.obiektowosc.p1.Pies pies2 =
                new com.comarch.szkolenia.obiektowosc.p1.Pies();

        Client c3 = new Client();
        int[] ints = new int[10];
        String[] strings = new String[10];

        System.out.println(ints[0]);
        System.out.println(strings[0]);
        System.out.println(c3.name);
        System.out.println(c3.address);
        System.out.println(c3.age);

        c3.address = new Address();

        System.out.println(c3.address);

        Client client = new Client();
        client.address.street = "Cos";
        int y = client.add(4, 7);
        System.out.println(y);
        System.out.println(client.add(5,9));
        Client client2 = new Client();
        client2.add(1,1);

        Random random = new Random();
        random.nextInt(0, 100);

        System.out.println(client.add(3.3, 6.7));

        c1.powiedzImie();
        c2.powiedzImie();

        Client jakisKlient = new Client();
        jakisKlient.name = "Zbyszek";
        jakisKlient.powiedzImie();

        client.add(123L, 234L);
        System.out.println("234453");
        System.out.println(55);
        System.out.println(true);
        System.out.println(client2);

        Client client3 = new Client("Mateusz", "Bereda", 30, 12341234L);
        System.out.println(client3.name);
        System.out.println(client3.surname);
        System.out.println(client3.age);
        System.out.println(client3.pesel);

        System.out.println(client3);
        client3.powiedzSwojaReferencje();

        System.out.println(c2);
        c2.powiedzSwojaReferencje();
    }
}
