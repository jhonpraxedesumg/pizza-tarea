package pkgpizza.base;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping>toppings = new ArrayList<>();

    public Pizza (String name,double price,Topping... toopings){
        this.name=name;
        this.price=price;
        for (Topping tp : toopings){
            this.toppings.add(tp);
        }
    }

    public void addTopping
}
