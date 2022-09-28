// The package in which the current Java compilation unit is to be found.

package syntax;
// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.

import java.util.Map;

public class State {
    /**
     */
    // Static values/constants of the class.

    // Fields/attributes of the class.
    // This here dictionary contains the associations which map the relations between
    // each symbol that is known by the current state and its transition to the next state/
    // If the symbol does not appear in the dictionary, then if we are in an accepting state we transmit the signal to
    // the program or the false one if not.
    private Map<Character, State> delta;

    // Specify if the state is an Accepting state, aka it can end execution and yield true if we land on this state
    // after parsing through all the letters of the word.
    private boolean isAcceptingState;

    // Constructor(s) of the class.

    // Getters of the class.
    public State getFirstState() {return null;}

    // Setters of the class.

    // Public non-static methods of the unit.

    // This here method does not really determine whether the symbol is accepted by the automaton but rather if
    // the symbol appears in the first state?
    // TODO: Do we really need this method, and if we do, is there a better name for it?
    public boolean acceptsSymbol(Character symbol) {return false;}

    public boolean acceptsWord(String word) {return false;}

    // Public static methods of the unit.

    // Private methods of the unit.
}
