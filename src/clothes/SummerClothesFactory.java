package clothes;

public class SummerClothesFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new SummerShirt();
    }

    @Override
    public Pants createPants() {
        return new SummerPants();
    }
}
