package com.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button1;
    private JPanel panel1;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Figure f1=new Triangle(6, 8, 10);
                Figure f2=new Circle(5);
                Figure f3=new Rhombus(4, Math.PI/6);
                Figure f4= new Rectangle(2, 4);
                Figure f5 = new Square(5);
                JOptionPane.showMessageDialog(null, "Triangle(6, 8, 10)"+'\n'+f1.calcPerimeter()
                        +'\n'+f1.calcSquare()+'\n'+"Circle(5)"+'\n'+f2.calcPerimeter()+'\n'+f2.calcSquare()+'\n'+
                        "Rhombus(4, pi/6)"+'\n'+f3.calcPerimeter()+'\n'+f3.calcSquare()+'\n'+
                        "Recatngle(2, 4)"+'\n'+f4.calcPerimeter()+'\n'+f4.calcSquare()+'\n'+
                        "Square(5)"+'\n'+f5.calcPerimeter()+'\n'+f5.calcSquare());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
