package Builder;

public class TowerBuilder implements Builder {
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

    public Tower getResult() {
        return new Tower(type, floors, elevator);
    }
}
