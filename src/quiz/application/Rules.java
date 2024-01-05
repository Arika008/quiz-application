package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Brain Benders");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "1. There will be a set of 10 objective type questions." + "<br><br>" +
                        "2. Time limit for each question will be 15 seconds." + "<br><br>" +
                        "3. If you are unable to answer within 15 seconds the questionn will be skipped. " + "<br><br>"
                        +
                        "4. 10 marks for correct answer, and no negative marking for wrong answer." + "<br><br>" +
                        "5. Their is a lifeline called 50-50 lifeline,which can be only used once." + "<br><br>" +
                        "6. You can submit the quiz only after attempting all the questions."
                        + "<br><br>" +
                        "7. After submitting the quiz your total score will be displayed" + "<br><br>" +
                        "<html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
