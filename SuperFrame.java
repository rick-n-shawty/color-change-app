package Btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Button;
import java.util.Random;
import java.awt.Color;
public class SuperFrame extends JFrame{
    JButton button; 
    public SuperFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(153, 47, 71));
        this.setSize(600, 600);
        this.setResizable(true);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Change colors");
        button = new JButton("Click me");
        button.setBounds(100, 200, 150, 100);
        button.setFocusable(false);
        button.addActionListener((e) -> {
            System.out.println("You triggerred remote nuclear launch");
            Random random = new Random(); 
            int red = random.nextInt(255);
            int green = random.nextInt(255);
            int blue = random.nextInt(255);
            this.getContentPane().setBackground(new Color(red, green, blue));   
        });

        this.add(button);
    }

}
