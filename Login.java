package QuizeApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,600,45);
        heading.setFont(new Font("Mangolian Baiti",Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        JLabel name= new JLabel("Enter your Name");
        name.setBounds(750,120,600,45);
        name.setFont(new Font("Mangolian Baiti",Font.BOLD, 40));
        name.setForeground(new Color(30,144,254));
        add(name);
        tfname = new JTextField();
        tfname.setBounds(750,170,400,40);
        tfname.setFont(new Font("Mangolian Baiti",Font.BOLD, 20));
        tfname.setForeground(new Color(30,144,254));
        add(tfname);

        rules= new JButton("Rules");
        rules.setBounds(750,225,120,25);
        rules.setFont(new Font("Mangolian Baiti",Font.BOLD, 20));
        rules.setForeground(new Color(30,144,254));
        rules.addActionListener(this);
        add(rules);
        back= new JButton("Back");
        back.setBounds(950,225,120,25);
        back.setFont(new Font("Mangolian Baiti",Font.BOLD, 20));
        back.setForeground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new rules(name);

        }else if (ae.getSource()==back ){
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Login();
    }


}
