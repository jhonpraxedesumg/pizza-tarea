import pkgpizza.base.Pizza;
import pkgpizza.base.Topping;

public class Main {
    public static void main(String[] args) {

        Pizza miPizza = new Pizza("Mi Pizza", 50.0, 5.0);
        miPizza.addTopping("Pepperoni");
        miPizza.addTopping("Champiñones");
        miPizza.addTopping("pimientos");
        miPizza.addTopping("aceitunas");

        System.out.println("El precio total de tu pizza es: " + miPizza.calcularPrecio() + " quetzales");
        }

}