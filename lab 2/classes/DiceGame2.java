package classes;

import java.util.Scanner;
/**
 * This class is based on the yatzee game and will create a terminal based game where
 * you can randomise 5 dices and choose which ones to hold. There is also a cheating
 * feature. The difference between DiceGame and DiceGame 2 is that DiceGame 2
 * involves 3 players (Player (user), monkey and computer).
 */
public class DiceGame2 {
    /**
     * this is the game
     */
    public void Yatzy(){

        Scanner sc = new Scanner(System.in);

        DicePlayer player = new DicePlayer();
        computer computer = new computer();
        monkey monkey = new monkey();

        int rounds = 0;
        player.rollAllDice();
        String index;
        boolean cheat = false;

        while(true) {
            player.hold.clear();
            computer.hold.clear();
            monkey.hold.clear();

            System.out.println("\n_____Please pick an option_____");
            System.out.println("This is round " + rounds + " of 3");
            System.out.println("what dices do you want to save? ");
            System.out.println("Your numbers are : ");
            System.out.println(player);

            if(!cheat) {
                System.out.println("Type cheat to cheat and advance round");
            }
            System.out.println("Next round");
            System.out.println("\n_________________________________");

            if(rounds == 3) {
                System.out.println("You:" + player.result());
                System.out.println("computer:" + computer.result());
                System.out.println("monkey:" + monkey.result());
                break;
            }

            boolean doneinner = false;
            index = "";
            while(doneinner == false){
                System.out.println("type '0' to end round");
                index = sc.nextLine();

                if(index.equals("cheat") && !cheat){

                    System.out.println("Select die: ");
                    int selection = sc.nextInt();

                    System.out.println("Set value: ");
                    int value = sc.nextInt();

                    player.DiceHand.set(selection - 1, DiceGraphicCheating.setRoll(value));
                    player.hold(selection - 1);
                    cheat = true;
                    doneinner = true;
                    break;
                }

                if(index.equals("0")){      // for some reason using index == "0" doesent work.
                    doneinner = true;
                    break;
                }

                try{
                    player.hold(Integer.parseInt(index) - 1);
                }
                catch(Exception e){
                    System.out.println("Invalid dice");     // Bug
                }

            }

            monkey.monkeyPlay();
            computer.computerplay();

            monkey.rollAllDice();
            computer.rollAllDice();
            player.rollAllDice();
            rounds++;
        }


    }

}
