// LineDesign.java
/* Program Description:
   Display straight lines inside a rectangle from one side to a perpendicular side.  
   The lines must be drawn in such a way that both the starting points of the lines on one side and the ending points
   on the other side are equidistant along the sides.  
*/

//Libraries
import java.awt.*;
import java.applet.*;

public class LineDesign extends Applet
{
    public void paint(Graphics g)
    {
      int width = 980;   //Define Variables
        int height = 630;
      int x1 = 10;
      int y1 = 640;
      int x2 = 990;
      int y2 = 640;
        g.drawRect(10, 10, width, height); //Draw Large Rectangle

      // Draw bottom-right corner
      while(x1<990)
      {
         g.drawLine(x1, y1, x2, y2);  //Draw Lines
         x1+=14;
         y2-=9;   
      }  
      
      // Draw bottom-left corner
      x1=10;
      y2=640;

      while(x2>10)
      {
         g.drawLine(x1, y1, x2, y2);  //Draw Lines
         x2-=14;
         y1-=9;
      }

      // Draw top-right corner
      x2=990;
      y1=10;
      y2=10;
        
      while(x1<990)
      {
         g.drawLine(x1, y1, x2, y2);  //Draw Lines
         x1+=14;
         y2+=9;
      }
            
        // Draw top-left corner
      x1 = 10;
      x2 = 10;
      y1 = 640;
      y2 = 10;
      
      while(x2<990)
      {
         g.drawLine(x1, y1, x2, y2);  //Draw Lines
         x2+=14;
         y1-=9;  
      }
      
      //Draw Smaller Visual
      g.drawRect(245, 175, 510, 300);  //Draw smaller, interior rectangle
      x1 = 245;
      y1 = 475;
      x2 = 755;
      y2 = 475;
          
      //Draw bottom-right corner of smaller visual
      while(x1<755)
      {
         g.drawLine(x1, y1, x2, y2);  //Draw Lines
         x1+=10;
         y2-=6;      
      }  
      
      // Draw bottom-left corner of smaller visual
      x1=245;
      y2=475;

      while(x2>245)
      {
         g.drawLine(x1, y1, x2, y2);  //Draw Lines
         x2-=10;
         y1-=6;     
      }
      
      // Draw top-right corner of smaller visual
      x2=755;
      y1=175;
      y2=175;
        
      while(x1<755)
      {
         g.drawLine(x1, y1, x2, y2);   //Draw Lines
         x1+=10;
         y2+=6;
      }
      
      // Draw top-left corner of smaller visual
      x1 = 245;
      x2 = 245;
      y1 = 475;
      y2 = 175;
      
      while(x2<755)
      {
         g.drawLine(x1, y1, x2, y2);  //Draw Lines
         x2+=10;
         y1-=6;
      }
    }
}