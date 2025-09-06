/**This is the SalesPeople class that has data
   on sales employees.
   @author Katelynn Snyder
   @since 11/30/2022
*/
public class SalesPeople extends Employee{
   private double regionNum;
   
   public SalesPeople() {
      super();
      this.regionNum = 0.0;
   }
   public SalesPeople(SalesPeople copy) {
      super(copy.getFname(), copy.getLname(), copy.getIdNum()); 
      this.regionNum = copy.regionNum; 
   }
   public SalesPeople(String fName, String lName, double idNum,
                        double regionNum) {
      super(fName, lName, idNum);
      this.regionNum = regionNum;
   }
   public void setRegionNum(double regionNum) {
      this.regionNum = regionNum;
   }
   public double getRegionNum() {
      return regionNum;
   }

   @Override
   public double commissionEarned() {
      double commission = 0;
      return commission;
   }
   public String toString() {
      String str = " ";
      str += "\n";
      str += super.toString(); 
      str += "\nRegion number: " + regionNum;
      str += "\n";
      
      return str;
   }//end toString




}