// RandomGraphics.java
/* Program Description:
   Construct objects of the Random, Color and Polygon classes.
   Cell 1: 100 random lines with random colors
   Cell 2: 100 random squares with random colors
   Cell 3: 100 random circles with random colors and the diameter is 0 to 200 pixels
   Cell 4: box that uses the Polygon class
*/

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                
public class RandomGraphics extends Applet
{
    public void paint(Graphics g)     
    {
   
      int a, x1, x2, y1, y2, red, green, blue;
      
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);
            
        // Draw Random Lines
      for(a=1; a<=100; a++)
      {
         red = (int)(Math.random()*256);
         green = (int)(Math.random()*256);
         blue = (int)(Math.random()*256);
         
         x1 = (int)(Math.random()*390 + 10);
         x2 = (int)(Math.random()*390 + 10);
         y1 = (int)(Math.random()*290 + 10);
         y2 = (int)(Math.random()*290 + 10);
         
         g.setColor(new Color(red, green, blue));
         g.drawLine(x1,y1,x2,y2);     
      }
        
        // Draw Random Squares
      int width = 50, height = 50;
      
      for(a=1; a<=100; a++)
      {
         red = (int)(Math.random()*256);
         green = (int)(Math.random()*256);
         blue = (int)(Math.random()*256);
      
         do
         {
            x1 = (int)(Math.random()*390 + 400);
            y1 = (int)(Math.random()*290 + 10);
         
         }while(width+x1 > 780 || height+y1> 290);  //generate an x and y value that is within the cell boundaries
         
         g.setColor(new Color(red, green, blue));
         g.fillRect(x1, y1, width, height);
      }
        
        // Draw Random Circles
      
      for(a=1; a<=100; a++)
      {
         red = (int)(Math.random()*256);
         green = (int)(Math.random()*256);
         blue = (int)(Math.random()*256);
         
         do
         {
            x1 = (int)(Math.random()*390 + 10);
            y1 = (int)(Math.random()*290 + 300);
            width = (int)(Math.random()*201);  //diameter needs to be anywhere from 0 to 200 pixels
            height = width;  //For a circle, the height and width must be the same
            
         }while(x1+width > 400 || y1+height > 590);
         
         g.setColor(new Color(red,green,blue));
         g.drawOval(x1,y1,width,height);
      }
        
        // Draw 3-D Box
      Polygon cubeFace1 = new Polygon();
      Polygon cubeFace2 = new Polygon();
      Polygon cubeFace3 = new Polygon();
      Polygon cubeFace4 = new Polygon();
      
      g.setColor(Color.blue);
      cubeFace1.addPoint(650,350);
      cubeFace1.addPoint(700,400);
      cubeFace1.addPoint(700,500);
      cubeFace1.addPoint(650,450);   
      g.fillPolygon(cubeFace1); 
      
      g.setColor(Color.yellow);
      cubeFace2.addPoint(550,350);
      cubeFace2.addPoint(650,350);
      cubeFace2.addPoint(650,450);
      cubeFace2.addPoint(550,450);
      g.fillPolygon(cubeFace2);
      
      g.setColor(Color.red);
      cubeFace3.addPoint(600,400);
      cubeFace3.addPoint(700,400);
      cubeFace3.addPoint(700,500);
      cubeFace3.addPoint(600,500);
      g.fillPolygon(cubeFace3);
      
      g.setColor(Color.green);
      cubeFace4.addPoint(550,350);
      cubeFace4.addPoint(600,400);
      cubeFace4.addPoint(600,500);
      cubeFace4.addPoint(550,450);
      g.fillPolygon(cubeFace4);
    }    
}  