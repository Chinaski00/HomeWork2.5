import java.util.*;

public class Product {

    private String name;
    private int cost;
    private String kg;
    private Set<String> products = new HashSet<>();

    public Product(String name, int cost, String kg) {
        this.name = name;
        if (!this.name.isBlank() || !this.name.isEmpty()){
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        this.cost = Math.abs(cost);
        this.kg = kg;
        if (!this.kg.isBlank() || !this.kg.isEmpty()){
            this.kg = kg;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public void checkProducts(Set<Product> foodBasket){
        if (!foodBasket.contains(this)){
            foodBasket.add(this);
        } else {
            throw new RuntimeException("Данный товар у Вас уже есть.");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                ", kg='" + kg + '\'' +
                '}';
    }
}
