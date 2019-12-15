package com.company.CelsiusConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterEngine implements ActionListener {
    private CelsiusConverterGUI parentGUI;

    CelsiusConverterEngine(CelsiusConverterGUI converterGUI) {
        this.parentGUI = converterGUI;  //a reference to the ConverterGUI window
    }

    // Overriding actionPerfomed method for ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        // Conversing Fahrenheit to Celsius code
        int celsiusResult, fahrenheitInput;

        JButton clickedButton = (JButton) e.getSource();        // Get the source of this action
        String clickedButtonLabel = clickedButton.getText();    // Get the buttons label
        //In case the Reset button pressed - set Fahrenheit = 90
        if (clickedButtonLabel.equals("Reset")) parentGUI.setFahrenheitValue("90");

        fahrenheitInput = Integer.parseInt(parentGUI.getFahrenheitValue());
        celsiusResult = (fahrenheitInput - 32) * 5 / 9;
        parentGUI.setCelsiusValue(String.valueOf(celsiusResult));
    }
}
