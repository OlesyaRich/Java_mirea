package Pr_6.Ex_3;
import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }
    public void showFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.info();
        }
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair1 = new Chair("Wooden chair", 50, 4);
        Chair chair2 = new Chair("Plastic chair", 30, 3);
        Sofa sofa1 = new Sofa("Leather sofa", 200, 3);
        Sofa sofa2 = new Sofa("Fabric sofa", 150, 2);

        shop.addFurniture(chair1);
        shop.addFurniture(chair2);
        shop.addFurniture(sofa1);
        shop.addFurniture(sofa2);

        shop.showFurniture();
    }
}