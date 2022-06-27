package pl.projekt_java_party;

public class Guest {
    private String name;
    private String meal;
    private int tableNumber;
    private boolean isVegan;

    //tworzymy konstruktor
    public Guest(String name, String meal, int tableNumber, boolean isVegan) { //konstruktor
        this.name = name;
        this.meal = meal;
        this.tableNumber = tableNumber;
        this.isVegan = isVegan;
    }


    //gettery, zakładamy ze wszystko jest tworzone w trakcie tworzenia obiektu naeszej klasy
    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInformation(){
        System.out.println("Imie: " + name);
        System.out.println("Preferowany posilek: ");
        System.out.println("Numer stolika: " + tableNumber);
        String isVeganString = isVegan ? "tak" : "nie"; //tworzymy zmienna isveganstring i w zalezosci od true / false dal isVegan przypisze nam string tak/nie
        System.out.println("Czy jest weganinem?: " + isVeganString);
        System.out.println("#######################");


    }
}
