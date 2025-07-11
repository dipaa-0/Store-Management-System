import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class StoreGUI {
    // Frames
    private JFrame frame, frame1, frame2, frame3, frame4, frame5;
    
    // Labels for topics
    private JLabel topicLabel, topic1Label, topic2Label, topic3Label, topic4Label, topic5Label;
    
    // Labels and fields for Department
    private JLabel storeIdLabel, storeNameLabel, locationLabel, openingHourLabel, totalSalesLabel, totalDiscountLabel, productNameLabel, markedPriceLabel;
    private JTextField storeIdField, storeNameField, locationField, openingHourField, totalSalesField, totalDiscountField, productNameField, markedPriceField;

    // Labels and fields for Retailer
    private JLabel storeId1Label, storeName1Label, location1Label, openingHour1Label, totalSales1Label, totalDiscount1Label, VATinclusivePriceLabel, loyaltyPointLabel, purchasedYearLabel;
    private JTextField storeId1Field, storeName1Field, location1Field, openingHour1Field, totalSales1Field, totalDiscount1Field, VATinclusivePriceField, loyaltyPointField;

    // Buttons for Store Management System
    private JButton addDepartmentButton, addRetailerButton, calculateButton, setButton, removeButton;
    
    // Buttons for Department
    private JButton addDepButton, displayButton, clearButton, backButton;
    
    // Buttons for Retailer
    private JButton addRetButton, display1Button,clear1Button, back1Button;
    
    //Labels, Fields and Buttons for Calculate Discount Price
    private JLabel storeId2Label;
    private JTextField storeId2Field;
    private JButton calculate1Button, clear2Button, back2Button;
    
    //Labels, Fields and Buttons for Set Loyalty Point
    private JLabel storeId3Label;
    private JTextField storeId3Field;
    private JButton set1Button, clear3Button, back3Button;
    
    //Labels, Fields and Buttons for Remove Products
    private JLabel storeId4Label;
    private JTextField storeId4Field;
    private JButton remove1Button, clear4Button, back4Button;
    
    // Check Boxes
    private JCheckBox isPaymentOnlineCheck, isInSalesCheck;

    // Combo Box
    private JComboBox<String> purchasedYearCombo;

    // ArrayList
    private ArrayList<Store> storeList;

    // Fonts
    private Font font, font1, font2, font3, font4, font5;

       

    // Constructor
    public StoreGUI() {
        storeList = new ArrayList<>();

        // Frame (Store Management System)
        frame = new JFrame("Store Management System");
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.decode("#dad0de"));
        frame.setLayout(null);

        topicLabel = new JLabel("Store Management System");
        topicLabel.setBounds(500, 80, 350, 50);
        frame.add(topicLabel);
        Font font = new Font("Times New Roman", Font.BOLD, 24);
        topicLabel.setFont(font);

        addDepartmentButton = new JButton("Add Department");
        addDepartmentButton.setBounds(550, 150, 200, 50);
        addDepartmentButton.setBackground(Color.decode("#9b91a1"));
        frame.add(addDepartmentButton);
       
        addRetailerButton = new JButton("Add Retailer");
        addRetailerButton.setBounds(550, 230, 200, 50);
        addRetailerButton.setBackground(Color.decode("#9b91a1"));
        frame.add(addRetailerButton);
       
        calculateButton = new JButton("Calculate Discount Price");
        calculateButton.setBounds(550,310,200,50);
        calculateButton.setBackground(Color.decode("#9b91a1"));
        frame.add(calculateButton);
        
        setButton = new JButton("Set Loyalty Point");
        setButton.setBounds(550,390,200,50);
        setButton.setBackground(Color.decode("#9b91a1"));
        frame.add(setButton);
        
        removeButton = new JButton("Remove Product");
        removeButton.setBounds(550,470,200,50);
        removeButton.setBackground(Color.decode("#9b91a1"));
        frame.add(removeButton);
        
        frame.setVisible(true);
        
        // Frame1 (Department)
        frame1 = new JFrame("Department");
        frame1.setSize(800, 800);
        frame1.getContentPane().setBackground(Color.decode("#989898"));
        frame1.setLayout(null);

       
        topic1Label = new JLabel("Add Department");
        topic1Label.setBounds(500, 80, 350, 50);
        frame1.add(topic1Label);
        Font font1 = new Font("Times New Roman", Font.BOLD, 24);
        topic1Label.setFont(font1);

        storeIdLabel = new JLabel("Store ID:");
        storeIdLabel.setBounds(400, 150, 150, 50);
        frame1.add(storeIdLabel);

        storeIdField = new JTextField();
        storeIdField.setBounds(600, 165, 150, 25);
        frame1.add(storeIdField);

        storeNameLabel = new JLabel("Store Name:");
        storeNameLabel.setBounds(400, 180, 150, 50);
        frame1.add(storeNameLabel);

        storeNameField = new JTextField();
        storeNameField.setBounds(600, 195, 150, 25);
        frame1.add(storeNameField);

        locationLabel = new JLabel("Location:");
        locationLabel.setBounds(400, 210, 150, 50);
        frame1.add(locationLabel);

        locationField = new JTextField();
        locationField.setBounds(600, 225, 150, 25);
        frame1.add(locationField);

        openingHourLabel = new JLabel("Opening Hour:");
        openingHourLabel.setBounds(400, 240, 150, 50);
        frame1.add(openingHourLabel);

        openingHourField = new JTextField();
        openingHourField.setBounds(600, 255, 150, 25);
        frame1.add(openingHourField);

        totalSalesLabel = new JLabel("Total Sales:");
        totalSalesLabel.setBounds(400, 270, 150, 50);
        frame1.add(totalSalesLabel);

        totalSalesField = new JTextField();
        totalSalesField.setBounds(600, 285, 150, 25);
        frame1.add(totalSalesField);

        totalDiscountLabel = new JLabel("Total Discount:");
        totalDiscountLabel.setBounds(400, 300, 150, 50);
        frame1.add(totalDiscountLabel);

        totalDiscountField = new JTextField();
        totalDiscountField.setBounds(600, 315, 150, 25);
        frame1.add(totalDiscountField);

        productNameLabel = new JLabel("Product Name:");
        productNameLabel.setBounds(400, 330, 150, 50);
        frame1.add(productNameLabel);

        productNameField = new JTextField();
        productNameField.setBounds(600, 345, 150, 25);
        frame1.add(productNameField);

        markedPriceLabel = new JLabel("Marked Price:");
        markedPriceLabel.setBounds(400, 360, 150, 50);
        frame1.add(markedPriceLabel);

        markedPriceField = new JTextField();
        markedPriceField.setBounds(600, 375, 150, 25);
        frame1.add(markedPriceField);

        isInSalesCheck = new JCheckBox("Is In Sales");
        isInSalesCheck.setBounds(600, 420, 100, 30);
        frame1.add(isInSalesCheck);

        addDepButton = new JButton("Add");
        addDepButton.setBounds(400, 500,100, 30);
        addDepButton.setBackground(Color.decode("#cccccc"));
        frame1.add(addDepButton);
        
        displayButton = new JButton("Display");
        displayButton.setBounds(550,500,100,30);
        displayButton.setBackground(Color.decode("#cccccc"));
        frame1.add(displayButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(700, 500, 100, 30);
        clearButton.setBackground(Color.decode("#cccccc"));
        frame1.add(clearButton);

        backButton = new JButton("Back");
        backButton.setBounds(850, 500, 100, 30);
        backButton.setBackground(Color.decode("#cccccc"));
        frame1.add(backButton);

        frame1.setVisible(false);
        
         // Frame2 (Retailer)
        frame2 = new JFrame("Retailer");
        frame2.setSize(800, 800);
        frame2.getContentPane().setBackground(Color.decode("#b3cf99"));
        frame2.setLayout(null);

        topic2Label = new JLabel("Add Retailer");
        topic2Label.setBounds(500, 80, 350, 50);
        frame2.add(topic2Label);
        Font font2 = new Font("Times New Roman", Font.BOLD, 24);
        topic2Label.setFont(font2);

        storeId1Label = new JLabel("Store ID:");
        storeId1Label.setBounds(400, 150, 150, 50);
        frame2.add(storeId1Label);

        storeId1Field = new JTextField();
        storeId1Field.setBounds(600, 165, 150, 25);
        frame2.add(storeId1Field);

        storeName1Label = new JLabel("Store Name:");
        storeName1Label.setBounds(400, 180, 150, 50);
        frame2.add(storeName1Label);

        storeName1Field = new JTextField();
        storeName1Field.setBounds(600,195,150,25);
        frame2.add(storeName1Field);
        
        location1Label = new JLabel("Location:");
        location1Label.setBounds(400,210,150,50);
        frame2.add(location1Label);
        
        location1Field = new JTextField();
        location1Field.setBounds(600,225,150,25);
        frame2.add(location1Field);
        
        openingHour1Label = new JLabel("Opening Hour:");
        openingHour1Label.setBounds(400,240,150,50);
        frame2.add(openingHour1Label);
        
        openingHour1Field = new JTextField();
        openingHour1Field.setBounds(600,255,150,25);
        frame2.add(openingHour1Field);
        
        totalSales1Label = new JLabel("Total Sales:");
        totalSales1Label.setBounds(400,270,150,50);
        frame2.add(totalSales1Label);
        
        totalSales1Field = new JTextField();
        totalSales1Field.setBounds(600,285,150,25);
        frame2.add(totalSales1Field);
        
        totalDiscount1Label = new JLabel("Total Discount:");
        totalDiscount1Label.setBounds(400,300,150,50);
        frame2.add(totalDiscount1Label);
        
        totalDiscount1Field = new JTextField();
        totalDiscount1Field.setBounds(600,315,150,25);
        frame2.add(totalDiscount1Field);
        
        VATinclusivePriceLabel = new JLabel("VAT Inclusive Price:");
        VATinclusivePriceLabel.setBounds(400,330,150,50);
        frame2.add(VATinclusivePriceLabel);
        
        VATinclusivePriceField = new JTextField();
        VATinclusivePriceField.setBounds(600,345,150,25);
        frame2.add(VATinclusivePriceField);
        
        loyaltyPointLabel = new JLabel("Loyalty Point:");
        loyaltyPointLabel.setBounds(400,360,150,50);
        frame2.add(loyaltyPointLabel);
        
        loyaltyPointField = new JTextField();
        loyaltyPointField.setBounds(600,375,150,25);
        frame2.add(loyaltyPointField);
        
        isPaymentOnlineCheck = new JCheckBox("Is Payment Online:");
        isPaymentOnlineCheck.setBounds(400,440,150,50);
        frame2.add(isPaymentOnlineCheck);
        
        purchasedYearLabel= new JLabel("Purchased Year:");
        purchasedYearLabel.setBounds(570,440,150,40);
        frame2.add(purchasedYearLabel);
        
        purchasedYearCombo = new JComboBox<>(new String[]{"","2020","2021","2022","2023","2024"});
        purchasedYearCombo.setBounds(670,440,150,40);
        frame2.add(purchasedYearCombo);

        addRetButton = new JButton("Add");
        addRetButton.setBounds(400,550,100,30);
        addRetButton.setBackground(Color.decode("#87ab69"));
        frame2.add(addRetButton);
        
        display1Button = new JButton("Display");
        display1Button.setBounds(550,550,100,30);
        display1Button.setBackground(Color.decode("#87ab69"));
        frame2.add(display1Button);
        
        clear1Button = new JButton("Clear");
        clear1Button.setBounds(700,550,100,30);
        clear1Button.setBackground(Color.decode("#87ab69"));
        frame2.add(clear1Button);
        
        back1Button = new JButton("Back");
        back1Button.setBounds(850,550,100,30);
        back1Button.setBackground(Color.decode("#87ab69"));
        frame2.add(back1Button);

        frame2.setVisible(false);
        
         // Frame3 (Calculate Discount Price)
        frame3 = new JFrame("Calculate Discount Price");
        frame3.setSize(800, 800);
        frame3.getContentPane().setBackground(Color.decode("#f3e2d6"));
        frame3.setLayout(null);

        topic3Label = new JLabel("Calculate Discount Price");
        topic3Label.setBounds(500, 100, 350, 50);
        frame3.add(topic3Label);
        Font font3 = new Font("Times New Roman", Font.BOLD, 24);
        topic3Label.setFont(font3);

        storeId2Label = new JLabel("Store ID:");
        storeId2Label.setBounds(450, 200, 100, 50);
        frame3.add(storeId2Label);

        storeId2Field = new JTextField();
        storeId2Field.setBounds(600, 215, 150, 25);
        frame3.add(storeId2Field);
        
        calculate1Button = new JButton("Calculate");
        calculate1Button.setBounds(400,300,100,30);
        calculate1Button.setBackground(Color.decode("#bb877a"));
        frame3.add(calculate1Button);
        
        clear2Button = new JButton("Clear");
        clear2Button.setBounds(550,300,100,30);
        clear2Button.setBackground(Color.decode("#bb877a"));
        frame3.add(clear2Button);
        
        back2Button = new JButton("Back");
        back2Button.setBounds(700,300,100,30);
        back2Button.setBackground(Color.decode("#bb877a"));
        frame3.add(back2Button);

        frame3.setVisible(false);
        
        // Frame4 (Set Loyalty Point)
        frame4 = new JFrame("Set Loyalty Point");
        frame4.setSize(800, 800);
        frame4.getContentPane().setBackground(Color.decode("#f6f4ec"));
        frame4.setLayout(null);

        topic4Label = new JLabel("Set Loyalty Point");
        topic4Label.setBounds(500, 100, 350, 50);
        frame4.add(topic4Label);
        Font font4 = new Font("Times New Roman", Font.BOLD, 24);
        topic4Label.setFont(font4);

        storeId3Label = new JLabel("Store ID:");
        storeId3Label.setBounds(450, 200, 100, 50);
        frame4.add(storeId3Label);

        storeId3Field = new JTextField();
        storeId3Field.setBounds(600, 215, 150, 25);
        frame4.add(storeId3Field);
        
        set1Button = new JButton("Set");
        set1Button.setBounds(400,350,100,30);
        set1Button.setBackground(Color.decode("#dcd2c3"));
        frame4.add(set1Button);
        
        clear3Button = new JButton("Clear");
        clear3Button.setBounds(550,350,100,30);
        clear3Button.setBackground(Color.decode("#dcd2c3"));
        frame4.add(clear3Button);
        
        back3Button = new JButton("Back");
        back3Button.setBounds(700,350,100,30);
        back3Button.setBackground(Color.decode("#dcd2c3"));
        frame4.add(back3Button);

        frame4.setVisible(false);
        
        // Frame5 (Remove Products)
        frame5 = new JFrame("Remove Products");
        frame5.setSize(800, 800);
        frame5.getContentPane().setBackground(Color.decode("#bfcbdd"));
        frame5.setLayout(null);

        topic5Label = new JLabel("Remove Products");
        topic5Label.setBounds(500, 100, 350, 50);
        frame5.add(topic5Label);
        Font font5 = new Font("Times New Roman", Font.BOLD, 24);
        topic5Label.setFont(font5);

        storeId4Label = new JLabel("Store ID:");
        storeId4Label.setBounds(450, 200, 100, 50);
        frame5.add(storeId4Label);

        storeId4Field = new JTextField();
        storeId4Field.setBounds(600, 215, 150, 25);
        frame5.add(storeId4Field);
        
        remove1Button = new JButton("Remove");
        remove1Button.setBounds(400,350,100,30);
        remove1Button.setBackground(Color.decode("#7197ba"));
        frame5.add(remove1Button);
        
        clear4Button = new JButton("Clear");
        clear4Button.setBounds(550,350,100,30);
        clear4Button.setBackground(Color.decode("#7197ba"));
        frame5.add(clear4Button);
        
        back4Button = new JButton("Back");
        back4Button.setBounds(700,350,100,30);
        back4Button.setBackground(Color.decode("#7197ba"));
        frame5.add(back4Button);

        frame5.setVisible(false);
        
        
        //Visibility of frames
        
        addDepartmentButton.addActionListener(new ActionListener()
        {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               frame.setVisible(false);
               frame1.setVisible(true);
               frame2.setVisible(false);
               frame3.setVisible(false);
               frame4.setVisible(false);
               frame5.setVisible(false);
           }
        });
        
        addRetailerButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               frame.setVisible(false);
               frame1.setVisible(false);
               frame2.setVisible(true);
               frame3.setVisible(false);
               frame4.setVisible(false);
               frame5.setVisible(false);
            }
        });
        
        calculateButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               frame.setVisible(false);
               frame1.setVisible(false);
               frame2.setVisible(false);
               frame3.setVisible(true);
               frame4.setVisible(false);
               frame5.setVisible(false);
            }
        });
        
        setButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               frame.setVisible(false);
               frame1.setVisible(false);
               frame2.setVisible(false);
               frame3.setVisible(false);
               frame4.setVisible(true);
               frame5.setVisible(false);
            }
        });
        
        removeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               frame.setVisible(false);
               frame1.setVisible(false);
               frame2.setVisible(false);
               frame3.setVisible(false);
               frame4.setVisible(false);
               frame5.setVisible(true);
            }
        });
        
        
        backButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            frame.setVisible(true);
            frame1.setVisible(false);
            frame2.setVisible(false);
            frame3.setVisible(false);
            frame4.setVisible(false);
            frame5.setVisible(false);
            }
        });
        
        back1Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            frame.setVisible(true);
            frame1.setVisible(false);
            frame2.setVisible(false);
            frame3.setVisible(false);
            frame4.setVisible(false);
            frame5.setVisible(false);
            }
        });
        
        back2Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            frame.setVisible(true);
            frame1.setVisible(false);
            frame2.setVisible(false);
            frame3.setVisible(false);
            frame4.setVisible(false);
            frame5.setVisible(false);
            }
        });
        
        back3Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            frame.setVisible(true);
            frame1.setVisible(false);
            frame2.setVisible(false);
            frame3.setVisible(false);
            frame4.setVisible(false);
            frame5.setVisible(false);
            }
        });
        
        back4Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            frame.setVisible(true);
            frame1.setVisible(false);
            frame2.setVisible(false);
            frame3.setVisible(false);
            frame4.setVisible(false);
            frame5.setVisible(false);
            }
        });
        
        
        //Button functionalities
        //addDepButton from main frame
        addDepButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                      
                 int storeId = Integer.parseInt(storeIdField.getText()); 
                 String storeName = storeNameField.getText();
                 String location = locationField.getText();
                 String openingHour = openingHourField.getText();
                 double totalSales = Double.parseDouble(totalSalesField.getText());
                 double totalDiscount = Double.parseDouble(totalDiscountField.getText());
                 String productName = productNameField.getText();
                 double markedPrice = Double.parseDouble(markedPriceField.getText());
                 
                 boolean storeIdExists = false;
                 
                if(storeIdField.getText().isEmpty() ||storeNameField .getText().isEmpty() ||locationField.getText().isEmpty()
                ||openingHourField.getText().isEmpty() || totalSalesField.getText().isEmpty() || totalDiscountField.getText().isEmpty()
                || productNameField.getText().isEmpty() || markedPriceField.getText().isEmpty()) 
                 {
                     JOptionPane.showMessageDialog(null,"Please fill all the text fields.", "Error",JOptionPane.ERROR_MESSAGE);
                     return;
                 }
                else
                {
                   if(storeId<0)
                   {
                      JOptionPane.showMessageDialog(null, "Invalid Store ID. Please enter a positive integer value.", "Error",JOptionPane.ERROR_MESSAGE); 
                      return;
                   }
                   if(!storeName.matches("[a-zA-Z\\s]+"))
                   {
                      JOptionPane.showMessageDialog(null, "The Store Name is invalid. Must be String.", "Error",JOptionPane.ERROR_MESSAGE); 
                      return; 
                   }
                   if(!location.matches("[a-zA-Z\\s]+"))
                   {
                      JOptionPane.showMessageDialog(null, "The Location is invalid. Must be String.", "Error",JOptionPane.ERROR_MESSAGE); 
                      return; 
                   }
                   if(!openingHour.matches("\\d{1,2}:\\d{2}"))
                   {
                      JOptionPane.showMessageDialog(null, "The Opening Hour is invalid. Must be in HH:MM format.", "Error",JOptionPane.ERROR_MESSAGE); 
                      return; 
                   }
                   if(totalSales<0)
                   {
                      JOptionPane.showMessageDialog(null, "Invalid Total Sales. Please enter a positive integer value.", "Error",JOptionPane.ERROR_MESSAGE); 
                      return;
                   }
                   if(totalDiscount<0)
                   {
                      JOptionPane.showMessageDialog(null, "Invalid Total Discount. Please enter a positive integer value.", "Error",JOptionPane.ERROR_MESSAGE); 
                      return;
                   }
                   if(!productName.matches("[a-zA-Z\\s]+"))
                   {
                      JOptionPane.showMessageDialog(null, "The Product Name is invalid. Must be String.", "Error",JOptionPane.ERROR_MESSAGE); 
                      return; 
                   }
                   if(markedPrice<0)
                   {
                      JOptionPane.showMessageDialog(null, "Invalid Marked Price. Please enter a positive integer value.", "Error",JOptionPane.ERROR_MESSAGE); 
                      return;
                   }
                }
                  
                for(Store store: storeList)
                     {
                          if(store instanceof Department && store.getstoreId()==storeId)
                               {
                                  JOptionPane.showMessageDialog(null,"The Store ID already exists.", "Error Message",JOptionPane.ERROR_MESSAGE); 
                                  storeIdExists = true;
                                  return;
                                }
                     }
                                     
                Department department = new Department(storeId, storeName, location, openingHour, totalSales,totalDiscount, productName, markedPrice);
                storeList.add(department);
                JOptionPane.showMessageDialog(null,"The department is added.");
                return;           
                 }
                catch(NumberFormatException ex)
                  {
                    JOptionPane.showMessageDialog(null,"Please enters valid inputs.", "WARNING",JOptionPane.WARNING_MESSAGE);
                    return;
                  }
            }
        });
        
        
        //addRetButton from main frame
        addRetButton.addActionListener(new ActionListener()
        {
            @Override
           public void actionPerformed(ActionEvent e)
           {
               try
               {
                    int storeId = Integer.parseInt(storeId1Field.getText());
                    String storeName = storeName1Field.getText();
                    String location = location1Field.getText();
                    String openingHour = openingHour1Field.getText();
                    double totalSales = Double.parseDouble(totalSales1Field.getText());
                    double totalDiscount = Double.parseDouble(totalDiscount1Field.getText());
                    int VATinclusivePrice = Integer.parseInt(VATinclusivePriceField.getText());   
                    boolean isPaymentOnline = isPaymentOnlineCheck.isSelected();
                    String purchasedYear = (String) purchasedYearCombo.getSelectedItem();
                    
                    boolean storeIdExists = false;
                    
                    if(storeId1Field.getText().isEmpty() ||storeName1Field .getText().isEmpty() ||location1Field.getText().isEmpty()
                  ||openingHour1Field.getText().isEmpty() || totalSales1Field.getText().isEmpty() || 
                  totalDiscount1Field.getText().isEmpty() || VATinclusivePriceField.getText().isEmpty())
                      {
                          JOptionPane.showMessageDialog(null,"Please input all the values.","Error",JOptionPane.ERROR_MESSAGE );
                          return;
                      }
                  else
                      {
                       if(storeId<0)
                       {
                            JOptionPane.showMessageDialog(null, "Invalid Store ID. Please enter a positive integer value.", "Error",JOptionPane.ERROR_MESSAGE); 
                            return;
                       }
                       if(!storeName.matches("[a-zA-Z\\s]+"))
                       {
                          JOptionPane.showMessageDialog(null, "The Store Name is invalid. Must be String.", "Error",JOptionPane.ERROR_MESSAGE); 
                          return; 
                       }
                       if(!location.matches("[a-zA-Z\\s]+"))
                       {
                          JOptionPane.showMessageDialog(null, "The Location is invalid. Must be String.", "Error",JOptionPane.ERROR_MESSAGE); 
                          return; 
                       }
                       if(!openingHour.matches("\\d{1,2}:\\d{2}"))
                       {
                          JOptionPane.showMessageDialog(null, "The Opening Hour is invalid. Must be in HH:MM format.", "Error",JOptionPane.ERROR_MESSAGE); 
                          return; 
                       }
                       if(totalSales<0)
                       {
                          JOptionPane.showMessageDialog(null, "Invalid Total Sales. Please enter a positive integer value.", "Error",JOptionPane.ERROR_MESSAGE); 
                          return;
                       }
                       if(totalDiscount<0)
                       {
                          JOptionPane.showMessageDialog(null, "Invalid Total Discount. Please enter a positive integer value.", "Error",JOptionPane.ERROR_MESSAGE); 
                          return;
                       } 
                       if(VATinclusivePrice<0)
                       {
                          JOptionPane.showMessageDialog(null, "Invalid VAT Inclusive Price. Please enter a positive integer value.", "Error",JOptionPane.ERROR_MESSAGE); 
                          return;
                       } 
                      }
                      
                    for(Store store: storeList)
                      {
                           if(store instanceof Retailer && store.getstoreId()==storeId)
                               {
                                  JOptionPane.showMessageDialog(null,"The Store ID already exists.Please enter valid Store ID.", "Error Message",JOptionPane.ERROR_MESSAGE); 
                                  storeIdExists = true;
                                  return;
                               }
                            }        
                      Retailer retailer = new Retailer(storeId, storeName,location, openingHour, totalSales, totalDiscount, VATinclusivePrice, isPaymentOnline, purchasedYear);
                      storeList.add(retailer);
                      JOptionPane.showMessageDialog(null,"The retailer is added."); 
                      return;
                      }
                  
               
               catch(NumberFormatException ex)
               {
                   JOptionPane.showMessageDialog(null,"Please enters valid inputs.", "WARNING",JOptionPane.WARNING_MESSAGE); 
                   return;
               }
            }
        });
        
        calculate1Button.addActionListener(new ActionListener()
        {
            @Override
           public void actionPerformed(ActionEvent e)
           {
               try
               {
                 int storeId = Integer.parseInt(storeId2Field.getText());
                 boolean isInSales = isInSalesCheck.isSelected(); 
                 double markedPrice = Double.parseDouble(markedPriceField.getText());
                 
                 
                 for (Store store : storeList) 
                    { 
                       if (store instanceof Department && store.getstoreId() == storeId)
                       {
                           Department department = (Department) store; 
                       if(isInSales)
                       { 
                        double discountPrice = department.calculateDiscountPrice(isInSales,markedPrice); 
                        totalDiscountField.setText(String.valueOf(discountPrice));
                        
                        JOptionPane.showMessageDialog(null, "The discount price is:"+discountPrice);
                        return; 
                       }
                       else
                       {
                          JOptionPane.showMessageDialog(null, "The product is not in sales.", "Waring",JOptionPane.WARNING_MESSAGE); 
                       }
                    }

               }
            }
               catch(NumberFormatException ex)
               {
                 
                    JOptionPane.showMessageDialog(null, "Store not found.", "Error",JOptionPane.ERROR_MESSAGE); 
                    return; 
                  
               }
           }
        });
        
        
        set1Button.addActionListener(new ActionListener()
        {
            @Override
           public void actionPerformed(ActionEvent e)
           {
               try
               {    
                  int storeId = Integer.parseInt(storeId3Field.getText()); 
                  int VATinclusivePrice = Integer.parseInt(VATinclusivePriceField.getText());   
                  boolean isPaymentOnline = isPaymentOnlineCheck.isSelected();
                  
                  
                  for (Store store : storeList) 
                    { 
                       if (store instanceof Retailer && store.getstoreId() == storeId)
                           {
                               Retailer retailer = (Retailer) store; 
                           if(isPaymentOnline)
                           {
                       
                           retailer.setloyaltyPoint(isPaymentOnline, VATinclusivePrice); 
                           
                        
                           JOptionPane.showMessageDialog(null, "Loyalty Point set successfully.");
                           return;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "The product is not payed online.", "ERROR",JOptionPane.ERROR_MESSAGE );
                           return;
                        }
                         
                       
                    }
                        }
                       
                    }
               
               catch(NumberFormatException ex)
               {
                   JOptionPane.showMessageDialog(null,"The retailer is not found.", "WARNING",JOptionPane.WARNING_MESSAGE);  
                   return;
               }
            }
        });
        
        
        remove1Button.addActionListener(new ActionListener()
        {
            @Override
           public void actionPerformed(ActionEvent e)
           {
               try
               {
                  int storeId = Integer.parseInt(storeId4Field.getText());
                  Store storeToRemove = null;
                  
                  for (Store store : storeList)
                {
                    if (store.getstoreId() == storeId)
                    {
                        storeToRemove = store;
                        break;
                    }
                }
                if (storeToRemove != null)
                {
                    storeList.remove(storeToRemove);
                    JOptionPane.showMessageDialog(null, "Product removed successfully.");
                } else
                {
                    JOptionPane.showMessageDialog(null, "Product not found.","Error",JOptionPane.ERROR_MESSAGE);
                }
               }
               catch(NumberFormatException ex)
               {
                   JOptionPane.showMessageDialog(null, "Please enter a valid Store ID.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
               }
            }
        });
        
        displayButton.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               try {
                int storeId = Integer.parseInt(storeIdField.getText());
                for (Store store : storeList)
                {
                    if (store.getstoreId() == storeId)
                    {
                        JOptionPane.showMessageDialog(null, store.getDetails(), "Department Details", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Store ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid store ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           }
        });
        
        display1Button.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               try {
                int storeId1 = Integer.parseInt(storeId1Field.getText());
                for (Store store : storeList)
                {
                    if (store.getstoreId() == storeId1)
                    {
                        JOptionPane.showMessageDialog(null, store.getDetails(), "Retailer Details", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Store ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid store ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           }
        });
        
        clearButton.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
             storeIdField.setText("");
             storeNameField.setText("");
             locationField.setText("");
             openingHourField.setText("");
             totalSalesField.setText("");
             totalDiscountField.setText("");
             productNameField.setText("");
             markedPriceField.setText("");
             isInSalesCheck.setSelected(false);
            }
       });
       
       clear1Button.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
                storeId1Field.setText("");
                storeName1Field.setText("");
                location1Field.setText("");
                openingHour1Field.setText("");
                totalSales1Field.setText("");
                totalDiscount1Field.setText("");
                VATinclusivePriceField.setText("");
                loyaltyPointField.setText("");
                isPaymentOnlineCheck.setSelected(false);
                purchasedYearCombo.setSelectedIndex(0);
           }
        });  
        
        clear2Button.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
                storeId2Field.setText("");
        }
        });
        
       clear3Button.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
                storeId3Field.setText("");
        }
        });
        
       clear4Button.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
                storeId4Field.setText("");
        }
        });
    }
    
     public static void main(String[]args)
    {
        new StoreGUI();
    }
}