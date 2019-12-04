package com.hewan;

import javax.swing.*;

import java.io.BufferedReader;
import java.io.FileReader;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;


import java.io.File;



public class ListOfClasses extends JFrame{
    private File file;
    private JTextArea text;

    public ListOfClasses(File f) {
        this.setTitle("Lists");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.add(getPanel());
        file = f;
        readFile();
    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();

        panel.setPreferredSize(new Dimension(500,400));
        panel.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("List Of Classes", 0);
        title.setFont(new Font("Arial", 1, 24));
        titlePanel.add(title);

        JPanel textPanel = new JPanel();


        text = new JTextArea();
        text.setColumns(35);
        text.setRows(20);

        JScrollPane scroll = new JScrollPane(text);

        textPanel.add(scroll);
        panel.add(titlePanel, BorderLayout.NORTH);
        panel.add(textPanel, BorderLayout.CENTER);
        return panel;
    }

    public void readFile(){
        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            String name;
            while ((name = br.readLine()) != null) {
                text.append(name +  "\n");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
