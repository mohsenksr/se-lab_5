package Prototype;

public class Apartment extends Building {

    public Apartment() {
        type = "Apartment";
    }

    @Override
    void build() {
        System.out.println("The Apartment has built");
    }
}
