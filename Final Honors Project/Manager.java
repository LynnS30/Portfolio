/**This is the Manager class.
   @author Katelynn Snyder
   @since 11/30/2022
*/
public class Manager extends Employee {
                     
   private double regionNum;
   private double amntSoldRegion;
   
   public Manager() {
      super();
      this.regionNum  = 0.0;
      this.amntSoldRegion = 0.0;
   }//end constructor
   
   public Manager(String fName, String lName, double idNum,
                      double regionNum) {
                      
      super(fName, lName, idNum);
      this.regionNum = regionNum;
   }
   
   public double getRegionNum() {
      return regionNum;
   }
   
   public void setRegionNum(double regionNum) {
      this.regionNum = regionNum;
   }
   
   @Override
   public double commissionEarned() {
      double totalSales = 0;
      double commission = 0;
      
      commission = totalSales * .01;
      
      return commission;
   }
   public String toString() {
      String str = " ";
      str += super.toString(); 
      str += "\nRegion: " + regionNum;
      str += "\n";
      
      return str;
   }//end toString
}//end class