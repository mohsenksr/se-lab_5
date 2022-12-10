package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();
        Flower iranianFlower = iranianGardenCreator.createFlower();
        Tree iranianTree = iranianGardenCreator.createTree();

        JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();
        Flower japaneseFlower = japaneseGardenCreator.createFlower();
        Tree japaneseTree = japaneseGardenCreator.createTree();

        System.out.println("Iranian Flower: " + iranianFlower.getClass().getSimpleName() +
                "\nIranian Tree: " + iranianTree.getClass().getSimpleName() +
                "\nJapanese Flower: " + japaneseFlower.getClass().getSimpleName() +
                "\nJapanese Tree: " + japaneseTree.getClass().getSimpleName()
        );
    }
}
