import java.util.*;

public class TestApartments
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Apartment a1 = new Apartment("B202", 2, 1, 1500.00);
        Apartment a2 = new Apartment("A100", 1, 1, 1100.00);
        Apartment a3 = new Apartment("B216", 2, 2, 1750.00);
        Apartment a4 = new Apartment("C310", 3, 2, 2100.00);
        Apartment a5 = new Apartment("C314", 3, 3, 2350.00);
        
    int bedNum;
    int bathNum;
    double rentMax;
    boolean found = false;
    System.out.println("Enter a minimum of bedrooms: " );
    bedNum = input.nextInt();
    System.out.println("Enter a minium of baths: ");
    bathNum = input.nextInt();
    System.out.println("Enter a maximum of rent: ");
    rentMax = input.nextDouble();
    
    if(bedNum == 1 && bathNum == 1 && rentMax >=1100)
    {
        System.out.printf("Apartment: " + a2.getApartment() + "\n" + "Bedrooms: " +a2.getBedrooms() +"\n");
        System.out.printf("Baths: " + a2.getBaths() + "\n" + "Monthly Rent: %.2f",a2.getRent());
        found = true;
    }
    
    if(bedNum == 2 && bathNum == 1 && rentMax >= 1500)
    {
        System.out.printf("Apartment: " + a1.getApartment() + "\n" + "Bedrooms: " +a1.getBedrooms() +"\n");
        System.out.printf("Baths: " + a1.getBaths() + "\n" + "Monthly Rent: %.2f",a1.getRent());
        found = true;
    }
    
    if(bedNum == 2 && bathNum ==2 && rentMax >=1750)
    {
        System.out.printf("Apartment: " + a3.getApartment() + "\n" + "Bedrooms: " +a3.getBedrooms() +"\n");
        System.out.printf("Baths: " + a3.getBaths() + "\n" + "Monthly Rent: %.2f",a3.getRent());
        found = true;
    }
    
    if(bedNum == 3 && bathNum == 2 && rentMax >= 2000)
    {
        System.out.printf("Apartment: " + a4.getApartment() + "\n" + "Bedrooms: " +a4.getBedrooms() +"\n");
        System.out.printf("Baths: " + a4.getBaths() + "\n" + "Monthly Rent: %.2f",a4.getRent());
        found = true;
    }
    
    if(bedNum == 3 && bathNum == 3 && rentMax >= 2200)
    {   System.out.printf("Apartment: " + a5.getApartment() + "\n" + "Bedrooms: " +a5.getBedrooms() +"\n");
        System.out.printf("Baths: " + a5.getBaths() + "\n" + "Monthly Rent: %.2f",a5.getRent());
        found = true;
    }
    
    if(!found)
    {
        System.out.println("Sorry we do not have any avaible units" + "\n" +"meeting that criteria at the moment." +"\n"+"Please check again later.");
    }
    
 }
}
