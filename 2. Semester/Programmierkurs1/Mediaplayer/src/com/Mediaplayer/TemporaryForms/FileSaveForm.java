package com.Mediaplayer.TemporaryForms;

import com.Mediaplayer.Menu;

import javax.swing.*;

public class FileSaveForm extends Menu {

    final JPanel filesystem = new JPanel();
    final JTextField filename = new JTextField(5);

    public FileSaveForm(){
        filesystem.add(new JLabel("Filename:"));
        filesystem.add(filename);

        int result = JOptionPane.showConfirmDialog(null, filesystem, "Please enter File info", JOptionPane.OK_CANCEL_OPTION);

        try {
            if (result == JOptionPane.OK_OPTION) {
                if (!filename.getText().isEmpty() | !filename.getText().isBlank()) {
                    mediaplayer.serialize(mediaplayer.mediums, filename.getText());
                } else {
                    throw new EmptyFileNameException("Empty Filename");
                }
            }
        } catch (EmptyFileNameException e) {
            JPanel confirm =new JPanel();
            confirm.add(new JLabel("Please enter filename or cancel"));
            int newName = JOptionPane.showConfirmDialog(null, confirm, "ERROR: Emtpy file name", JOptionPane.OK_CANCEL_OPTION);
            if (newName == JOptionPane.OK_OPTION){
                new FileSaveForm();
            }
        }
        mainMenu();
    }
}
