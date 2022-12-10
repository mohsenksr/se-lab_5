package Prototype;

public class Tower extends Building {

    public Tower() {
        type = "Tower";
    }

    @Override
    void build() {
        System.out.println("The Tower has built");
    }
}
