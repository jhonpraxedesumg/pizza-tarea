package pkgpizza.base;
import java.util.ArrayList;
import java.util.List;
public class Topping {

        private List<String> ingredientesDisponibles;

        public Topping() {
            this.ingredientesDisponibles = new ArrayList<>();
        }

        public void agregarIngrediente(String ingrediente) {
            this.ingredientesDisponibles.add(ingrediente);
        }

        public List<String> getIngredientesDisponibles() {
            return this.ingredientesDisponibles;
        }
    }


