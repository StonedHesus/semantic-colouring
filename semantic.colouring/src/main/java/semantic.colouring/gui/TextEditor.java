// The package in which the current Java compilation unit is to be found.
package semantic.colouring.gui;

// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.

import main.java.semantic.colouring.settings.Settings;
import semantic.colouring.gui.TextEditorWindowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextEditor extends JFrame implements Settings {
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

        // Instantiate and initialise a new JScrollPane object.
        JScrollPane scrollPane = new JScrollPane(this.textArea);
        // Set its vertical scroll bar policy to VERTICAL_SCROLLBAR_ALWAYS.
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // And make the component visible.
        scrollPane.setVisible(true);

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
        this.addWindowListener(new TextEditorWindowListener());
        this.setSize(INITIAL_SIZE);
        this.setTitle(INITIAL_DOCUMENT_TITLE);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.
    public void openFile(String path) throws IOException{
        /**
         * @param path; a String object which indicates the location where the file which we wish to open is to be found.
         *
         * <p>
         *      This here method is responsible for opening the file at the given path, if that file exists; and if it
         *      doesn't then the method is going to raise an IOException.
         *      If the file does exist, then the method will make sure that the cursor will be placed after the last
         *      line in the file.
         * </p>
         *
         * @author Andrei-Paul Ionescu.
         */

        //
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        String line = "";

        this.textArea.setText(line);

        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        while((line = bufferedReader.readLine()) != null)
            this.textArea.setText(this.textArea.getText().concat(line).concat("\r\n"));

        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        bufferedReader.close();
    }

    // Public static methods of the unit.

    // Private methods of the unit.
}
