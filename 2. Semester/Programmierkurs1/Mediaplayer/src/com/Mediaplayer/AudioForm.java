package com.Mediaplayer;

import javax.swing.*;

public class AudioForm extends MediaForms {

    final int DEFAULT_DURATION = 1;
    final JTextField interprete = new JTextField(5);
    
    AudioForm() {
        super();

        mediumForm.add(new JLabel("Interprete:"));
        mediumForm.add(interprete);

        int result = JOptionPane.showConfirmDialog(null, mediumForm, "Please enter File info", JOptionPane.OK_CANCEL_OPTION);

        try {
            if (result == JOptionPane.OK_OPTION)
                mediaplayer.addMedium(new Audio(interprete.getText(), DEFAULT_DURATION, title.getText(), Integer.parseInt(year.getText())));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            JOptionPane.showMessageDialog(mediumForm, "Please enter a Number for Year. I am too lazy to overload this shit and Java is too retarded to allow optional parameters etc vanilla.");
            new AudioForm();
        }
        mainMenu();
    }
}
