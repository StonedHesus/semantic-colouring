// The package in which the current Java compilation unit is to be found.
package semantic.colouring.syntax;

// Imports from existing Java libraries, classes and interfaces.
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Import from custom libraries, classes and interfaces.


public final class State {
    /**
     */
    // Static values/constants of the class.

    // Fields/attributes of the class.
    // This here dictionary contains the associations which map the relations between
    // each symbol that is known by the current state and its transition to the next state/
    // If the symbol does not appear in the dictionary, then if we are in an accepting state we transmit the signal to
    // the program or the false one if not.
    private Map<Character, Set<State>> delta;

    private String label;

    // Specify if the state is an Accepting state, aka it can end execution and yield true if we land on this state
    // after parsing through all the letters of the word.
    private boolean isAcceptingState;

    // Constructor(s) of the class.
    public State(String label, boolean isAcceptingState){

        this.label = label;
        this.isAcceptingState = isAcceptingState;
        this.delta = new HashMap<>();
    }

    // Getters of the class.
    public State getFirstState() {return null;}

    // Setters of the class.

    // Public non-static methods of the unit.
    public void addTransitions(char symbol, State state) {

        Set<State> states = new HashSet<State>();

        if(this.delta.get(symbol) != null)
            states.addAll(this.delta.get(symbol));

        states.add(state);
        this.delta.put(symbol, states);
    }

    // This here method does not really determine whether the symbol is accepted by the automaton but rather if
    // the symbol appears in the first state?
    // TODO: Do we really need this method, and if we do, is there a better name for it?
    public boolean acceptsSymbol(Character symbol) {return false;}

    public boolean acceptsWord(String word) {return false;}

    // Public static methods of the unit.

    // Private methods of the unit.
}
