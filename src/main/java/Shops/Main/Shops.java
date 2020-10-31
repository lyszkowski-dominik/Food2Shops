package Shops.Main;

public abstract class Shops {
    protected String shopName;
    protected String productName;
    protected int productQuantity;
    protected double productPrice;

    public Shops(String shopName, String productName, int productQuantity, double productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public abstract void process();
}
