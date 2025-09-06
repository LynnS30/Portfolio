/**This is the Utilities class that computes comission 
   of employees in different quarters.
   @author Katelynn Snyder
   @since 12/03/2022
*/
import java.util.*;

public class Utilities {
   public static void searchForCommisionAmnt
            (ArrayList<SalesEmployee> em) {
    System.out.println("________________Comission_______________");
      
        for(SalesEmployee comm : em ) {
        double commiss = 0;
        commiss = ((SalesEmployee)comm).getCommissionEarnedQuarter1();
        System.out.println("Employee last name: " + comm.getLastName());
        System.out.printf("Commission Quarter 1: $%,.2f\n", commiss);
        System.out.println();
      }
      for(SalesEmployee comm : em ) {
        double commiss = 0;
        commiss = ((SalesEmployee)comm).getCommissionEarnedQuarter2();
        System.out.println("Employee last name: " + comm.getLastName());
        System.out.printf("Commission Quarter 2: $%,.2f\n", commiss);
        System.out.println();
      }
      for(SalesEmployee comm : em ) {
        double commiss = 0;
        commiss = ((SalesEmployee)comm).getCommissionEarnedQuarter3();
        System.out.println("Employee last name: " + comm.getLastName());
        System.out.printf("Commission Quarter 3: $%,.2f\n", commiss);
        System.out.println();
      }
      for(SalesEmployee comm : em ) {
        double commiss = 0;
        commiss = ((SalesEmployee)comm).getCommissionEarnedQuarter4();
        System.out.println("Employee last name: " + comm.getLastName());
        System.out.printf("Commission Quarter 4: $%,.2f\n", commiss);
        System.out.println();
      }
   }//end search commission amount
}//end class
