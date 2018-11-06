// Bowl.java

import java.awt.*;
import java.applet.*;

class Bowl  //The Bowl Class
{
   public static void drawBowl(Graphics g)   //Paints the Ice Cream Bowl
   {
      g.setColor(Color.BLUE);
      g.fillRect(300, 300, 500, 50);
      g.fillArc(325,150,450,330,180,180);
   }
}

