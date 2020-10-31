package Shops.Main;

public class HealthyShop extends Shops{
    public HealthyShop(String shopName, String productName, int productQuantity, double productPrice) {
        super(shopName, productName, productQuantity, productPrice);
    }

    @Override
    public void process() {
        System.out.println("Jestem innym procesem od reszty dla Sklepu HealthyShop");
    }
}
