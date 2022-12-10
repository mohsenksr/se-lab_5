package Builder;

public class House {
    private final BuildingType type;
    private final int floors;
    private final boolean elevator;

    public House(BuildingType type, int floors, boolean elevator) {
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
        return "House{" +
                "type=" + type +
                ", floors=" + floors +
                ", elevator=" + elevator +
                '}';
    }
}
