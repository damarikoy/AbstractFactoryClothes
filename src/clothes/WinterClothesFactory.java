package clothes;

public class WinterClothesFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new WinterShirt();
    }

    @Override
    public Pants createPants() {
        return new WinterPants();
    }
}

