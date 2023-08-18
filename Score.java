package QuizeApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score(String name, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading= new JLabel(" Thankyou " + name  +" for Playing Simple Minds ");
        heading.setBounds(45,30,700,40);
        heading.setFont(new Font("Tahoma",Font.PLAIN,28));
        add(heading);
        setVisible(true);
        JLabel lblscore= new JLabel(" Your Score is " +score);
        lblscore.setBounds(350,200,300,40);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,28));
        add(lblscore);
        setVisible(true);
       JButton submit = new JButton("Play Again");
        submit.setBounds(400,270,120,40);
        submit.setFont(new Font("Tahoma",Font.PLAIN,18));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);


    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();

    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}
