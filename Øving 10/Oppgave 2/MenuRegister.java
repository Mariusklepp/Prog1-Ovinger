import java.util.ArrayList;
import java.util.List;

public class MenuRegister {

    private List<Dish> dishes = new ArrayList<>();
    private List<Menu> menus = new ArrayList<>();

    public void registerDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish findDish(String name){
        for(Dish d : dishes){
            if (d.getName().equalsIgnoreCase(name)){
                return d;
            }

        }
        return null;
    }

    public List<Dish> findDishesByType(String type){
        List<Dish> resultat = new ArrayList<>();

        for(Dish d : dishes){
            if (d.getType().equalsIgnoreCase(type)){
               resultat.add(d);
            }
        }
        return resultat;
    }

    public void registerMenu(Menu menu) {
        menus.add(menu);
    }

    public void FindMenusInPricerange(int nedregrense, int øvregrense){
        List<Menu> result = new ArrayList<>();
            for (Menu m : menus){
                int total = m.getTotalPrice();
                if(nedregrense <= total && total <= øvregrense){
                    result.add(m);
                }
            }
        System.out.println(result);
    }




}   



