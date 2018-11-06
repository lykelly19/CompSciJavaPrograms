//ChocolateChips.java

import java.awt.*;
import java.applet.*;
   
public class ChocolateChips   //ChocolateChips class
{
   public ChocolateChips(Graphics g, int xPosScoop)
   {
      drawChocolateChips(g,xPosScoop);
   }

   public static void drawChocolateChips(Graphics g, int xPosScoop)   //A Cookie Dough Ice Cream Scoop has chocolate chips
   {
      //draw a bunch of Chocolate Chips
      g.setColor(Color.BLACK);
      g.fillRect(xPosScoop+120,170,20,20);
      g.fillRect(xPosScoop+50,230,20,20);
      g.fillRect(xPosScoop+200,280,20,20);
      g.fillRect(xPosScoop+270,260,20,20);
   }  
}