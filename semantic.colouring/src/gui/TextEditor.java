// The package in which the current Java compilation unit is to be found.

package gui;
// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.

import settings.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TextEditor extends JFrame implements ActionListener, WindowListener, Settings {
    /**
     *
     * @author Andrei-Paul Ionescu.
     */
    // Static values/constants of the class.

    // Fields/attributes of the class.
    JTextArea textArea = new JTextArea(); // The text area Swing component.

    // Constructor(s) of the class.
    public TextEditor(){

        // Instantiate and initialise the JTextArea instance attribute.
        textArea = new JTextArea();

        // Set the default properties for the textArea object so as to ensure a default behaviour for the application.
        textArea.setFont(DEFAULT_FONT);
        // Enable both line wrapping and word wrapping by default so as to aid with ensuring proper and not confusing
        // usage by the user.
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Instantiate and initialise a new Container object.
        Container container = new Container();

        // Set the container's layout to BorderLayout.
        container.setLayout(new BorderLayout());

        // Add the textArea to the container.
        container.add(this.textArea);

        // Add the container to the content pane of the current JFrame, in this case that is equivalent with the current
        // instance.
        this.getContentPane().add(container);


        // Set the default properties for the JFrame component, i.e. the current instance.
        this.addWindowListener(this);
        this.setSize(INITIAL_SIZE);
        this.setTitle(INITIAL_DOCUMENT_TITLE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    // Public static methods of the unit.

    // Private methods of the unit.
}
