package QuizeApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading = new JLabel("Welcome "+name+" in Simple Minds");
        heading.setBounds(50,20,700,40);
        heading.setFont(new Font("Tahoma",Font.BOLD, 28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        JLabel rules= new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>"+
                "<html>"
        );
        add(rules);
        back= new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setFont(new Font("Mangolian Baiti",Font.BOLD, 20));
        back.setForeground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);

        start= new JButton("start");
        start.setBounds(400,500,100,30);
        start.setFont(new Font("Mangolian Baiti",Font.BOLD, 20));
        start.setForeground(new Color(30,144,254));
        start.addActionListener(this);
        add(start);


        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if( ae.getSource()==start){
            setVisible(false);
            new Quize(name);

        }else{
            setVisible(false);
            new Login();
        }

    }

    public static void main(String[] args) {
     new rules("User");
    }
}
