package classes;

import java.util.ArrayList;
import java.util.List;

public class computer extends DiceHand {
    ArrayList<Integer> hold = new ArrayList<>();

    public computer(){
        super(5);   // "super()" calls on the variables and methods in the parent class
    }
    public void rollAllDice(){
        for (int i = 0; i < DiceHand.size(); i++) {
            if (hold.contains(i)) {
                continue;
            }
            DiceHand.get(i).roll();
        }

    }

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
    public void computerplay(){
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

        for (int i = 0; i < val.size(); i++) {
            if (val.get(i) == element) {
                hold.add(i);
            }
        }
    }
}
