package Shops.Main;

public class App {
    public static void main (String []args){
        ShopsInit shopsInit = new ShopsInit();
        Warehouse warehouse = shopsInit.getShopsList();
        OrderProcess orderProcess = new OrderProcess(warehouse);
        orderProcess.getShopList();
        orderProcess.informationOnProcess();
    }
}
