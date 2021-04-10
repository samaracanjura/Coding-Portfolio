import java.util.*;

public class Apartment
{   
    private String apartmentNum;
    private int bedrooms;
    private int baths;
    private double rent; 

    //constructor
    public Apartment( String apartmentNum, int bedrooms, int baths, double rent)
    {
        this.apartmentNum = apartmentNum;
        this.bedrooms = bedrooms;
        this.baths = baths;
        if(rent > 0)
        {
            this.rent = rent; 
        }
    }
    //instance varibles
    public void setApartment(String apartmentNum)
    { 
        this.apartmentNum = apartmentNum;
    }

    public String getApartment()
    {
        return apartmentNum;
    }

    public void setBedrooms(int bedrooms)
    {
        this.bedrooms = bedrooms;
    }

    public int getBedrooms()
    {
        return bedrooms; 
    }

    public void setBaths(int baths)
    {
        this.baths = baths;
    }
    
    public int getBaths()
    {
        return baths; 
    }
    
    public void setRent(double rent)
    {
        if(rent > 0.0)
        {
            this.rent = rent;
        }
    }
    
    public double getRent()
    {
        return rent;
    }
}   
