package Builder;

public class HouseBuilder implements Builder {
    private BuildingType type;
    private int floors;
    private boolean elevator;

    @Override
    public void setBuildingType(BuildingType type) {
        this.type = type;
    }

    @Override
    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }

    public House getResult() {
        return new House(type, floors, elevator);
    }
}
