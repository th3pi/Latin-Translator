package com.company;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author Tanjimul H. Bhuiyan
 *
 */

public class Main extends JFrame {
    //Initialize global variables
    private JButton button1, button2,button3;
    private JPanel panel;
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 100;

    private Main(){
        setTitle("Latin Translator");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Sets button text
        button1 = new JButton("SINISTER");
        button2 = new JButton("DEXTER");
        button3 = new JButton("MEDIUM");

        //Button's even listener
        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());

        //Creates a panel for all the buttons
        panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        //Adds the panel
        add(panel);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String actionCommand = e.getActionCommand();

            if(actionCommand.equals("SINISTER")){
                JOptionPane.showMessageDialog(null, "Left");
            }else if(actionCommand.equals("DEXTER")){
                JOptionPane.showMessageDialog(null,"Right");
            }else if(actionCommand.equals("MEDIUM")){
                JOptionPane.showMessageDialog(null,"Center");
            }
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
