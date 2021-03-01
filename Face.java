import java.awt.*;
import java.util.Random;
import java.awt.Color;

public class Face{

    // variables needed for the application
    public int x ;
    public int y ;
    public int width ;
    public int height ;
    public String faceStatus = "neutral";
    
    private Random myRand = new Random(); // random generator

        // getters and setters
        public int getX(){return x;}

        public void setX(int x){this.x= x;}
    
        public int getY(){return y;}
    
        public void setY(int y){this.y= y;}
    
        public int getWidth(){return width;}
    
        public void setWidth(int width){this.width= width;}
    
        public int getHeight(){return height;}
    
        public void setHeight(int height){this.height= height;}
    


    // default constructor
    public Face(){}

    // non default constructor
    public Face(int width, int height){
        this.width = width;
        this.height = height;
    }

    //non - default constrctpor 
    public Face(int x, int y , int width, int height){

        this.x =x;
        this.y = y;
        this.width = width;
        this.height= height;

    }

    // draw metthod draws smilling, frawing and neutral based on random values
    public void draw(Graphics g){

        // random width and height for face
        width = myRand.nextInt(120)+90;
        height = myRand.nextInt(140)+80;
        
        // random range for x and y 
        x = myRand.nextInt(250);
        y = myRand.nextInt(350);

        // drawing ovals with random size
        g.drawArc(x,y, width, height, 0,  360 );
        g.setColor(Color.black);

        //right eye
        g.drawArc(x+40, y+30, 15,25, 0, 360 );
        
        //left eye
        g.drawArc(  x+80,  y+30,15,  25, 0,  360 );
        

        switch(myRand.nextInt(3)){

            // arc for the smile
            case 0:
            {

                g.drawArc( x+40, y+50,  50,  30,  0,  -180);
               
                faceStatus = "smiling";
                break;


            }
            // arc for frowing face
            case 1:
            {
                g.drawArc( x+40, y+65, 50, 30, 0, 180);
               
                faceStatus = "frowing";
                break;

            }
            // line for neutral face
            case 2:
            {
                g.drawLine( x+30, y+80, x+ 90,y+80);
             
                faceStatus = "neutral";
                break;
            }
            default: g.drawLine( x+30, y+80, x+130, y+70); // neutrul
            break;

        }
    }


    @Override
    // to string that prints face dimensions
    public String toString(){

        return"Face{x=" + x +", y=" +y + ", width="+ width +", height=" + height+ ", status="  + faceStatus+ "}";
    }
    
    }

