package pl.projekt_java_party;


import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //czy pętla powinna być kontynuowana
        boolean shouldContinue = true;

        //obiekt klasy party (z konstruktorem domyslnym?)
        Party party = new Party();

        while(shouldContinue) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj Goscia");
            System.out.println("3. Wyswietl zamowione potrawy");
            System.out.println("4. Znajdz po numerze stolika");
            System.out.println("5. Wyjscie");

            //user wybiera opcje
            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1 -> party.displayGuests(); //wywolanie metody
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByTableNumber();
                case 5 -> shouldContinue = false;

            }

        }

    }
        }



