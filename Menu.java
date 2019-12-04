package com.hewan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


import java.io.File;

import java.awt.event.ActionEvent;


public class Menu extends JFrame {

    public Menu() {
        this.setTitle("SJSU CS Planner");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(getPanel());
    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,400));
        panel.setLayout(new BorderLayout());


        JPanel titlePanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(400,300));


        JLabel title = new JLabel("SJSU CS Planner", 0);
        title.setFont(new Font("Arial", 1, 24));
        titlePanel.add(title);


        JButton searchClasses = new JButton("Spring 2020 CS Classes");
        searchClasses.setPreferredSize(new Dimension(80,20));
        searchClasses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String URL = "http://info.sjsu.edu/web-dbgen/schedules-spring/d96383.html";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
                } catch (Exception c){
                    JOptionPane.showMessageDialog(null, c.getMessage());
                }
            }

        });


        JButton seeRequiredClasses = new JButton("Required Classes");
        seeRequiredClasses.setPreferredSize(new Dimension(80,20));
        seeRequiredClasses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File file = new File("RequiredClasses.txt");
                JFrame window = new ListOfClasses(file);
                window.pack();
                window.setVisible(true);
            }

        });

        JButton seeElective = new JButton("Elective Classes");
        seeElective.setPreferredSize(new Dimension(80,20));
        seeElective.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File file = new File("ElectiveClasses.txt");
                JFrame window = new ListOfClasses(file);
                window.pack();
                window.setVisible(true);
            }

        });

        JButton interest = new JButton("Areas of Elective Classes");
        interest.setPreferredSize(new Dimension(80,20));
        interest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame window = new Interest();
                window.pack();
                window.setVisible(true);
            }

        });

        JButton trackRequired = new JButton("Track Your Required Classes");
        trackRequired.setPreferredSize(new Dimension(80,20));
        trackRequired.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame window = new CSRequiredClasses();
                window.pack();
                window.setVisible(true);
            }

        });

        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(searchClasses);
        buttonPanel.add(seeRequiredClasses);
        buttonPanel.add(seeElective);
        buttonPanel.add(interest);
        buttonPanel.add(trackRequired);


        panel.add(titlePanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.EAST);


        return panel;
    }

}
