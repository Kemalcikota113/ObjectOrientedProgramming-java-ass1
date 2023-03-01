package classes;

/**
 * This class allows for the user to change the value of an already randomized
 * value. The user can also pick Which one of the dice to cheat with.
 */
public interface DiceGraphicCheating {
    static Dice setRoll(int value) {
        Dice d = new Dice();
        d.lastRoll = value;
        return d;
    }
}
