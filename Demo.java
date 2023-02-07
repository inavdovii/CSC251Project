import java.util.Scanner;

public class Demo 
{

public static void main(String[] args) 
{

      Scanner keyboard = new Scanner(System.in);
      
      String policyNumber;
      String providerName;
      String policyholderFirstName;
      String policyholderLastName;
      int policyholderAge;
      String policyholderSmokingStatus;
      double policyholderHeight;
      double policyholderWeight;



  //get the user's input
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s First Name:");
      policyholderFirstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      policyholderLastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      policyholderAge = keyboard.nextInt();
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      policyholderSmokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      policyholderHeight = keyboard.nextInt();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      policyholderWeight = keyboard.nextInt();
      
  // Create a Policy object with default values
  Policy policy1 = new Policy();
  System.out.println("Policy Number: " + policy1.getPolicyNumber());
  System.out.println("Provider Name: " + policy1.getProviderName());
  System.out.println("First Name: " + policy1.getFirstName());
  System.out.println("Last Name: " + policy1.getLastName());
  System.out.println("Age: " + policy1.getAge());
  System.out.println("Smoking Status: " + policy1.getSmokingStatus());
  System.out.println("Height: " + policy1.getHeight());
  System.out.println("Weight: " + policy1.getWeight());
  System.out.println("BMI: " + policy1.calculateBMI());
  System.out.println("Price: " + policy1.calculatePrice());

}
}