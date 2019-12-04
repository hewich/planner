package com.hewan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CSRequiredClasses extends JFrame{

    Subject s1 = new Subject("CS46A");
    Subject s2 = new Subject("CS46B");
    Subject s3 = new Subject("CS47");
    Subject s4 = new Subject("CS146");
    Subject s5 = new Subject("CS147");
    Subject s6 = new Subject("CS149");
    Subject s7 = new Subject("CS151");
    Subject s8 = new Subject("CS152");
    Subject s9 = new Subject("CS154");
    Subject s10 = new Subject("CS160");
    Subject s11 = new Subject("CS 116B, 123B, 153, 157B, 157C, 158B, 161, 167B, or 167C");

    private SubjectModel sub;

    private ListOfClassesToTake list;

    public CSRequiredClasses() {

        this.setTitle("Track CS Required Classes");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        this.add(getPanel());
        sub = getSubList();
    }

    public SubjectModel getSubList(){
        SubjectModel s = new SubjectModel();

        s.addSubject(s1);
        s.addSubject(s2);
        s.addSubject(s3);
        s.addSubject(s4);
        s.addSubject(s5);
        s.addSubject(s6);
        s.addSubject(s7);
        s.addSubject(s8);
        s.addSubject(s9);
        s.addSubject(s10);
        s.addSubject(s11);


        return s;

    }

    public SubjectModel getToTakeList(){
        return sub;
    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,400));
        panel.setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JPanel titlePanel = new JPanel();

        JLabel title = new JLabel("Choose the classes that you have taken", 0);
        titlePanel.add(title);


        JRadioButton CS46A  = new JRadioButton("CS46A");
        CS46A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s1);
            }

        });
        JRadioButton CS46B = new JRadioButton("CS46B");
        CS46B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s2);
            }

        });
        JRadioButton CS47 = new JRadioButton("CS47");
        CS47.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s3);
            }

        });
        JRadioButton CS146 = new JRadioButton("CS146");
        CS146.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s4);
            }

        });
        JRadioButton CS147 = new JRadioButton("CS147");
        CS147.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s5);
            }

        });
        JRadioButton CS149 = new JRadioButton("CS149");
        CS149.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s6);
            }

        });
        JRadioButton CS151 = new JRadioButton("CS151");
        CS151.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s7);
            }

        });
        JRadioButton CS152 = new JRadioButton("CS152");
        CS152.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s8);
            }

        });
        JRadioButton CS154 =new JRadioButton("CS154");
        CS154.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s9);
            }

        });
        JRadioButton CS160 = new JRadioButton("CS160");

        CS160.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s10);
            }

        });
        JRadioButton CSUp = new JRadioButton("CS 116B, 123B, 153, 157B, 157C, 158B, 161, 167B, or 167C");
        CSUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sub.removeSubject(s11);
            }

        });


        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.add(CS46A);
        radioPanel.add(CS46B);
        radioPanel.add(CS47);
        radioPanel.add(CS146);
        radioPanel.add(CS147);
        radioPanel.add(CS149);
        radioPanel.add(CS151);
        radioPanel.add(CS152);
        radioPanel.add(CS154);
        radioPanel.add(CS160);
        radioPanel.add(CSUp);

        JButton next = new JButton("Next");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame window = new ListOfClassesToTake(getToTakeList());
                window.pack();
                window.setVisible(true);

            }

        });
        buttonPanel.add(next,0);

        panel.add(titlePanel, BorderLayout.NORTH);
        panel.add(radioPanel,BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

}
