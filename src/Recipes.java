import java.util.HashSet;
import java.util.Set;

public class Recipes {

    private String lotsProducts;
    private String totalCost;
    private String nameRecipe;
    private Set<String> recipes = new HashSet<>();

    public Recipes(String lotsProducts, String totalCost, String nameRecipe) {
        this.lotsProducts = lotsProducts;
        this.totalCost = totalCost;
        this.nameRecipe = nameRecipe;
    }

    public String getLotsProducts() {
        return lotsProducts;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }
    public void checkRecipes(Set<Recipes> recipes){
        if (!recipes.contains(this)){
            recipes.add(this);
        } else {
            throw new RuntimeException("Данный рецепт у Вас уже есть.");
        }
    }
}
