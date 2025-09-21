package clothes;

public class Application {
    public static void main(String[] args) {
        ClothesFactory summerFactory = new SummerClothesFactory();
        ClothesFactory winterFactory = new WinterClothesFactory();

        System.out.println("Summer Collection");
        summerFactory.createShirt().wear();
        summerFactory.createPants().wear();

        System.out.println("\n Winter Collection");
        winterFactory.createShirt().wear();
        winterFactory.createPants().wear();
    }
}



