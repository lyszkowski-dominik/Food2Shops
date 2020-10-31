package Shops.Main;

import java.util.ArrayList;
import java.util.List;

public class ShopsInit {
    List<Shops> shopsList = new ArrayList<Shops>();

    public Warehouse getShopsList(){
    shopsList.add(new ExtraFoodShop("Extra Food Shop","Burger",40,2.5));
    shopsList.add(new GlutenFreeShop("Gluten Free","Chlebek",30,1.5));
    shopsList.add(new HealthyShop("Healthy Shop","Witamina C", 12,5.50));

    return new Warehouse(shopsList);
    }
}
