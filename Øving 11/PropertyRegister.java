import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PropertyRegister {
    Scanner sc = new Scanner(System.in);
    private List<Property> properties;

    public PropertyRegister(){
         properties = new ArrayList<>();
    }

    public Property addPropertyInfo(){
        System.out.print("\nWrite in the municipality number (Between 101 and 5054): ");
        int municipalityNumber = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Write in Municipality name: ");
        String municipalityName = sc.nextLine();

        System.out.print("Write in the lot number: ");
        int lotNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Write in the section number: ");
        int sectionNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Write in the name of the property (if there is one, if not press enter) :");
        String propertyName = sc.nextLine();

        System.out.print("Write in the area of the property: ");
        Double area = sc.nextDouble();
        sc.nextLine();

        System.out.print("Write in the name of the owner :");
        String nameOfOwner = sc.nextLine();

        return new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber, propertyName, area, nameOfOwner);
    }   

    //register
    public void addProperty(Property a){
        properties.add(a);
    }

    public void removeProperty(Property a){
        properties.remove(a);
    }

    public int numberOfProperties(){
        return properties.size();
    }

    public void printAllProperties(){
        for(Property p: properties){
            System.out.println(p);
        }
    }

    public Property findProperty(String propertyNumber){
        for (Property p : properties){
            if(p.getPropertyNumber().equals(propertyNumber) ){
                return p;
            }   
                
        }
        return null;
    }

    public void averageArea(){
        Double sum = 0.0;
        for(Property p : properties){
            sum += p.getArea();
        }
        Double averageArea = sum / properties.size();
        System.out.println("The average area of a property is " + averageArea); 
    }

    public List<Property> findPropertiesByLotNr(int lotNumber){ 
        List <Property> propertiesByLotNr = new ArrayList<>(); 
        for(Property p : properties){
            if (p.getLotNumber() == lotNumber){
                propertiesByLotNr.add(p);
            }
        }
        return propertiesByLotNr;
    }
}
