package com.Mediaplayer.Forms;

import com.Mediaplayer.Bild;

import javax.swing.*;

public class PictureForm extends MediaForms{

    final JTextField location = new JTextField(5);

    public PictureForm(){
        super();


        mediumForm.add(new JLabel("Location:"));
        mediumForm.add(location);

        int result = JOptionPane.showConfirmDialog(null, mediumForm, "Please enter File info", JOptionPane.OK_CANCEL_OPTION);

        try {
            if (result == JOptionPane.OK_OPTION)
                mediaplayer.addMedium(new Bild(location.getText(), title.getText(), Integer.parseInt(year.getText())));

        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            JOptionPane.showMessageDialog(mediumForm, "Please enter a Number for Year. I am too lazy to overload this shit and Java is too retarded to allow optional parameters etc vanilla.");
            new PictureForm();
        }
        mainMenu();
    }
}
