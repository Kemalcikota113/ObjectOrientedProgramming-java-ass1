import java.util.Scanner;       // importing everything we need
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] quotes = {"Jag känner många chemister", "Jag har fullt på bilen grejor", "P.E.S.T.E.L Analys", "Chena Mats ja kan inte kom denne vecke", "Step by step they get stepped on", "MGC", "All i have in this world are my balls and my word and i dont break them for no one."};       //  The array for quotes
        Random random = new Random();

        // Creating a menu
        while(true){
            System.out.println("\n_____Please pick an option_____");
            System.out.println("1, Create random numbers with limits");
            System.out.println("2, Calculate BMI");
            System.out.println("3, Quote of the day");
            System.out.println("4, Date and Time");
            System.out.println("5, Sum of integers");
            System.out.println("_______________________________");

            String option = sc.nextLine();
            switch(option){
                
                case "1":

                System.out.println("choose lower limit : ");
                int min = sc.nextInt();
                System.out.println("choose upper limit : ");
                int max = sc.nextInt();
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                System.out.println("\nYour random number is : " + randomNum);
                
                sc.nextLine();      // This prevents a bug making the menu print twice.

                break; 

                case "2":  // --> BMI = mass/height^2

                System.out.print("Please input your weight (kg) : ");
                double weight = sc.nextDouble();
                System.out.print("\nPlease input your height (cm) : ");
                double height = sc.nextDouble();

                height /= 100;      // converting from cm to m.

                double BMI = weight / (height * height);
                System.out.print("\nYour BMI is : " + BMI + "kg/m²");

                sc.nextLine();
                break;

                case "3":

                int index = random.nextInt(quotes.length);
                System.out.println("\nThe quote of the day is : " + quotes[index]);

                break;

                case "4":

                DateFormat dateFormat = new SimpleDateFormat("\nyyyy/MM/dd HH:mm:ss, E, w");
                Calendar cal = Calendar.getInstance();
                System.out.println("Todays date, time, day and week number is : "+dateFormat.format(cal.getTime()));

                break;

                case "5":
                
                int i, sum=0, z;
                System.out.print("\n Enter Number of Numbers to be Calculated: ");
                int n = sc.nextInt();
                boolean bug = false;
                for(i=0; i < n; i++)   //   How many ints we want
                {
                    if(bug == true){
                        i = 0;
                    }
                    bug = false;
        
                    System.out.print("Enter the number: ");
                    z = 0;
                    try{
                        z = sc.nextInt(); //    Reads ints
                        sum += z;       //     Sums together
                    }
                    catch(Exception Ex){
                        System.out.println("invalid input");
                        if(i > 0){
                            i--;
                        }
                        else{
                            bug = true;
                        }
                        sc.nextLine();
                        continue;
                    }
                }
                System.out.println("\nThe sum of the numbers is: " + sum);
                sc.nextLine();
                break;


                case "0":
                    sc.close();
                default:



            }


        }
        
    }
}