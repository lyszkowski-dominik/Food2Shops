package Shops.Main;

import java.util.ArrayList;
import java.util.List;
import Shops.Main.Shops;

public class OrderProcess {
    private Warehouse warehouse;
    private List<Shops> shopsList = new ArrayList<>();

    public OrderProcess(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void getShopList(){
        this.shopsList = warehouse.getShopsList();
    }

    public void informationOnProcess(){

        for (Shops shops: shopsList) {
            shops.process();
        }
    }
}
