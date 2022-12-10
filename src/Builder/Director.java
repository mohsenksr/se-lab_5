package Builder;

public class Director {
    public void constructTower(Builder builder) {
        builder.setBuildingType(BuildingType.Tower);
        builder.setFloors(100);
        builder.setElevator(true);
    }

    public void constructApartment(Builder builder) {
        builder.setBuildingType(BuildingType.Apartment);
        builder.setFloors(10);
        builder.setElevator(true);
    }

    public void constructHouse(Builder builder) {
        builder.setBuildingType(BuildingType.House);
        builder.setFloors(2);
        builder.setElevator(false);
    }
}
