public class Store
{
    private int storeId;
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;
    public Store(int storeId, String storeName, String location, String openingHour)
    {
        this.storeId=storeId;
        this.storeName=storeName;
        this.location=location;
        this.openingHour=openingHour;
        this.totalSales=0.0;
        this.totalDiscount=0.0;
    }
    public int getstoreId()
    {
        return storeId;
    }
    public String getstoreName()
    {
        return storeName;
    }
    public String getlocation()
    {
        return location;
    }
    public String getopeningHour()
    {
        return openingHour;
    }
    public double gettotalSales()
    {
        return totalSales;
    }
    public double gettotalDiscount()
    {
        return totalDiscount;
    }
    public void settotalSales(double totalSales)
    {
        this.totalSales +=totalSales;
    }
    public void settotalDiscount(double totalDiscount)
    {
        this.totalDiscount +=totalDiscount;
    }
    public void display()
    {
        System.out.println("Store Id="+ this.storeId);
        System.out.println("Store Name="+this.storeName);
        System.out.println("Location="+this.location);
        System.out.println("Opening Hour="+this.openingHour);
        System.out.println("Total Sales="+this.totalSales);
       if(totalDiscount==0 && totalSales==0)
       {
           System.out.println("No sales and discounts.");
       }
       else
       {
           System.out.println("Total Sales="+ totalSales);
           System.out.println("Total Discount="+ totalDiscount);
       }
    }
    
    public String getDetails()
    {
        return "Store ID:" + storeId + "\n" +
               "Store Name" + storeName + "\n" +
               "Location" + location +"\n" +
               "Opening Hour"+ openingHour +"\n" +
               "Total Sales"+ totalSales + "\n" +
               "Total Discount" +totalDiscount ;
                  
    }
    public static void main(String[]args)
       {
           int storeId=10;
           String storeName="STORE";
           String location="Kathmandu";
           String openingHour="9:00 AM";
       }
    }