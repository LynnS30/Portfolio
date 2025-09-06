/**This is the EmployeeDriver class that prints and 
   sets data from files.
   @author Katelynn Snyder
   @since 11/30/2022
*/
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.Collections;

public class EmployeeDriver {
   public static void main(String[] args) throws IOException {
      ArrayList<SalesPeople> et = new ArrayList<SalesPeople>();
      ArrayList<Manager> e = new ArrayList<Manager>();
      ArrayList<SalesEmployee> em = new ArrayList<SalesEmployee>();
      
      int option = 0;

       setSalesPData(em);
       setSalesPeople(et);
       setManagersData(e);
      while(option != 10) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("______________________________________________\n" +
                          "Please select one of the following options.\n" +
                          "1. Search for commision anount.\n" +
                          "2. Sort sales employees by name.\n" +
                          "3. Display total amount made by company.\n" +
                          "4. Salary report for sales employees.\n" +
                          "5. Search salary report for one sales employee.\n" +
                          "6. Search for sales employee by region number.\n" +
                          "7. Display either sales employees or managers.\n" +
                          "8. Sort by Manager name.\n" +
                          "9. Search for Managers by region\n" +
                          "10. Exit program\n" +
                           "_______________________________________________");
                          
       option = keyboard.nextInt();
       
      switch(option) {
      case 1:
         Utilities.searchForCommisionAmnt(em);
         break;
      case 2:
         sortSalesPname(et);
         break;
      case 3:
         totalAmountMade(em);
         break;
      case 4:
         salaryReport(em);
         break;
      case 5:
         searchSalaryReport(em);
         break;
      case 6:
         searchRegionNumSales(et);
         break;
      case 7:
         displayMangOrSalesP(et, e);
         break;
     case 8:
         displayManager(e);
         break;
     case 9:
         searchManagerRegion(e);
     case 10:
         System.exit(0);
     default:
         System.out.println("Invaled option. Please try again " +
                            "or selct option 8 to exit");
    }//end switch
   }//end while
   }//end main
   public static void searchManagerRegion(ArrayList<Manager> e) {
      String display = " ";
      display = JOptionPane.showInputDialog("Please enter region number.");
      
      boolean flag = false;
      System.out.println("Here is the Manager with entered region number.");
      for(Manager region : e) {
         if(region.getRegionNum() == Integer.parseInt(display)) {
            System.out.println(region);
            flag = true;
            }//end if
       }//end for
       System.out.println();
       if(!flag) {
        display = JOptionPane.showInputDialog("No employee matching entered region.\n" +
                                             "Please try again or select cancel to " +
                                             "exit.");}
   }
   public static void displayMangOrSalesP(ArrayList<SalesPeople> et, ArrayList<Manager> e)
   {
   
      String display = " ";
      display = JOptionPane.showInputDialog("Would you like to search Manager employees or " +
                                             "Sales employees?");
       boolean flag = false;
                                             
       if(display.equalsIgnoreCase("Sales"))
         System.out.println(et);

       if(display.equalsIgnoreCase("Manager")) 
         System.out.println(e);
         flag = true;
         System.out.println();
         
       if(!flag) {
        display = JOptionPane.showInputDialog("Cannot find Sales or Manager employee.\n" +
                                              "Please try again or select cancel to " +
                                              "exit.");
        }
   }//end display manager or sales people
   public static void searchRegionNumSales(ArrayList<SalesPeople> et) {
      String display = " ";
      display = JOptionPane.showInputDialog("Please enter region number.");
      
      boolean flag = false;
      System.out.println("Here is the employee with entered region number.");
      for(SalesPeople region : et) {
         if(region.getRegionNum() == Integer.parseInt(display)) {
            System.out.println(region);
            flag = true;
            }//end if
       }//end for
       System.out.println();
       if(!flag) {
        display = JOptionPane.showInputDialog("No employee matching entered region.\n" +
                                             "Please try again or select cancel to " +
                                             "exit.");}
   }//end search region number
   public static void searchSalaryReport(ArrayList<SalesEmployee> em) {
      String display = " ";
      display = JOptionPane.showInputDialog("Please enter last name of employee you are " +
                                           "looking for.");
        boolean flag = false;
        
        for(SalesEmployee se : em) {
         if(se.getLastName().equalsIgnoreCase(display)) {
            System.out.println("Here is sales report for selected employee.");
            System.out.println(se);
            flag = true;
            }//end if                              
         }//end for
         System.out.println();
         if(!flag){
          display = JOptionPane.showInputDialog("No employee matching entered name.\n" +
                                                "Please try again or select cancel to " +
                                                "exit.");}
   }//end searchSalaryReport

   public static void salaryReport(ArrayList<SalesEmployee> em) {
     for(SalesEmployee report : em)
        System.out.println("Employee name: " + report.getLastName() +
           "\n" + "Quarter 1: $" + report.getSalesAmountQuarter1() + "\n" +
           "Quarter 2: $" + report.getSalesAmountQuarter2() + "\n" +
           "Quarter 3: $" + report.getSalesAmountQuarter3() + "\n" + 
           "Quarter 4: $" + report.getSalesAmountQuarter4() + "\n");
         
     for(SalesEmployee total : em)
      System.out.println("Employee name " + total .getLastName() + "\nTotal Sales: $" +
                        (total.getSalesAmountQuarter1() + 
                        total.getSalesAmountQuarter2() + 
                        total.getSalesAmountQuarter3() + 
                        total.getSalesAmountQuarter4())
                       + "\n");
   }
   public static void totalAmountMade(ArrayList<SalesEmployee> em) {
      double totalQ1 = 0;
      double totalQ2 = 0;
      double totalQ3 = 0;
      double totalQ4 = 0;
      
      for(SalesEmployee amount : em)
         totalQ1 += amount.getSalesAmountQuarter1();    
         for(SalesEmployee am : em)
          totalQ2 += am.getSalesAmountQuarter2();
         for(SalesEmployee amnt : em)
          totalQ3 += amnt.getSalesAmountQuarter3(); 
         for(SalesEmployee amt : em)   
          totalQ4 += amt.getSalesAmountQuarter4();
         
         System.out.printf("Total sales of company: $%,.2f\n",
                           (totalQ1 + totalQ2 + totalQ3 + totalQ4));
         System.out.println();
   }
   public static void displaySalesData(ArrayList<SalesEmployee> em) {
      for(SalesEmployee sales : em)
         System.out.println(sales);
         System.out.println();
      }//end displaySAlesData
   public static void setSalesPeople(ArrayList<SalesPeople> et)
                                             throws IOException {
      String display = " ";
      
      File file = new File("salespeople.csv");
      if(!file.exists())
         display = JOptionPane.showInputDialog("File not found. Please try again.");
     
     Scanner keyboard = new Scanner(file);
     String tokens[];

     while(keyboard.hasNext()) {
      String str = keyboard.nextLine();
      tokens = str.split(",");
      
      et.add(new SalesPeople(tokens[0], tokens[1], Double.parseDouble(tokens[2]),
                               Double.parseDouble(tokens[3])));
     }//end while
     keyboard.close();
   }//ens set sales people

   public static void setSalesPData(ArrayList<SalesEmployee> em)
                                             throws IOException {
      String display = " ";
      
      File file = new File("salesdata.csv");
      if(!file.exists())
         display = JOptionPane.showInputDialog("File not found. Please try again.");
     
     Scanner keyboard = new Scanner(file);
     String tokens[];

     while(keyboard.hasNext()) {
      String str = keyboard.nextLine();
      tokens = str.split(",");
      
      em.add(new SalesEmployee(tokens[0], Double.parseDouble(tokens[1]), 
             Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]), 
             Double.parseDouble(tokens[4])));
     }//end while
     keyboard.close();
   }//end set sales data
   
   public static void displaySalesPeople(ArrayList<SalesPeople> et) {
      for(Employee e : et)
        System.out.println(e);
        System.out.println("\n");
   }//end display sales people
   
   public static void sortSalesPname(ArrayList<SalesPeople> et) {
      SalesPeople temp;
      
      for(int i = 0; i < et.size(); i++)
       for(int j = 1; j < et.size(); j++)
         if(et.get(j-1).getLname().compareToIgnoreCase(et.get(j).getLname()) > 0)
           {
            temp = et.get(j-1);
            et.set((j-1), et.get(j));
            et.set(j,temp);     
            }//end for loop
            System.out.println("Sort by sales person name.");
            displaySalesPeople(et);
            System.out.println("\n");
   }//end sort by sales person name
   
   public static void displayManager(ArrayList<Manager> e) {
      Collections.sort(e);
        System.out.println(e);
        System.out.println("\n");
   }//end display managers
   public static void setManagersData(ArrayList<Manager> e) throws IOException {
      String display = " ";
      
      File file = new File("managers.csv");
      if(!file.exists())
       display = JOptionPane.showInputDialog("File not found. Please try again.");
     
     Scanner scan = new Scanner(file);
     String tokens[];
       
     while(scan.hasNext()) {
      String str = scan.nextLine();
      tokens = str.split(",");
      e.add(new Manager(tokens[0], tokens[1], Double.parseDouble(tokens[2]), 
                        Double.parseDouble(tokens[3])));
     }//end while
      System.out.println("\n");
     scan.close();
   }// end set managers data
}//end class