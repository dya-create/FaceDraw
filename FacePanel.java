import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton.*;


public class FacePanel extends JPanel{
    
    private ArrayList<Face> FaceList = new ArrayList<Face>();//creates an array list to store faces
    Random random = new Random();

    public FacePanel() { setLayout(new FlowLayout(FlowLayout.CENTER));}

    // drawing faces and adding it to toString which shows face dimensions
    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        for(Face face: FaceList){

            face.draw(g);
            System.out.println(face.toString());

        }
    }

    // method to add face object to array list
    public void addFaces(int faceCount){

        for (int i = 0; i < faceCount; i++){

            //creates new face object 
            Face face = new Face(random.nextInt(getWidth()), random.nextInt(getHeight()), 200,200);
            FaceList.add(face); //adds face object to arraylist
        }
    }   

    }

