package com.hewan;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Iterator;




public class ListOfClassesToTake extends JFrame {

    private SubjectModel sub;
    private JTextArea textArea;

    public ListOfClassesToTake(SubjectModel s) {

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("List of Classes to Take");
        this.add(getPanel());
        sub = s;
        printList();
    }

    public void printList(){

        Iterator it = sub.iterator();

        while(it.hasNext()){
            Subject sub = (Subject) it.next();
            textArea.append(sub.toString() +  "\n");

        }
    }

    public JPanel getPanel() {

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,400));
        panel.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("The Remaining Classes to Take", 0);
        title.setFont(new Font("Arial", 1, 24));
        titlePanel.add(title);

        JPanel textPanel = new JPanel();

        textArea = new JTextArea();
        textArea.setColumns(30);
        textArea.setRows(15);
        textPanel.add(textArea);

        panel.add(titlePanel, BorderLayout.NORTH);
        panel.add(textPanel, BorderLayout.CENTER);

        return panel;
    }

}
