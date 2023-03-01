package classes;

import java.util.Scanner;

public class DiceGame2 {

    DicePlayer player = new DicePlayer();
    computer computer = new computer();
    monkey monkey = new monkey();

    public void Yatzy(){

        Scanner sc = new Scanner(System.in);

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
                System.out.println("You:" + shuno());
                System.out.println("computer:" + computershuno());
                System.out.println("monkey:" + monkeyshuno());
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

    public String shuno() {
        return player.result();
    }
    public String computershuno(){
        return computer.result();
    }
    public String monkeyshuno(){
        return monkey.result();
    }
}
