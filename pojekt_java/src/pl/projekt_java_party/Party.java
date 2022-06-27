package pl.projekt_java_party;

import java.util.*;

public class Party {

    //pole klasy widoczne tylko z poziomu klasy party
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> tableToGuest = new HashMap<>(); //hashmapa
    Scanner scanner = new Scanner(System.in);

    //metoda dodawajaca gosci widoczna z innych klas
    public void addGuest(){     //void bo nic nie musi zwracac, ona tylko dodaje
    System.out.println("Podaj imie i nazwisko goscia");
    String name = scanner.nextLine();

    System.out.println("podaj preferwany posilek");
    String meal = scanner.nextLine();

    System.out.println("podaj numer stolika");
    //int TableNumber = scanner.nextInt(); okazuje się że metoda nextInt nie czyta znaku konca lini wiec jesli wpiszemy jakas liczbe i wcisniemy enter to nastepny nextLine przeczyta nam ten enter. Dlatego wykorzystalem poniższy sposob
    int TableNumber = Integer.valueOf(scanner.nextLine()); //zamiana stringa na integer


    System.out.println("Czy weganin? (Y/N)");
    String isVeganString = scanner.nextLine();
    boolean isVegan;

    //jesli porownujemy obiekty a nie typy prymitywne musimy uzywamy metody equals
    if(isVeganString.equals("y")){
        isVegan = true;
    } else {
        isVegan = false;
    }

        Guest guest = new Guest(name, meal, TableNumber, isVegan);//wywolujemy konstruktor

        meals.add(meal);
        tableToGuest.put(TableNumber, guest);
        guests.add(guest); //przekazujemy obiekt
    }


    //metoda wyswietlajaca zamowione posilki

    public void displayMeals(){
        for (String meal : meals){
            System.out.println(meal);
        }
    }

    //metoda wyswietlajaca gosci po numerach stolikow

    public void displayGuestByTableNumber(){
        Integer tableNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = tableToGuest.get(tableNumber);

        guest.displayGuestInformation();
    }

    //metoda zwracajaca liste gosci
    public void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestInformation(); //wywoluemy tą meteode z klasy guest
        }
    }
}
