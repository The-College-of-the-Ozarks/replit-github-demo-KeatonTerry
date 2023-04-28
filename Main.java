import java.util.*;
class Main 
{   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded;
      int gallonsNeeded = 18;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
      
      
      while(true){
        quartsNeeded = Integer.parseInt(input.next());
        
        try{
          
          System.out.print("Enter quarts needed >> ");
        }
        catch(NumberFormatException e) {
          System.out.println("Please enter a number >> ");
          
          continue;
        }
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
      extraQuartsNeeded + " quarts.");
      }

        
      }
    
   
   }
