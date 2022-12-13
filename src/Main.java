import java.util.*;

public class Main {
    public static void main(String[] args){


        Product banana = new Product("Банан", 90, "1");
        Product apple = new Product("Яблоко", 50, "2");
        Product coconut = new Product("Кокос", 120, "1");

        Set<Product> products = new HashSet<>();
        banana.checkProducts(products);
        apple.checkProducts(products);

        Recipes recipes1 = new Recipes("1",90,"Банановый смузи");
        Recipes recipes2 = new Recipes("4",200,"Яблочный смузи");
        HashMap<Product, Integer> map = new HashMap<>();
        map.put(banana,1);
        map.put(apple, 4);



        System.out.println(createSet());
        System.out.println(removeNumbers(createSet()));

        //Задача про учителя и таблицу умножения
        List<String> strings = new ArrayList<>();
        strings.add("2*2");
        strings.add("2*3");
        strings.add("2*4");
        strings.add("2*5");
        strings.add("2*6");
        strings.add("2*7");
        strings.add("2*8");
        strings.add("2*9");
        strings.add("3*2");
        strings.add("3*3");
        strings.add("3*4");
        strings.add("3*5");
        strings.add("3*6");
        strings.add("3*7");
        strings.add("3*8");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        Collections.shuffle(strings);
        List<String> chosenPairs = strings.subList(0, 15);
        System.out.println(chosenPairs);


        //Задача про паспорта
        Passport passport1 = new Passport("5020","Iva","Kost","Evg","09.09.2000", "2000");
        Set<Passport> passport = new HashSet<>();
        passport1.addPassport(passport);
        System.out.println(passport1.toString());
        Passport passport2 = new Passport("5020","Iva","Zver","Evg","09.09.2000","20000");
        passport2.addPassport(passport);
        System.out.println(passport1.toString());
    }
    public static Set<Integer> createSet() {
        Set<Integer> newSet = new HashSet<>();

        for (int i = 0; i <= 20; i++) {
            newSet.add((int)Math.round(Math.random()*100));
        }
        return newSet;
    }
    public static Set<Integer> removeNumbers(Set<Integer> set) {
        set.removeIf(num -> num % 2 != 0);
        return set;
    }
}