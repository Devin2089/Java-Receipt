/**
 * Receipt3.java  
 *
 * @author – Your name
 * @author – Class period
 */ 
import java.util.Scanner;
public class Receipt3
{
   public static void main(String [] args)
   {
      String highSchoolName = "Battle Ground HS";
      String drink = "Drink";
      String drinkCost = "$1.50";
      String candy = "Candy";
      String candyCost = "$1.25";
      String hotDog = "Hot Dog";
      String hotDogCost = "$2.75";
      String hamburger = "Hamburger";
      String hamburgerCost = "$3.50";
      int randomOrderNumber = (int)(Math.random() * 100) + 1;
      int randomDrinkQuantity = (int)(Math.random() * 3);
      int randomCandyQuantity = (int)(Math.random() * 3);
      int randomHotdogQuantity = (int)(Math.random() * 3);
      int randomHamburgerQuantity = (int)(Math.random() * 3);
      Double DrinkTotal = randomDrinkQuantity * 1.50;
      Double CandyTotal = randomCandyQuantity * 1.25;
      Double HotdogTotal = randomHotdogQuantity * 2.75;
      Double HamburgerTotal = randomHamburgerQuantity * 3.50;
      Double Subtotal = DrinkTotal + CandyTotal + HotdogTotal + HamburgerTotal;
      Double Tax = Subtotal * 8.6/100;
      Double TaxRounded = Math.round(Tax * 100.0) / 100.0;
      Tax = TaxRounded;
      Double Total = Subtotal + Tax;
      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*    " + highSchoolName + " Snack Bar      *");
      System.out.println("*                                    *");
      System.out.println("*     "+drink+" .........."+drinkCost+"          *");                      
      System.out.println("*     "+candy+" .........." +candyCost+ "          *");     
      System.out.println("*     "+hotDog+" ........"+hotDogCost+"          *");     
      System.out.println("*     "+hamburger+" ......"+hamburgerCost+"          *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
      System.out.println("*   Order Number: " + randomOrderNumber + "                 *");
      System.out.println("*                                    *");
      System.out.println("* QTY       ITEM          TOTAL      *");
      System.out.println("**************************************");
      System.out.println("*  "+randomDrinkQuantity+"      "+drink+"          "+DrinkTotal+"         *");
      System.out.println("*  "+randomCandyQuantity+"      "+candy+"          "+CandyTotal+"         *");
      System.out.println("*  "+randomHotdogQuantity+"      "+hotDog+"        "+HotdogTotal+"        *");
      System.out.println("*  "+randomHamburgerQuantity+"      "+hamburger+"      "+HamburgerTotal+"         *");
      System.out.println("**************************************");
      System.out.println("*         Subtotal:      "+Subtotal+"        *");
      System.out.println("*         Tax:           "+Tax+"        *");
      System.out.println("*         Total:         "+Total+"       *");
      System.out.println("**************************************");
      System.out.println("*     Thank you for your business!   *");
      System.out.println("*       Please come again soon!      *");
      System.out.println("**************************************"); 
   }
}