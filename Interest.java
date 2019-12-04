package com.hewan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Interest extends JFrame {
    public Interest() {
        this.setTitle("Areas of Interest");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.add(getPanel());
    }

    public JPanel getPanel() {

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,400));
        panel.setLayout(new BorderLayout());


        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Choose any area of interest", 0);
        titlePanel.add(title);

        JPanel textPanel = new JPanel();
        textPanel.setPreferredSize(new Dimension(300,100));
        JTextArea output = new JTextArea();
        output.setColumns(20);
        output.setRows(5);
        textPanel.add(output);


        JPanel buttonPanel = new JPanel();
        JButton web = new JButton("Web Development");
        web.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText("46A -> 46B  -> 174");
            }

        });

        JButton bio = new JButton("Bioinformatics");
        bio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText("46A -> 46B -> 123A -> 123B");
            }

        });

        JButton data = new JButton("Database Managment");
        data.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText("46A -> 46B -> 49J -> 146 -> 157A -> 157B or 157C");
            }

        });

        JButton network = new JButton("Network");
        network.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText(" 46A -> 46B  -> 47 -> 146 / 147 -> 158A -> 158B");
            }

        });

        JButton security = new JButton("Information Security");
        security.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText(" 46A -> 46B -> 47 -> 166");
            }

        });

        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(web);
        buttonPanel.add(bio);
        buttonPanel.add(data);
        buttonPanel.add(network);
        buttonPanel.add(security);

        panel.add(titlePanel, BorderLayout.NORTH);
        panel.add(textPanel, BorderLayout.EAST);
        panel.add(buttonPanel, BorderLayout.WEST);
        return panel;

    }

}
