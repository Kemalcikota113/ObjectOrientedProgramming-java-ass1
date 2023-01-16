package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the player that the user controls
 */
public class DicePlayer extends DiceHand    {       // We inherit from DiceHand
    ArrayList<Integer> hold = new ArrayList<>();

    /**
     * A method that makes use of the The super keyword in Java is a reference variable
     * that is used to refer parent class objects.
     */
    public DicePlayer(){
        super(5);   // "super()" calls on the variables and methods in the parent class
    }

    /**
     * @param die return the element at a given index from the specified Array.
     */
    public void getDie(int die){
        System.out.println(this.DiceHand.get(die));
    }

    /**
     * Holds a dice and prevents it from beeing rolled
     * @param position Position of the wished die to hold.
     */
    public void hold(int position){
        hold.add(position);
    }

    /**
     * Sums the dices in the hand and prints them
     */
    public void sum(){
        int dices = 0;

        for (int i = 0; i < DiceHand.size(); i++) {
            dices += Integer.parseInt(DiceHand.get(i).toString());
        }
        System.out.println("the sum is : " + dices);
    }

    public void rollAllDice(){
        for (int i = 0; i < DiceHand.size(); i++) {
            if (hold.contains(i)) {
                continue;
            }
            DiceHand.get(i).roll();
        }

    }
    /**
     * @return the result at the end of the game
     */
    public String result(){
        List<Integer> val = new ArrayList<>();

        for(Dice die: this.DiceHand){
            val.add(Integer.parseInt(die.toString()));
        }

        int element = 0;
        int count = 1;

        for(int i = 0; i < val.size(); i++){
            int tempelement = val.get(i);
            int tempcount = 0;
            for(int k = 1; k < val.size(); k++){
                if(val.get(k) == tempelement)   {
                    tempcount++;
                }
            }
            if(tempcount > count){
                element = tempelement;
                count = tempcount;
            }
        }
        if(count == 0) {
            System.out.println("the result is : You got one of a kind! Thats terrible!"); }
        else if(count == 1){
            System.out.println("the result is : you got two of a kind! You can do better!");}
        else if(count == 2) {
            System.out.println("the result is : you got three of a kind! Thats pretty good!"); }
        else if(count == 3){
            System.out.println("the result is : you got four of a kind! So close!");}
        else if(count == 4){
            System.out.println("the result is : you got five of a kind! YATZEE!");}

        return "";
        

    }
}

