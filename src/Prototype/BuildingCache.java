package Prototype;

import java.util.Hashtable;

public class BuildingCache {

    private static Hashtable<String, Building> buildingMap = new Hashtable<String, Building>();

    public static Building getShape(String shapeId) {
        Building cachedBuilding = buildingMap.get(shapeId);
        return (Building) cachedBuilding.clone();
    }

    public static void loadCache() {
        Tower tower = new Tower();
        tower.setId("tower1");
        buildingMap.put(tower.getId(), tower);

        Apartment apartment = new Apartment();
        apartment.setId("apartment1");
        buildingMap.put(apartment.getId(), apartment);
    }
}