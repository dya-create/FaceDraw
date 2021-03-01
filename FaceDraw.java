/* Diya Patel
Object Oriented Programming
Sprint 3 - FaceDraw
*/

import javax.swing.*;
import javax.swing.JButton.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

// main 
public class FaceDraw {
    public static void main(String[] args) {

        //minumum and maximum number of faces that could be drawn 
        int minBound = 3;
        int maxBound = 10;

        Random random = new Random();  // random generator

        FacePanel panel = new FacePanel();  // creating a object for panel
        JFrame frame = new JFrame("FaceDraw"); // frame title
        JButton b = new JButton("Button"); // object for a button
        b.setBounds(500,400,100,30);
        frame.add(b); //adding button to jframe
        JTextField f;
        f = new JTextField("Click the button to resize window");// message to display on window
        f.setBounds(50,100,200,30);
        frame.add(f);

        //frame 
        frame.pack();
        frame.setSize(600, 600);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        System.out.print("Starting FaceDraw.....");// print starting message to console 
        panel.addFaces(random.nextInt(maxBound - minBound + 1) + minBound);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //currently window is not resizable
        frame.setResizable(false);
        
        
        b.addActionListener(new ActionListener(){
      
           //anoymous class implementing the ActionListener
            public void actionPerformed(ActionEvent e){
                frame.setResizable(true);// making the window resizable when the button is clicked

            }
        });    
    }
}






