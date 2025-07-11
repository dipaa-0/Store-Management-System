    class Department extends Store
    {
        private String productName; 
        private double markedPrice;
        private double sellingPrice;
        private boolean isInSales;
    
        public Department(int storeId, String storeName, String location, String openingHour, double totalSales, double totalDiscount,String productName,double markedPrice)
        {
          super(storeId,storeName,location,openingHour);
          this.productName = productName;
          this.isInSales=true;
          this.sellingPrice=0.0;
          this.markedPrice= markedPrice;
                
    }
        public String getproductName()
        {
            return productName;
        }
        public double getmarkedPrice()
        {
            return this.markedPrice;
        }
         public void setmarked_price(double marked_price)
        {
           this.markedPrice=markedPrice;
        }
        public  double calculateDiscountPrice(boolean isInSales, double markedPrice)
        {
        if(isInSales)
        {
        if (markedPrice>=5000)
        {
            sellingPrice= markedPrice-(markedPrice * 0.20);
        }
        
        else if (markedPrice>3000 && markedPrice<5000)
        {
            sellingPrice= markedPrice-(markedPrice * 0.10);
        }
        
        else if (markedPrice>1000 && markedPrice<3000)
        {
            sellingPrice= markedPrice-(markedPrice * 0.05);
        }
        
        else
        {
            sellingPrice= markedPrice;
        }
        }
        settotalDiscount(markedPrice - sellingPrice);
        this.isInSales= false;
        return sellingPrice;
         }
        public void display()
        {
            super.display();
            if(isInSales)
            {
                System.out.println("Product name=" + productName);  
                System.out.println("Marked_Price=" + markedPrice);
            }
            else
            {
                System.out.println("Product name=" + productName);
                System.out.println("Selling_Price=" + sellingPrice);
            }
        }
        @Override
        public String getDetails()
        {
            return super.getDetails() + "\n"+
                        "Product Name:" + productName + "\n"+
                        "Marked Price" + markedPrice + "\n"+
                        (isInSales ? "Selling Price: Not Calculated Yet": "Selling Price:" + sellingPrice);
        }

    }
        