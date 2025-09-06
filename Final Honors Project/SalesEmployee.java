/**This is the SalesEmployee class that sets
   sales data.
   @author Katelynn Snyder
   @since 11/27/2022
*/
public class SalesEmployee {
   private String lastName;
   private double salesAmountQuarter1;
   private double salesAmountQuarter2;
   private double salesAmountQuarter3;
   private double salesAmountQuarter4;

   public SalesEmployee() {
      lastName = " ";
      salesAmountQuarter1 = 0.0;
      salesAmountQuarter2 = 0.0;
      salesAmountQuarter3 = 0.0;
      salesAmountQuarter4 = 0.0;
   }

   public SalesEmployee(String lastName,
                      double salesAmountQuarter1, double salesAmountQuarter2,
                      double salesAmountQuarter3, double salesAmountQuarter4) {
      this.lastName = lastName;
      this.salesAmountQuarter1 = salesAmountQuarter1;
      this.salesAmountQuarter2 = salesAmountQuarter2;
      this.salesAmountQuarter3 = salesAmountQuarter3;
      this.salesAmountQuarter4 = salesAmountQuarter4;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   public String getLastName() {
      return lastName;
   }
   public void setsalesAmountQuarter1(double salesAmountQuarter1) {
      this.salesAmountQuarter1 = salesAmountQuarter1;
   }
   public void setsalesAmountQuarter2(double salesAmountQuarter2) {
      this.salesAmountQuarter2 = salesAmountQuarter2;
   }
   public void setsalesAmountQuarter3(double salesAmountQuarter3) {
      this.salesAmountQuarter3 = salesAmountQuarter3;
   }
   public void setsalesAmountQuarter4(double salesAmountQuarter4) {
      this.salesAmountQuarter4 = salesAmountQuarter4;
   }

   public double getSalesAmountQuarter1() {
      return salesAmountQuarter1;
   }
   public double getSalesAmountQuarter2() {
      return salesAmountQuarter2;
   }
   public double getSalesAmountQuarter3() {
      return salesAmountQuarter3;
   }
   public double getSalesAmountQuarter4() {
      return salesAmountQuarter4;
   }
   
   public double getCommissionEarnedQuarter1() {
      double commission;
      
      if(salesAmountQuarter1 < 2500)
         commission = 0.0;
         
      else   
      if(salesAmountQuarter1 < 5001)
         commission = salesAmountQuarter1 * .05;
      
      else
      if(salesAmountQuarter1 < 10001)
         commission = salesAmountQuarter1 * .05;
      
      else
      if(salesAmountQuarter1 < 20000)
         commission = salesAmountQuarter1 * .09;
      else
        commission =  salesAmountQuarter1 * .10;
      
      return commission;
   }
  public double getCommissionEarnedQuarter2() {
      double commission;
      
      if(salesAmountQuarter2 < 2500)
         commission = 0.0;
      else   
      if(salesAmountQuarter2 < 5001)
         commission = salesAmountQuarter2 * .05;
      
      else
      if(salesAmountQuarter1 < 10001)
         commission = salesAmountQuarter2 * .05;
      
      else
      if(salesAmountQuarter1 < 20000)
         commission = salesAmountQuarter2 * .09;
      else
        commission =  salesAmountQuarter2 * .10;
      
      return commission;
   }
   public double getCommissionEarnedQuarter3() {
      double commission;
      
      if(salesAmountQuarter3 < 2500)
         commission = 0.0;
      
      else
      if(salesAmountQuarter3 < 5001)
         commission = salesAmountQuarter3 * .05;
      
      else
      if(salesAmountQuarter3 < 10001)
         commission = salesAmountQuarter3 * .05;
      
      else
      if(salesAmountQuarter3 < 20001)
         commission = salesAmountQuarter3 * .09;
      else
        commission =  salesAmountQuarter3 * .10;
      
      return commission;
   }
   public double getCommissionEarnedQuarter4() {
      double commission;
      
      if(salesAmountQuarter4 < 2500)
         commission = 0.0;
         
      else   
      if(salesAmountQuarter4 < 5001)
         commission = salesAmountQuarter4 * .05;
      
      else
      if(salesAmountQuarter4 < 10001)
         commission = salesAmountQuarter4 * .05;
      
      else
      if(salesAmountQuarter4 < 20000)
         commission = salesAmountQuarter4 * .09;
      else
        commission =  salesAmountQuarter4 * .10;
      
      return commission;
   }
   public String toString() {
      String str = " ";
      str += "\n";
      str += "\nSales employee last name: " + lastName;
      str += "\nThe amount of sales quarter 1 is: $" + salesAmountQuarter1;
      str += "\nThe amount of sales quarter 2 is: $" + salesAmountQuarter2;
      str += "\nThe amount of sales quarter 3 is: $" + salesAmountQuarter3;
      str += "\nThe amount of sales quarter 4 is: $" + salesAmountQuarter4;
      
      
      return str;    
   }//end toString
}//end class