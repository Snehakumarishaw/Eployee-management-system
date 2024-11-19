package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {
    Main_class(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/img_5.png"));
        Image i2 = i1.getImage().getScaledInstance(1120,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);


        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(400,155,400,60);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(335,270,150,40);
        add.setForeground(Color.white);
        add.setBackground(Color.BLACK);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Addemployee();
                setVisible(false);
            }
        });
        img.add(add);
        JButton View= new JButton("View Employee");
        View.setBounds(565,270,150,40);
        View.setForeground(Color.white);
        View.setBackground(Color.BLACK);
        View.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_employee();
                setVisible(false);
            }
        });
        img.add(View);

        JButton Remove = new JButton("Remove Employee");
        Remove.setBounds(440,370,170,50);
        Remove.setForeground(Color.white);
        Remove.setBackground(Color.BLACK);
        Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();

            }
        });
        img.add(Remove);



        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main_class();
    }
}
