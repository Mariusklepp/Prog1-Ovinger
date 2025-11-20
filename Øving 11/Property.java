public class Property {
    private int municipalityNumber;
    private String municipalityName;
    private int lotNumber; //gnr
    private int sectionNumber; //bnr
    private String name;
    private Double
     area;
    private String nameOfOwner;
    private String propertyNumber;

    public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name, Double area, String nameOfOwner){
        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.nameOfOwner = nameOfOwner;
        this.propertyNumber = municipalityNumber + "-" + lotNumber + "/" + sectionNumber;

    }

    public int getMunicipalityNumber(){
        return municipalityNumber;
    }
    public String getMunicipalityName(){
        return municipalityName;
    }
    public int getLotNumber(){
        return lotNumber;
    }
    public int getSectionNumber(){
        return sectionNumber;
    }
    public String getName(){
        return name;
    }
    public Double getArea(){
        return area;
    }
    public String getNameOfOwner(){
        return nameOfOwner;
    }

    public static String propertyNumber(int municipalityNumber, int lotNumber, int sectionNumber){
        return municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    }
    public String getPropertyNumber(){
        return propertyNumber;
    }

    public String toString(){
        return "Property number: " + propertyNumber + 
                "\nName of property: " + name +
                "\nName of owner: " + nameOfOwner +
                "\nArea of the property: " + area + "m^2" +
                "\nMunicipality name: " + municipalityName;
    }
}
