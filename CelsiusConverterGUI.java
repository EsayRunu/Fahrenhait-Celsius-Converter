package com.company.CelsiusConverter;

import javax.swing.*;
import java.awt.*;

public class CelsiusConverterGUI extends JFrame {
    private JTextField fahrenheitTextField;
    private JButton convertButton;
    private JLabel celsiusLabel;
    private JButton resetButton;
    private JPanel rootPanel;

    public CelsiusConverterGUI() {
        // 1. Create a panel
        setContentPane(rootPanel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //2. Create Listener Engine
        CelsiusConverterEngine myConverterEngine = new CelsiusConverterEngine(this);
        convertButton.addActionListener(myConverterEngine);
        resetButton.addActionListener(myConverterEngine);
    }

    public String getFahrenheitValue() {
        // Returning the value of fahrenhiet from textField
        return fahrenheitTextField.getText();
    }

    public void setFahrenheitValue (String valueue) {
        // Setting the value of celsius label
        fahrenheitTextField.setText(valueue);
    }

    public void setCelsiusValue (String valueue) {
        // Setting the value of celsius label
        celsiusLabel.setText(valueue);
    }

}
