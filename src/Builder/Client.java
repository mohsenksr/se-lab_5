package Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();
        HouseBuilder houseBuilder = new HouseBuilder();
        TowerBuilder towerBuilder = new TowerBuilder();

        director.constructHouse(houseBuilder);
        House house = houseBuilder.getResult();

        director.constructApartment(apartmentBuilder);
        Apartment apartment = apartmentBuilder.getResult();

        director.constructTower(towerBuilder);
        Tower tower = towerBuilder.getResult();

        System.out.println("House: " + house.toString() + "\nApartment: " + apartment.toString() + "\nTower: " + tower.toString());

    }
}
