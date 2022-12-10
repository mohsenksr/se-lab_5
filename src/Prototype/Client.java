package Prototype;

public class Client {
    public static void main(String[] args) {
        BuildingCache.loadCache();

        Building clonedTower = (Building) BuildingCache.getBuilding("tower1");
        System.out.println("Building : " + clonedTower.getType());

        Building clonedApartment = (Building) BuildingCache.getBuilding("apartment1");
        System.out.println("Building : " + clonedApartment.getType());
    }
}
