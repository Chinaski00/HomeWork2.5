import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Recipes {

    private String lotsProducts;
    private int totalCost;
    private String nameRecipe;
    private HashMap<Product, Integer> map = new HashMap<>();

    public Recipes(String lotsProducts, int totalCost, String nameRecipe) {
        this.lotsProducts = lotsProducts;
        this.totalCost = totalCost;
        this.nameRecipe = nameRecipe;
    }

    public String getLotsProducts() {
        return lotsProducts;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }
    public void checkRecipes1(HashMap<Product,Integer> map){
        if (map.containsValue(null)){
            map.containsValue(1);
        }
    }
    public void checkRecipes(Set<Recipes> recipes){
        if (!recipes.contains(this)){
            recipes.add(this);
        } else {
            throw new RuntimeException("Данный рецепт у Вас уже есть.");
        }
    }
}
