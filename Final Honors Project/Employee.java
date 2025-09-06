/**This is the Employee class.
   @author Katelynn Snyder
   @since 11/30/2022
*/
public abstract class Employee implements Comparable<Manager>{
   private String fName;
   private String lName;
   private double idNum;
   
   public Employee() {
      this.fName = fName;
      this.lName = lName;
      this.idNum = idNum;
   }
   public Employee(String fName, String lName, double idNum) {
      this.fName = fName;
      this.lName = lName;
      this.idNum = idNum;
   }//end default contructor
   public String getFname() {
      return fName;
   }
   public String getLname() {
      return lName;
   }
   public double getIdNum() {
      return idNum;
   }
   public void setFname(String fName) {
      this.fName = fName;
   }
   public void setLname(String lName) {
      this.lName = lName;
   }
   public void setIdNum(double idNum) {
      this.idNum = idNum;
   }
   public abstract double commissionEarned();
   
   @Override
   public int compareTo(Manager e) {
      return lName.compareTo(e.getLname());
   }
   public String toString() {
      String str = " ";
      
      str += "\nFirst name of Employee: " + fName;
      str += "\nLast name of Employee: " + lName;
      str += "\nID number of Employee: " + idNum;
      
      return str;
   }
}