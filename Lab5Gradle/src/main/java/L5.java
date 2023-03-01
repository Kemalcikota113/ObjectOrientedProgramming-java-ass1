import classes.*;

import java.util.Scanner;

/**
 * the main class
 */
public class L5 implements DiceGraphicCheating{
    public static void main(String[] args){

        Dice die = new Dice();

        Scanner sc = new Scanner(System.in);

        Boolean done = false;

        while(!done){
            System.out.println("\n_____Please pick an option_____");
            System.out.println("1, Roll a dice :");
            System.out.println("2, Roll a graphic dice :");
            System.out.println("3, Cheat the dice :");
            System.out.println("4, Hold any type of dice :");
            System.out.println("5, Roll the dice and re-roll. :");
            System.out.println("6, Play Yatzy :");
            System.out.println("7, play yatzy with oponents");
            System.out.println("E, Exit the program :");
            System.out.println("_______________________________");

            String option = sc.nextLine();
            switch(option){

                case "1":
                    die.roll();
                    System.out.println("The rolled dice is : " + die);
                    break;

                case "2":
                    die.roll();
                    System.out.println("The rolled die is : " + die.printGraphic());
                    break;

                case "3":
                    die.roll();
                    System.out.println("The rolled die was : " + die);

                    System.out.println("Cheat the dice by setting a new value : ");
                    int value = sc.nextInt();

                    die = DiceGraphicCheating.setRoll(value);

                    System.out.println("The new dice value is : " + die);

                    sc.nextLine();
                    break;

                case "4":
                    DiceHand hand = new DiceHand(4);    // How many dices we want to play with
                    hand.rollAllDice();
                    System.out.println("The dice are : " + hand);       // First dices

                    System.out.println("The Re-Rolled dices are : " + hand);
                    hand.roll(4);

                    System.out.println("The new values are now : " + hand);

                    break;

                case "5":
                    DicePlayer player = new DicePlayer();
                    player.rollAllDice();

                    System.out.println("The players values are : \n" + player);

                    player.roll(1);     // This will re roll the first die because we specified (index - 1) in the class
                    player.roll(2);     //  We can re roll several dices but we need to call the method again

                    System.out.println("The values for the player is : \n" + player);

                    //player.getDie(0);   //  this will show us the first element in the list (element "0").

                    break;

                case "6":
                    DiceGame yatzy = new DiceGame();
                    yatzy.Yatzy();

                    break;

                case "7":
                    DiceGame2 yatzy2 = new DiceGame2();
                    yatzy2.Yatzy();

                    break;

                case "E":
                    sc.close();
                    done = true;
                    System.exit(0);
                    break;

                default:
                    System.out.println("Not a valid choice");
                    break;
            }
        }
    }
}
