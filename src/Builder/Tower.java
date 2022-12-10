package Builder;

public class Tower {
    private final BuildingType type;
    private final int floors;
    private final boolean elevator;

    public Tower(BuildingType type, int floors, boolean elevator) {
        this.type = type;
        this.floors = floors;
        this.elevator = elevator;
    }

    public BuildingType getType() {
        return type;
    }

    public int getFloors() {
        return floors;
    }

    public boolean isElevator() {
        return elevator;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "type=" + type +
                ", floors=" + floors +
                ", elevator=" + elevator +
                '}';
    }
}
