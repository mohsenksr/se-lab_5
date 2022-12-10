package AbstractFactory;

public class IranianGardenCreator extends GardenCreator {
    @Override
    Tree createTree() {
        return new Chenar();
    }

    @Override
    Flower createFlower() {
        return new Mohammadi();
    }
}
