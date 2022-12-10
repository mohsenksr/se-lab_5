package AbstractFactory;

public class JapaneseGardenCreator extends GardenCreator {
    @Override
    Tree createTree() {
        return new Maple();
    }

    @Override
    Flower createFlower() {
        return new Sakura();
    }
}
