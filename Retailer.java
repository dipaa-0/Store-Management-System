public class Retailer extends Store
{
    private int VATinclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;
    public Retailer(int storeId, String storeName, String location, String openingHour,double totalSales,double totalDiscount, int VATinclusivePrice,
    boolean isPaymentOnline, String purchasedYear)
    {
     super(storeId,storeName,location,openingHour);
     this.VATinclusivePrice=VATinclusivePrice;
     this.isPaymentOnline=isPaymentOnline;
     this.purchasedYear=purchasedYear;
     int loyaltyPoint=0;
    }
    public int getVATinclusivePrice()
    {
       return VATinclusivePrice; 
    }
    public int getloyaltyPoint()
    {
        return loyaltyPoint;
    }
    public String getpurchasedYear()
    {
        return purchasedYear;
    }
    public boolean getisPaymentOnline()
    {
        return isPaymentOnline;
    }
    public void setisPaymentOnline(boolean isPaymentOnline)
    {
        this.isPaymentOnline=isPaymentOnline;
    }
    public void setloyaltyPoint( boolean isPaymentOnline, int VATinclusivePrice)
    {
    if (isPaymentOnline){
        this.loyaltyPoint=VATinclusivePrice/100;
    }
    else
    {
        this.loyaltyPoint=0;
    }
    }
    public void setpurchasedYear(String purchasedYear)
    {
        this.purchasedYear= purchasedYear;
    }
      
    public void removeProduct()
   {
        if (loyaltyPoint==0 && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022") || purchasedYear.equals("2023") || purchasedYear.equals("2024")))
        {
            System.out.println("The product is removed.");
        }
        else
        {
            System.out.println("The product is not removed.");
        }
        int VATincluvivePrice=0;
        int loyaltyPoint=0;
        boolean isPaymentOnline=false;
    }
   public void display()
    {
    super.display();

    if(loyaltyPoint==0 && !(purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022")))
    {
        System.out.println(VATinclusivePrice=0);
        System.out.println(loyaltyPoint=0);
        System.out.println(isPaymentOnline=false);
    }
    else
    {
        System.out.println("The product has been removed.");
    }
    }   
    @Override
        public String getDetails()
        {
            return super.getDetails() + "\n"+
                   "VAT Inclusive Price:" + VATinclusivePrice + "\n"+
                   "Loyalty Point:" + loyaltyPoint + "\n" +
                   "Purchased Year:" + purchasedYear ;
        }
}