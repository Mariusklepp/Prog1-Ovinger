import java.util.List;
import java.util.ArrayList;

public class Menu{
    private List<Dish> dishes;
    private String menuname;


    public Menu(String menuname){
        this.menuname = menuname;
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }
    public List<Dish> getDishes() {
        return dishes;
    }

    public String getName(){
        return menuname;
    }

    public String toString(){
        return "Retter i menyen" +
                dishes;
    }

    public int getTotalPrice(){
        int sum = 0;
        for (Dish d : dishes){
            sum += d.getPris();
        }
        return sum;
    }
}

