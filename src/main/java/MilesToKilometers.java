//This program displays a conversion table of miles to kilometers
public class MilesToKilometers {
  public static void main(String[] args) {

//Constant for Kilometers per mile
    final double KMS_PER_MI = 1.609;

//table
      System.out.println("Miles     Kilometers");

      for (int i = 1; i <= 10; i++) {
        System.out.printf("%-13d%-10.3f\n", i, (i * KMS_PER_MI));
      }
  }  
}