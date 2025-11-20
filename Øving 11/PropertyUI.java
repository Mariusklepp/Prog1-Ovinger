import java.util.Scanner;
public class PropertyUI {
    int userChoice;
    String propertyNumber;
    PropertyRegister register = new PropertyRegister();
    Scanner sc = new Scanner(System.in);

    public void start(){
        do{
            showMenu();
            userChoice = userChoice();
            sc.nextLine();
            switch (userChoice) {
                case 1:
                    register.addProperty(register.addPropertyInfo());

                    break;
                
                case 2:
                    int numberOfProperties = register.numberOfProperties();
                    System.out.println("There is " + numberOfProperties + " properties registered\n");
                    register.printAllProperties();
                    break;
                
                case 3:
                System.out.print("Write property number (format 123-123/123): ");
                    propertyNumber = sc.nextLine().trim();

                    Property found = register.findProperty(propertyNumber);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("No property found with that number.");
                    }

                    break;

                case 4:
                    register.averageArea();
                    break;

                case 5:
                    System.out.print("Write property number (format 123-123/123): ");
                    propertyNumber = sc.nextLine().trim();


                    Property toRemove = register.findProperty(propertyNumber);
                    register.removeProperty(toRemove);
                    break;
                
                case 9:
                System.out.println("Thank you for using the Properties app!");
                    break;

                default:
                    System.out.println("Please choose a number betweeen 1-5 or 9");
                    break;
            }
        }while( userChoice!= 9);
    }


    public void showMenu(){
        System.out.println("\n---------Property register application v0.1-------\n");
        System.out.println("1) Add property");
        System.out.println("2) List all properties");
        System.out.println("3) Search property");
        System.out.println("4) Calculate average area");
        System.out.println("5) Remove a property");
        System.out.println("9) Quit");

    }

    public int userChoice(){
        int userChoice = 0;
        System.out.println("Please enter a number between 1-5 or 9\n");
        if(sc.hasNextInt()){
            userChoice = sc.nextInt();
        }
        else{
            System.out.println("Please enter a number, not text");
        }
        return userChoice; 
    }


}
