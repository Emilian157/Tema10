package org.fasttrackit;

import org.fasttrackit.exercise1.Basket;
import org.fasttrackit.exercise2.FlowerBouquet;
import org.fasttrackit.exercise3.Company;
import org.fasttrackit.exercise3.Person;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ex1
        Basket basket = new Basket();

        basket.add("Portocala");
        basket.add("Mandarina");
        basket.add("Mar");
        basket.add("Banana");
        basket.add("Banana");

        System.out.println("Numarul de fructe: " + basket.count());
        System.out.println("Numarul de fructe unice: " + basket.uniqueFruitsCount());
        System.out.println("Este fructul ales de tine in cos: " + basket.find("Banana"));
        System.out.println("Pozitia fructului tau este: " + basket.position("Portocala"));
        System.out.println("Fructul ales de tine a fost scos: " + basket.remove("Mandarina"));
        System.out.println("Este fructul ales de tine in cos? " + basket.find("Mandarina"));

        Collection<String> distinctFruits = basket.distinct();
        System.out.println("Fructe distincte: " + distinctFruits);

        System.out.println();
        System.out.println();

        //ex2
        FlowerBouquet flowerBouquet = new FlowerBouquet();
        flowerBouquet.add("Garoafa");
        flowerBouquet.add("Lalea");
        flowerBouquet.add("Trandafir");
        flowerBouquet.add("Ghiocel");
        flowerBouquet.add("Liliac");

        System.out.println("A fost scoasa floarea ta din bouquet: " + flowerBouquet.remove("Liliac"));
        System.out.println("A fost scoasa floarea ta din bouquet: " + flowerBouquet.remove("Ghiocel"));

        Collection<String> allFlowers = flowerBouquet.getAll();
        System.out.println("Toate florile din bouquet sunt: " + allFlowers);

        System.out.println();
        System.out.println();

        //ex3
        Company company = new Company();
        Person manager = new Person("David", 35, "manager");
        company.employ(manager);
        Person welder = new Person("Daniela", 24, "welder");
        company.employ(welder);
        Person carpenter = new Person("Petru", 31, "carpenter");
        company.employ(carpenter);
        Person plumber = new Person("Sara", 28, "plumber");
        company.employ(plumber);

        Person theManager = company.getManager();
        if (theManager != null) {
            System.out.println("Manager-ul este " + theManager.getName());
        } else {
            System.out.println("Nu avem un manager momentan");
        }

        List<Person> personWithProfession = company.getPersons("plumber");
        System.out.println("Persoanele cu profesia aleasa sunt: ");
        for (Person person : personWithProfession) {
            System.out.println("-" + person.getName());
        }

        List<Person> olderThan = company.getPersonsOlder(25);
        System.out.println("Persoanele cu varsta mai mare sunt:");
        for (Person person : olderThan) {
            System.out.println("-" + person.getName());
        }

        List<Person> filteredPersonsByName = company.getPerson("D");
        System.out.println("Persoanele cu numele ales sunt: ");
        for (Person person : filteredPersonsByName) {
            System.out.println("-" + person.getName());
        }
    }
}