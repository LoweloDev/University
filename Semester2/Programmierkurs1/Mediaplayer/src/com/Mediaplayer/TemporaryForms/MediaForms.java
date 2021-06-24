package com.Mediaplayer.TemporaryForms;

import com.Mediaplayer.Menu;

import javax.swing.*;

public class MediaForms extends Menu {
    //TODO implement JSpinner for year
//    final int currYear = new Date().getYear() + 1900;
//    final int[] years = IntStream.range(500, currYear).toArray();

    final JPanel mediumForm = new JPanel();
    final JTextField title = new JTextField(5);
    final JTextField year = new JTextField(5);

    MediaForms() {
        mediumForm.add(new JLabel("Title:"));
        mediumForm.add(title);
        mediumForm.add(new JLabel("Year:"));
        mediumForm.add(year);
    }


}
