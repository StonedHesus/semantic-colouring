// The package in which the current Java compilation unit is to be found.
package test;

// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.
import semantic.colouring.syntax.Automaton;
import semantic.colouring.syntax.State;

public class Test {
    /**
     */
    // Static values/constants of the class.

    // Fields/attributes of the class.

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.

    // Public static methods of the unit.
    public static void main(String[] args){

        State initialState = new State("", false);
        State firstState   = new State("p", false);
        State secondState  = new State("pu", false);
        State thirdState   = new State("pub", false);
        State forthState   = new State("publ", false);
        State fifthState   = new State("publi", false);
        State sixthState   = new State("public", true);

        initialState.addTransitions('p', firstState);
        firstState.addTransitions('u', secondState);
        secondState.addTransitions('b', thirdState);
        thirdState.addTransitions('l', forthState);
        forthState.addTransitions('i', fifthState);
        fifthState.addTransitions('c', sixthState);

        Automaton publicKeyWord = new Automaton(initialState);
    }

    // Private methods of the unit.
}
