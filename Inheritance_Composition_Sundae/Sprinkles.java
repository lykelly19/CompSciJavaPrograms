// Sprinkles.java

import java.awt.*;
import java.applet.*;
 
public class Sprinkles  //Sprinkles class
{
   public Sprinkles(Graphics g, int xPosScoop)  //constructor
   {
      drawSprinkles(g,xPosScoop);  
   }
   
   public static void drawSprinkles(Graphics g, int xPosScoop)
   {
      //draws a bunch of sprinkles
      g.setColor(Color.RED);   //Red Sprinkles
      g.fillRect(xPosScoop+100,270,15,4);
      g.fillRect(xPosScoop+210,184,15,4);
      g.setColor(new Color(238,130,238));  //Purple Sprinkles
      g.fillRect(xPosScoop+80,198,15,4);
      g.fillRect(xPosScoop+200,250,15,4);
      g.setColor(Color.YELLOW);  //Yellw Sprinkles
      g.fillRect(xPosScoop+60,230,15,4);
      g.fillRect(xPosScoop+130,180,15,4);
      g.fillRect(xPosScoop+170,230,15,4);
   }
}
 
