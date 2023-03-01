package classes;

/**
 * This class will make a graphicall representation of the chosen dice
 * by extending from the dice class.
 * NOTE : Does not work for Windows 10/11
 */
public interface DiceGraphic {

    String[] graphicDie = {" ", "graphic1", "graphic2", "graphic3", "graphic4", "graphic5", "graphic6"};        // This does not work on Windows 10/11 but it has been succesfully tested on Linux Ubuntu.
    String printGraphic ();

}
