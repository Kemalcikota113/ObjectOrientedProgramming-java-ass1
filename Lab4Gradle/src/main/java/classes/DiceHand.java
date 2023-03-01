package classes;

import java.util.ArrayList;

/**
 * This class will creat an arraylist with all of the values (Dices).
 * This will allow the user to roll all dices simultaneously but also
 * roll a specific dice as well as converting them from ints to strings.
 */
public class DiceHand {

    public ArrayList<Dice> DiceHand = new ArrayList<>();

    /**
     * This is the dicehand i.e an arraylist of the values randomized,
     * cheated or held by the user.
     * @param Num The amount of values that the loop will itterate over
     *            (The amount of dices in the hand).
     */
    public DiceHand(int Num){       // This will loop the number of times specified in main (Line 59).
        for(int i = 0; i < Num; i++){
            DiceHand.add(new Dice());
        }
    }

    /**
     * This will simply itterate over all dices in dichand and give them
     * a new value 1-6.
     */
    public void rollAllDice(){
        for(Dice die: DiceHand){
            die.roll();
        }
    }

    /**
     * this will roll a specific dice chosen by the user.
     * @param position This is the dice-number i.e which one of the fivel dices
     *                 it is.
     * @return A new dice value for the specified dice (1-6).
     */
    public ArrayList<Dice> roll(int position){
        Dice die;
        die = DiceHand.get(position - 1);
        die.roll();
        return DiceHand;
    }

    /**
     * @return a string representation of the ints generated when rolling
     * and adding to the arraylist.
     */
    public String toString(){
        String x = "";
        Dice die;
    
        for(int i = 0; i < DiceHand.size(); i++){
            die = DiceHand.get(i);
            i++;
            x += "dice " + i + " : " + die + "\n";
            i--;
        }
        return x;
    }
}