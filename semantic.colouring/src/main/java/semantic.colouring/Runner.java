// The package in which the current Java compilation unit is to be found.
package semantic.colouring;

// Imports from existing Java libraries, classes and interfaces.
import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

// Import from custom libraries, classes and interfaces.
import semantic.colouring.gui.TextEditor;



public class Runner {
    /**
     */
    // Static values/constants of the class.

    // Fields/attributes of the class.

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.

    // Public static methods of the unit.

    // Private methods of the unit.

    public static void main (String[] args) {

        try {
            SwingUtilities.invokeAndWait(TextEditor::new);
        } catch (InterruptedException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
