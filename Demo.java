import java.util.*; 
import java.io.*;


public class Demo 
{   
   public static void main(String[] args)
   {
      //open the main method                              
        
      try 
      {
         /*Creating an instance of the File class. Passing the string "PolicyInformation.txt" to the constructor. 
         This process creates a File object that represents the file PolicyInformation.txt.*/
         File file = new File("PolicyInformation.txt");
          
         /* Passing a reference to the File object as an argument to the Scanner class constructor (i.e., file) */                             
         Scanner inputFile = new Scanner(file);
      
         //declaring variables
         String policyNumber = "";
         String providerName = "";
         String firstName = "";
         String lastName = "";
         int age = 0;
         String smokingStatus = "";
         double height = 0.0;
         double weight = 0.0;
         int totalSmokers = 0;
         int totalNonsmokers = 0;
      
         //Creating an array list to store objects. The ArrayList will hold Policy objects.
         ArrayList<Policy> policies = new ArrayList<Policy>();
      
         /* This while loop will read the file. The hasNext() method will determine whether 
            the file has more data to be read. An "if statement" will determine the end of the file and 
            to consume newline characters */
            
         while(inputFile.hasNext())       
         { //open loop
         
            policyNumber = inputFile.nextLine();  
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            smokingStatus = inputFile.nextLine();
            inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            /* Creating Policy objects using the Policy class type - we are still under the while loop. Objects will be created as long as there are records
            in the file to read.*/
            Policy p = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
           //Passing variables as arguments to the constructor
         
            // Add Policy objects to the ArrayList 
            policies.add(p); 
         
         } //close loop
      
         inputFile.close();//close the file
      
       //use a for loop to display the output
         for(int i =0; i < policies.size(); i++)
         { 
         
      System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
      System.out.println("Provider Name: " + policies.get(i).getProviderName());
      System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
      System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
      System.out.println("Policyholder's Age: " + policies.get(i).getAge());
      System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
      System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policies.get(i).getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).getBMI());
      System.out.printf("Policy Price: $%.2f\n", policies.get(i).getPrice());
      System.out.println();
      
      
      if(policies.get(i).getSmokingStatus().equalsIgnoreCase("smoker")) 
      {
         totalSmokers += 1;
         }
         
         else 
         {
         totalNonsmokers += 1;
         }
      }
      
      System.out.println("Total numbe of policies with a smoker is: " + totalSmokers);
      System.out.println("Total number of policies with a non-smoker is: " + totalNonsmokers);



  }//close the "try" block of code
      
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
   } //close main
   
} //close the class container