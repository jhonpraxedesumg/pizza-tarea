package pkgpizza.base;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double precioBase;
    private double precioIngredienteExtra;
    private List<String> toppings;

    public Pizza(String name, double precioBase, double precioIngredienteExtra) {
        this.name = name;
        this.precioBase = precioBase;
        this.precioIngredienteExtra = precioIngredienteExtra;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public double calcularPrecio() {
        return this.precioBase + (this.toppings.size() * this.precioIngredienteExtra);
    }

}