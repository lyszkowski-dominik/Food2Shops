package Shops.Main;

public class GlutenFreeShop extends Shops{
    public GlutenFreeShop(String shopName, String productName, int productQuantity, double productPrice) {
        super(shopName, productName, productQuantity, productPrice);
    }

    @Override
    public void process() {
        System.out.println("Kupiłeś/aś ze sklepu " + shopName + " Produkt: " + productName + " w ilości: " + productQuantity + " za cenę jednostkową " + productPrice + " Suma: " + productQuantity*productPrice);
    }
}
