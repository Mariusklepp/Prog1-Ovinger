import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuRegister register = new MenuRegister();


        //lager 3 retter
        Dish d1 = new Dish("Pizza", "Hovedrett", 250, "Oppskrift");
        Dish d2 = new Dish("Taco", "Hovedrett", 300, "Oppskrift");
        Dish d3 = new Dish("Is", "Dessert", 100, "Oppskrift");

        //registrerer rettene
        register.registerDish(d1);
        register.registerDish(d2);
        register.registerDish(d3);


        //Søker etter retter etter navn
        Dish found = register.findDish("Pizza");

        if (found != null) {
            System.out.println("Fant retten:");
            System.out.println(found);
        } else {
            System.out.println("Fant ingen rett med det navnet.");
        }   


        //Søker etter retter etter type
        List<Dish> foundByType = register.findDishesByType("Hovedrett");

        if (!foundByType.isEmpty()) {
            System.out.println("Her er rettene som har typen Hovedrett:");
            for (Dish d : foundByType) {
                System.out.println(d); // bruker toString() i Dish
            }
        } else {
            System.out.println("Det er ingen retter som hører til denne typen rett.");
        }
        
        //Registere to nye menyer
        Menu menu1 = new Menu("Middagsmeny");
        Menu menu2 = new Menu("Dessertmeny");

        //legger til i menyene
        menu1.addDish(d1);
        menu1.addDish(d2);
        menu2.addDish(d3);

        
        //printer ut den ene menyen
        System.out.println("\nRetter i " + menu1.getName() + ":");
        for (Dish d : menu1.getDishes()){
            System.out.println(d);
        }

        //printer ut den ene menyen
        System.out.println("\nRetter i " + menu2.getName() + ":");
        for (Dish d : menu2.getDishes()){
            System.out.println(d);
        }

        //registrerer begge menyene
        register.registerMenu(menu1);
        register.registerMenu(menu2);

        //finner alle menyene innenfor en prisklasse
        System.out.println("\nMenyene innenfor prisklassen er:");
        register.FindMenusInPricerange(50, 300);

    }
}
