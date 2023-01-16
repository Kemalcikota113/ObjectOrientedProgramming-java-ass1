import java.util.Scanner;       // importing everything we need
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a menu
        while(true){
            System.out.println("_____Please pick an option_____");
            System.out.println("1, Create random numbers with limits");
            System.out.println("2, Calculate BMI");
            System.out.println("_______________________________");

            String option = sc.nextLine();
            switch(option){
                
                case "1":

                System.out.println("choose lower lim and then upper lim");
                int min = sc.nextInt();
                int max = sc.nextInt();
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                System.out.println(randomNum);

                break;

                case "2":

                int i, sum=0, z;  
                System.out.print("\nEnter Number of Numbers to be Calculated: ");  
                int n = sc.nextInt();  
                for(i=0;i<n;i++)   //   How many ints we want
                {  
                System.out.print("Enter the number: ");  
                z = sc.nextInt(); //    Reads ints
                sum=sum+z;       //     Sums together
                }  
                System.out.println("\nThe sum of the numbers is: "+sum);  
                sc.nextLine();

                break;

                
                case "0":
                    sc.close();

                default:



            }


        }
        
    }
}