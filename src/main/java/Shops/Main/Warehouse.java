package Shops.Main;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Shops> shopsList = new ArrayList<>();

    public Warehouse(List<Shops> shopsList) {
        this.shopsList = shopsList;
    }

    public List<Shops> getShopsList() {
        return new ArrayList<Shops>(shopsList);
    }
}
